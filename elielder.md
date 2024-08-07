PSI5120 – Tópicos em Computação em Nuvem (2024)

Aluno: Elielder Belchior de Melo

Nº USP: 15613280

01 de agosto de 2024

Avaliação Intermediária

## Roteiro de Implementação: https://drive.google.com/file/d/1ZcuhRVWG_DToJcPEgff6Eetlw8S0wHwt/view?usp=drive_link

# Comandos de Implementações (Local-Baremetal e Nuvem-AWS)

## Implementação Local-Baremetal

### Instalação do docker.io e minikube e kubectl
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
### Verificação de requisitos do PC/Laptop
```
sudo apt install neofetch
neofetch
```
### Criação da pasta com arquivos da pasta php-apache-web-server e mudança de diretório
```
mkdir AvaliacaoInter
cd AvaliacaoInter/
```
### Implementação
```
minikube start --driver=docker
minikube addons enable metrics-server
kubectl apply -f php-apache.yaml 
kubectl autoscale deployment php-apache --cpu-percent=50 --min=1 --max=10
kubectl get hpa
kubectl run -i --tty load-generator --rm --image=busybox:1.28 --restart=Never -- /bin/sh -c "while sleep 0.01; do wget -q -O- http://php-apache; done"
kubectl get hpa php-apache --watch
``
## Implementação Nuvem-AWS


