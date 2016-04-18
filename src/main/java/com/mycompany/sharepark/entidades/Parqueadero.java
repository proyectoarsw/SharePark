/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sharepark.entidades;

/**
 *
 * @author 2096904
 */
public class Parqueadero {
    
    private int codigo;
    private int codigoUsuario;
    private String localizacion;
    private int precio_dias;
    private String tipo; 
   
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public int getPrecio_dias() {
        return precio_dias;
    }

    public void setPrecio_dias(int precio_dias) {
        this.precio_dias = precio_dias;
    }


    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
}
