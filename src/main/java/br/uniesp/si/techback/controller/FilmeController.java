package br.uniesp.si.techback.controller;

import br.uniesp.si.techback.model.Filme;
import br.uniesp.si.techback.service.FilmeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/filmes")
public class FilmeController {

    private final FilmeService service;
    @GetMapping
    public List<Filme> listar(){
        return service.listar();
    }
    @GetMapping("/titulo/{titulo}")
    public List<Filme> listarFilmePorTitulo(@PathVariable String titulo){
        return service.listarFilmePorTitulo(titulo);
    }
    @PostMapping
    public Filme incluir(@RequestBody @Validated Filme filme){
        return service.cadastrar(filme);
    }
    @PutMapping
    public Filme alterar(@RequestBody Filme filme){
        return service.alterar(filme);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete (@PathVariable Integer id){
        service.excluir(id);
        return ResponseEntity.ok().build();
    }
}
