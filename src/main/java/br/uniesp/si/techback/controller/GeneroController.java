package br.uniesp.si.techback.controller;

import br.uniesp.si.techback.model.Genero;
import br.uniesp.si.techback.service.GeneroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/generos")
public class GeneroController {

    private final GeneroService service;
    @GetMapping
    public List<Genero> listar(){
        return service.listar();
    }
    @PostMapping
    public Genero incluir(@RequestBody Genero genero){
        return service.cadastrar(genero);
    }
    @PutMapping
    public Genero alterar(@RequestBody Genero genero){
        return service.alterar(genero);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete (@PathVariable Integer id){
        service.excluir(id);
        return ResponseEntity.ok().build();
    }
}
