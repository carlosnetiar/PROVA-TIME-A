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
