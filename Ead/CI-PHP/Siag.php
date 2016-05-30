<?php

// CONTRALADOR E INTEGRADOR DOS DADOS COM AS VISÕES (SAÍDAS)

class Siag extends CI_Controller {


		// METODO PRINCIPAL E GENERICA DE PAGINAS QUE POR PADRAO É A PAGINA INICIAL (INDEX)
        public function index($page = 1,$item = 0) {

        		$data['page'] = $page;
        		$data['conteudo'] = $item;

				$this->load->database();
				$this->load->model('Siag_model', 'obj_siag');

				$data['page_info'] = $this->obj_siag->get_conteudo($page);
				$data['page_menu'] = $this->obj_siag->get_menu();

				$page_tipo = $data['page_info']['enum_tipo'];
				if (isset($page_tipo) AND ($page_tipo != "PHP")) $data['page_conteudo'] = $this->obj_siag->get_conteudo_item($page,$item);

				$data['heading'] = $data['page_info']['titulo'];
				$data['title'] = "SIAG";

                $this->load->view('siag_page', $data);
                $this->obj_siag->update_hits($page);
        }

		// METODO PARA CONSULTAR COMUNICACAO COM A BASE DE DADOS E OBTER INFORMACOES ESTRUTURAIS DAS TABELAS
        public function sql_status() {

				$this->load->model('Siag_model', 'obj_siag');
				$this->load->database();

                $data['query'] = $this->obj_siag->get_sum_rows("tbl_agendamento","cod_servico",10);
                $this->load->view('content', $data);
                $data['query'] = $this->obj_siag->get_last_rows("tbl_aluno",4);
                $this->load->view('siag_alunos', $data);

                $data['tabelas'] = $this->db->list_tables();
                $data['enum_names'] = $this->obj_siag->get_enum_names("tbl_feedback");
                $this->load->view('siag_tabelas', $data);
        }

}
?>