var frm = $(".formHorario");
$("#containerTable").hide();
frm.submit(function () {
    $.ajax({
        type: frm.attr("method"),
        url: frm.attr("action"),
        data: frm.serialize(),
        success: function (data) {
            var result = data;
            if (result.toString().length == 0) {
                alert("Nenhum resultado");
                $("#containerTable").hide();
            } else {
                $('#bodyTable').empty();
                $("#containerTable").show();
                $('#clienteTemplate').tmpl(data)
                        .appendTo('#bodyTable'); //adiciona os dados ao template e anexa ao container
                $('#carregando').hide();
                //console.log(listaClientes);               
            }
        }

    });
    return false;
});
