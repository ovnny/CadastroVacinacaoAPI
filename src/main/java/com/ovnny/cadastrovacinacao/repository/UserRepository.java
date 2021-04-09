package com.ovnny.cadastrovacinacao.repository;

import com.ovnny.cadastrovacinacao.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(long id);
}
