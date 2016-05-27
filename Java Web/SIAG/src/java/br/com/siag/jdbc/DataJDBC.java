/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.jdbc;

import br.com.siag.beans.DataBean;
import br.com.siag.dao.DataDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcus
 */
public class DataJDBC implements DataDAO {

    private final Connection conexao;

    public DataJDBC(Connection conexao) {
        this.conexao = conexao;
    }

    /**
     * 
     * @param dataEspecifica
     * @param i
     * @return RETORNA OS HORÁRIOS ESPECÍFICOS JÁ FAZENDO AVALIAÇÃO SE ESTÃO MARCADOS OU NÃO
     */
    @Override
    public List<DataBean> listarHorariosDisponiveis(String dataEspecifica, int i) {
        PreparedStatement pst;
        List<DataBean> listDatas = new ArrayList<>();
        DataBean data;
        StringBuilder sql = new StringBuilder();
        ResultSet rs;
        sql.append("SELECT * FROM tbl_disponibilidade ");
        sql.append("WHERE dia='" + dataEspecifica + "'");

        try {
            pst = conexao.prepareStatement(sql.toString());
            rs = pst.executeQuery();
            while (rs.next()) {
                data = new DataBean();
                
                /**
                 * VERIFICA SE JÁ EXISTE UM HORÁRIO MARCADO NAQUELE SERVIÇO
                 */
                if (verificarStatus(rs.getDate("dia"), rs.getString("hora"), i) == 0) {
                    data.setDia(rs.getDate("dia"));
                    data.setId_data_hora(rs.getInt("codigo"));
                    data.setHora(rs.getString("hora"));
                    listDatas.add(data);
                }
            }
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("ERRO AO LISTAR DATAS --- ERRO || " + ex);
        }

        return listDatas;
    }

    @Override
    public boolean alterarStatus(int d) {
        PreparedStatement pst;
        String sql = "UPDATE tbl_disponibilidade SET status=0 WHERE codigo='" + d + "'";
        boolean b;
        try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
            pst.close();
            b = true;
        } catch (SQLException ex) {
            System.out.println("ERRO AO MARCAR HORARIO --- ERRO || " + ex);
            b = false;
        }
        return b;
    }

    @Override
    public DataBean carregarDataEspecifica(int id) {
        PreparedStatement pst;
        StringBuilder sql = new StringBuilder();
        ResultSet rs;
        DataBean dataBean = null;

        sql.append("SELECT * FROM tbl_disponibilidade ");
        sql.append("WHERE codigo='" + id + "'");

        try {
            pst = conexao.prepareStatement(sql.toString());
            rs = pst.executeQuery();
            if (rs.next()) {
                dataBean = new DataBean();
                dataBean.setHora(rs.getString("hora"));
                dataBean.setDia(rs.getDate("dia"));
            }
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("ERRO AO CARREGAR DATAS --- ERRO || " + ex);
        }

        return dataBean;
    }

    @Override
    public int verificarStatus(Date dia, String hora, int cod_serv) {
        PreparedStatement pst;
        StringBuilder sql = new StringBuilder();
        ResultSet rs;
        int count = 0;

        sql.append("SELECT count(*) As size,ds.dia, ds.hora, ag.cod_servico, se.nome_servico, cs.nome_cat ");
        sql.append("FROM tbl_agendamento ag ");
        sql.append("INNER JOIN tbl_disponibilidade ds ON (ag.cod_dia=ds.codigo) ");
        sql.append("INNER JOIN tbl_servico se ON (ag.cod_servico=se.codigo) ");
        sql.append("INNER JOIN tbl_cat_servico cs ON (se.tipo_cat = cs.codigo) ");
        sql.append("WHERE ds.dia='" + dia + "' AND ds.hora='" + hora + "' AND cs.codigo='" + cod_serv + "'");
        

        try {
            pst = conexao.prepareStatement(sql.toString());
            rs = pst.executeQuery();

            if (rs.next()) {
                count = rs.getInt("size");
            }
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("ERRO AO VERIFICAR STATUS --- ERRO || " + ex);
        }

        return count;
    }
}
