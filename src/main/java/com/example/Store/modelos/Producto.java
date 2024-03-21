package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombreProducto",nullable = false,length = 50)

    private String nombreProducto;//no vacio la misma mrd
    @Column(name = "referencia",nullable = true,length = 50)

    private String referencia;//no vacio log 14
    @Column(name = "talla",nullable = false,length = 50)

    private String talla;//solo letras y longitud 4
    @Column(name = "cantidadBodega",nullable = false)

    private Integer cantidadBodega;//solo numeros positivos
    @Column(name = "precioUnitario",nullable = false)

    private Integer precioUnitario;//solo numeros positivos
    @Column(name = "descripcion",nullable = true,length = 50)

    private String descripcion;//solo letras esppacios log 50
    @Column(name = "fotografia",nullable = false,length = 700)

    private String fotografia;//solo letras y numeros sin espacios

    public Producto() {
    }

    public Producto(Integer id, String nombreProducto, String referencia, String talla, Integer cantidadBodega, Integer precioUnitario, String descripcion, String fotografia) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.referencia = referencia;
        this.talla = talla;
        this.cantidadBodega = cantidadBodega;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
    }
}
