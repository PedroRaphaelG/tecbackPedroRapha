package br.uniesp.si.techback.controller;


 import br.uniesp.si.techback.model.EnderecoViaCep;
 import br.uniesp.si.techback.service.CepService;
 import lombok.RequiredArgsConstructor;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PathVariable;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ceps")
@RequiredArgsConstructor
public class EnderecoController {

    private final CepService cepService;

    @GetMapping("/{cep}")
    EnderecoViaCep consultarCep(@PathVariable String cep){
        return cepService.buscarEnderecoPorCep(cep);
    }
}