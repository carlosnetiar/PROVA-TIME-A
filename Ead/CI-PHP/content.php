<br>
        <ul>
		<?php
			foreach ($query as $row)
			{
				echo "<li>Categoria: ".$row->cod_servico." - Total de Agendamentos: ".$row->total."</li>";
			}

		?>
        </ul>
<br>