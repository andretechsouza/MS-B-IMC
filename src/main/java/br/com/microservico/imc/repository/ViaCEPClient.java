package br.com.microservico.imc.repository;

@FeignClient(url="https://viacep.com.br/ws/", name = "viacep")
public interface ViaCEPClient {
}
