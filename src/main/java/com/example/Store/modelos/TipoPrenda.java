package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoPrenda")
public class TipoPrenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre",nullable = false,length = 50)
    private String nombre;//no vacio letras y espacios
    public TipoPrenda() {
    }

    public TipoPrenda(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
