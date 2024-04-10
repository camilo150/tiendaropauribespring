package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoPrenda")
public class TipoPrenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tipoPrenda;
    @Column(name = "nombre",nullable = false,length = 50)
    private String nombre;//no vacido solo letras y espacios long-max 80

    public TipoPrenda() {
    }

    public TipoPrenda(Integer id, String nombre) {
        this.id_tipoPrenda = id;
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
