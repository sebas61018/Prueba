package com.ufpso.tienda.service;

import com.ufpso.tienda.exception.NotFoundException;
import com.ufpso.tienda.model.UserModel;
import com.ufpso.tienda.repository.UserRepository;
import com.ufpso.tienda.util.ExceptionsConstants;
import com.ufpso.tienda.util.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    //Metodo para insertar
    public UserModel createUser(UserModel userModelReq){
        userModelReq.setPassword(passwordEncoder.encode(userModelReq.getPassword()));
        userModelReq.setRole(Role.USER);
        return userRepository.save(userModelReq);
    }

    public UserModel getUserById(Long id){
        if(id == null)
            throw new RuntimeException(ExceptionsConstants.USER_NOT_FOUND.getMessage());
        return userRepository.findById(id).orElseThrow(() -> new NotFoundException(ExceptionsConstants.USER_NOT_FOUND.getMessage()));
    }

    public List<UserModel> findAllUsers(){
        return (List<UserModel>) userRepository.findAll();
    }

    //Metodo para actializar un usuario
    public UserModel updateUser(UserModel userModelReq, Long id){
        if( id == null)
            throw new NotFoundException(ExceptionsConstants.USER_IS_NULL.getMessage());
        UserModel userModelBd = this.getUserById(id);
        userModelBd.setFirstName(userModelReq.getFirstName());
        userModelBd.setLastName(userModelReq.getLastName());
        userModelBd.setPhone(userModelReq.getPhone());
        return userRepository.save(userModelBd);
    }

    //Metodo para eliminar de una base de datos
    public boolean deleteUser(Long id){
        UserModel userModelBd = this.getUserById(id);
        userRepository.deleteById(userModelBd.getId());
        return true;
    }

}
