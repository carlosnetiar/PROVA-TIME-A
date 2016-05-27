<?php
class Siag extends CI_Controller {

        public function index()
        {
				$data['title'] = "SIAG - Sistema Integrado de Agendamento";
				$data['heading'] = "SIAG - Sistema Integrado de Agendamento";

				$this->load->model('Siag_model', 'obj_siag');
				$this->load->database();

                $this->load->view('header', $data);
                $this->load->view('menu');

                $data['query'] = $this->obj_siag->get_sum_rows("tbl_agendamento","cod_servico",10);
                $this->load->view('content', $data);
                $data['query'] = $this->obj_siag->get_last_rows("tbl_aluno",4);
                $this->load->view('siag_alunos', $data);


                $data['tabelas'] = $this->db->list_tables();
                $this->load->view('siag_tabelas', $data);


                $this->load->view('footer');
        }

        public function comments()
        {
				$data = array(
						'title' => 'My Title',
						'heading' => 'My Heading',
						'message' => 'My Message'
				);

				$this->load->view('siag_faq', $data);
        }


}
?>