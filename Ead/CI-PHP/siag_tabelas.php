<?php

foreach ($tabelas as $table)
{
		echo "<br>Tabela: <b>".$table."</b> => ";
		$fields = $this->db->list_fields($table);

		echo "CAMPOS";
		foreach ($fields as $field)
		{
			echo " [".$field."] ";
		}
}

?>