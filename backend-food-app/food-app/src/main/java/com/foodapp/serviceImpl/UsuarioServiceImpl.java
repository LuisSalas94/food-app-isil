package com.foodapp.serviceImpl;


import com.foodapp.model.Rol;
import com.foodapp.model.Usuario;
import com.foodapp.model.UsuarioRequest;
import com.foodapp.model.UsuarioResponse;
import com.foodapp.repository.UsuarioRepo;
import com.foodapp.service.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
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

    @Transactional
    @Override
    public UsuarioResponse updateUser(UsuarioRequest usuarioRequest) {

        Usuario usuario = Usuario.builder()
                .id(usuarioRequest.getId())
                .firstname(usuarioRequest.getFirstname())
                .lastname(usuarioRequest.getLastname())
                .email(usuarioRequest.getEmail())
                        .rol(Rol.USER1)
                                .build();

                repo.updateUser(usuario.getId(),usuario.getFirstname(),usuario.getLastname(),usuario.getEmail());

                return new UsuarioResponse("El usuario se actualizo correctamnte");
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);
    }
}
