package com.example.demo.models;


import javax.persistence.*;



@Entity
@Table(name = "Linea_Donacion")
public class LineaDonacionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    private String folio_donacion;
    private String id_articulo;
    private String cantidad;
    private String costo_unitario;
    private String costo_neto;

    public LineaDonacionModel() {

    }

    public LineaDonacionModel(Long id, String folio_donacion, String id_articulo, String cantidad, String costo_unitario, String costo_neto) {
       
        this.id = id;
        this.folio_donacion = folio_donacion;
        this.id_articulo = id_articulo;
        this.cantidad = cantidad;
        this.costo_unitario = costo_unitario;
        this.costo_neto = costo_neto;

    }


    public void getId(Long id){
        this.id = id;
    }

    public Long setId(){
        return id;
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

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCosto_Unitario() {
        return costo_unitario;
    }

    public void setCosto_Unitario(String costo_unitario) {
        this.costo_unitario = costo_unitario;
    }

    public String getCosto_Neto() {
        return costo_neto;
    }

    public void setCosto_Neto(String costo_neto) {
        this.costo_neto = costo_neto;
    }
}