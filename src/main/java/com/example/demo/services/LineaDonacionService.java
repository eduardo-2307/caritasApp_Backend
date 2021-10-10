package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.LineaDonacionModel;
import com.example.demo.repositories.LineaDonacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LineaDonacionService {

    @Autowired
    LineaDonacionRepository lineadonacionRepository;
    
    public ArrayList<LineaDonacionModel> obtenerLineaDonacion() {
        return (ArrayList<LineaDonacionModel>) lineadonacionRepository.findAll();
    }

    public LineaDonacionModel guardarLineaDonacion(LineaDonacionModel donacion) {
        return lineadonacionRepository.save(donacion);
    }

    public Optional<LineaDonacionModel> obtenerPorId(Long id) {
        return lineadonacionRepository.findById(id);
    }

    public ArrayList<LineaDonacionModel> obtenerLineaDonacionPorId_articulo(String id_articulo) {
        return lineadonacionRepository.findById_articulo(id_articulo);
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
