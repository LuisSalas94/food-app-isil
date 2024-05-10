package com.foodapp.controller;


import com.foodapp.model.Usuario;
import com.foodapp.model.UsuarioRequest;
import com.foodapp.model.UsuarioResponse;
import com.foodapp.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = {"http://localhost:4200"})

public class UsuarioController {


    @Autowired
    private IUsuarioService service;

    @GetMapping
    public List<Usuario> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Usuario findById(@PathVariable("id") int id) {
        return service.findById(id);
    }


    @PostMapping
    public Usuario save(@RequestBody Usuario usuario) {
        return service.save(usuario);
    }

    @PutMapping()
    public ResponseEntity<UsuarioResponse>updateUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        return ResponseEntity.ok(service.updateUser(usuarioRequest));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
        service.deleteById(id);
    }
}
