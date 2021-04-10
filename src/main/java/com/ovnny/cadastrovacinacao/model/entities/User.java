package com.ovnny.cadastrovacinacao.model.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    final String nome;

    @Column(nullable = false, unique = true)
    final String email;

    @Column(nullable = false, unique = true)
    final String cpf;

    @Column(nullable = false)
    final LocalDateTime dataNascimento;

    @Column(nullable = false, columnDefinition = "boolean default false")
    private Boolean isRiskGroup;

    public User(String nome, String email, String cpf, LocalDateTime dataNascimento) {
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

    private LocalDateTime getDatanascimento() {
        return dataNascimento;
    }

    private Boolean getIsRiskGroup() {
        return isRiskGroup;
    }

    private void setIsRiskGroup(Boolean riskGroup) {
        isRiskGroup = riskGroup;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) && nome.equals(user.nome) && email.equals(user.email) && cpf.equals(user.cpf) && dataNascimento.equals(user.dataNascimento) && isRiskGroup.equals(user.isRiskGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, cpf, dataNascimento, isRiskGroup);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", isRiskGroup=" + isRiskGroup +
                '}';
    }
}
