# Teste de carga do app-java-teste
## Máquina:
```
douglas@minikube-lubuntu 
------------------------ 
OS: Lubuntu 24.04 LTS x86_64 
Host: KVM/QEMU (Standard PC (Q35 + ICH9, 2009) pc-q35-8.2) 
Kernel: 6.8.0-39-generic 
Uptime: 3 hours, 23 mins 
Packages: 1864 (dpkg), 7 (snap) 
Shell: bash 5.2.21 
Resolution: 1024x768 
DE: LXQt 1.4.0 
WM: Openbox 
Theme: Breeze [GTK3] 
Icons: ePapirus [GTK3] 
Terminal: tilix 
CPU: 11th Gen Intel i7-1165G7 (2) @ 2.803GHz 
GPU: 00:01.0 Red Hat, Inc. QXL paravirtual graphic card 
Memory: 1918MiB / 3916MiB 
```

## Teste com cpu alvo de 50 % e disparos a cada 0,3 s
```
NAME             REFERENCE                   TARGETS              MINPODS   MAXPODS   REPLICAS   AGE
app-java-teste   Deployment/app-java-teste   cpu: <unknown>/50%   1         20        1          21s
app-java-teste   Deployment/app-java-teste   cpu: 63%/50%         1         20        1          60s
app-java-teste   Deployment/app-java-teste   cpu: 63%/50%         1         20        2          75s
app-java-teste   Deployment/app-java-teste   cpu: 34%/50%         1         20        2          2m
app-java-teste   Deployment/app-java-teste   cpu: 42%/50%         1         20        2          3m
app-java-teste   Deployment/app-java-teste   cpu: 40%/50%         1         20        2          4m
app-java-teste   Deployment/app-java-teste   cpu: 16%/50%         1         20        2          5m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        2          6m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        2          9m45s
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        1          10m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        1          10m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        1          11m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        1          13m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        1          16m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        1          17m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        1          19m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        1          24m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        1          25m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        1          26m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        1          28m
app-java-teste   Deployment/app-java-teste   cpu: 1%/50%          1         20        1          29m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        1          30m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        1          32m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        1          33m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        1          34m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        1          35m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%          1         20        1          37m
app-java-teste   Deployment/app-java-teste   cpu: 78%/50%         1         20        1          39m
app-java-teste   Deployment/app-java-teste   cpu: 78%/50%         1         20        2          39m
app-java-teste   Deployment/app-java-teste   cpu: 88%/50%         1         20        2          40m
app-java-teste   Deployment/app-java-teste   cpu: 58%/50%         1         20        2          41m
app-java-teste   Deployment/app-java-teste   cpu: 58%/50%         1         20        3          41m
app-java-teste   Deployment/app-java-teste   cpu: 50%/50%         1         20        3          42m
app-java-teste   Deployment/app-java-teste   cpu: 71%/50%         1         20        3          43m
```
## Teste com cpu alvo de 50 % e disparos a cada 0,1 s
```
NAME             REFERENCE                   TARGETS       MINPODS   MAXPODS   REPLICAS   AGE
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%   1         20        3          66m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%   1         20        3          67m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%   1         20        3          67m
app-java-teste   Deployment/app-java-teste   cpu: 11%/50%   1         20        1          68m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%    1         20        1          69m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%    1         20        1          70m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%    1         20        1          71m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%    1         20        1          73m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%    1         20        1          73m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%    1         20        1          74m
app-java-teste   Deployment/app-java-teste   cpu: 164%/50%   1         20        1          75m
app-java-teste   Deployment/app-java-teste   cpu: 164%/50%   1         20        4          76m
app-java-teste   Deployment/app-java-teste   cpu: 70%/50%    1         20        4          76m
app-java-teste   Deployment/app-java-teste   cpu: 85%/50%    1         20        4          77m
app-java-teste   Deployment/app-java-teste   cpu: 83%/50%    1         20        4          78m
app-java-teste   Deployment/app-java-teste   cpu: 77%/50%    1         20        4          79m
app-java-teste   Deployment/app-java-teste   cpu: 85%/50%    1         20        4          80m
app-java-teste   Deployment/app-java-teste   cpu: 84%/50%    1         20        4          81m
app-java-teste   Deployment/app-java-teste   cpu: 83%/50%    1         20        4          82m
app-java-teste   Deployment/app-java-teste   cpu: 85%/50%    1         20        4          83m
app-java-teste   Deployment/app-java-teste   cpu: 86%/50%    1         20        4          84m
app-java-teste   Deployment/app-java-teste   cpu: 85%/50%    1         20        4          85m
app-java-teste   Deployment/app-java-teste   cpu: 85%/50%    1         20        4          86m
app-java-teste   Deployment/app-java-teste   cpu: 86%/50%    1         20        4          87m
app-java-teste   Deployment/app-java-teste   cpu: 85%/50%    1         20        4          88m
app-java-teste   Deployment/app-java-teste   cpu: 78%/50%    1         20        4          89m
app-java-teste   Deployment/app-java-teste   cpu: 81%/50%    1         20        4          90m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%     1         20        4          91m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%     1         20        4          92m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%     1         20        4          93m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%     1         20        4          96m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%     1         20        1          96m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%     1         20        1          99m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%     1         20        1          100m
```
## Teste com cpu alvo de 50 %, memória alvo de 650 MB e disparos a cada 0,1 s
```  
douglas@minikube-lubuntu:~/cluster_kubernetes$ kubectl describe node
Name:               minikube
Roles:              control-plane
Labels:             beta.kubernetes.io/arch=amd64
                    beta.kubernetes.io/os=linux
                    kubernetes.io/arch=amd64
                    kubernetes.io/hostname=minikube
                    kubernetes.io/os=linux
                    minikube.k8s.io/commit=5883c09216182566a63dff4c326a6fc9ed2982ff
                    minikube.k8s.io/name=minikube
                    minikube.k8s.io/primary=true
                    minikube.k8s.io/updated_at=2024_07_24T19_18_40_0700
                    minikube.k8s.io/version=v1.33.1
                    node-role.kubernetes.io/control-plane=
                    node.kubernetes.io/exclude-from-external-load-balancers=
Annotations:        kubeadm.alpha.kubernetes.io/cri-socket: unix:///var/run/cri-dockerd.sock
                    node.alpha.kubernetes.io/ttl: 0
                    volumes.kubernetes.io/controller-managed-attach-detach: true
CreationTimestamp:  Wed, 24 Jul 2024 19:18:37 -0300
Taints:             <none>
Unschedulable:      false
Lease:
  HolderIdentity:  minikube
  AcquireTime:     <unset>
  RenewTime:       Sun, 04 Aug 2024 12:39:02 -0300
Conditions:
  Type             Status  LastHeartbeatTime                 LastTransitionTime                Reason                       Message
  ----             ------  -----------------                 ------------------                ------                       -------
  MemoryPressure   False   Sun, 04 Aug 2024 12:37:31 -0300   Sun, 04 Aug 2024 02:47:00 -0300   KubeletHasSufficientMemory   kubelet has sufficient memory available
  DiskPressure     False   Sun, 04 Aug 2024 12:37:31 -0300   Sun, 04 Aug 2024 02:47:00 -0300   KubeletHasNoDiskPressure     kubelet has no disk pressure
  PIDPressure      False   Sun, 04 Aug 2024 12:37:31 -0300   Sun, 04 Aug 2024 02:47:00 -0300   KubeletHasSufficientPID      kubelet has sufficient PID available
  Ready            True    Sun, 04 Aug 2024 12:37:31 -0300   Sun, 04 Aug 2024 02:47:00 -0300   KubeletReady                 kubelet is posting ready status
Addresses:
  InternalIP:  192.168.49.2
  Hostname:    minikube
Capacity:
  cpu:                2
  ephemeral-storage:  35804172Ki
  hugepages-1Gi:      0
  hugepages-2Mi:      0
  memory:             4010040Ki
  pods:               110
Allocatable:
  cpu:                2
  ephemeral-storage:  35804172Ki
  hugepages-1Gi:      0
  hugepages-2Mi:      0
  memory:             4010040Ki
  pods:               110
System Info:
  Machine ID:                 7158a9563d2b4a4788d310457c7b66f2
  System UUID:                57cd6b0e-7afd-4ea1-90ca-c8a530d56cb7
  Boot ID:                    4664b7ae-058d-412e-a82c-84662fd48ba8
  Kernel Version:             6.8.0-39-generic
  OS Image:                   Ubuntu 22.04.4 LTS
  Operating System:           linux
  Architecture:               amd64
  Container Runtime Version:  docker://26.1.1
  Kubelet Version:            v1.30.0
  Kube-Proxy Version:         v1.30.0
PodCIDR:                      10.244.0.0/24
PodCIDRs:                     10.244.0.0/24
Non-terminated Pods:          (15 in total)
  Namespace                   Name                                         CPU Requests  CPU Limits  Memory Requests  Memory Limits  Age
  ---------                   ----                                         ------------  ----------  ---------------  -------------  ---
  default                     app-java-teste-7c9966f88-scjmf               500m (25%)    2 (100%)    600Mi (15%)      1Gi (26%)      24m
  default                     app-java-teste-7c9966f88-tr94s               500m (25%)    2 (100%)    600Mi (15%)      1Gi (26%)      29m
  default                     kubernetes-bootcamp-644c5687f4-l7ptg         0 (0%)        0 (0%)      0 (0%)           0 (0%)         10d
  default                     kubernetes-bootcamp-644c5687f4-qphrd         0 (0%)        0 (0%)      0 (0%)           0 (0%)         10d
  default                     load-generator                               0 (0%)        0 (0%)      0 (0%)           0 (0%)         25m
  kube-system                 coredns-7db6d8ff4d-hhjb9                     100m (5%)     0 (0%)      70Mi (1%)        170Mi (4%)     10d
  kube-system                 etcd-minikube                                100m (5%)     0 (0%)      100Mi (2%)       0 (0%)         10d
  kube-system                 kube-apiserver-minikube                      250m (12%)    0 (0%)      0 (0%)           0 (0%)         10d
  kube-system                 kube-controller-manager-minikube             200m (10%)    0 (0%)      0 (0%)           0 (0%)         10d
  kube-system                 kube-proxy-qt95c                             0 (0%)        0 (0%)      0 (0%)           0 (0%)         10d
  kube-system                 kube-scheduler-minikube                      100m (5%)     0 (0%)      0 (0%)           0 (0%)         10d
  kube-system                 metrics-server-c59844bb4-d62cf               100m (5%)     0 (0%)      200Mi (5%)       0 (0%)         10d
  kube-system                 storage-provisioner                          0 (0%)        0 (0%)      0 (0%)           0 (0%)         10d
  kubernetes-dashboard        dashboard-metrics-scraper-b5fc48f67-fvr4z    0 (0%)        0 (0%)      0 (0%)           0 (0%)         10d
  kubernetes-dashboard        kubernetes-dashboard-779776cb65-pw9sf        0 (0%)        0 (0%)      0 (0%)           0 (0%)         10d
Allocated resources:
  (Total limits may be over 100 percent, i.e., overcommitted.)
  Resource           Requests      Limits
  --------           --------      ------
  cpu                1850m (92%)   4 (200%)
  memory             1570Mi (40%)  2218Mi (56%)
  ephemeral-storage  0 (0%)        0 (0%)
  hugepages-1Gi      0 (0%)        0 (0%)
  hugepages-2Mi      0 (0%)        0 (0%)
Events:
  Type    Reason                   Age                From             Message
  ----    ------                   ----               ----             -------
  Normal  Starting                 47m                kube-proxy       
  Normal  Starting                 47m                kubelet          Starting kubelet.
  Normal  NodeAllocatableEnforced  47m                kubelet          Updated Node Allocatable limit across pods
  Normal  NodeHasSufficientMemory  47m (x8 over 47m)  kubelet          Node minikube status is now: NodeHasSufficientMemory
  Normal  NodeHasNoDiskPressure    47m (x8 over 47m)  kubelet          Node minikube status is now: NodeHasNoDiskPressure
  Normal  NodeHasSufficientPID     47m (x7 over 47m)  kubelet          Node minikube status is now: NodeHasSufficientPID
  Normal  RegisteredNode           47m                node-controller  Node minikube event: Registered Node minikube in Controller
```  

Evento: 48 min - carga dobrada (2 loaders-generators)

```
douglas@minikube-lubuntu:~/cluster_kubernetes$ kubectl events
LAST SEEN              TYPE      REASON              OBJECT                                   MESSAGE
57m                    Normal    ScalingReplicaSet   Deployment/app-java-teste                Scaled up replica set app-java-teste-7c9966f88 to 1
57m                    Normal    SuccessfulCreate    ReplicaSet/app-java-teste-7c9966f88      Created pod: app-java-teste-7c9966f88-tr94s
57m                    Normal    Scheduled           Pod/app-java-teste-7c9966f88-tr94s       Successfully assigned default/app-java-teste-7c9966f88-tr94s to minikube
57m                    Normal    Pulling             Pod/app-java-teste-7c9966f88-tr94s       Pulling image "douglasbc1984/app-java-teste"
57m                    Normal    Pulled              Pod/app-java-teste-7c9966f88-tr94s       Successfully pulled image "douglasbc1984/app-java-teste" in 1.7s (1.7s including waiting). Image size: 1244918946 bytes.
57m                    Normal    Started             Pod/app-java-teste-7c9966f88-tr94s       Started container app-java-teste
57m                    Normal    Created             Pod/app-java-teste-7c9966f88-tr94s       Created container app-java-teste
56m                    Normal    Pulled              Pod/load-generator                       Container image "busybox:1.28" already present on machine
56m                    Normal    Created             Pod/load-generator                       Created container load-generator
56m                    Normal    Started             Pod/load-generator                       Started container load-generator
56m                    Normal    Scheduled           Pod/load-generator                       Successfully assigned default/load-generator to minikube
54m                    Normal    Scheduled           Pod/load-generator                       Successfully assigned default/load-generator to minikube
54m                    Normal    Pulled              Pod/load-generator                       Container image "busybox:1.28" already present on machine
53m                    Normal    Started             Pod/load-generator                       Started container load-generator
53m                    Normal    Created             Pod/load-generator                       Created container load-generator
53m                    Normal    SuccessfulRescale   HorizontalPodAutoscaler/app-java-teste   New size: 3; reason: cpu resource utilization (percentage of request) above target
53m                    Normal    SuccessfulCreate    ReplicaSet/app-java-teste-7c9966f88      Created pod: app-java-teste-7c9966f88-q2nj9
53m                    Normal    Pulling             Pod/app-java-teste-7c9966f88-scjmf       Pulling image "douglasbc1984/app-java-teste"
53m                    Normal    Scheduled           Pod/app-java-teste-7c9966f88-scjmf       Successfully assigned default/app-java-teste-7c9966f88-scjmf to minikube
53m                    Normal    SuccessfulCreate    ReplicaSet/app-java-teste-7c9966f88      Created pod: app-java-teste-7c9966f88-scjmf
53m                    Normal    ScalingReplicaSet   Deployment/app-java-teste                Scaled up replica set app-java-teste-7c9966f88 to 3 from 1
53m                    Normal    Pulled              Pod/app-java-teste-7c9966f88-scjmf       Successfully pulled image "douglasbc1984/app-java-teste" in 1.668s (1.668s including waiting). Image size: 1244918946 bytes.
53m                    Normal    Created             Pod/app-java-teste-7c9966f88-scjmf       Created container app-java-teste
53m                    Normal    Started             Pod/app-java-teste-7c9966f88-scjmf       Started container app-java-teste
50m                    Normal    SuccessfulCreate    ReplicaSet/app-java-teste-7c9966f88      Created pod: app-java-teste-7c9966f88-swbff
50m                    Normal    SuccessfulRescale   HorizontalPodAutoscaler/app-java-teste   New size: 4; reason: cpu resource utilization (percentage of request) above target
50m                    Normal    ScalingReplicaSet   Deployment/app-java-teste                Scaled up replica set app-java-teste-7c9966f88 to 4 from 3
7m36s                  Normal    Scheduled           Pod/load-generator-2                     Successfully assigned default/load-generator-2 to minikube
7m35s                  Normal    Pulled              Pod/load-generator-2                     Container image "busybox:1.28" already present on machine
7m35s                  Normal    Created             Pod/load-generator-2                     Created container load-generator-2
7m35s                  Normal    Started             Pod/load-generator-2                     Started container load-generator-2
6m17s                  Normal    ScalingReplicaSet   Deployment/app-java-teste                Scaled up replica set app-java-teste-7c9966f88 to 6 from 4
6m17s                  Normal    SuccessfulRescale   HorizontalPodAutoscaler/app-java-teste   New size: 6; reason: cpu resource utilization (percentage of request) above target
6m17s                  Normal    SuccessfulCreate    ReplicaSet/app-java-teste-7c9966f88      Created pod: app-java-teste-7c9966f88-5phdm
6m16s                  Normal    SuccessfulCreate    ReplicaSet/app-java-teste-7c9966f88      Created pod: app-java-teste-7c9966f88-c65wr
4m50s (x10 over 50m)   Warning   FailedScheduling    Pod/app-java-teste-7c9966f88-swbff       0/1 nodes are available: 1 Insufficient cpu. preemption: 0/1 nodes are available: 1 No preemption victims found for incoming pod.
2m20s (x11 over 53m)   Warning   FailedScheduling    Pod/app-java-teste-7c9966f88-q2nj9       0/1 nodes are available: 1 Insufficient cpu. preemption: 0/1 nodes are available: 1 No preemption victims found for incoming pod.
50s (x2 over 6m16s)    Warning   FailedScheduling    Pod/app-java-teste-7c9966f88-5phdm       0/1 nodes are available: 1 Insufficient cpu. preemption: 0/1 nodes are available: 1 No preemption victims found for incoming pod.
50s (x2 over 6m16s)    Warning   FailedScheduling    Pod/app-java-teste-7c9966f88-c65wr       0/1 nodes are available: 1 Insufficient cpu. preemption: 0/1 nodes are available: 1 No preemption victims found for incoming pod.

```

Evento: 60 min - removendo uma das cargas

Evento: 72 min - removendo a segunda carga

Eventos em 91 min:

```
douglas@minikube-lubuntu:~/cluster_kubernetes$ kubectl events
LAST SEEN              TYPE      REASON              OBJECT                                   MESSAGE
44m                    Normal    Scheduled           Pod/load-generator-2                     Successfully assigned default/load-generator-2 to minikube
44m                    Normal    Pulled              Pod/load-generator-2                     Container image "busybox:1.28" already present on machine
44m                    Normal    Created             Pod/load-generator-2                     Created container load-generator-2
44m                    Normal    Started             Pod/load-generator-2                     Started container load-generator-2
42m                    Normal    SuccessfulCreate    ReplicaSet/app-java-teste-7c9966f88      Created pod: app-java-teste-7c9966f88-5phdm
42m                    Normal    SuccessfulRescale   HorizontalPodAutoscaler/app-java-teste   New size: 6; reason: cpu resource utilization (percentage of request) above target
42m                    Normal    ScalingReplicaSet   Deployment/app-java-teste                Scaled up replica set app-java-teste-7c9966f88 to 6 from 4
42m                    Normal    SuccessfulCreate    ReplicaSet/app-java-teste-7c9966f88      Created pod: app-java-teste-7c9966f88-c65wr
2m15s (x9 over 42m)    Warning   FailedScheduling    Pod/app-java-teste-7c9966f88-5phdm       0/1 nodes are available: 1 Insufficient cpu. preemption: 0/1 nodes are available: 1 No preemption victims found for incoming pod.
2m15s (x9 over 42m)    Warning   FailedScheduling    Pod/app-java-teste-7c9966f88-c65wr       0/1 nodes are available: 1 Insufficient cpu. preemption: 0/1 nodes are available: 1 No preemption victims found for incoming pod.
2m15s (x19 over 89m)   Warning   FailedScheduling    Pod/app-java-teste-7c9966f88-q2nj9       0/1 nodes are available: 1 Insufficient cpu. preemption: 0/1 nodes are available: 1 No preemption victims found for incoming pod.
2m15s (x18 over 86m)   Warning   FailedScheduling    Pod/app-java-teste-7c9966f88-swbff       0/1 nodes are available: 1 Insufficient cpu. preemption: 0/1 nodes are available: 1 No preemption victims found for incoming pod.
```

Monitoramento total do teste:

```
douglas@minikube-lubuntu:~/cluster_kubernetes$ kubectl get hpa -w
NAME             REFERENCE                   TARGETS                                       MINPODS   MAXPODS   REPLICAS   AGE
app-java-teste   Deployment/app-java-teste   cpu: <unknown>/50%, memory: <unknown>/650Mi   1         10        0          15s
app-java-teste   Deployment/app-java-teste   cpu: 8%/50%, memory: 470851584/650Mi          1         10        1          15s
app-java-teste   Deployment/app-java-teste   cpu: 1%/50%, memory: 471166976/650Mi          1         10        1          60s
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%, memory: 471404544/650Mi          1         10        1          2m1s
app-java-teste   Deployment/app-java-teste   cpu: 113%/50%, memory: 743280640/650Mi        1         10        1          3m1s
app-java-teste   Deployment/app-java-teste   cpu: 113%/50%, memory: 743280640/650Mi        1         10        3          3m16s
app-java-teste   Deployment/app-java-teste   cpu: 90%/50%, memory: 694192128/650Mi         1         10        3          4m1s
app-java-teste   Deployment/app-java-teste   cpu: 81%/50%, memory: 695443456/650Mi         1         10        3          5m1s
app-java-teste   Deployment/app-java-teste   cpu: 82%/50%, memory: 695785472/650Mi         1         10        3          6m1s
app-java-teste   Deployment/app-java-teste   cpu: 82%/50%, memory: 695785472/650Mi         1         10        4          6m16s
app-java-teste   Deployment/app-java-teste   cpu: 83%/50%, memory: 695799808/650Mi         1         10        4          7m1s
app-java-teste   Deployment/app-java-teste   cpu: 81%/50%, memory: 697315328/650Mi         1         10        4          8m1s
app-java-teste   Deployment/app-java-teste   cpu: 86%/50%, memory: 697344k/650Mi           1         10        4          9m1s
app-java-teste   Deployment/app-java-teste   cpu: 82%/50%, memory: 697430016/650Mi         1         10        4          10m
app-java-teste   Deployment/app-java-teste   cpu: 78%/50%, memory: 697325568/650Mi         1         10        4          11m
app-java-teste   Deployment/app-java-teste   cpu: 87%/50%, memory: 697890816/650Mi         1         10        4          12m
app-java-teste   Deployment/app-java-teste   cpu: 83%/50%, memory: 698195968/650Mi         1         10        4          13m
app-java-teste   Deployment/app-java-teste   cpu: 85%/50%, memory: 698238976/650Mi         1         10        4          14m
app-java-teste   Deployment/app-java-teste   cpu: 84%/50%, memory: 698505216/650Mi         1         10        4          15m
app-java-teste   Deployment/app-java-teste   cpu: 79%/50%, memory: 698576896/650Mi         1         10        4          16m
app-java-teste   Deployment/app-java-teste   cpu: 84%/50%, memory: 698601472/650Mi         1         10        4          17m
app-java-teste   Deployment/app-java-teste   cpu: 77%/50%, memory: 698073088/650Mi         1         10        4          18m
app-java-teste   Deployment/app-java-teste   cpu: 80%/50%, memory: 698079232/650Mi         1         10        4          19m
app-java-teste   Deployment/app-java-teste   cpu: 77%/50%, memory: 698163200/650Mi         1         10        4          20m
app-java-teste   Deployment/app-java-teste   cpu: 84%/50%, memory: 698161152/650Mi         1         10        4          21m
app-java-teste   Deployment/app-java-teste   cpu: 83%/50%, memory: 698155008/650Mi         1         10        4          22m
app-java-teste   Deployment/app-java-teste   cpu: 83%/50%, memory: 698517504/650Mi         1         10        4          23m
app-java-teste   Deployment/app-java-teste   cpu: 86%/50%, memory: 748058624/650Mi         1         10        4          24m
app-java-teste   Deployment/app-java-teste   cpu: 83%/50%, memory: 747026432/650Mi         1         10        4          25m
app-java-teste   Deployment/app-java-teste   cpu: 84%/50%, memory: 746194944/650Mi         1         10        4          26m
app-java-teste   Deployment/app-java-teste   cpu: 78%/50%, memory: 745121792/650Mi         1         10        4          27m
app-java-teste   Deployment/app-java-teste   cpu: 78%/50%, memory: 744265728/650Mi         1         10        4          28m
app-java-teste   Deployment/app-java-teste   cpu: 75%/50%, memory: 752754688/650Mi         1         10        4          29m
app-java-teste   Deployment/app-java-teste   cpu: 71%/50%, memory: 752701440/650Mi         1         10        4          30m
app-java-teste   Deployment/app-java-teste   cpu: 82%/50%, memory: 752560128/650Mi         1         10        4          31m
app-java-teste   Deployment/app-java-teste   cpu: 86%/50%, memory: 752629760/650Mi         1         10        4          32m
app-java-teste   Deployment/app-java-teste   cpu: 77%/50%, memory: 752662528/650Mi         1         10        4          33m
app-java-teste   Deployment/app-java-teste   cpu: 85%/50%, memory: 752207872/650Mi         1         10        4          34m
app-java-teste   Deployment/app-java-teste   cpu: 84%/50%, memory: 752322560/650Mi         1         10        4          35m
app-java-teste   Deployment/app-java-teste   cpu: 87%/50%, memory: 752451584/650Mi         1         10        4          36m
app-java-teste   Deployment/app-java-teste   cpu: 79%/50%, memory: 752629760/650Mi         1         10        4          37m
app-java-teste   Deployment/app-java-teste   cpu: 81%/50%, memory: 753039360/650Mi         1         10        4          38m
app-java-teste   Deployment/app-java-teste   cpu: 77%/50%, memory: 753244160/650Mi         1         10        4          39m
app-java-teste   Deployment/app-java-teste   cpu: 81%/50%, memory: 752926720/650Mi         1         10        4          40m
app-java-teste   Deployment/app-java-teste   cpu: 86%/50%, memory: 753172480/650Mi         1         10        4          41m
app-java-teste   Deployment/app-java-teste   cpu: 84%/50%, memory: 753080320/650Mi         1         10        4          42m
app-java-teste   Deployment/app-java-teste   cpu: 80%/50%, memory: 753096704/650Mi         1         10        4          43m
app-java-teste   Deployment/app-java-teste   cpu: 81%/50%, memory: 753170432/650Mi         1         10        4          44m
app-java-teste   Deployment/app-java-teste   cpu: 80%/50%, memory: 753260544/650Mi         1         10        4          45m
app-java-teste   Deployment/app-java-teste   cpu: 80%/50%, memory: 753354752/650Mi         1         10        4          46m
app-java-teste   Deployment/app-java-teste   cpu: 84%/50%, memory: 753410048/650Mi         1         10        4          47m
app-java-teste   Deployment/app-java-teste   cpu: 80%/50%, memory: 753412096/650Mi         1         10        4          48m
app-java-teste   Deployment/app-java-teste   cpu: 97%/50%, memory: 753571840/650Mi         1         10        4          48m
app-java-teste   Deployment/app-java-teste   cpu: 147%/50%, memory: 751785984/650Mi        1         10        4          49m
app-java-teste   Deployment/app-java-teste   cpu: 147%/50%, memory: 751785984/650Mi        1         10        6          50m
app-java-teste   Deployment/app-java-teste   cpu: 147%/50%, memory: 751785984/650Mi        1         10        6          50m
app-java-teste   Deployment/app-java-teste   cpu: 156%/50%, memory: 751611904/650Mi        1         10        6          51m
app-java-teste   Deployment/app-java-teste   cpu: 143%/50%, memory: 751751168/650Mi        1         10        6          52m
app-java-teste   Deployment/app-java-teste   cpu: 160%/50%, memory: 751521792/650Mi        1         10        6          53m
app-java-teste   Deployment/app-java-teste   cpu: 160%/50%, memory: 751915008/650Mi        1         10        6          54m
app-java-teste   Deployment/app-java-teste   cpu: 156%/50%, memory: 753166336/650Mi        1         10        6          55m
app-java-teste   Deployment/app-java-teste   cpu: 153%/50%, memory: 753201152/650Mi        1         10        6          56m
app-java-teste   Deployment/app-java-teste   cpu: 140%/50%, memory: 752893952/650Mi        1         10        6          57m
app-java-teste   Deployment/app-java-teste   cpu: 143%/50%, memory: 753700864/650Mi        1         10        6          60m
app-java-teste   Deployment/app-java-teste   cpu: 136%/50%, memory: 753700864/650Mi        1         10        6          60m
app-java-teste   Deployment/app-java-teste   cpu: 74%/50%, memory: 753711104/650Mi         1         10        6          61m
app-java-teste   Deployment/app-java-teste   cpu: 85%/50%, memory: 753537024/650Mi         1         10        6          62m
app-java-teste   Deployment/app-java-teste   cpu: 82%/50%, memory: 753360896/650Mi         1         10        6          63m
app-java-teste   Deployment/app-java-teste   cpu: 84%/50%, memory: 753278976/650Mi         1         10        6          64m
app-java-teste   Deployment/app-java-teste   cpu: 80%/50%, memory: 753381376/650Mi         1         10        6          65m
app-java-teste   Deployment/app-java-teste   cpu: 82%/50%, memory: 753186816/650Mi         1         10        6          66m
app-java-teste   Deployment/app-java-teste   cpu: 82%/50%, memory: 753186816/650Mi         1         10        6          67m
app-java-teste   Deployment/app-java-teste   cpu: 82%/50%, memory: 753018880/650Mi         1         10        6          68m
app-java-teste   Deployment/app-java-teste   cpu: 78%/50%, memory: 752846848/650Mi         1         10        6          69m
app-java-teste   Deployment/app-java-teste   cpu: 78%/50%, memory: 752773120/650Mi         1         10        6          70m
app-java-teste   Deployment/app-java-teste   cpu: 87%/50%, memory: 752865280/650Mi         1         10        6          71m
app-java-teste   Deployment/app-java-teste   cpu: 85%/50%, memory: 752867328/650Mi         1         10        6          72m
app-java-teste   Deployment/app-java-teste   cpu: 80%/50%, memory: 752867328/650Mi         1         10        6          73m
app-java-teste   Deployment/app-java-teste   cpu: 6%/50%, memory: 752564224/650Mi          1         10        6          74m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%, memory: 753385472/650Mi          1         10        6          75m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%, memory: 753164288/650Mi          1         10        6          76m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%, memory: 753229824/650Mi          1         10        6          79m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%, memory: 753231872/650Mi          1         10        6          89m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%, memory: 752979968/650Mi          1         10        6          91m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%, memory: 752984064/650Mi          1         10        6          92m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%, memory: 752814080/650Mi          1         10        6          101m
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%, memory: 752816128/650Mi          1         10        6          106m

```
Depois de 5h32 min:
```
app-java-teste   Deployment/app-java-teste   cpu: 0%/50%, memory: 751179776/650Mi   1         10        6          5h32m
```
  
