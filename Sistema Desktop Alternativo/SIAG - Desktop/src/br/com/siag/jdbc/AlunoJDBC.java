/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.jdbc;

import br.com.siag.beans.AlunoBean;
import br.com.siag.dao.AlunoDAO;
import br.com.siag.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author marcus
 */
public class AlunoJDBC implements AlunoDAO {

    private final Connection conexao;

    public AlunoJDBC(Connection conexao) throws ClassNotFoundException {
        this.conexao = ConnectionFactory.getConnection();
    }

    /**
     * 
     * @param aluno
     * @return MÉTODO PARA INSERIR ALUNO NO DATABASE
     */
    @Override
    public boolean inserir(AlunoBean aluno) {
        PreparedStatement pst;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO tbl_aluno (nome_aluno, cpf_aluno, tel_aluno, email_aluno) ");
        sql.append("VALUES (?,?,?,?) ");
        boolean b = false;
        try {
            pst = conexao.prepareStatement(sql.toString());
            pst.setString(1, aluno.getNome_aluno());
            pst.setString(2, aluno.getCpf_aluno());
            pst.setString(3, aluno.getTelefone_aluno());
            pst.setString(4, aluno.getEmail_aluno());
            pst.execute();
            pst.close();
            b = true;
            JOptionPane.showMessageDialog(null, "Aluno inserido com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO INSERIR ALUNO --- ERRO || " + ex);
        }
        return b;
    }

    /**
     * 
     * @param cpf
     * @return MÉTODO QUE RETORNA UM ALUNO PELO SEU CPF
     */
    @Override
    public AlunoBean procurar(String cpf) {
        PreparedStatement pst;
        String sql = "SELECT * FROM sisagenda.tbl_aluno WHERE cpf_aluno ='" + cpf + "'AND status='ATIVO'";
        ResultSet rs;
        AlunoBean alunoBean = null;

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                alunoBean = new AlunoBean();
                alunoBean.setId_aluno(rs.getInt("codigo"));
                alunoBean.setNome_aluno(rs.getString("nome_aluno"));
                alunoBean.setCpf_aluno(rs.getString("cpf_aluno"));
                alunoBean.setEmail_aluno(rs.getString("email_aluno"));
                alunoBean.setTelefone_aluno(rs.getString("tel_aluno"));
            }
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CARREGAR ALUNO --- ERRO || " + ex);
        }

        return alunoBean;

    }

    /**
     * 
     * @param codigo
     * @param aluno
     * @return MÉTODO QUE ALTERA UM ALUNO
     */
    @Override
    public boolean alterar(int codigo, AlunoBean aluno) {
        PreparedStatement pst;
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE tbl_aluno ");
        sql.append("SET nome_aluno ='"+aluno.getNome_aluno()+"',tel_aluno='"+aluno.getTelefone_aluno()+"',email_aluno='"+aluno.getEmail_aluno()+"' ");
        sql.append("WHERE codigo = '" + codigo + "'");
        boolean b;
        try {
            pst = conexao.prepareStatement(sql.toString());
            pst.execute();
            b = true;
        } catch (SQLException ex) {
            b = false;
            JOptionPane.showMessageDialog(null, "ERRO || "+ex);
        }
        return b;
    }

    /**
     * 
     * @param codigo
     * @return MÉTODO QUE DELETA UM ALUNO BASEANDO-SE PELO CÓDIGO
     */
    @Override
    public boolean deletar(int codigo) {
        PreparedStatement pst;
        String sql = "UPDATE tbl_aluno SET status='INATIVO' WHERE codigo = '" + codigo + "'";
        boolean b;
        try {
            pst = conexao.prepareStatement(sql);
            pst.execute();
            b = true;
            JOptionPane.showMessageDialog(null, "Deletado com sucesso !");
            pst.close();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "ERRO AO DELETAR CADASTRO --- ERRO || " + ex);
            b = false;
        }

        return b;
    }

}
