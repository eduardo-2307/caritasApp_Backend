package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.LineaDonacionModel;
import com.example.demo.services.LineaDonacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lineadonacion")
public class LineaDonacionController {
    @Autowired
    LineaDonacionService lineaDonacionService;

    //Metodo de busqueda de linea donacion en base de datos
    @GetMapping()
    public ArrayList<LineaDonacionModel> obtenerLineaDonacion(){
        return lineaDonacionService.obtenerLineaDonacion();
    }

    //Metodo de guardado de linea donacion en base de datos
    @PostMapping()
    public LineaDonacionModel guardarLineaDonacion(@RequestBody LineaDonacionModel lineaDonacion) {
        return this.lineaDonacionService.guardarLineaDonacion(lineaDonacion);
    }

    //Buscar linea donacion por su folio donacion en base de datos
    @GetMapping( path = "/{id}")
    public Optional<LineaDonacionModel> obtenerPorId(@PathVariable("id") Long id) {
        return this.lineaDonacionService.obtenerPorId(id);
    }

    //Eliminar una donacion de base de datos indicando su id 
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.lineaDonacionService.eliminarLineaDonacion(id);
        if (ok){
            return "Se eliminó la linea donación con id " + id;
        }else{
            return "No se pudo eliminar la linea donación con id " + id;
        }
    }
    
}
