/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.jdbc;

import br.com.siag.beans.AgendamentosBean;
import br.com.siag.beans.DisponibilidadeBean;
import br.com.siag.dao.DisponibilidadeDAO;
import br.com.siag.util.ConnectionFactory;
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
public class DisponibilidadeJDBC implements DisponibilidadeDAO {

    private final Connection conexao;

    public DisponibilidadeJDBC(Connection conexao) throws ClassNotFoundException {
        this.conexao = ConnectionFactory.getConnection();
    }
    /**
     * 
     * @param disp
     * @return MÉTODO PARA INSERIR UM DIA DISPONÍVEL PARA AGENDAMENTO
     */
    @Override
    public boolean inserirDisponibilidade(DisponibilidadeBean disp) {
        PreparedStatement pst;
        String sql = "INSERT INTO tbl_disponibilidade (dia, hora, status, cod_guiche)\n"
                + "VALUES (?,?,?,?)";
        boolean b;
        try {
            pst = conexao.prepareStatement(sql);
            pst.setDate(1, new java.sql.Date(disp.getDia().getTime()));
            pst.setString(2, disp.getHora());
            pst.setInt(3, disp.getStatus());
            pst.setInt(4, disp.getCod_guiche());
            pst.execute();
            b = true;
        } catch (SQLException ex) {
            b = false;
            System.out.println("ERRO AO CADASTRAR DISPONIBILIDADE --- ERRO || " + ex);
        }
        return b;
    }

    /**
     * 
     * @param dataAual
     * @param codigo_atendente
     * @return MÉTODO PARA LISTAR TODOS OS AGENDAMENTOS DE UM DIA E UM CÓDIGO DE ATENDENTE ESPECÍFICO
     */
    @Override
    public List<AgendamentosBean> listarAgendamentos(String dataAual, int codigo_atendente) {
        List<AgendamentosBean> listAgendamentos = new ArrayList<>();
        AgendamentosBean agendamentoBean;
        PreparedStatement pst;
        ResultSet rs;
        StringBuilder sql = new StringBuilder();
        int size = 0;
        sql.append("SELECT tbl_usuario.nome,tbl_aluno.nome_aluno, tbl_aluno.cpf_aluno,tbl_disponibilidade.dia,tbl_agendamento.codigo,tbl_disponibilidade.hora,tbl_servico.nome_servico ");
        sql.append("FROM tbl_agendamento ");
        sql.append("INNER JOIN tbl_usuario ON tbl_usuario.codigo = tbl_agendamento.cod_atendente ");
        sql.append("INNER JOIN tbl_disponibilidade ON tbl_disponibilidade.codigo = tbl_agendamento.cod_dia ");
        sql.append("INNER JOIN tbl_aluno ON tbl_aluno.codigo = tbl_agendamento.cod_aluno ");
        sql.append("INNER JOIN tbl_servico ON tbl_servico.codigo = tbl_agendamento.cod_servico ");
        sql.append("WHERE tbl_disponibilidade.dia='"+dataAual+"'AND tbl_usuario.codigo='"+codigo_atendente+"'");
        
        try{
            pst = conexao.prepareStatement(sql.toString());
            rs = pst.executeQuery();
            
            while(rs.next()){
                agendamentoBean = new AgendamentosBean();
                agendamentoBean.setId_agendamento(rs.getInt("codigo"));
                agendamentoBean.setCpf_aluno(rs.getString("cpf_aluno"));
                agendamentoBean.setNome_aluno(rs.getString("nome_aluno"));
                agendamentoBean.setHora(rs.getString("hora"));
                agendamentoBean.setNome_servico(rs.getString("nome_servico"));
                listAgendamentos.add(agendamentoBean);
                size++;
            }
            pst.close();
            rs.close();
        }catch(SQLException ex){
            System.out.println("Erro ao carregar dados -- ERRO || "+ex);
        }
        System.out.println(size);
        return listAgendamentos;
    }
}
