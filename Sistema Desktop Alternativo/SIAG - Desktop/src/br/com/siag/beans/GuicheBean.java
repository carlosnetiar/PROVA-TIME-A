/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.beans;

/**
 *
 * @author marcus 
 * BEAN RESPONSÁVEL POR ARMAZENAR OS TIPOS DE DADOS REFERENTE AO GUICHE
 */
public class GuicheBean {

    private Integer num_guiche;
    private Integer cod_catservico;
    private Integer codigo;

    public Integer getNum_guiche() {
        return num_guiche;
    }

    public void setNum_guiche(Integer num_guiche) {
        this.num_guiche = num_guiche;
    }

    public Integer getCod_catservico() {
        return cod_catservico;
    }

    public void setCod_catservico(Integer cod_catservico) {
        this.cod_catservico = cod_catservico;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

}
