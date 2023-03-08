package com.amigos.demo.usuarios;


import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioService {
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
