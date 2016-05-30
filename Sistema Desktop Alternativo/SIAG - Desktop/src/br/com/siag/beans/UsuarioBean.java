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
 *  * BEAN RESPONSÁVEL POR ARMAZENAR OS TIPOS DE DADOS REFERENTE AO USUÁRIO - ATENDENTES
 */
public class UsuarioBean {
    private String nome_usuario;
    private String cpf_usuario;
    private Date dada_nascimento;
    private Integer cod_guiche;
    private Integer codigo;
    private String categoria_servico;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria_servico() {
        return categoria_servico;
    }

    public void setCategoria_servico(String categoria_servico) {
        this.categoria_servico = categoria_servico;
    }
    
    

    public Integer getCod_guiche() {
        return cod_guiche;
    }

    public void setCod_guiche(Integer cod_guiche) {
        this.cod_guiche = cod_guiche;
    }
    
    

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getCpf_usuario() {
        return cpf_usuario;
    }

    public void setCpf_usuario(String cpf_usuario) {
        this.cpf_usuario = cpf_usuario;
    }

    public Date getDada_nascimento() {
        return dada_nascimento;
    }

    public void setDada_nascimento(Date dada_nascimento) {
        this.dada_nascimento = dada_nascimento;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    
}
