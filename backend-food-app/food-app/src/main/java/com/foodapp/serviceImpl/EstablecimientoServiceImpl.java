package com.foodapp.serviceImpl;


import com.foodapp.model.Establecimiento;
import com.foodapp.repository.IEstablecimientoRepo;
import com.foodapp.service.IEstablecimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstablecimientoServiceImpl implements IEstablecimientoService {

    @Autowired
    IEstablecimientoRepo repo;

    @Override
    public List<Establecimiento> findAll() {
        return repo.findAll();
    }

    @Override
    public Establecimiento findById(int id) {
        return repo.findById(id).orElseThrow();
    }

    @Override
    public Establecimiento save(Establecimiento establecimiento) {
        return repo.save(establecimiento);
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);
    }
}
