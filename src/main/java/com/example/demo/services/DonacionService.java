package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.DonacionModel;
import com.example.demo.repositories.DonacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonacionService {
    @Autowired
    DonacionRepository donacionRepository;
    
    public ArrayList<DonacionModel> obtenerDonacion() {
        return (ArrayList<DonacionModel>) donacionRepository.findAll();
    }

    public DonacionModel guardarDonacion(DonacionModel donacion) {
        return donacionRepository.save(donacion);
    }

    public Optional<DonacionModel> obtenerPorFolio(Long folio_donacion) {
        return donacionRepository.findById(folio_donacion);
    }

    // public ArrayList<DonacionModel> obtenerPorUPC(String UPC) {
    //     return donacionRepository.findByUPC(UPC);
    // }

    public boolean eliminarDonacion(Long folio_donacion) {
        try{
            donacionRepository.deleteById(folio_donacion);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
}
