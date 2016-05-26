/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.dao;

import br.com.siag.beans.UsuarioBean;

/**
 *
 * @author marcus
 */
public interface UsuarioDAO {
    /**
     * 
     * @param cpf
     * @return Retorna usuário com base no CPF
     */
    UsuarioBean carregarUser(String cpf);
}
