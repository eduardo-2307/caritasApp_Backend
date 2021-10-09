package com.example.demo.models;

import java.text.DateFormat;

import javax.persistence.*;



@Entity
@Table(name = "Donacion")
public class DonacionModel {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    private DateFormat fecha;
    private String id_donador;
    private String status;
    private String recolector;


    public void getFolio_Donacion(Long id){
        this.id = id;
    }

    public Long setFolio_Donacion(){
        return id;
    }

    public void getFecha(DateFormat fecha){
        this.fecha = fecha;
    }

    public DateFormat setFecha(){
        return fecha;
    }

    public String getId_Donador() {
        return id_donador;
    }

    public void setId_Donador(String id_donador) {
        this.id_donador = id_donador;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRecolector() {
        return recolector;
    }

    public void setRecolector(String recolector) {
        this.recolector = recolector;
    }
}