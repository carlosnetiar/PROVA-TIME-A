/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.jdbc;

import br.com.siag.beans.GuicheBean;
import br.com.siag.beans.UsuarioBean;
import br.com.siag.dao.UsuarioDAO;
import br.com.siag.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marcus
 */
public class UsuarioJDBC implements UsuarioDAO{
    private final Connection conexao;
    
    public UsuarioJDBC(Connection conexao) throws ClassNotFoundException{
        this.conexao = ConnectionFactory.getConnection();
    }

    /**
     * 
     * @param cpf
     * @param dataNasc
     * @return MÉTODO RESPONSÁVEL POR FAZER AUTENTICAÇÃO, USANDO-SE DE CPF E DATA DE NASCIMENTO
     */
    @Override
    public UsuarioBean logar(String cpf, Date dataNasc) {
        PreparedStatement pst;
        UsuarioBean user= null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT tbl_usuario.*, tbl_guiche.*, tbl_cat_servico.* FROM tbl_usuario ");
        sql.append("LEFT OUTER JOIN tbl_guiche ON tbl_guiche.codigo = tbl_usuario.cod_guiche ");
        sql.append("LEFT OUTER JOIN tbl_cat_servico ON tbl_cat_servico.codigo = tbl_guiche.cod_catservico ");
        sql.append("WHERE cpf='"+cpf+"' AND data_nascimento='"+dataNasc+"'");
        ResultSet rs;
        try{
            pst = conexao.prepareStatement(sql.toString());
            rs = pst.executeQuery();
            
            if(rs.next()){
                user = new UsuarioBean();
                user.setCodigo(rs.getInt("codigo"));
                user.setNome_usuario(rs.getString("nome"));
                user.setCod_guiche(rs.getInt("cod_guiche"));
                user.setCpf_usuario(rs.getString("cpf"));
                user.setCategoria_servico(rs.getString("nome_cat"));
                user.setTipo(rs.getString("enm_tipo"));
            }
            pst.close();
            rs.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao logar --- ERRO || "+ex);
        }
        
        return user;
    }

    /**
     * 
     * @return MÉTODO RESPONSÁVEL POR LISTAR TODOS OS GUICHÊS
     */
    @Override
    public List<GuicheBean> carregarGuiches() {
        PreparedStatement pst;
        String sql = "SELECT * FROM tbl_guiche";
        ResultSet rs;
        List<GuicheBean> listGuiche = new ArrayList<>();
        GuicheBean guiche;
        
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                guiche = new GuicheBean();
                guiche.setCod_catservico(rs.getInt("cod_catservico"));
                guiche.setNum_guiche(rs.getInt("numero"));
                guiche.setCodigo(rs.getInt("codigo"));
                listGuiche.add(guiche);
            }
            pst.close();
            rs.close();
        }catch(SQLException ex){
            System.out.println("Erro ao listar guiche -- ERRO || "+ex);
        }
        
        return listGuiche;
    }

    @Override
    public boolean novo(UsuarioBean usuario) {
        PreparedStatement pst;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO tbl_usuario (nome,cpf,data_nascimento,cod_guiche) ");
        sql.append("VALUES(?,?,?,?)");
        boolean b;
        try{
            pst = conexao.prepareStatement(sql.toString());
            pst.setString(1, usuario.getNome_usuario());
            pst.setString(2, usuario.getCpf_usuario());
            pst.setDate(3, usuario.getDada_nascimento());
            pst.setInt(4, usuario.getCod_guiche());
            pst.execute();
            b=true;
        }catch(SQLException ex){
            b = false;
            System.out.println("ERRO AO CADASTRAR ATENDENTE --- ERRO || "+ex);
        }
        
        return b;
    }
}
