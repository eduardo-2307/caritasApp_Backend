
package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Producto")
public class ProductoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    
    private Long id;
    private int linea;
    private String UPC;
    private String UOM;
    private String descripcion;
    private int img;

    public ProductoModel() {

    }

    public ProductoModel(Long id, int linea, String UPC, String UOM, String descripcion, int img) {
        this.id = id;
        this.linea = linea;
        this.UPC = UPC;
        this.UOM = UOM;
        this.descripcion = descripcion;
        this.img = img;


    }

    public void getLinea(int linea){
        this.linea = linea;
    }

    public int setLinea(){
        return linea;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public String getUOM() {
        return UOM;
    }

    public void setUOM(String UOM) {
        this.UOM = UOM;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void getimg(int img){
        this.img = img;
    }

    public int setimg(){
        return img;
    }

    
    
}


