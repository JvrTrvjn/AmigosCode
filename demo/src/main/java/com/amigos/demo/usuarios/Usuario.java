package com.amigos.demo.usuarios;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;


@Entity
@Table
public class Usuario {
    @Id
    @SequenceGenerator(
            name = "usuario_sequence",
            sequenceName = "usuario_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "usuario_sequence"
    )
    private Long id;
    private String name;
    private String dni;
    private String email;
    private LocalDate dob;

    @Transient //this field right here
    // There is no need for you to be a column in our database(age will be calculated for us)
    private Integer age;

    public Usuario() {
    }

    public Usuario(Long id, String name, String dni, String email, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dni = dni;
        this.email = email;
        this.dob = dob;
    }

    public Usuario(String name, String dni, String email, LocalDate dob) {
        this.name = name;
        this.dni = dni;
        this.email = email;
        this.dob = dob;
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(this.dob,LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
