package com.example.Store.modelos;

import jakarta.persistence.*;

import java.awt.*;
import java.time.LocalDate;

@Entity
@Table(name = "marcas")

public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_marca;
    @Column(name = "nombreMarca",nullable = false,length = 25)
    private String nombreMarca;//obligatorio con espacios long-max 50
    @Column(name = "nit",nullable = false,length = 25)
    private String nit;//obligatorio solo numeros long-max 10
    @Column(name = "anoCreacion",nullable = false)
    private LocalDate anoCreacion;//obligatorio
    @Column(name = "sedePrincipal",nullable = false,length = 25)
    private String sedePrincipal;//no se valida

    public Marca() {
    }

    public Marca(Integer id, String nombreMarca, String nit, LocalDate anoCreacion, String sedePrincipal) {
        this.id_marca = id;
        this.nombreMarca = nombreMarca;
        this.nit = nit;
        this.anoCreacion = anoCreacion;
        this.sedePrincipal = sedePrincipal;
    }


    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public LocalDate getAnoCreacion() {
        return anoCreacion;
    }

    public void setAnoCreacion(LocalDate anoCreacion) {
        this.anoCreacion = anoCreacion;
    }

    public String getSedePrincipal() {
        return sedePrincipal;
    }

    public void setSedePrincipal(String sedePrincipal) {
        this.sedePrincipal = sedePrincipal;
    }
}
