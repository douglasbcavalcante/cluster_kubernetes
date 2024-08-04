package br.usp.kubernetes_java_teste;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class GeradorNumeroPrimo {
    private static final SecureRandom random = new SecureRandom();
    private static Long tempoDeProcessamento;
    private static Double memoria;
    private static Double carga;

    public static Long getTempoDeProcessamento() {
        return tempoDeProcessamento;
    }

    public static BigInteger gerarNumeroPrimoGrande(int comprimentoBits) {
        BigInteger primo;

        long inicio = System.nanoTime();
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();

        List<Double> cargas = new ArrayList<>();
        List<Long> memorias = new ArrayList<>();

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        Runnable tarefaMonitoramento = () -> {
            double c = osBean.getSystemLoadAverage();
            long m = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            cargas.add(c);
            memorias.add(m);
        };
        executor.scheduleAtFixedRate(tarefaMonitoramento, 0, 100, TimeUnit.MILLISECONDS);

        while (true) {
            primo = new BigInteger(comprimentoBits, random);
            if (isProvavelmentePrimo(primo, 100)) { // 100 iterações para maior certeza
                break;
            }
        }
        long fim = System.nanoTime();
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tempoDeProcessamento = (fim - inicio) / 1_000_000;
        DoubleSummaryStatistics estatCargas = cargas.stream().mapToDouble(Double::doubleValue).summaryStatistics();
        carga = estatCargas.getAverage();
        LongSummaryStatistics estatMem = memorias.stream().mapToLong(Long::longValue).summaryStatistics();
        memoria =  estatMem.getAverage() / (1024 * 1024); // Retorna o uso de memória em MB
        return primo;
    }

    public static boolean isProvavelmentePrimo(BigInteger numero, int iteracoes) {
        return numero.isProbablePrime(iteracoes);
    }

    public static SecureRandom getRandom() {
        return random;
    }

    public static Double getMemoria() {
        return memoria;
    }

    public static Double getCarga() {
        return carga;
    }

}
