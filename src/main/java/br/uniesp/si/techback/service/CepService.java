package br.uniesp.si.techback.service;

import br.uniesp.si.techback.client.ViaCepClient;
import br.uniesp.si.techback.model.EnderecoViaCep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CepService {

    private final ViaCepClient viaCepClient;

    public EnderecoViaCep buscarEnderecoPorCep(String cep) {
        return viaCepClient.consultarCep(cep);
    }
}