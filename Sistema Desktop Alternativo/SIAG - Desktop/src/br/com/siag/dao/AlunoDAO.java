/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.dao;

import br.com.siag.beans.AlunoBean;

/**
 *
 * @author marcus
 */
public interface AlunoDAO {
    /**
     * 
     * @param aluno
     * @return INSERE UM ALUNO NO DATABASE
     */
    public boolean      inserir(AlunoBean aluno);
    
    /**
     * 
     * @param cpf
     * @return PROCURA UM ALUNO BASEANDO-SE PELO CPF
     */
    public AlunoBean    procurar(String cpf);
    
    /**
     * 
     * @param codigo
     * @param aluno
     * @return ALTERA UM ALUNO NO DATABASE
     */
    public boolean      alterar(int codigo, AlunoBean aluno);
    
    /**
     * 
     * @param codigo
     * @return DELETA UM ALUNO NO DATABASE
     */
    public boolean      deletar(int codigo);
}
