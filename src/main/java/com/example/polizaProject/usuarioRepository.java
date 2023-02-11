package com.example.polizaProject;

import com.example.polizaProject.usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuarioRepository extends CrudRepository<usuario, Long> {
}
