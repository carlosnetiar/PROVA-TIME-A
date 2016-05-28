/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.jdbc;

import br.com.siag.beans.DataBean;
import br.com.siag.dao.DataDAO;
import br.com.siag.util.TratarHora;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
     * @return RETORNA OS HORÁRIOS ESPECÍFICOS JÁ FAZENDO AVALIAÇÃO SE ESTÃO
     * MARCADOS OU NÃO
     */
    @Override
    public List<DataBean> listarHorariosDisponiveis(String dataEspecifica, int id_servico) {
        PreparedStatement pst;
        List<DataBean> listDatas = new ArrayList<>();
        DataBean data;
        StringBuilder sql = new StringBuilder();
        ResultSet rs;
        TratarHora tratarHora = new TratarHora();
        sql.append("SELECT d.*, g.cod_catservico, u.codigo ");
        sql.append("FROM tbl_disponibilidade as d, tbl_guiche as g, tbl_usuario as u ");
        sql.append("WHERE g.codigo = d.cod_guiche AND g.codigo = u.cod_guiche AND d.status = 0 ");
        sql.append("AND g.cod_catservico='"+id_servico+"' AND dia='"+dataEspecifica+"' GROUP BY d.hora");

        try {
            pst = conexao.prepareStatement(sql.toString());
            rs = pst.executeQuery();
            while (rs.next()) {
                data = new DataBean();
                /**
                 * FAZ A COMPARAÇÃO COM A HORA DO SISTEMA E A HORA DO BANCO DE DADOS, PRA NÃO PEGAR DATAS QUE JÁ PASSARAM
                 */
                if (tratarHora.tratarHora(tratarHora.getHoraSys()).before(tratarHora.tratarHora(rs.getString("hora")))) {
                    data.setDia(rs.getDate("dia"));
                    data.setId_data_hora(rs.getInt("codigo"));
                    data.setHora(rs.getString("hora"));
                    data.setId_guiche(rs.getInt("cod_guiche"));
                    data.setId_atendente(rs.getInt("u.codigo"));
                    System.out.println("JDBC:" + data.getId_atendente());
                    listDatas.add(data);

                }
            }
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("ERRO AO LISTAR DATAS --- ERRO || " + ex);
        } catch (ParseException ex) { 
            Logger.getLogger(DataJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listDatas;
    }

    /**
     * 
     * @param d
     * @return b
     * 
     * MÉTODO RESPONSÁVEL POR ALTERAR O STATUS DO HORARIO | 0 = LIVRE | 1 = RESERVADO
     */
    @Override
    public boolean alterarStatus(int d) {
        PreparedStatement pst;
        String sql = "UPDATE tbl_disponibilidade SET status=1 WHERE codigo='" + d + "'";
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

    /**
     * 
     * @param id
     * @return DataBean
     * 
     */
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
}
