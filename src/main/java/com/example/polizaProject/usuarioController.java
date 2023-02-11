package com.example.polizaProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuario")
public class usuarioController {
    @Autowired
    usuarioService usuarioService;

    @GetMapping()
    public ArrayList<usuario> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public usuario guardarUsuario(@RequestBody usuario usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }
}
