package com.ovnny.primeira_rest_api_dio.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;

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

    @Column(nullable = false)
    private Boolean isRiskGroup = false;

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
}
