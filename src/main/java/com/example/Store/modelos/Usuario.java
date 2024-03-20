package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//ACTUALIZAR TODOS LOS DATOS DE NUL O NO
    @Column(name="nombres",nullable = false,length = 50)
    private String nombres;
    @Column(name = "apellidos",nullable = false,length = 50)
    private String apellidos;
    @Column(name = "cedula",nullable = false,length = 50)
    private String cedula;
    @Column(name = "correo",nullable = false,length = 50)
    private String correo;
    @Column(name = "direccion",nullable = false,length = 50)
    private String direccion;
    @Column(name = "sexo",nullable = true,length = 20)
    private String sexo;
    @Column(name = "medioPago",nullable = false,length = 50)
    private String medioPago;
    @Column(name = "pais",nullable = false,length = 50)
    private String pais;
    @Column(name = "departamento",nullable = false,length = 50)
    private String departamento;
    @Column(name = "munucipio",nullable = false,length = 50)
    private String municipio;
    @Column(name = "codigoPostal",nullable = false,length = 50)
    private String codigoPostal;
    public Usuario() {
    }
//poner construcctores en cada tabla
    public Usuario(Integer id, String nombres, String apellidos, String cedula, String correo, String direccion, String sexo, String medioPago, String pais, String departamento, String municipio, String codigoPostal) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
        this.direccion = direccion;
        this.sexo = sexo;
        this.medioPago = medioPago;
        this.pais = pais;
        this.departamento = departamento;
        this.municipio = municipio;
        this.codigoPostal = codigoPostal;
    }
}
