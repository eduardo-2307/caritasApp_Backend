package com.example.demo.repositories;

import java.util.ArrayList;
import com.example.demo.models.LineaDonacionModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineaDonacionRepository extends CrudRepository <LineaDonacionModel, Long> {

    public abstract ArrayList<LineaDonacionModel> findById_articulo(String id_articulo);
    
}

