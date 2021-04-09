package com.ovnny.cadastrovacinacaozup.repository;

import com.ovnny.cadastrovacinacaozup.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(long id);
}
