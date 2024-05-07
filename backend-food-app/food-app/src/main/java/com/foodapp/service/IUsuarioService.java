package com.foodapp.service;

import com.foodapp.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    List<Usuario>findAll();

    Usuario findById(int id);

    Usuario save(Usuario usuario);

    void deleteById(int id);

}
