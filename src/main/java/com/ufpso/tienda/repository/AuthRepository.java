package com.ufpso.tienda.repository;

import com.ufpso.tienda.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthRepository extends JpaRepository<UserModel, Integer> {
    public Optional<UserModel> findByEmail(String email);
}
