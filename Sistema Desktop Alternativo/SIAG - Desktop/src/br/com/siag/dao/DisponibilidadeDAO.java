/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.dao;

import br.com.siag.beans.AgendamentosBean;
import br.com.siag.beans.DisponibilidadeBean;
import java.util.List;

/**
 *
 * @author marcus
 */
public interface DisponibilidadeDAO {
    /**
     * 
     * @param disp
     * @return INSERE UM NOVO DIA DISPONÍVEL PARA AGENDAMENTO
     */
    public boolean      inserirDisponibilidade(DisponibilidadeBean disp);
    
    /**
     * 
     * @param dataAual
     * @param codigo_atendente
     * @return LISTA TODOS OS AGENDAMENTOS DAQUELE DIA PARA AQUELE ATENDENTE
     */
    public List<AgendamentosBean> listarAgendamentos(String dataAual, int codigo_atendente);
}
