package com.foodapp.serviceImpl;


import com.foodapp.model.Usuario;
import com.foodapp.repository.UsuarioRepo;
import com.foodapp.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    UsuarioRepo repo;


    @Override
    public List<Usuario> findAll() {
        return repo.findAll();
    }

    @Override
    public Usuario findById(int id) {
        return repo.findById(id).orElseThrow();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return repo.save(usuario);
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);
    }
}
