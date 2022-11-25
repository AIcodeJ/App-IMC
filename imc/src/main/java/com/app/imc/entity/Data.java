/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.imc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Alexis
 */

@Entity
public class Data {
    
    private Long id;
    private double imc;
    private String nombre;
    private String apellido;
    private String estatus;
    private String sexo;
    private double peso;
    private double altura;
    private int edad;

    public Data() {
    }

    public Data(Long id, double imc, String nombre, String apellido, String estatus, String sexo, double peso, double altura, int edad) {
        super();
        this.id = id;
        this.imc = imc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estatus = estatus;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
            return id;
    }
    
    public void setId(Long id) {
            this.id = id;
    }
    
    public String getNombre() {
            return nombre;
    }
    
    public void setNombre(String nombre) {
            this.nombre = nombre;
    }
    
    public String getApellido() {
            return apellido;
    }
    
    public void setApellido(String apellido) {
            this.apellido = apellido;
    }
    
    public double getPeso() {
            return peso;
    }
    
    public void setPeso(double peso) {
            this.peso = peso;
    }
    
    public double getAltura() {
            return altura;
    }
    
    public void setAltura(double altura) {
            this.altura = altura;
    }
    
    public int getEdad() {
            return edad;
    }
    
    public void setEdad(int edad) {
            this.edad = edad;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public double getImc() {
            return imc = (peso / (altura * altura));
    }
    
    public void setImc(double imc) {
            this.imc = (peso / (altura * altura));
    }

    public String getEstatus() {
        if (imc < 18.5){
            estatus = "Muy bajo";
        } else if (imc >= 18.5 && imc <= 24.99){
            estatus = "Peso Ideal";
        } else if (imc >= 25 && imc <= 29.99){
            estatus = "Sobrepeso";
        } else if (imc >= 30 && imc <= 39.99){
            estatus = "Obesidad";
        } else if (imc >= 40){
            estatus = "Obesidad Extrema";
        }
        return estatus;
    }

    public void setEstatus(String estatus) {
        if (imc < 18.5){
            estatus = "Muy bajo";
        } else if (imc >= 18.5 && imc <= 24.99){
            estatus = "Peso Ideal";
        } else if (imc >= 25 && imc <= 29.99){
            estatus = "Sobrepeso";
        } else if (imc >= 30 && imc <= 39.99){
            estatus = "Obesidad";
        } else if (imc >= 40){
            estatus = "Obesidad Extrema";
        }
        this.estatus = estatus;
    }
    
}
