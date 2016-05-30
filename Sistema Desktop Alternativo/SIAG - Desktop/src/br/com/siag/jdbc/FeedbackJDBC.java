/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.jdbc;

import br.com.siag.beans.FeedBackBean;
import br.com.siag.dao.FeedbackDAO;
import br.com.siag.util.ConnectionFactory;
import java.sql.Connection;
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
public class FeedbackJDBC implements FeedbackDAO {

    private Connection conexao;

    public FeedbackJDBC(Connection conexao) throws ClassNotFoundException {
        this.conexao = ConnectionFactory.getConnection();
    }

    /**
     *
     * @param feedback
     * @return MÉTODO PARA INSERIR UM FEEDBACK NO BANCO DE DADOS
     */
    @Override
    public boolean inserir(FeedBackBean feedback) {
        PreparedStatement pst;
        String sql = "INSERT INTO tbl_feedback (cod_agendamento, opiniao, nota) "
                + "VALUES (?,?,?)";
        boolean b;

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, feedback.getCod_atendimento());
            pst.setString(2, feedback.getOpiniao());
            pst.setInt(3, feedback.getNota());
            pst.execute();
            b = true;
        } catch (SQLException ex) {
            b = false;
            JOptionPane.showMessageDialog(null, "Erro ao adicionar feedback --- ERRO || " + ex);
        }
        return b;
    }

    /**
     *
     * @param codigoAtendimento
     * @return MÉTODO PARA VERIFICAR SE JÁ EXISTE UM FEEDBACK CADASTRADO NAQUELE
     * CODIGO
     */
    @Override
    public int verificarFeedback(int codigoAtendimento) {
        PreparedStatement pst;
        String sql = "SELECT count(*) As size FROM tbl_feedback WHERE cod_agendamento='" + codigoAtendimento + "'";
        ResultSet rs;
        int codigo = 0;
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                codigo = rs.getInt("size");
            }
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("ERRO AO CARREGAR --- ERRO || " + ex);
        }

        return codigo;
    }

    @Override
    public boolean inserirFeedBackAluno(FeedBackBean feedback) {
        PreparedStatement pst;
        String sql = "INSERT INTO tbl_feedback (cod_agendamento, opiniao, nota,origem) "
                + "VALUES (?,?,?,'aluno')";
        boolean b;

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, feedback.getCod_atendimento());
            pst.setString(2, feedback.getOpiniao());
            pst.setInt(3, feedback.getNota());
            pst.execute();
            b = true;
        } catch (SQLException ex) {
            b = false;
            JOptionPane.showMessageDialog(null, "Erro ao adicionar feedback --- ERRO || " + ex);
        }
        return b;
    }

    @Override
    public List<FeedBackBean> listarFeedBack() {
        List<FeedBackBean> listFeedBack = new ArrayList<>();
        FeedBackBean feedBackBean;
        PreparedStatement pst;
        StringBuilder sql = new StringBuilder();
        ResultSet rs;
        
        sql.append("SELECT tbl_usuario.nome, AVG(tbl_feedback.nota) AS media ");
        sql.append("FROM tbl_feedback ");
        sql.append("INNER JOIN tbl_agendamento ON tbl_agendamento.codigo = tbl_feedback.cod_agendamento ");
        sql.append("INNER JOIN tbl_usuario ON tbl_usuario.codigo = tbl_agendamento.cod_atendente ");
        sql.append("WHERE tbl_feedback.origem='aluno'");

        try{
            pst = conexao.prepareStatement(sql.toString());
            rs = pst.executeQuery();
            
            while(rs.next()){
                feedBackBean = new FeedBackBean();
                feedBackBean.setNome_atendente(rs.getString("nome"));
                feedBackBean.setMedia(rs.getFloat("media"));
                listFeedBack.add(feedBackBean);
            }
            pst.close();
            rs.close();
        }catch(SQLException ex){
            System.out.println("ERRO AO CARREGAR !"+ex);
        }
        
        return listFeedBack;
    }

}
