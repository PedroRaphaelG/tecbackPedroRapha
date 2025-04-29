package br.uniesp.si.techback.client;

import br.uniesp.si.techback.model.EnderecoViaCep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "viaCepClient", url = "https://viacep.com.br/ws")
public interface ViaCepClient {

    @GetMapping("/{cep}/json")
    EnderecoViaCep consultarCep(@PathVariable("cep") String cep);
}