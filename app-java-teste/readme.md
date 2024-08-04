# Aplicação de exemplo para teste de HPA do Kubernetes com Wildfly e Java

A aplicação é uma WEB API que gera aleatoriamente um comprimento entre 32 bits e 2048 bits e procura por um número primo do tamanho obtido. Em alguns casos o algoritmo aloca 500 MB de memória por 20 s (mais o tempo do Garbage Colector).

Objetivo: gerar carga de processamento com memórias e tempos aleatórios.

API GET: `/inicia-teste`

Resultado: 
```
{
    "primo": # Número gerado,
    "tempoProcessamentoMs": # Tempo de processamento em milissegundos,
    "memoriaMB": # Uso médio de memória durante a geração do número,
    "cargaCpu":# Uso médio de CPU durante a geração do número (média da soma dos processos em fila e em execução)
}
```

## Requisitos
- Java 21+
- Wildfly 33.0.0
- docker
- maven
- IDE Recomendada: VSCODE com plugins para Java, Git e Docker.

## Build do projeto
Executar a partir da pasta `app-java-teste`:
```
$ mvn clean package
```

## Geração e execução de imagem Docker
```
# docker build -t app-java-teste .
# docker run -p 80:80 -p 9990:9990 --name app-java-teste 
```

## Atualização do repositório no DockerHub
```
# docker login -u USUARIO
# docker tag app-java-teste USUARIO/app-java-teste
# docker push USUARIO/app-java-teste:latest
```

## Teste com Kubernetes - execução local
### Requisitos
- minikube
- kubectl

### Início do minikube e habilitação do metrics-server
```
$ minikube addons enable metrics-server
$ minikube start
# minikube proxy
```

### Deploy da aplicação, habilitação do HPA e monitoramento
Em um novo prompt:
```
$ kubectl apply -f app-java-teste.yaml
$ kubectl autoscale deployment app-java-teste --cpu-percent=50 --min=1 --max=20
$ kubectl get hpa --watch
```

### Gerador de carga
Em um novo prompt:
```
$ kubectl run -i --tty load-generator --rm --image=busybox:1.28 --restart=Never -- /bin/sh -c "while sleep 0.1; do wget -q -O- http://app-java-teste/app-java-teste/inicia-teste; done"
```

Usar Ctrl + C para parar o teste.

### HPA com yaml
Aplicar o `autoscaling.yaml` e fazer o mesmo que no item anterior:
```
$ kubectl apply -f autoscaling.yaml
```


