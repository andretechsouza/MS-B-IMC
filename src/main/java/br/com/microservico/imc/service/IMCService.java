package br.com.microservico.imc.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class IMCService {

    public Long processaIMC(double peso, double altura){
        var calculo = peso / (altura * altura);
        return Math.round(calculo);
    }
}
