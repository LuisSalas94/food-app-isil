package com.foodapp.controller;


import com.foodapp.model.Usuario;
import com.foodapp.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api/usuarios")
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

    @PutMapping
    public Usuario update(@RequestBody Usuario usuario) {
        return service.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
        service.deleteById(id);
    }
}
