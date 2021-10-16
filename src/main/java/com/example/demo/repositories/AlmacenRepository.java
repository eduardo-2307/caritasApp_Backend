package com.example.demo.repositories;

//import java.util.ArrayList;

import com.example.demo.models.AlmacenModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlmacenRepository extends CrudRepository <AlmacenModel, Long> {

    //public abstract ArrayList<AlmacenModel> findByStatus(String status);
    
} 
