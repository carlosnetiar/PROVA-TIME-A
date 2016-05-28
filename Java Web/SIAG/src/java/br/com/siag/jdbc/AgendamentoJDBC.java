/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.jdbc;

import br.com.siag.beans.AgendaBean;
import br.com.siag.dao.AgendamentoDAO;
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
public class AgendamentoJDBC implements AgendamentoDAO {

    private final Connection conexao;

    public AgendamentoJDBC(Connection conexao) {
        this.conexao = conexao;
    }
    
    @Override
    public boolean agendarAula(AgendaBean agendamento) {
        PreparedStatement pst;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO tbl_agendamento (cod_aluno,cod_dia,cod_servico,cod_guiche, cod_atendente) VALUES(?,?,?,?,?)");
        boolean b;
        try {
            pst = conexao.prepareStatement(sql.toString());
            pst.setInt(1, agendamento.getId_usuario());
            pst.setInt(2, agendamento.getId_dia());
            pst.setInt(3, agendamento.getServico());
            pst.setInt(4, agendamento.getGuiche());
            pst.setInt(5, agendamento.getId_atendente());
            pst.execute();
            b = true;
        } catch (SQLException ex) {
            System.out.println("ERRO AO MARCAR AGENDAMENTO --- ERRO || " + ex);
            b = false;
        }

        return b;
    }

    @Override
    public List<AgendaBean> listarAgendamento(String CPF) {
        List<AgendaBean> listHorarios = new ArrayList<>();
        AgendaBean horario;
        PreparedStatement pst;
        ResultSet rs;
        StringBuilder sql = new StringBuilder();
        
        sql.append("SELECT tbl_aluno.*, tbl_agendamento.*,tbl_servico.*, tbl_disponibilidade.* ,tbl_agendamento.* FROM tbl_agendamento ");
        sql.append("INNER JOIN tbl_aluno ON tbl_aluno.codigo = tbl_agendamento.cod_aluno ");
        sql.append("INNER JOIN tbl_servico ON tbl_servico.codigo = tbl_agendamento.cod_servico ");
        sql.append("INNER JOIN tbl_disponibilidade ON tbl_disponibilidade.codigo = tbl_agendamento.cod_dia ");
        sql.append("WHERE tbl_aluno.cpf_aluno='"+CPF+"'");
        
        try{
            pst = conexao.prepareStatement(sql.toString());
            rs = pst.executeQuery();
            while(rs.next()){
                horario = new AgendaBean();
                horario.setHorario(rs.getString("tbl_disponibilidade.hora"));
                horario.setNome_aluno(rs.getString("tbl_aluno.nome_aluno"));
                horario.setData(rs.getDate("tbl_disponibilidade.dia"));
                listHorarios.add(horario);
                System.out.println(listHorarios);
            }
            pst.close();
            rs.close();
        }catch(SQLException ex){
            System.out.println("ERRO AO LISTAR AGENDA --- ERRO || "+ex);
        }
        return listHorarios;
    }
}
