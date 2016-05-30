/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.tablemodel;

import br.com.siag.beans.AgendamentosBean;
import br.com.siag.dao.DisponibilidadeDAO;
import br.com.siag.util.DAOFactory;
import br.com.siag.util.HoraAtual;
import java.sql.Connection;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author marcus
 * 
 * TABLEMODEL REPONSÁVEL POR LISTAR OS AGENDAMENTO DO DIA
 */
public class AgendamentosTM extends AbstractTableModel {
    private Connection conexao;
    private final List<AgendamentosBean> lista;
    String[] colunas = {"Codigo","Nome do Aluno", "CPF", "Serviço", "Horário"};
    public AgendamentosTM(int codigo) throws ClassNotFoundException {
        DisponibilidadeDAO disponibilidadeDAO = DAOFactory.criarDisponibilidadeDAO(conexao);
        lista = disponibilidadeDAO.listarAgendamentos(HoraAtual.dataSistema(),codigo);
    }
    
    public void addRow(AgendamentosBean agendamento){
        this.lista.add(agendamento);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        switch(i1){
            case 0: return lista.get(i).getId_agendamento();
            case 1: return lista.get(i).getNome_aluno();
            case 2: return lista.get(i).getCpf_aluno();
            case 3: return lista.get(i).getNome_servico();
            case 4: return lista.get(i).getHora();
        }
        return null;
    }

    @Override
    public String getColumnName(int columnIndex){
        return this.colunas[columnIndex];
    }
}
