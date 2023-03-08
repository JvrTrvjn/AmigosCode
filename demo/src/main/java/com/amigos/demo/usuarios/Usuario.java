package com.amigos.demo.usuarios;

public class Usuario {
    private Long id;
    private String name;
    private String dni;
    private String email;


    public Usuario(Long id, String name, String dni, String email) {
        this.id = id;
        this.name = name;
        this.dni = dni;
        this.email = email;
    }

    public Usuario(String name, String dni, String email) {
        this.name = name;
        this.dni = dni;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
