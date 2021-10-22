package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.RecepcionModel;
import com.example.demo.repositories.RecepcionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Declaracion del Service de recepcion
@Service 
public class RecepcionService {

    //Declaracion de las funciones obtener, guardar y eliminar recepcion
    @Autowired
    RecepcionRepository recepcionRepository;
    
    public ArrayList<RecepcionModel> obtenerRecepcion() {
        return (ArrayList<RecepcionModel>) recepcionRepository.findAll();
    }

    public RecepcionModel guardarRecepcion(RecepcionModel recepcion) {
        return recepcionRepository.save(recepcion);
    }

    public Optional<RecepcionModel> obtenerPorId(Long id) {
        return recepcionRepository.findById(id);
    }

    public boolean eliminarRecepcion(Long id) {
        try{
            recepcionRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
}
