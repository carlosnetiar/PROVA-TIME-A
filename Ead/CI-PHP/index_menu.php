<?
	// GERAÇÃO AUTOMATICA DO MENU DE OPCOES, ATRAVÉS DO ARRAY $page_manu

	foreach ($page_menu as $key => $row) {
		echo "<a href=\"".$STATIC_ROOT_FILES."index.php/siag/index/".$row['codigo']."\" class=menulateral>".$row['titulo']."</a>";
	}
?>

<p>&nbsp;</p>

