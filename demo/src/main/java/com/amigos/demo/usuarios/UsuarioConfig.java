package com.amigos.demo.usuarios;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {
    CommandLineRunner commandLineRunner(UsuarioRepository repository){
        return args -> {
            new Usuario(1L,
                    "Antonio",
                    "802020",
                    "toni@gmail.com");
        };
    }
}
