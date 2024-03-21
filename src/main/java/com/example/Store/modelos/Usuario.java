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
    private String nombres; //no vacio-solo letras espacios-long mas 50 car
    @Column(name = "apellidos",nullable = true,length = 50)
    private String apellidos; //no validar nada
    @Column(name = "cedula",nullable = false,length = 50)
    private String cedula;// solo numeros sin espacios-no vacio-longitud 50cr
    @Column(name = "correo",nullable = false,length = 50)
    private String correo;//no vacio y formato de correo
    @Column(name = "direccion",nullable = true,length = 50)
    private String direccion;//no se valida
    @Column(name = "sexo",nullable = true,length = 20)
    private String sexo;//solo debe contener las palaras (masculino/femenino// )
    @Column(name = "medioPago",nullable = false,length = 50)
    private String medioPago;//no se valida
    @Column(name = "pais",nullable = false,length = 50)
    private String pais;//no se valida
    @Column(name = "departamento",nullable = false,length = 50)
    private String departamento;//no se valida
    @Column(name = "munucipio",nullable = false,length = 50)
    private String municipio;//no se valida
    @Column(name = "codigoPostal",nullable = false,length = 50)
    private String codigoPostal;//solo numeros no vacio
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
