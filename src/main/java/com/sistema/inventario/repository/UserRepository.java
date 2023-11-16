package com.sistema.inventario.repository;
import com.sistema.inventario.model.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<UserModel,Long> {
    Optional<UserModel> findByEmail(String email);
    Optional<UserModel> findByDocument(String document);
}
