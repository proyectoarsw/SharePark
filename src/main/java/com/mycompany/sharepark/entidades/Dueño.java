/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sharepark.entidades;

/**
 *
 * @author estudiante
 */
public class Dueño {
    
    private String nombre;
    private int cedula;
    private int codigos_parqueadero;
    private int calificacion;
    private int telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCodigos_parqueadero() {
        return codigos_parqueadero;
    }

    public void setCodigos_parqueadero(int codigos_parqueadero) {
        this.codigos_parqueadero = codigos_parqueadero;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
