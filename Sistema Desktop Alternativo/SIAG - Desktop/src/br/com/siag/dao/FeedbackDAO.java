/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.dao;

import br.com.siag.beans.FeedBackBean;
import java.util.List;

/**
 *
 * @author marcus
 */
public interface FeedbackDAO {
    /**
     * 
     * @param feedback
     * @return INSERE FEEDBACK NO DATABASE
     */
    public boolean  inserir(FeedBackBean feedback);
    
    /**
     * 
     * @param codigoAtendimento
     * @return VERIFICA SE JÁ EXISTE UM FEEDBACK RELACIONADO AQUELE AGENDAMENTO
     */
    public int  verificarFeedback(int codigoAtendimento);
    
    /**
     * 
     * @param feedBackBean
     * @return INSERE FEEDBACK DO ALUNO
     */
    public boolean inserirFeedBackAluno(FeedBackBean feedBackBean);
    
    /**
     * 
     * @return LISTAR FEEDBACK DOS ATENDENTES
     * 
     */
    public List<FeedBackBean> listarFeedBack();
}
