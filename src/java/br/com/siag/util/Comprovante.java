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
public class Comprovante {

    public static String corpoComprovante(String nome, String data, String Horario, String categoria, String servico) {
        String head = "<div class=\"header\" style=\"width: 600px; height: 220px; align-content: center;\">\n" +
"\n" +
"		<div class=\"logo\" style=\"display: block; float: left; margin-left: 30px\">\n" +
"				<img src=\"http://i66.tinypic.com/104s4dv.png\" alt=\"SIAG\" style=\"width: 100px; height: 100px;\" />\n" +
"		</div>\n" +
"\n" +
"		<div class=\"apresentacao\" style=\"margin-left: 210px;\">\n" +
"		<strong >Sistema Integrado de Agendamento Gerenciado</strong><br>\n" +
"			<h3 style=\"margin-left: 30px;\"><b>Comprovante de Agendamento</b></h3><br>\n" +
"		</div>\n" +
"\n" +
"		<br><br><br>";
        
        String conteudo = "		<div class=\"conteudo\" style=\"margin-left: 30px\">\n" +
"			Nome:<strong>"+nome+"</strong><br>\n" +
"			Data:<strong>"+data+"</strong><br>\n" +
"			Horario:<strong>"+Horario+"</strong><br>\n" +
"			Categoria de Serviço:<strong>"+categoria+"</strong><br>\n" +
"			Serviço:<strong>"+servico+"</strong>\n" +
"\n" +
"		</div>\n" +
"				\n" +
"		</div>";
        
        return head+conteudo;
    }
}
