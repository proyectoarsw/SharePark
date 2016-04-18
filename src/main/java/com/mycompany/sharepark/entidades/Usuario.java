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
public class Usuario {
    private String nombre;
    private int cedula;
    private boolean mensualidad;
    private int calificacion;
    private int codigo_parqueadero;
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

    public boolean isMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(boolean mensualidad) {
        this.mensualidad = mensualidad;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getCodigo_parqueadero() {
        return codigo_parqueadero;
    }

    public void setCodigo_parqueadero(int codigo_parqueadero) {
        this.codigo_parqueadero = codigo_parqueadero;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
