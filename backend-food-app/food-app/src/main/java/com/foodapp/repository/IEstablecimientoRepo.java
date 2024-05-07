package com.foodapp.repository;

import com.foodapp.model.Establecimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstablecimientoRepo extends JpaRepository<Establecimiento,Integer> {
}
