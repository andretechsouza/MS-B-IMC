package br.com.microservico.imc.service;

import org.springframework.stereotype.Service;

@Service
public class IMCService {

    public Long processaIMC(double peso, double altura){
        var calculo = peso / (altura * altura);
        return Math.round(calculo);
    }
}
