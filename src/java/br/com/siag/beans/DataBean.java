/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.beans;

import java.sql.Date;

/**
 *
 * @author marcus
 */
public class DataBean{
    private int     id_data_hora;
    private int     id_data;
    private int     id_hora;
    private Date  dia;
    private String  hora;
    private boolean status;

    public int getId_data_hora() {
        return id_data_hora;
    }

    public void setId_data_hora(int id_data_hora) {
        this.id_data_hora = id_data_hora;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    
    
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId_data() {
        return id_data;
    }

    public void setId_data(int id_data) {
        this.id_data = id_data;
    }

    public int getId_hora() {
        return id_hora;
    }

    public void setId_hora(int id_hora) {
        this.id_hora = id_hora;
    }
    
    
}
