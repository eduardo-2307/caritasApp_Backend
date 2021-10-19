package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.RecepcionModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RecepcionRepository extends CrudRepository <RecepcionModel, Long> {  
    
    public abstract ArrayList<RecepcionModel> findByFolio_donacion(String folio_donacion);
    
}
