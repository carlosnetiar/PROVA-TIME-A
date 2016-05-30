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

function fadeIn(element,time,idobjeto){
	var objeto = document.getElementById('imgview');
	objeto.src = idobjeto;
	processa(element,time,0,100);
}

function fadeOut(element,time){
        	processa(element,time,100,0);
}

function processa(element,time,initial,end){
	if(initial == 0){
		increment = 2;
		element.style.display = "block";
	        element.style.opacity = 0;
	        element.style.filter = "alpha(opacity=0)";		
		
	}else {
		increment = -2;
	}

	opc = initial;

	intervalo = setInterval(function(){
		if((opc == end)){
		      if(end == 0){
					element.style.display = "none";
		      }
		      clearInterval(intervalo);
		}else {
		      opc += increment;
		      element.style.opacity = opc/100;
		      element.style.filter = "alpha(opacity="+opc+")";
		}
	},time * 10);
}