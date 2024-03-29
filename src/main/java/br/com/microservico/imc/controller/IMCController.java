package br.com.microservico.imc.controller;

import br.com.microservico.imc.dto.IMCDTO;
import br.com.microservico.imc.service.IMCService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.TimeZone;

@RestController
@RequestMapping("/imc")
public class IMCController {

    private final IMCService imcService;

    public IMCController(IMCService imcService) {
        this.imcService = imcService;
    }

    @GetMapping("/health")
    public String health(){

        TimeZone tz = TimeZone.getTimeZone("GMT-3");
        TimeZone.setDefault(tz);
        return Calendar.getInstance(tz).getTime().toString();
    }


    @GetMapping(value = "/consulta")
    public ResponseEntity<IMCDTO> consultaIMC(@RequestParam(value = "altura", required = true) float altura,
                                              @RequestParam(value = "peso", required = true) float peso,
                                              @RequestParam(value = "nome", required = true) String nome){

        IMCDTO imcdto = new IMCDTO();
        ResponseEntity<IMCDTO> response = null;
        imcdto.setImc(imcService.processaIMC(peso, altura));
        imcdto.setNome(nome);

        try{
            if(imcdto.getImc() < 18.5){
                imcdto.setMsg("Baixo peso");
            }else if(imcdto.getImc() >= 18.5 && imcdto.getImc() < 24.9){
                imcdto.setMsg("Peso ideal");
            }else if(imcdto.getImc() >= 25 && imcdto.getImc() <= 29.9 ){
                imcdto.setMsg("Sobrepeso");
            }else if(imcdto.getImc() >= 30 && imcdto.getImc() <= 34.9){
                imcdto.setMsg("Obesidade Grau 1");
            }else if(imcdto.getImc() >= 35 && imcdto.getImc() <= 39.9){
                imcdto.setMsg("Obesidade Grau 2");
            }else if(imcdto.getImc() >= 40){
                imcdto.setMsg("Obesidade Grau 3");
            }
            response = new ResponseEntity<IMCDTO>(imcdto, HttpStatus.OK);
            System.out.println("[IMC] - Processamento realizado com sucesso");
        }catch (Exception e){
            System.out.println("[IMC] - Ocorreu um erro durante o processamento "+ e);
            response = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return response;
    }
}
