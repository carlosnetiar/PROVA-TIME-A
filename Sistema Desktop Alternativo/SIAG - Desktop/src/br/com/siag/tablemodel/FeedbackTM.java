/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.tablemodel;

import br.com.siag.beans.FeedBackBean;
import br.com.siag.dao.FeedbackDAO;
import br.com.siag.util.DAOFactory;
import java.sql.Connection;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author marcus
 *
 * TABLEMODEL RESPONSÁVEL POR LISTAR TODOS OS AGENDAMENTOS COM SUAS DEVIDAS
 * MÉDIAS
 *
 */
public class FeedbackTM extends AbstractTableModel {

    private Connection conexao;
    private final List<FeedBackBean> lista;
    private final String[] colunas = {"Nome do atendente", "Média de Avaliação"};

    public FeedbackTM() throws ClassNotFoundException {
        FeedbackDAO fbDAO = DAOFactory.criarFeedbackDAO(conexao);
        lista = fbDAO.listarFeedBack();
        
        System.out.println(lista.get(0).getNome_atendente());
        System.out.println(lista.get(0).getMedia());
    }
    
    public void addRow(FeedBackBean feedback){
        this.lista.add(feedback);
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
        lista.size();
        switch(i1){
            case 0: return lista.get(i).getNome_atendente();
            case 1: return lista.get(i).getMedia();
        }
        return null;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return this.colunas[columnIndex];
    }

}
