package com.ufpso.tienda.repository;


import com.ufpso.tienda.model.AddressModel;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<AddressModel,Long> {
}
