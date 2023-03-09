package com.amigos.demo.usuarios;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UsuarioConfig {
    @Bean
    CommandLineRunner commandLineRunner(UsuarioRepository repository){
        return args -> {
            Usuario antonio = new Usuario(1L,
                    "Antonio",
                    "802020",
                    "toni@gmail.com");
            Usuario ana = new Usuario(2L,
                    "Ana",
                    "305958",
                    "ana@gmail.com");
            Usuario alex = new Usuario(3L,
                    "Alex",
                    "345958",
                    "alexander@gmail.com");

            repository.saveAll(List.of(ana,alex));
        };
    }
}
