package br.uniesp.si.techback.service;

import br.uniesp.si.techback.model.Usuario;
import br.uniesp.si.techback.repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository repository;
    public Usuario cadastrar(Usuario usuario){
        return repository.save(usuario);
    }

    public List<Usuario> listar(){
        return repository.findAll();
    }

    public void excluir(Integer id){
        repository.deleteById(id);
    }

    public Usuario alterar(Usuario usuario) {
        if (usuario.getId() == null) {
            throw new EntityNotFoundException("Usuário não existe");
        }
        return repository.save(usuario);
    }
}
