package com.example.demo.repositories;

import java.util.ArrayList;
import com.example.demo.models.DonacionModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Declaracion del repositorio
@Repository
public interface DonacionRepository extends CrudRepository <DonacionModel, Long> {
    //Metodo de busqueda por status de donacion
    public abstract ArrayList<DonacionModel> findByStatus(String status);
    
} 

