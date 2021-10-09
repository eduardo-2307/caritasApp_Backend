package com.example.demo.repositories;

//import java.util.ArrayList;

import com.example.demo.models.DonacionModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonacionRepository extends CrudRepository <DonacionModel, Long> {

    //public abstract ArrayList<DonacionModel> findByID(Long id);
    
} 

