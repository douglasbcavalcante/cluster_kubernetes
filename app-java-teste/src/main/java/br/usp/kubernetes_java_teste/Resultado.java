package br.usp.kubernetes_java_teste;

import java.math.BigInteger;

public class Resultado {

    private BigInteger primo;
    private Long tempoProcessamentoMs;
    private Double memoriaMB;
    private Double cargaCpu;

    public Resultado(){

    }

    public Resultado(BigInteger primo, Long tempoProcessamentoMs, Double memoriaMB, Double cargaCpu) {
        this.primo = primo;
        this.tempoProcessamentoMs = tempoProcessamentoMs;
        this.memoriaMB = memoriaMB;
        this.cargaCpu = cargaCpu;
    }

    public BigInteger getPrimo() {
        return primo;
    }

    public void setPrimo(BigInteger primo) {
        this.primo = primo;
    }

    public Long getTempoProcessamentoMs() {
        return tempoProcessamentoMs;
    }

    public void setTempoProcessamentoMs(Long tempoProcessamentoMs) {
        this.tempoProcessamentoMs = tempoProcessamentoMs;
    }

    public Double getMemoriaMB() {
        return memoriaMB;
    }

    public void setMemoriaMB(Double memoriaMB) {
        this.memoriaMB = memoriaMB;
    }

    public Double getCargaCpu() {
        return cargaCpu;
    }

    public void setCargaCpu(Double cargaCpu) {
        this.cargaCpu = cargaCpu;
    }

   

    
  
}
