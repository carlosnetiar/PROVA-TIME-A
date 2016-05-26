/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.beans;

import java.util.Date;

/**
 *
 * @author marcus
 */
public class AgendaBean {
    
    private Integer id_agenda;
    private Integer id_usuario;
    private Integer id_dia;
    private Integer id_atendente;
    private Integer cat_servico;
    private Integer servico;
    private Integer guiche;
    
    
    private String nome_aluno;
    private String horario;
    private Date   data;
    private String nome_servico;

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNome_servico() {
        return nome_servico;
    }

    public void setNome_servico(String nome_servico) {
        this.nome_servico = nome_servico;
    }
    

    public Integer getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(Integer id_agenda) {
        this.id_agenda = id_agenda;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Integer getId_dia() {
        return id_dia;
    }

    public void setId_dia(Integer id_dia) {
        this.id_dia = id_dia;
    }

    public Integer getId_atendente() {
        return id_atendente;
    }

    public void setId_atendente(Integer id_atendente) {
        this.id_atendente = id_atendente;
    }

    public Integer getCat_servico() {
        return cat_servico;
    }

    public void setCat_servico(Integer cat_servico) {
        this.cat_servico = cat_servico;
    }

    public Integer getServico() {
        return servico;
    }

    public void setServico(Integer servico) {
        this.servico = servico;
    }

    public Integer getGuiche() {
        return guiche;
    }

    public void setGuiche(Integer guiche) {
        this.guiche = guiche;
    }
    
    
}
