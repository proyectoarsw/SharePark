/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sharepark.entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author estudiante
 */
public class agenda {
    private Date inicio_horario;
    private Date fin_horario;
    private ArrayList horarios_libres;

    public Date getInicio_horario() {
        return inicio_horario;
    }

    public void setInicio_horario(Date inicio_horario) {
        this.inicio_horario = inicio_horario;
    }

    public Date getFin_horario() {
        return fin_horario;
    }

    public void setFin_horario(Date fin_horario) {
        this.fin_horario = fin_horario;
    }

    public ArrayList getHorarios_libres() {
        return horarios_libres;
    }

    public void setHorarios_libres(ArrayList horarios_libres) {
        this.horarios_libres = horarios_libres;
    }
    
}
