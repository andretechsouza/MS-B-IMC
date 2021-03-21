package br.com.microservico.imc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class IMCService {

    private static final Logger LOGGER = LoggerFactory.getLogger(IMCService.class);

    public Long processaIMC(double peso, double altura){
        var calculo = peso / (altura * altura);
        return Math.round(calculo);
    }
}
