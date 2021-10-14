package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Almacen")
public class AlmacenModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    private String nombre;
    private String calle;
    private String no_exterior;
    private String no_interior;
    private String cp;
    private String colonia;

    public AlmacenModel() {

    }

    public AlmacenModel(Long id, String nombre, String calle, String no_exterior, String no_interior, String cp, String colonia) {
       
        this.id = id;
        this.nombre = nombre;
        this.calle = calle;
        this.no_exterior = no_exterior;
        this.no_interior = no_interior;
        this.cp = cp;
        this.colonia = colonia;

    }


    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNo_exterior() {
        return no_exterior;
    }

    public void setNo_exterior(String no_exterior) {
        this.no_exterior = no_exterior;
    }

    public String getNo_interior() {
        return no_interior;
    }

    public void setNo_interior(String no_interior) {
        this.no_interior = no_interior;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    
}
