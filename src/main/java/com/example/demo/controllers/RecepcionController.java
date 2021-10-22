package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.RecepcionModel;
import com.example.demo.services.RecepcionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recepcion")
public class RecepcionController {
    @Autowired
    RecepcionService recepcionService;

    //Metodo de busqueda de recepcion en base de datos
    @GetMapping()
    public ArrayList<RecepcionModel> obtenerRecepcion(){
        return recepcionService.obtenerRecepcion();
    }

    //Metodo de guardado de recepcion en base de datos
    @PostMapping()
    public RecepcionModel guardarRecepcion(@RequestBody RecepcionModel recepcion) {
        return this.recepcionService.guardarRecepcion(recepcion);
    }

    //Buscar recepcion por su id en base de datos
    @GetMapping( path = "/{id}") 
    public Optional<RecepcionModel> obtenerPorId(@PathVariable("id") Long id) {
        return this.recepcionService.obtenerPorId(id);
    }

    //Eliminar una recepcion de base de datos indicando su id
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.recepcionService.eliminarRecepcion(id);
        if (ok){
            return "Se eliminó el recepcion con id " + id;
        }else{
            return "No se pudo eliminar el recepcion con id " + id;
        }
    }
    
}
