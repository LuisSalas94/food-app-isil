package com.foodapp.service;

import com.foodapp.model.Establecimiento;

import java.util.List;

public interface IEstablecimientoService {

    List<Establecimiento>findAll();

    Establecimiento findById(int id);

    Establecimiento save(Establecimiento establecimiento);

    void deleteById(int id);
}
