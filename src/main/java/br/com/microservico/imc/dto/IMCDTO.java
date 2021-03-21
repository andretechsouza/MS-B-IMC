package br.com.microservico.imc.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IMCDTO {

    private String nome;

    private float imc;

    private String msg;
}
