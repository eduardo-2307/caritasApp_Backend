package com.example.demo.repositories;

import com.example.demo.models.AlmacenModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Declaracion del repositorio
@Repository
public interface AlmacenRepository extends CrudRepository <AlmacenModel, Long> {
    //Aqui se declararian metodos adicionales en caso de ser necesario
} 
