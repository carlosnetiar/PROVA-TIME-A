/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.controllers;

import br.com.fradetecnologia.controllers.Controller;
import br.com.siag.beans.AgendaBean;
import br.com.siag.beans.CatServicoBean;
import br.com.siag.beans.DataBean;
import br.com.siag.beans.ServicoBean;
import br.com.siag.beans.UsuarioBean;
import br.com.siag.dao.AgendamentoDAO;
import br.com.siag.dao.DataDAO;
import br.com.siag.dao.ServicosDAO;
import br.com.siag.dao.UsuarioDAO;
import br.com.siag.util.Comprovante;
import br.com.siag.util.DAOFactory;
import br.com.siag.util.FEmail;
import br.com.siag.util.Feedback;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author marcus
 *
 * CLASSE CONTROLLER RESPONSÁVEL POR AGRUPAR OS MÉTODOS QUE SERÃO RESPONSÁVEIS
 * POR REALIZAR O AGENDAMENTO
 *
 */
public class Horario extends Controller {

    public Horario(HttpServletRequest request, HttpServletResponse response, HttpSession session, String[] args) {
        super(request, response, session, args);
    }

    public void index() throws ServletException, IOException {
        procurar();
    }

    /**
     *
     * @throws ServletException
     * @throws IOException
     *
     * MÉTODO RESPONSÁVEL POR MOSTRAR A TELA PRINCIPAL PARA O USUÁRIO
     */
    public void procurar() throws ServletException, IOException {
        ServicosDAO servicosDAO = DAOFactory.criarServicosDAO(conexao);
        request.setAttribute("cat_serv", servicosDAO.listarCategoriasDisponiveis());
        request.getRequestDispatcher("agendar/procurar.jsp").forward(request, response);
    }

    /**
     *
     * @throws ServletException
     * @throws IOException
     *
     * MÉTODO RESPONSÁVEL POR LISTAR A CATEGORIA DE SERVIÇO E O SERVIÇO
     * REFERENTE A ESSE TIPO VIA AJAX
     */
    public void listarServico() throws ServletException, IOException {
        //CHAMADA DOS DAOS RESPONSÁVEIS PELO SERVICO
        ServicosDAO servicosDAO = DAOFactory.criarServicosDAO(conexao);

        //RECUPERAÇÃO DO CODIGO DA CATEGORIA VIA AJAX NO ARQUIVO /js/ajax/selectDependente.js
        String codigoCategoria = request.getParameter("categoriaServico");

        //STRINGBUILDER RESPONSÁVEL POR ARMAZENAR OS VALORES CARREGADOS DO BANCO
        StringBuilder sb = new StringBuilder();
        PrintWriter out = response.getWriter();

        //ARMAZENAMENTO DOS RESULTADOS OBTIDOS DIRETAMENTE NO BANCO
        List<ServicoBean> listServico = servicosDAO.listarServicosDisponiveis(codigoCategoria);

        //ARMAZENAMENTO DOS DADOS OBTIDOS NO BANCO DENTRO DO STRINGBUILDER PARA VALIDAÇÃO AJAX
        for (int i = 0; i < listServico.size(); i++) {
            sb.append(listServico.get(i).getNome_servico() + "-" + listServico.get(i).getId_servico() + ":");
            System.out.println(sb.toString());
        }
        out.write(sb.toString());
    }

    /**
     *
     * @throws ServletException
     * @throws IOException
     * @throws ParseException
     *
     * MÉTODO RESPONSÁVEL POR LISTAR OS HORÁRIOS DISPONÍVEIS DE ATENDIMENTO EM
     * DETERMINADO DIA
     *
     */
    public void horariosDisponiveis() throws ServletException, IOException, ParseException {
        /**
         * USO DO TRY CATCH PARA FAZER TRATAMENTO DE EXCESSÕES
         */
        try {

            //CARREGAMENTO DOS DAOS DO USUÁRIO E DATA
            UsuarioDAO usuarioDAO = DAOFactory.criarUsuarioDAO(conexao);
            DataDAO dataDAO = DAOFactory.criarDataDAO(conexao);

            //RECUPERAÇÃO DA DATA DO FORMULÁRIO ATRAVÉS DO METODO .getParameter("")
            Date data = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("dataAtendimento"));
            String dataFormatada = new SimpleDateFormat("yyyy-MM-dd").format(data);

            //STRING RESPONSÁVEL POR ARMAZENAR O SERVIÇO
            String codigoCategoria = request.getParameter("categoria");
            String servico = request.getParameter("servico");

            
            //BEAN RESPONSÁVEL POR ARMAZENAR OS DADOS DO USUÁRIO ATRAVÉS DO CPF
            UsuarioBean usuario = new UsuarioBean();
            usuario.setCpf_user(request.getParameter("cpf"));

            if (usuarioDAO.carregarUser(usuario.getCpf_user()) == null) {
                //VALIDAÇÃO DO SISTEMA - VERIFICA SE EXISTE USUÁRIO COM ESSE CPF
                request.setAttribute("erroMsg", Feedback.erroCPF(usuario.getCpf_user()));
                procurar();
            } else if (codigoCategoria.equals("999") || servico.equals("999")) {

                //VALIDAÇÃO DO SISTEMA - VERIFICA SE O USUÁRIO ESCOLHEU UMA CATEGORIA
                request.setAttribute("erroMsg", Feedback.erroCategoria());
                procurar();

            } else if (dataDAO.listarHorariosDisponiveis(dataFormatada, Integer.valueOf(codigoCategoria)).isEmpty()) {

                //VALIDAÇÃO DO SISTEMA - VERIFICA SE EXISTE HORÁRIO DISPONÍVEL NESSA DATA
                request.setAttribute("erroMsg", Feedback.erroData());
                System.out.println(dataFormatada);
                procurar();

            } else {

                //ATRIBUTOS UTILIZADOS NA agendar/listar.jsp
                request.getSession().setAttribute("servico", servico);
                request.getSession().setAttribute("categoria", codigoCategoria);
                request.setAttribute("datasDisponiveis", dataDAO.listarHorariosDisponiveis(dataFormatada, Integer.valueOf(codigoCategoria)));
                request.getSession().setAttribute("usuario", usuarioDAO.carregarUser(usuario.getCpf_user()));
                request.getRequestDispatcher("agendar/listar.jsp").forward(request, response);

            }
            //TRATAMENTO DE EXCESSÕES
        } catch (NullPointerException | ParseException ex) {
            procurar();
        }

    }

    /**
     *
     * @throws ServletException
     * @throws IOException
     *
     * MÉTODO RESPONSÁVEL POR PEGAR OS ATRIBUTOS NA VIEW E INSERIR NO BANCO DE
     * DADOS
     */
    public void confirmar() throws ServletException, IOException {
        try {
            //CRIAÇÃO E INSTANCIAÇÃO DOS BEANS UTILIZADOS NO MÉTODO
            UsuarioBean aluno;
            AgendaBean agendaBean = new AgendaBean();
            ServicoBean servicoBean;
            CatServicoBean catServicoBean;
            DataBean dataBean;

            //Carregamento dos DAOS
            DataDAO dataDAO = DAOFactory.criarDataDAO(conexao);
            AgendamentoDAO agendaDAO = DAOFactory.criarAgendamentoDAO(conexao);
            ServicosDAO servicosDAO = DAOFactory.criarServicosDAO(conexao);

            //Carregamento e Inserção nos BEANS            
            agendaBean.setId_usuario(Integer.valueOf(this.args[1]));
            agendaBean.setId_dia(Integer.valueOf(this.args[0]));
            agendaBean.setCat_servico(Integer.valueOf(this.args[2]));
            agendaBean.setServico(Integer.valueOf(this.args[3]));
            agendaBean.setGuiche(Integer.valueOf(this.args[4]));
            agendaBean.setId_atendente(Integer.valueOf(this.args[5]));
            aluno = (UsuarioBean) request.getSession().getAttribute("usuario");

            //CHAMANDO OS METODOS DAO COM OS PARAMETROS PARA JDBC
            servicoBean = servicosDAO.servicoEspecifico(Integer.valueOf(request.getSession().getAttribute("servico").toString()));
            catServicoBean = servicosDAO.categoriaEspecifica(Integer.valueOf(request.getSession().getAttribute("categoria").toString()));
            dataBean = dataDAO.carregarDataEspecifica(Integer.valueOf(this.args[0]));

            //RETORNANDO UMA MENSAGEM NA TELA SE OCORREU TUDO BEM
            if(dataDAO.alterarStatus(Integer.valueOf(this.args[0])) &&  agendaDAO.agendarAula(agendaBean)){
            request.setAttribute("erroMsg", Feedback.sucesso());
            
            //ENVIAR EMAIL DE CONFIRMAÇÃO DE AGENDAMENTO
            String corpo = Comprovante.corpoComprovante(aluno.getNome_user(), String.valueOf(dataBean.getDia()), dataBean.getHora(), catServicoBean.getNome_categoria(), servicoBean.getNome_servico());
            FEmail.enviar("SIAG - Agendamento Integrado", aluno.getEmail_user(), "Comprovação de Agendamento - SIAG", corpo);
            procurar();
            
            }else{
            request.setAttribute("erroMsg", Feedback.erroSistema());
            procurar();
            }
            //TRATAMENTO DE EXCESSÕES COM USO DE MULTICATCH
        } catch (NullPointerException | ArrayIndexOutOfBoundsException | NumberFormatException ex) {
            procurar();
        }

    }

    /**
     * 
     * @throws ServletException
     * @throws IOException 
     * Método responsável por mostrar a tela de listar horário
     */
    public void listar() throws ServletException, IOException {
        request.getRequestDispatcher("listar/listarHorarios.jsp").forward(request, response);
    }

    /**
     * 
     * @throws ServletException
     * @throws IOException 
     * MÉTODO RESPONSÁVEL POR ATUALIZAR A TABELA VIA AJAX
     */
    public void recuperarListaAjax() throws ServletException, IOException {
        AgendamentoDAO agendamentoDAO = DAOFactory.criarAgendamentoDAO(conexao);
        JSONArray listaAgenda = new JSONArray();
        String cpf = request.getParameter("cpf");
        System.out.println(cpf);

        for (AgendaBean agenda : agendamentoDAO.listarAgendamento(cpf)) {
            listaAgenda.put(new JSONObject(agenda));
        }

        response.setContentType("application/json");
        response.getWriter().write(listaAgenda.toString());
    }

}
