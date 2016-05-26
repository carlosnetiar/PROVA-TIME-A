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
public class ServicoBean extends CatServicoBean{
    private Integer id_servico;
    private String nome_servico;
    private Integer tipo_categoria;

    public Integer getTipo_categoria() {
        return tipo_categoria;
    }

    public void setTipo_categoria(Integer tipo_categoria) {
        this.tipo_categoria = tipo_categoria;
    }
    
    

    public Integer getId_servico() {
        return id_servico;
    }

    public void setId_servico(Integer id_servico) {
        this.id_servico = id_servico;
    }

    public String getNome_servico() {
        return nome_servico;
    }

    public void setNome_servico(String nome_servico) {
        this.nome_servico = nome_servico;
    }
    
    
}
