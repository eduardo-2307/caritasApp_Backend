package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import com.example.demo.models.AlmacenModel;

import com.example.demo.models.LineaDonacionModel;
import com.example.demo.models.ProductoModel;

import org.junit.jupiter.api.Test;


public class UnitTests {

    //Pruebas de almacen
    AlmacenModel almacenModel = new AlmacenModel();
    
    @Test
    void testGetCPAlmacen() {
        // Given
        AlmacenModel input = new AlmacenModel((long) 1, "Almacen 1", "Agustin Melgar", "2013", "1", "31560", "Colonia 1");
        
        // When
        String result = input.getCp();
        
        // Then
        String expected = "31560";
        assertEquals(expected, result);
    }

    @Test
    void testSetColoniaAlmacen() {
        // Given
        AlmacenModel input = new AlmacenModel((long) 1, "Almacen 1", "Agustin Melgar", "2013", "1", "31560", "Colonia 1");
        
        // When
        input.setColonia("Colonia Industrial");
        String result =  input.getColonia();
        // Then
        String expected = "Colonia Industrial";
        assertEquals(expected, result);
    }

    //Pruebas de linea donacion
    LineaDonacionModel donacionModel = new LineaDonacionModel();

    @Test
    void testGetCosto_Neto() {
        // Given
        LineaDonacionModel input = new LineaDonacionModel((long) 2, "123456", "23", "8", "20", "160");
        
        // When
        String result = input.getCosto_Neto();
        
        // Then
        String expected = "160";
        assertEquals(expected, result);
    }

    @Test
    void testSetCantidad() {
        // Given
        LineaDonacionModel input = new LineaDonacionModel((long) 2, "123456", "23", "8", "20", "160");
        
        // When
        input.setCantidad("14");
        String result =  input.getCantidad();
        // Then
        String expected = "14";
        assertEquals(expected, result);
    }


    //Pruebas de producto
    ProductoModel productoModel = new ProductoModel();

    @Test
    void testGetUPC() {
        // Given
        ProductoModel input = new ProductoModel((long) 3, "456123789", "420869", "Tomate", 2654);
        
        // When
        String result = input.getUPC();
        
        // Then
        String expected = "456123789";
        assertEquals(expected, result);
    }

    @Test
    void testSetUOM() {
        // Given
        ProductoModel input = new ProductoModel((long) 3, "456123789", "420869", "Tomate", 2654);
        
        // When
        input.setUOM("77779999");
        String result =  input.getUOM();
        // Then
        String expected = "77779999";
        assertEquals(expected, result);
    }
    
}
