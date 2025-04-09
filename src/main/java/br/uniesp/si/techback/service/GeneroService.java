package br.uniesp.si.techback.service;

import br.uniesp.si.techback.model.Genero;
import br.uniesp.si.techback.repository.GeneroRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class GeneroService {


    private final GeneroRepository repository;
    public Genero cadastrar(Genero genero){
        return repository.save(genero);
    }

    public List<Genero> listar(){
        return repository.findAll();
    }

    public void excluir(Integer id){
        repository.deleteById(id);
    }

    public Genero alterar(Genero genero) {
        if (genero.getId() == null) {
            throw new EntityNotFoundException("Genero não existe");
        }
        return repository.save(genero);
    }
}
