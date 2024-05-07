package com.foodapp.controller;


import com.foodapp.model.Establecimiento;
import com.foodapp.service.IEstablecimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/api/establecimientos")
public class EstablecimientoController {


    @Autowired
    private IEstablecimientoService service;

    @GetMapping
    public List<Establecimiento> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Establecimiento findById(@PathVariable("id") int id) {
        return service.findById(id);
    }


    @PostMapping
    public Establecimiento save(@RequestBody Establecimiento establecimiento) {
        return service.save(establecimiento);
    }

    @PutMapping
    public Establecimiento update(@RequestBody Establecimiento establecimiento) {
        return service.save(establecimiento);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
        service.deleteById(id);
    }


}
