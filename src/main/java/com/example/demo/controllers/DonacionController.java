package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.DonacionModel;
import com.example.demo.services.DonacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/donacion")
public class DonacionController {
    @Autowired
    DonacionService donacionService;

    @GetMapping()
    public ArrayList<DonacionModel> obtenerDonacion(){
        return donacionService.obtenerDonacion();
    }

    @PostMapping()
    public DonacionModel guardarDonacion(@RequestBody DonacionModel donacion) {
        return this.donacionService.guardarDonacion(donacion);
    }

    @GetMapping( path = "/{id}")
    public Optional<DonacionModel> obtenerPorFolio(@PathVariable("id") Long id) {
        return this.donacionService.obtenerPorFolio(id);
    }

    /*@GetMapping( path = "/query")
    public ArrayList<DonacionModel> obtenerProductoPorUPC(@RequestParam("UPC") String UPC) {
        return this.donacionService.obtenerPorUPC(UPC);
    }*/

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.donacionService.eliminarDonacion(id);
        if (ok){
            return "Se eliminó la donación con folio " + id;
        }else{
            return "No se pudo eliminar la donación con folio " + id;
        }
    }
    
}