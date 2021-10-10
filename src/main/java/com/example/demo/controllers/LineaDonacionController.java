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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lineadonacion")
public class LineaDonacionController {
    @Autowired
    LineaDonacionService lineaDonacionService;

    @GetMapping()
    public ArrayList<LineaDonacionModel> obtenerLineaDonacion(){
        return lineaDonacionService.obtenerLineaDonacion();
    }

    @PostMapping()
    public LineaDonacionModel guardarLineaDonacion(@RequestBody LineaDonacionModel lineaDonacion) {
        return this.lineaDonacionService.guardarLineaDonacion(lineaDonacion);
    }

    @GetMapping( path = "/{id}")
    public Optional<LineaDonacionModel> obtenerPorId(@PathVariable("id") Long id) {
        return this.lineaDonacionService.obtenerPorId(id);
    }

    @GetMapping( path = "/query")
    public ArrayList<LineaDonacionModel> obtenerLineaDonacionPorId_articulo(@RequestParam("id_articulo") String id_articulo) {
        return this.lineaDonacionService.obtenerLineaDonacionPorId_articulo(id_articulo);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.lineaDonacionService.eliminarLineaDonacion(id);
        if (ok){
            return "Se eliminó la donación con folio " + id;
        }else{
            return "No se pudo eliminar la donación con folio " + id;
        }
    }
    
}
