package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.AlmacenModel;
import com.example.demo.services.AlmacenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//
@RestController
@RequestMapping("/almacen")
public class AlmacenController {

    @Autowired
    AlmacenService almacenService;

    @GetMapping()
    public ArrayList<AlmacenModel> obtenerAlmacen(){
        return almacenService.obtenerAlmacen();
    }

    @PostMapping()
    public AlmacenModel guardarAlmacen(@RequestBody AlmacenModel donacion) {
        return this.almacenService.guardarAlmacen(donacion);
    }

    @GetMapping( path = "/{id}")
    public Optional<AlmacenModel> obtenerPorId(@PathVariable("id") Long id) {
        return this.almacenService.obtenerPorId(id);
    }

    // @GetMapping( path = "/query")
    // public ArrayList<AlmacenModel> obtenerDonacionPorStatus(@RequestParam("status") String status) {
    //     return this.almacenService.obtenerDonacionPorStatus(status);
    // }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.almacenService.eliminarAlmacen(id);
        if (ok){
            return "Se eliminó la donación con folio " + id;
        }else{
            return "No se pudo eliminar la donación con folio " + id;
        }
    }
    
}
