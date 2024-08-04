package br.usp.kubernetes_java_teste;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class AlocarMemoria {

    public static void trabalhaMemoriaThread() {


        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        Runnable tarefaMonitoramento = () -> {
            ArrayList<Byte[]> array = new ArrayList<>();
            for (int i = 0; i < 20; i++){
                array.add(alocarMemoria());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            array.clear();          
            System.gc();
            // Imprime mensagem para indicar que a memória foi liberada
            System.out.println("Memória liberada.");
        };
        executor.scheduleAtFixedRate(tarefaMonitoramento, 0, 100, TimeUnit.MILLISECONDS);

    }

    private static Byte[] alocarMemoria(){
         // Tamanho em bytes para alocar (25 MB)
         long sizeInBytes = 25L * 1024L * 1024L;

         // Aloca a memória
         Byte[] memoryBlock = new Byte[(int) sizeInBytes];
 
         // Preenche o array com algum valor para garantir que a memória seja realmente alocada
         for (int i = 0; i < memoryBlock.length; i++) {
             memoryBlock[i] = 1;
         }
 
         // Imprime mensagem para indicar que a memória foi alocada
         System.out.println("Memória de mais de 25 MB alocada.");
        return memoryBlock;
    }
}
