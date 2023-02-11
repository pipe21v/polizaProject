package com.example.polizaProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class usuarioService {
    @Autowired
    usuarioRepository usuarioRepository;

    public ArrayList<usuario> obtenerUsuarios(){
        return (ArrayList<usuario>) usuarioRepository.findAll();
    }

    public usuario guardarUsuario(usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
