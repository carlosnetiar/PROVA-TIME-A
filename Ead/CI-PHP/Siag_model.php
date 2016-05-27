<?php

class Siag_model extends CI_Model {
        public $title;
        public $content;
        public $date;

        public function __construct()
        {
                // Call the CI_Model constructor
                parent::__construct();
        }

        public function get_last_rows($table,$num_return)
        {
				$this->db->select();
                $query = $this->db->get($table, $num_return);
                return $query->result();
        }

        public function get_sum_rows($table,$field,$num_return)
        {
                $this->db->select($field);
                $this->db->select("COUNT(".$field.") as total");
                $this->db->group_by($field);
                $this->db->order_by("total DESC");

                $query = $this->db->get($table, $num_return);
                return $query->result();
        }

        public function insert_entry()
        {
                $this->title    = $_POST['title']; // please read the below note
                $this->content  = $_POST['content'];
                $this->date     = time();

                $this->db->insert('tb_contatos', $this);
        }

        public function update_entry()
        {
                $this->title    = $_POST['title'];
                $this->content  = $_POST['content'];
                $this->date     = time();

                $this->db->update('tb_contatos', $this, array('id' => $_POST['id']));
        }
}

?>