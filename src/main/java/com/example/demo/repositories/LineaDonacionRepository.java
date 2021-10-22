package com.example.demo.repositories;

//import java.util.ArrayList;
import com.example.demo.models.LineaDonacionModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Declaracion del repositorio
@Repository
public interface LineaDonacionRepository extends CrudRepository <LineaDonacionModel, Long> {

    //Aqui se declararian metodos adicionales en caso de ser necesario
    
}

