package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle")
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "costoTotal",nullable = false)
    private Integer costoTotal;//no vacio solo numeros positvips
    @Column(name = "cantidadProductos",nullable = false)
    private Integer cantidadProductos;//solonumers positivos

    public Detalle() {
    }

    public Detalle(Integer id, Integer costoTotal, Integer cantidadProductos) {
        this.id = id;
        this.costoTotal = costoTotal;
        this.cantidadProductos = cantidadProductos;
    }
}
