package com.amigos.demo.usuarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/usuario")
public class UsuarioController {
    @GetMapping
    public List<Usuario> getUsuarios(){
        //new Usuario(2L,"javi","2323223","toto@gmail.com");
        return List.of(
                new Usuario(1L,
                        "Antonio",
                        "802020",
                        "toni@gmail.com")
        );
    }
}
