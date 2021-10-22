package com.example.demo.repositories;

import java.util.ArrayList;
import com.example.demo.models.ProductoModel;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Declaracion del repositorio
@Repository
public interface ProductoRepository extends CrudRepository <ProductoModel, Long> {  
    //Metodo de busqueda de producto por UPC
    public abstract ArrayList<ProductoModel> findByUPC(String UPC);
    
}