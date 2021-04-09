package com.ovnny.cadastrovacinacaozup.model.entities;

import javax.persistence.*;
import java.text.DateFormat;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    final String nome;

    @Column(nullable = false, unique = true)
    final String email;

    @Column(nullable = false, unique = true)
    final String cpf;

    @Column(nullable = false)
    final DateFormat dataNascimento;

    @Column(nullable = false, columnDefinition = "boolean default false")
    private Boolean isRiskGroup;

    public User(String nome, String email, String cpf, DateFormat dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    private Long getId() {
        return id;
    }

    private String getNome() {
        return nome;
    }

    private String getEmail() {
        return email;
    }

    private String getCpf() {
        return cpf;
    }

    private DateFormat getDatanascimento() {
        return dataNascimento;
    }

    private Boolean setIsRiskGroup() {
        return true;
    }
}
