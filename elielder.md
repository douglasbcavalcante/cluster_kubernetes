PSI5120 – Tópicos em Computação em Nuvem (2024)

Aluno: Elielder Belchior de Melo

Nº USP: 15613280

01 de agosto de 2024

Avaliação Intermediária

## Roteiro de Implementação: [Roteiro com Telas em PDF](https://drive.google.com/file/d/1ZcuhRVWG_DToJcPEgff6Eetlw8S0wHwt/view?usp=drive_link)

# Comandos de Implementações (Local-Baremetal e Nuvem-AWS)

## 1. Implementação Local-Baremetal

### 1.1 Instalação do docker.io e minikube e kubectl
```
sudo apt-get install docker.io -y
sudo usermod -aG docker $USER && newgrp docker
sudo apt install -y curl wget apt-transport-https
curl -LO https://storage.googleapis.com/minikube/releases/latest/minikube-linux-amd64
sudo install minikube-linux-amd64 /usr/local/bin/minikube
curl -LO https://storage.googleapis.com/kubernetes-release/release/$(curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt)/bin/linux/amd64/kubectl
chmod +x kubectl
sudo mv kubectl /usr/local/bin/
```
### 1.2. Verificação de requisitos do PC/Laptop
```
sudo apt install neofetch
neofetch
```
### 1.3. Criação da pasta com arquivos da pasta [/php-apache-web-server/](https://github.com/douglasbcavalcante/cluster_kubernetes/tree/main/php-apache-web-server) e mudança de diretório
```
mkdir AvaliacaoInter
cd AvaliacaoInter/
```
### 1.4. Implementação
```
minikube start --driver=docker
minikube addons enable metrics-server
kubectl apply -f php-apache.yaml 
kubectl autoscale deployment php-apache --cpu-percent=50 --min=1 --max=10
kubectl get hpa
kubectl run -i --tty load-generator --rm --image=busybox:1.28 --restart=Never -- /bin/sh -c "while sleep 0.01; do wget -q -O- http://php-apache; done"
kubectl get hpa php-apache --watch
```
## 2. Implementação Nuvem-AWS

Partindo com o docker.io, minikube e kubectl instalados, deve-se prosseguir com as outras configurações e implementações.

### 2.1. Instalação, verificação e configuração do AWS
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install --bin-dir /usr/local/bin --install-dir /usr/local/aws-cli --update
aws --version
```
Para configuração das credenciais, deve-se seguir o roteiro que está no link acima com os seguintes passos:
1. Ir até a CLI AWS e procurar pelo arquivo: /~/.aws/credentials;
2. Copiar o conteúdo para a máquina local no mesmo caminho: /~/.aws/credentials.

Verifique se a configuração está correta com o seguinte comando:
```
aws sts get-caller-identity
```

### 2.2. Configuração do minikube + kubectl + aws (Esse processo está em conjunto com o processo de criação do cluster AWS EKS com EC2, como descrito no roteiro)
```
aws cloudformation create-stack --region us-east-1 --stack-name elielder-eks-vpc-stack --template-url https://s3.us-west-2.amazonaws.com/amazon-eks/cloudformation/2020-10-29/amazon-eks-vpc-private-subnets.yaml
minikube start --driver=docker
minikube addons enable metrics-server
kubectl get nodes -o wide
aws eks update-kubeconfig --region us-east-1 --name elielder-cluster
kubectl get svc
kubectl create namespace php-apache-elielder
```

### 2.3. Implementação do servidor web com arquivos da pasta [/php-apache-web-server/](https://github.com/douglasbcavalcante/cluster_kubernetes/tree/main/php-apache-web-server) para criação de servidor com imagem kubernetes e serviço associado ao servidor
```
cd AvaliacaoInter/
kubectl apply -f php-apache.yaml
kubectl apply -f php-apache-service.yaml
```

### 2.4. Configuração do ambiente kubernetes para vínculo com AWS e deployment do servidor web com autoescalonamento horizontal
```
kubectl get all
kubectl -n php-apache-elielder describe service php-apache-service
kubectl apply -f https://github.com/kubernetes-sigs/metrics-server/releases/latest/download/components.yaml
kubectl get deployment metrics-server -n kube-system
kubectl top nodes
kubectl autoscale deployment php-apache --cpu-percent=50 --min=1 --max=10
kubectl get hpa
kubectl run -i     --tty load-generator     --rm --image=busybox     --restart=Never     -- /bin/sh -c "while sleep 0.01; do wget -q -O- http://php-apache; done"
kubectl get hpa php-apache --watch
```
