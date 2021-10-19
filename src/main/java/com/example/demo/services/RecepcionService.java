package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.RecepcionModel;
import com.example.demo.repositories.RecepcionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class RecepcionService {

    @Autowired
    RecepcionRepository recepcionRepository;
    
    public ArrayList<RecepcionModel> obtenerRecepcion() {
        return (ArrayList<RecepcionModel>) recepcionRepository.findAll();
    }

    public RecepcionModel guardarRecepcion(RecepcionModel producto) {
        return recepcionRepository.save(producto);
    }

    public Optional<RecepcionModel> obtenerRecepcionPorId(Long id) {
        return recepcionRepository.findById(id);
    }

    public ArrayList<RecepcionModel> obtenerPorFolio_donacion(String folio_donacion) {
        return recepcionRepository.findByFolio_donacion(folio_donacion);
    }

    public boolean eliminarProducto(Long id) {
        try{
            recepcionRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
}
