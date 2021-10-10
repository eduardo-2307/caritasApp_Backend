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
    LineaDonacionRepository donacionRepository;
    
    public ArrayList<LineaDonacionModel> obtenerLineaDonacion() {
        return (ArrayList<LineaDonacionModel>) donacionRepository.findAll();
    }

    public LineaDonacionModel guardarLineaDonacion(LineaDonacionModel donacion) {
        return donacionRepository.save(donacion);
    }

    public Optional<LineaDonacionModel> obtenerPorId(Long id) {
        return donacionRepository.findById(id);
    }

    public ArrayList<LineaDonacionModel> obtenerDonacionPorStatus(String id_articulo) {
        return donacionRepository.findById_articulo(id_articulo);
    }

    public boolean eliminarLineaDonacion(Long id) {
        try{
            donacionRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
}
