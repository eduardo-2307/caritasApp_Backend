package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.AlmacenModel;
import com.example.demo.repositories.AlmacenRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Declaracion del Service de almacen
@Service
public class AlmacenService {
    //Declaracion de las funciones obtener, guardar y eliminar almacen
    @Autowired
    AlmacenRepository almacenRepository;
    
    public ArrayList<AlmacenModel> obtenerAlmacen() {
        return (ArrayList<AlmacenModel>) almacenRepository.findAll();
    }

    public AlmacenModel guardarAlmacen(AlmacenModel donacion) {
        return almacenRepository.save(donacion);
    }

    public Optional<AlmacenModel> obtenerPorId(Long id) {
        return almacenRepository.findById(id);
    }

    public boolean eliminarAlmacen(Long id) {
        try{
            almacenRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
