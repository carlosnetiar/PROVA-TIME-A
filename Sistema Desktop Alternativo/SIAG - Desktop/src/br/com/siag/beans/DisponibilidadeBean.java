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
 * BEAN RESPONSÁVEL POR ARMAZENAR OS TIPOS DE DADOS REFERENTE A DISPONIBILIDADE
 */
public class DisponibilidadeBean {
    private Integer codigo;
    private Date dia;
    private String hora;
    private Integer status;
    private Integer cod_guiche;

    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

  
    public Integer getCod_guiche() {
        return cod_guiche;
    }

    public void setCod_guiche(Integer cod_guiche) {
        this.cod_guiche = cod_guiche;
    }
    
    
}
