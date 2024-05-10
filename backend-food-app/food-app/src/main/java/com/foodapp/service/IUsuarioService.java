package com.foodapp.service;

import com.foodapp.model.Usuario;
import com.foodapp.model.UsuarioRequest;
import com.foodapp.model.UsuarioResponse;

import java.util.List;

public interface IUsuarioService {

    List<Usuario>findAll();

    Usuario findById(int id);

    Usuario save(Usuario usuario);

    UsuarioResponse updateUser(UsuarioRequest userRequest);

    void deleteById(int id);

}
