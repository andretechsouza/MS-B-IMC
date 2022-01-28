package br.com.microservico.imc.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "br.com.microservico.imc.config")
@ComponentScan(value = "br.com.microservico.imc")
@EnableFeignClients
public class IMC {

    public static void main(String[] args) {
        SpringApplication.run(IMC.class, args);
    }
}
