<?php

// MODELOS DE MANIPULAÇÃO DOS DADOS

class Siag_model extends CI_Model {
        public $title;
        public $content;
        public $date;

		// CONSTRUTOR BASE DA CLASSE
        public function __construct()
        {
                // Call the CI_Model constructor
                parent::__construct();
        }

		// METODO PARA CONSULTAR E GERAR INFORMAÇÕES PARA O MENU PRINCIPAL
        public function get_menu()
        {
				$this->db->select();
				$this->db->where("show_menu = 'SIM'");
				$this->db->order_by("codigo");
                $query = $this->db->get('tbl_ead_conteudo');

				return $query->result_array();

        }

		// METODO PARA LEITURA DO BANCO DE DADOS DE INFORMACOES GERAIS DE CADA PAGINA (LINKS INTERNOS)
        public function get_conteudo($page)
        {
				$this->db->select();
				$this->db->where("codigo = ".$page);
				$this->db->where("status = 'PUBLIC'");
                $query = $this->db->get('tbl_ead_conteudo');

				if ($this->db->affected_rows() > 0) {
					$row = $query->result_array();

					return $row[0];
				} else {
					return 0;
				}

        }


		// METODO PARA LEITURA DO BANCO DE DADOS DE INFORMACOES INTERNAS DE CADA PAGINA (SEÇÃO)
        public function get_conteudo_item($page,$item = -1)
        {
				$this->db->select();
				$this->db->where("cod_conteudo = ".$page);
				if ($item > 0) $this->db->where("codigo = ".$item);
                $query = $this->db->get('tbl_ead_conteudo_itens');

				$result = $query->result_array();

                // echo "<hr>Item ".$item." - ".$this->db->affected_rows()."<hr>";
				//foreach ($result as $key => $row) {
				//	echo "<hr>".$key." - ".$row."<br>";
				//	foreach ($row as $key2 => $row2) {
				//		echo $key." - ".$row2."<br>";
				//	}
				//}
                return $query->result_array();
        }

		// MÉTODO PARA INCREMETAR A INFORMACAO DE ACESSO DE CADA LINK ESPECIFICO
        public function update_hits($page)
        {
				$this->db->set('hits_acessos', 'hits_acessos+1', FALSE);
				$this->db->where('codigo', $page);
				return $this->db->update('tbl_ead_conteudo');
		}


        // METODO PARA LEITURA DO BANCO DE DADOS PARA ULTIMOS CADASTROS FEITOS EM UMA TABELA GENERICA
        public function get_last_rows($table,$num_return)
        {
				$this->db->select();
				$this->db->order_by("1 DESC");
                $query = $this->db->get($table, $num_return);
                return $query->result();
        }

        // METODO PARA LEITURA DO BANCO DE DADOS PARA COM UMA CONFERENCIA DE INFORMACOES POR GRUPO ESPECIFICO
        public function get_sum_rows($table,$field,$num_return)
        {
                $this->db->select($field);
                $this->db->select("COUNT(".$field.") as total");
                $this->db->group_by($field);
                $this->db->order_by("total DESC");

                $query = $this->db->get($table, $num_return);
                return $query->result();
        }


        // METODO PARA LEITURA DO BANCO DE DADOS DE INFORMACOES DE CAMPOS ENUM (TIPOS PERSONALIZADOS)
        public function get_enum_names($table = "ALL")
        {
			$this->db->select('COLUMN_NAME');
			$this->db->select('TABLE_NAME');
			$this->db->select('COLUMN_TYPE');
			if ($table =! "ALL") $this->db->where('TABLE_NAME', $table);
			$this->db->where('DATA_TYPE', 'enum');
			$query = $this->db->get('INFORMATION_SCHEMA.COLUMNS');

			$retorno = $query->result_array();

			foreach ($retorno as $key => $row) {
				$enum_list = explode(",", str_replace("'", "", substr($row['COLUMN_TYPE'], 5, (strlen($row['COLUMN_TYPE'])-6))));
				$campo_enum[$row['TABLE_NAME']][$row['COLUMN_NAME']] = $enum_list;
			}

			return $campo_enum;
		}



        public function insert_conteudo()
        {
			// METODO A SER FEITO

        }

        public function update_conteudo()
        {
			// METODO A SER FEITO
        }
}

?>