/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.dao;

import br.com.siag.beans.AgendaBean;
import java.util.List;

/**
 *
 * @author marcus
 */
public interface AgendamentoDAO {
    /**
     * 
     * @param agendamento
     * @return Insere agendamento no banco de dados
     */
    boolean agendarAula(AgendaBean agendamento);
    
    /**
     * 
     * @param CPF
     * @return Listagem de agendamento filtrando pelo CPF do aluno
     */
    List<AgendaBean> listarAgendamento(String CPF);
}
