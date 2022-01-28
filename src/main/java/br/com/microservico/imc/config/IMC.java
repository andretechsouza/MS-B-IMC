package br.com.microservico.imc.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.microservico.imc.config")
public class IMC {

    public static void main(String[] args) {
        SpringApplication.run(IMC.class, args);
    }
}
