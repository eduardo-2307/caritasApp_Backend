package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.LineaDonacionModel;
import com.example.demo.repositories.LineaDonacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Declaracion del Service de Linea_Donacion
@Service
public class LineaDonacionService {
    //Declaracion de las funciones obtener, guardar y eliminar Linea_Donacion
    @Autowired
    LineaDonacionRepository lineadonacionRepository;
    
    public ArrayList<LineaDonacionModel> obtenerLineaDonacion() {
        return (ArrayList<LineaDonacionModel>) lineadonacionRepository.findAll();
    }

    public LineaDonacionModel guardarLineaDonacion(LineaDonacionModel lineadonacion) {
        return lineadonacionRepository.save(lineadonacion);
    }

    public Optional<LineaDonacionModel> obtenerPorId(Long id) {
        return lineadonacionRepository.findById(id);
    }

    public boolean eliminarLineaDonacion(Long id) {
        try{
            lineadonacionRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
}
