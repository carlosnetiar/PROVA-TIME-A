/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.util;

/**
 *
 * @author marcus
 */
public class Feedback {

    public static String erroCPF(String cpf) {
        return "<div class=\"alert alert-danger\">\n"
                + "               <strong>Erro: </strong> Nenhum usuário encontrado com este CPF: <strong>"+cpf+"</strong> </div>";
    }

    public static String erroCategoria() {
        return "<div class=\"alert alert-danger\">\n"
                + "               <strong>Erro: </strong> Por favor, escolha um serviço! </div>";
    }

    public static String erroData() {
        return "<div class=\"alert alert-warning\">\n"
                + "                                        <strong>Atenção !</strong> Não existe horário disponível neste dia, por favor escolha outro ! </div>";
    }

    public static String sucesso() {
        return "<div class=\"alert alert-success\">\n"
                + "<strong>Parabéns!</strong> Horário marcado com sucesso ! Verifique seu e-mail para impressão do comprovante. </div>";
    }
}
