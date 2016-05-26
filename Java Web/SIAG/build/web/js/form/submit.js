$(function (){
    $('.formHorario').submit(function (){
        $.ajax({
            url: "procurar",
            type: 'POST',
            contentType: "application/json; charset=utf-8", //define o myme type da requisição
            dataType: "json", //define o tipo de dado retornado pela requisição
            success: function (data, textStatus, jqXHR) {
                $('.recebeDados').html(data);
            }
        });
        return false;
    });
});
