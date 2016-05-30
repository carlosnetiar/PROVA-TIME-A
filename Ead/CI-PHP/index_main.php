<?
if (isset ($page_info) AND $page_info != "") {

	if ($page_info['enum_tipo'] == "PHP")
	{
		include $page_info['descricao'];
	} else {
		$date = strtotime($page_info['datatime']);
		$descricao = str_replace("<li>", "<li class=pagina>", $page_info['descricao']);

		echo "<div class=conteudo>";

		echo "<h1 class=pagina_titulo>".$page_info['titulo']."</h1>";
		echo "<h3 class=pagina_info>Publicado em: ".date('d-m-Y H:i:s', $date)." - Visualizações: ".$page_info['hits_acessos']."</h3>";
		echo "<p class=pagina_descricao>".$descricao."</p>";


		if ($page_info['enum_tipo'] == "BLOG") {

			foreach ($page_conteudo as $key => $conteudo) {


				if ($conteudo['enum_tipo'] == "IMG" || $conteudo['enum_tipo'] == "VIDEO") {

					if ($conteudo['enum_tipo'] == "IMG") {
						$imagem_src = str_replace("[--IMAGENS--]", $SRC_IMG_CONTEUDO, $conteudo['html_tags']);
						$html_media = "<img class=item_img src='".$imagem_src."' onclick=\"fadeIn(fullscreen,1,'".$imagem_src."')\" class=zoom>";


					} else {
						$html_media = "<iframe width=\"100%\" height=360 class=item src='".$conteudo['html_tags']."' frameborder=0 allowfullscreen></iframe>";
					}

					echo "<div class=item>";
					echo "<p class=item_titulo>".$conteudo['subtitulo']."</p>";
					echo "<div class=item_img>$html_media</div>";
					echo "<p class=item_descricao>".$conteudo['descricao']."</p>";
					echo "</div>";
				}
			}

		}

		if ($page_info['enum_tipo'] == "SLIDESHOW") {
							echo "<div class=slideshow_img>";
							echo "<p class=slideshow_titulo>".$conteudo['subtitulo']."</p>";
							echo "<img class=slideshow_img src='".$imagem_src."'>";
							echo "<p class=slideshow_descricao>".$conteudo['descricao']."</p>";
							echo "</div>";

		}

		echo "</div>";

	}
} else {
	echo "<div class=msg_erro>ERRO 404 - Página não encontrada</div>";
}
?>
