package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.services.ProductoService;
import com.example.demo.models.ProductoModel;

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
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    //Metodo de busqueda de productos en base de datos
    @GetMapping()
    public ArrayList<ProductoModel> obtenerProductos(){
        return productoService.obtenerProductos();
    }

    //Metodo de guardado de pruductos en base de datos
    @PostMapping()
    public ProductoModel guardarProducto(@RequestBody ProductoModel producto) {
        return this.productoService.guardarProducto(producto);
    }

    //Buscar productos por su id en base de datos
    @GetMapping( path = "/{id}")
    public Optional<ProductoModel> obtenerProductoPorId(@PathVariable("id") Long id) {
        return this.productoService.obtenerPorId(id);
    }

    //Buscar productos por su UPC en base de datos
    @GetMapping( path = "query")
    public ArrayList<ProductoModel> obtenerProductoPorUPC(@RequestParam("UPC") String UPC) {
        return this.productoService.obtenerPorUPC(UPC);
    }

    //Eliminar un producto de base de datos indicando su id
    @DeleteMapping( path = "{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.productoService.eliminarProducto(id);
        if (ok){
            return "Se eliminó el producto con id " + id;
        }else{
            return "No se pudo eliminar el producto con id " + id;
        }
    }

    
}
