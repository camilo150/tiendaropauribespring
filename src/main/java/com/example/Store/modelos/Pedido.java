package com.example.Store.modelos;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pedido;
@Column(name ="FechaYHora",nullable = false )
    private LocalDateTime FechaYHora;//obligatorio y formato internacional

    @ManyToOne
    @JoinColumn(name = "id_usuario",referencedColumnName = "id_usuario")//se respeta el nombre de la tabla con la que me quiero asociar
    Usuario usuario; // nombre de la tabala con la que me quiero asociarsiempr3e vba a ser primal la relacion muchos y donde esté muchos me paro

    public Pedido() {
    }

    public Pedido(Integer id, LocalDateTime fechaYHora) {
        this.id_pedido = id;
        FechaYHora = fechaYHora;
    }


    public LocalDateTime getFechaYHora() {
        return FechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        FechaYHora = fechaYHora;
    }
}
