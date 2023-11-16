package com.ufpso.tienda.repository;
import com.ufpso.tienda.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel,Long> {

}
