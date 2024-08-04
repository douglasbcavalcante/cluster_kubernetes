package br.usp.kubernetes_java_teste;

import java.math.BigInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class JavaTesteController{
    JavaTesteController(){

    }

    @GetMapping("/inicia-teste")
    Resultado get(){
        int comprimentoBits = (int) ((Math.random() * (2048-32)) + 32);

        BigInteger primo = GeradorNumeroPrimo.gerarNumeroPrimoGrande(comprimentoBits);
        Long tempo = GeradorNumeroPrimo.getTempoDeProcessamento();
        Double memoria = GeradorNumeroPrimo.getMemoria();
        Double carga = GeradorNumeroPrimo.getCarga();
        Resultado resultado = new Resultado(primo, tempo, memoria, carga);
        return resultado;
    }
}