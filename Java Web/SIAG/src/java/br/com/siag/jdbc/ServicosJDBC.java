/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.jdbc;

import br.com.siag.beans.CatServicoBean;
import br.com.siag.beans.ServicoBean;
import br.com.siag.dao.ServicosDAO;
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
public class ServicosJDBC implements ServicosDAO {

    private final Connection conexao;

    public ServicosJDBC(Connection conexao) {
        this.conexao = conexao;
    }
    
    /**
     * 
     * @param codigoCategoria
     * @return TODOS OS SERVIÇOS DISPONÍVEIS
     */
    @Override
    public List<ServicoBean> listarServicosDisponiveis(String codigoCategoria) {
        List<ServicoBean> listServicos = new ArrayList<>();
        ServicoBean servico;
        PreparedStatement pst;
        ResultSet rs;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM tbl_servico ");
        sql.append("WHERE tipo_cat='" + codigoCategoria + "'");

        try {
            pst = conexao.prepareStatement(sql.toString());
            rs = pst.executeQuery();

            while (rs.next()) {
                servico = new ServicoBean();
                servico.setId_servico(rs.getInt("codigo"));
                servico.setNome_servico(rs.getString("nome_servico"));
                servico.setTipo_categoria(rs.getInt("tipo_cat"));
                listServicos.add(servico);
                System.out.println(servico.getNome_servico());
            }
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("ERRO AO CARERGAR SERVICOS --- ERRO || " + ex);
        }

        return listServicos;
    }

    /**
     * 
     * @return TODAS AS CATEGORIAS DISPONÍVEIS
     */
    @Override
    public List<CatServicoBean> listarCategoriasDisponiveis() {
        PreparedStatement pst;
        String sql = "SELECT * FROM tbl_cat_servico";
        ResultSet rs;
        List<CatServicoBean> listCatServico = new ArrayList<>();
        CatServicoBean catServico;

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                catServico = new CatServicoBean();
                catServico.setId_categoria(rs.getInt("codigo"));
                catServico.setNome_categoria(rs.getString("nome_cat"));
                listCatServico.add(catServico);

            }
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("ERRO AO LISTAR CATEGORIAS --- ERRO || " + ex);
        }
        return listCatServico;
    }

    @Override
    public ServicoBean servicoEspecifico(int codigo) {
        PreparedStatement pst;
        ServicoBean servicoBean = null;
        String sql = "SELECT * FROM tbl_servico WHERE codigo='" + codigo + "'";
        ResultSet rs;

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                servicoBean = new ServicoBean();
                servicoBean.setNome_servico(rs.getString("nome_servico"));
            }
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("ERRO AO PROCURAR SERVICO --- ERRO || " + ex);
        }
        return servicoBean;
    }

    @Override
    public CatServicoBean categoriaEspecifica(int codigo) {
        PreparedStatement pst;
        CatServicoBean catServicoBean = null;
        String sql = "SELECT * FROM tbl_cat_servico WHERE codigo='" + codigo + "'";
        ResultSet rs;

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                catServicoBean = new CatServicoBean();
                catServicoBean.setNome_categoria(rs.getString("nome_cat"));
            }
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("ERRO AO PROCURAR CATEGORIA --- ERRO || " + ex);
        }
        return catServicoBean;
    }

}
