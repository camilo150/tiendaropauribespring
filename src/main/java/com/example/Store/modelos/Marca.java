package com.example.Store.modelos;

import jakarta.persistence.*;

import java.awt.*;
import java.time.LocalDate;

@Entity
@Table(name = "marcas")

public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombreMarca",nullable = false,length = 50)
    private String nombreMarca;//no vacio y la misma mrd
    @Column(name = "nit",nullable = false,length = 50)
    private String nit;//solo numeros y no vacio
    @Column(name = "anoCreacion",nullable = true,length = 50)
    private LocalDate anoCreacion;//formato tradicional
    @Column(name = "sedePrincipal",nullable = true,length = 50)
    private String sedePrincipal;//no se valida

    public Marca() {
    }

    public Marca(Integer id, String nombreMarca, String nit, LocalDate anoCreacion, String sedePrincipal) {
        this.id = id;
        this.nombreMarca = nombreMarca;
        this.nit = nit;
        this.anoCreacion = anoCreacion;
        this.sedePrincipal = sedePrincipal;
    }
}
