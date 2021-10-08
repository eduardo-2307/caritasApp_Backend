package com.example.demo.models;


import javax.persistence.*;



@Entity
@Table(name = "Linea_Donacion")
public class LineaDonacionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long consecutivo;
    private String folio_donacion;
    private String id_articulo;
    private float cantidad;
    private float costo_unitario;
    private float costo_neto;


    public void getConsecutivo(Long consecutivo){
        this.consecutivo = consecutivo;
    }

    public Long setConsecutivo(){
        return consecutivo;
    }

    public void getFolio_Donacion(String folio_donacion){
        this.folio_donacion = folio_donacion;
    }

    public String setFolio_Donacion(){
        return folio_donacion;
    }

    public String getId_Articulo() {
        return id_articulo;
    }

    public void setId_Articulo(String id_articulo) {
        this.id_articulo = id_articulo;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getCosto_Unitario() {
        return costo_unitario;
    }

    public void setCosto_Unitario(float costo_unitario) {
        this.costo_unitario = costo_unitario;
    }

    public float getCosto_Neto() {
        return costo_neto;
    }

    public void setCosto_Neto(float costo_neto) {
        this.costo_neto = costo_neto;
    }
}