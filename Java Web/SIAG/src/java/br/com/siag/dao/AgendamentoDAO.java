package br.com.siag.dao;

import br.com.siag.beans.AgendaBean;
import java.util.List;

/**
 *
 * @author marcus
 * DAO QUE SERVIRÁ DE ACESSO PARA JDBC RELACIONADO A AGENDAMENTO
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
