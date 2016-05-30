/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.jdbc;

import br.com.siag.beans.CategoriaServicoBean;
import br.com.siag.beans.GuicheBean;
import br.com.siag.dao.ServicoDAO;
import br.com.siag.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author marcus
 */
public class ServicoJDBC implements ServicoDAO {

    private final Connection conexao;

    public ServicoJDBC(Connection conexao) throws ClassNotFoundException {
        this.conexao = ConnectionFactory.getConnection();
    }

    @Override
    public List<CategoriaServicoBean> listarCategorias() {
        List<CategoriaServicoBean> listCategorias = new ArrayList<>();
        CategoriaServicoBean categoria;
        PreparedStatement pst;
        String sql = "SELECT * FROM tbl_cat_servico";
        ResultSet rs;

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                categoria = new CategoriaServicoBean();
                categoria.setId_categoria(rs.getInt("codigo"));
                categoria.setNome_categoria(rs.getString("nome_cat"));
                listCategorias.add(categoria);
            }
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("ERRO AO CARREGAR CATEGORIAS --- ERRO ||" + ex);
        }

        return listCategorias;
    }

    @Override
    public List<GuicheBean> listarGuicheEspecifico(int cod_cat) {
        PreparedStatement pst;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT gu.numero FROM tbl_guiche gu ");
        sql.append("INNER JOIN tbl_cat_servico cs ON cs.codigo = gu.cod_catservico ");
        sql.append("WHERE gu.codigo NOT IN (SELECT us.cod_guiche FROM tbl_usuario us WHERE us.cod_guiche IS NOT NULL) AND cs.codigo='"+cod_cat+"'");
        ResultSet rs;
        List<GuicheBean> listGuiche = new ArrayList<>();
        GuicheBean guiche;

        try {
            pst = conexao.prepareStatement(sql.toString());
            rs = pst.executeQuery();

            while (rs.next()) {
                guiche = new GuicheBean();
                guiche.setNum_guiche(rs.getInt("numero"));
                listGuiche.add(guiche);
            }
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao listar guiche -- ERRO || " + ex);
        }

        return listGuiche;
    }
}
