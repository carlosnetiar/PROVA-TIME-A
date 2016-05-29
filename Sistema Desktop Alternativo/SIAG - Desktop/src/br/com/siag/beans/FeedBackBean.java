/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.beans;

/**
 *
 * @author marcus
 */
public class FeedBackBean {
    private Integer cod_atendimento;
    private String opiniao;
    private Integer nota;
    private String origem;
    
    private float media;
    private int total;
    private String nome_atendente;

    public String getNome_atendente() {
        return nome_atendente;
    }

    public void setNome_atendente(String nome_atendente) {
        this.nome_atendente = nome_atendente;
    }
    
    

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    

    public Integer getCod_atendimento() {
        return cod_atendimento;
    }

    public void setCod_atendimento(Integer cod_atendimento) {
        this.cod_atendimento = cod_atendimento;
    }

    public String getOpiniao() {
        return opiniao;
    }

    public void setOpiniao(String opiniao) {
        this.opiniao = opiniao;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
    
}
