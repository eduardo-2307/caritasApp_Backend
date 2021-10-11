package com.example.demo.models;


import java.util.Calendar;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table(name = "Donacion")
public class DonacionModel {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT-6")
    private Calendar fecha;
    private String id_donador;
    private String status;
    private String recolector;

    public DonacionModel() {

    }

    public DonacionModel(Long id, Calendar fecha, String id_donador, String status, String recolector) {
       
        this.id = id;
        this.fecha = fecha;
        this.id_donador = id_donador;
        this.recolector = recolector;

    }


    public void setFolio_Donacion(Long id){
        this.id = id;
    }

    public Long getFolio_Donacion(){
        return id;
    }

    public void setFecha(Calendar fecha){
        this.fecha = fecha;
    }

    public Calendar getFecha(){
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