<?

// ARQUIVO DE FORMATACAO DO CABEÇALHO DE TODAS AS PAGINAS

	$STATIC_ROOT_FILES = "/php/";
	$SRC_IMG_CONTEUDO = $STATIC_ROOT_FILES."img/conteudo/";
?>


<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="<?php echo $STATIC_ROOT_FILES ?>css/styles-siag.css">
	<link rel="stylesheet" type="text/css" href="<?php echo $STATIC_ROOT_FILES ?>css/fullscreen_v1.css" />
    <title><?php echo $title." - ".$heading;?></title>
</head>
<body>
<div class=fullscreen id=fullscreen style="background-image: url('<?php echo $STATIC_ROOT_FILES ?>img/fundo.png');">
	<input type="image" src="<?php echo $STATIC_ROOT_FILES ?>img/ico_close.png" id="fadeOut" width=80 height=20 class="bt_close" onclick="fadeOut(fullscreen,1)"><br>
	<div class=main_img>
		<img src="<?php echo $STATIC_ROOT_FILES ?>img/fundo.png" class=imgview id=imgview><br>
	</div>
</div>
<script type="text/javascript" src="<?php echo $STATIC_ROOT_FILES ?>js/fullscreen_v1.js"></script>

<p class="title">
<a href="<? echo $STATIC_ROOT_FILES ?>"><img src="<?php echo $STATIC_ROOT_FILES ?>img/siag.png" class=logosiag width=300></a>
</p>

