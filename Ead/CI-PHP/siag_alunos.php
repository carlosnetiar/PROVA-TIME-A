<br>
        <ul>
		<?php
			foreach ($query as $row)
			{
				echo "<li>Categoria: ".$row->nome_aluno." - E-mail: ".$row->email_aluno."</li>";
			}

		?>
        </ul>
<br>