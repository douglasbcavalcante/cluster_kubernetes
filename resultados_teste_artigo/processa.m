clear; clc;

dados_vm = dlmread('ambiente-virtual-kvm.csv',',',1,0);
vm_cpu = dados_vm(:,1);
tg_cpu = dados_vm(:,2);
vm_pods = dados_vm(:,3);
vm_time = dados_vm(:,4);

fig = figure(1, 'position', [10 10 900 600]);
hold on;
plot(vm_time,tg_cpu,'k;Taxa alvo;');
plot(vm_time,vm_cpu,'b;Uso de CPU;');
plot(vm_time,vm_pods,'r;Num. PODs;');
hold off;
title("Desempenho do HPA em ambiente virtual\n Retirada da carga em aprox. 720 s");
legend('Location','northeast');
xlabel('Tempo (s)');
ylabel('Num. PODs e Carga CPU/100');
axis([min(vm_time)-10 max(vm_time)+10 0 max(vm_pods)+1]);
set(gca,'XTick',0:50:max(vm_time+10))
set(gca,'YTick',0:0.5:max(vm_pods+1))
grid('on')
saveas(fig,'ambiente_virtual.png');
savefig(fig,'ambiente_virtual.fig');

dados_aws = dlmread('aws-eks.csv',',',1,0);
aws_cpu = dados_aws(:,1);
tg_aws = dados_aws(:,2);
aws_pods = dados_aws(:,3);
aws_time = dados_aws(:,4);

fig = figure(2, 'position', [10 10 900 600]);
hold on;
plot(aws_time,tg_aws,'k;Taxa alvo;');
plot(aws_time,aws_cpu,'b;Uso de CPU;');
plot(aws_time,aws_pods,'r;Num. PODs;');
hold off;
title("Desempenho do HPA na AWS EKS\n Retirada da carga em aprox. 660 s");
legend('Location','northeast');
xlabel('Tempo (s)');
ylabel('Num. PODs e Carga CPU/100');
axis([min(aws_time)-10 max(aws_time)+10 0 max(aws_pods)+1]);
set(gca,'XTick',0:50:max(aws_time+10))
set(gca,'YTick',0:0.5:max(aws_pods+1))
grid('on')
saveas(fig,'aws_eks.png');
savefig(fig,'aws_eks.fig');

dados_bm = dlmread('baremetal.csv',',',1,0);
bm_cpu = dados_bm(:,1);
tg_bm = dados_bm(:,2);
bm_pods = dados_bm(:,3);
bm_time = dados_bm(:,4);

fig = figure(3, 'position', [10 10 900 600]);
hold on;
plot(bm_time,tg_bm,'k;Taxa alvo;');
plot(bm_time,bm_cpu,'b;Uso de CPU;');
plot(bm_time,bm_pods,'r;Num. PODs;');
hold off;
title("Desempenho do HPA em baremetal\n Retirada da carga em aprox. 530 s");
legend('Location','northeast');
xlabel('Tempo (s)');
ylabel('Num. PODs e Carga CPU/100');
axis([min(bm_time)-10 max(bm_time)+10 0 max(bm_pods)+1]);
set(gca,'XTick',0:50:max(bm_time+10))
set(gca,'YTick',0:0.5:max(bm_pods+1))
grid('on')
saveas(fig,'baremetal.png');
savefig(fig,'baremetal.fig');
