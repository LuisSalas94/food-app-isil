package com.foodapp.repository;

import com.foodapp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario,Integer> {
    Optional<Usuario> findByUsername(String username);

    @Modifying()
    @Query("update Usuario u set u.firstname=:firstname, u.lastname=:lastname,u.email=:email where u.id = :id")
    void updateUser(@Param(value = "id") Integer id, @Param(value = "firstname") String firstname, @Param(value = "lastname") String lastname,@Param(value="email") String email );

}
