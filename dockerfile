# Usar uma imagem base com o JDK 21
FROM eclipse-temurin:21-jdk

# Definir variáveis de ambiente
ENV WILDFLY_VERSION 33.0.0.Final
ENV JBOSS_HOME /opt/wildfly

# Baixar e instalar o WildFly
RUN curl -L -O https://github.com/wildfly/wildfly/releases/download/$WILDFLY_VERSION/wildfly-$WILDFLY_VERSION.tar.gz \
    && tar xf wildfly-$WILDFLY_VERSION.tar.gz -C /opt \
    && mv /opt/wildfly-$WILDFLY_VERSION $JBOSS_HOME \
    && rm wildfly-$WILDFLY_VERSION.tar.gz

# Adicionar o usuário administrador do WildFly
RUN $JBOSS_HOME/bin/add-user.sh admin admin --silent

# Expor as portas 80 e 9990 (porta do console de gerenciamento)
EXPOSE 80 9990

# Configurar o WildFly para rodar na porta 80 e permitir acesso externo ao console de gerenciamento
RUN sed -i 's/<socket-binding name="http" port="${jboss.http.port:8080}"/<socket-binding name="http" port="${jboss.http.port:80}"/' $JBOSS_HOME/standalone/configuration/standalone.xml \
    && sed -i 's/<inet-address value="${jboss.bind.address.management:127.0.0.1}"/<inet-address value="${jboss.bind.address.management:0.0.0.0}"/' $JBOSS_HOME/standalone/configuration/standalone.xml

# Copiar a aplicação para dentro do container e construir com Maven
COPY app-java-teste /app-java-teste
WORKDIR /app-java-teste
RUN apt-get update && apt-get install -y maven \
    && mvn clean package \
    && cp target/*.war $JBOSS_HOME/standalone/deployments/app-java-teste.war

# Iniciar o WildFly
CMD ["/opt/wildfly/bin/standalone.sh", "-b", "0.0.0.0"]
