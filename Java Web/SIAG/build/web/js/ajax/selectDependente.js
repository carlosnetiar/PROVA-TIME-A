$(document).ready(function () {
    $('select[name=categoria]').on('change', function () {
        $.ajax({
            type: 'POST',
            url: 'listarServico',
            data: 'categoriaServico=' + $('select[name=categoria]').val(),
            success: function (data) {
                $('select[name=servico] option').remove();
                var pegaDados = data.split(":");
                for (var i = 0; i < pegaDados.length - 1; i++) {
                    var nomeServico = pegaDados[i].split("-")[0];
                    var codigoServico = pegaDados[i].split("-")[1];
                    $('select[name=servico]').append('<option value="' + codigoServico + '">' + nomeServico + '</option>');
                }
            }
        });
    });
});