/*

=============================================================================
Codigo simplificado para gerar um FULLSCREEN da imagem desejada
=============================================================================
Rotina .js (fadein/fadeout) disponivel na WEB  -> "clovisdasilvaneto"
Ajustes, generalização, diagramação e css -> Carlos Netiar em 2016/maio/26
=============================================================================

INSTALAÇÃO:

1. Incluir no arquivo "html/php" a carga do .CSS (inicio) e .JS(final)

2. INCLUIR ESTE CODIGO NO INICIO DO HTML:

	<div class=fullscreen id=fullscreen>
		<input type="image" src="ico_close.png" id="fadeOut" width=16 height=16 class="bt_close" onclick="fadeOut(fullscreen,1)"><br>
		<div class=main_img>
			<img src="fundo.png" class=imgview id=imgview><br>
		</div>
	</div>

3. Acrescentar em cada imagem a ser ampliada a classe "zoom" e 
   a chamada a função alterando o nome da imagem em SRC e no parametro de FADEIN

	<img src="foto2.png" width=200 height=120 onclick="fadeIn(fullscreen,1,'foto2.png')" class=zoom>

*/
