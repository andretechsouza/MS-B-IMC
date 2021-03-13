package br.com.microservico.imc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imc")
public class IMCController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IMCController.class);

    @GetMapping(value = "/consulta")
    public String consultaIMC(){
        return "SETUP FUNCIONANDO!!!";
    }
}
