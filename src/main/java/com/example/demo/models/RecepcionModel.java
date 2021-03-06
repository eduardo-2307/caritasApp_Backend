package com.example.demo.models;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

//Creacion de la tabla de la base de datos
@Entity
@Table(name = "recepcion")
public class RecepcionModel {
    //Declaracion de los atributos de la tabla recepcion
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String folio_donacion;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT-6")
    private Calendar fecha_llegada;
    private String peso;
    private String almacen_destino;
    private String colaborador_recolector;
    private String colaborador_recepcionista;

    //Constructores
    public RecepcionModel() {

    }

    public RecepcionModel(Long id, String folio_donacion, Calendar fecha_llegada, String peso, String almacen_destino, String colaborador_recolector, String colaborador_recepcionista) {
       
        this.id = id;
        this.folio_donacion = folio_donacion;
        this.fecha_llegada = fecha_llegada;
        this.peso = peso;
        this.almacen_destino = almacen_destino;
        this.colaborador_recolector = colaborador_recolector;
        this.colaborador_recepcionista = colaborador_recepcionista;

    }

    //Setters y getters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFolio_donacion() {
        return folio_donacion;
    }

    public void setFolio_donacion(String folio_donacion) {
        this.folio_donacion = folio_donacion;
    }

    public Calendar getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(Calendar fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }
    
    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAlmacen_destino() {
        return almacen_destino;
    }

    public void setAlmacen_destino(String almacen_destino) {
        this.almacen_destino = almacen_destino;
    }

    public String getColaborador_recolector() {
        return colaborador_recolector;
    }

    public void setColaborador_recolector(String colaborador_recolector) {
        this.colaborador_recolector = colaborador_recolector;
    }

    public String getColaborador_recepcionista() {
        return colaborador_recepcionista;
    }

    public void setColaborador_recepcionista(String colaborador_recepcionista) {
        this.colaborador_recepcionista = colaborador_recepcionista;
    }
    
}
