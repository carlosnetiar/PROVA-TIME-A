/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.dao;

import br.com.siag.beans.GuicheBean;
import br.com.siag.beans.UsuarioBean;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author marcus
 */
public interface UsuarioDAO {

    /**
     *
     * @param cpf
     * @param dataNasc
     * @return LOGAR NO SISTEMA
     */
    public UsuarioBean logar(String cpf, Date dataNasc);

    /**
     * 
     * @return LISTA TODOS OS GUICHÊS DISPONÍVEIS
     */
    public List<GuicheBean> carregarGuiches();
    
    /**
     * 
     * @param usuario
     * @return INSERIR NOVO ATENDENTE
     */
    public boolean novo(UsuarioBean usuario);
}
