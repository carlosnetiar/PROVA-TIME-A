/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.jdbc;

import br.com.siag.beans.DataBean;
import br.com.siag.dao.DataDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    @Override
    public List<DataBean> listarHorariosDisponiveis(String dataEspecifica) {
        PreparedStatement pst;
        List<DataBean> listDatas = new ArrayList<>();
        DataBean data;
        StringBuilder sql = new StringBuilder();
        ResultSet rs;

        sql.append("SELECT * FROM tbl_disponibilidade ");
        sql.append("WHERE status = 1 && dia='"+dataEspecifica+"'");

        try {
            pst = conexao.prepareStatement(sql.toString());
            rs = pst.executeQuery();
            while (rs.next()) {
                data = new DataBean();
                data.setDia(rs.getDate("dia"));
                data.setHora(rs.getString("hora"));
                data.setId_data_hora(rs.getInt("codigo"));
                listDatas.add(data);
            }
            pst.close();
            rs.close();
        }catch(SQLException ex){
            System.out.println("ERRO AO LISTAR DATAS --- ERRO || "+ex);
        }
        
        return listDatas;
    }

    @Override
    public boolean alterarStatus(int d) {
        PreparedStatement pst;
        String sql = "UPDATE tbl_disponibilidade SET status=0 WHERE codigo='"+d+"'";
        boolean b;
        try{
            pst = conexao.prepareStatement(sql);
            pst.execute();
            pst.close();
            b=true;
        }catch(SQLException ex){
            System.out.println("ERRO AO MARCAR HORARIO --- ERRO || "+ex);
            b=false;
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
        sql.append("WHERE codigo='"+id+"'");
        
        try{
            pst = conexao.prepareStatement(sql.toString());
            rs = pst.executeQuery();
            if(rs.next()){
                dataBean = new DataBean();
                dataBean.setHora(rs.getString("hora"));
                dataBean.setDia(rs.getDate("dia"));
            }
            pst.close();
            rs.close();
        }catch(SQLException ex){
            System.out.println("ERRO AO CARREGAR DATAS --- ERRO || "+ex);
        }
        
        return dataBean;
    }
}
