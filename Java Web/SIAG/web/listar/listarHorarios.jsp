<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template>
    <jsp:attribute name="css">
        <link href="${SUBDIR}/assets/validation_js/ajax.css" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/global/plugins/datatables/datatables.min.css" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.css" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/global/css/ajax.css" rel="stylesheet" type="text/css" />
    </jsp:attribute>

    <jsp:attribute name="jsfiles">
        <!-- BEGIN PAGE LEVEL PLUGINS -->
        <script src="${SUBDIR}/assets/global/plugins/moment.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/bootstrap-daterangepicker/daterangepicker.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/js/tabela/jquery.tmpl.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/js/tabela/horariosAjax.js" type="text/javascript"></script>
        <script src="${SUBDIR}/js/form/validar.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/scripts/datatable.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/datatables/datatables.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js" type="text/javascript"></script>
        <!-- END PAGE LEVEL PLUGINS -->
        <!-- END PAGE LEVEL PLUGINS -->     
    </jsp:attribute>
    <jsp:body>
        ${msgErro}
        <script id="clienteTemplate" type="x-jquery-tmpl">
                        <tr>
                            <td>{{= horario }}</td>
                            <td>{{= nome_aluno }}</td>
                            <td>{{= data}}</td>
                        </tr>
        </script>

        <div class="portlet light bordered">
            <div class="portlet-title">
                <div class="caption font-red-sunglo">
                    <i class="fa fa-clock-o font-red-sunglo"></i>
                    <span class="caption-subject bold uppercase"> Pesquisar Agendamento</span>
                </div>
            </div>
            <div class="recebeDados"> </div>
            <div class="portlet-body form">
                <form role="form" action="${SUBDIR}/Horario/recuperarListaAjax" class="formHorario" method="POST">
                    <fieldset>
                        <div class="form-body">
                            <div class="form-group">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>CPF:</label>
                                        <div class="input-group">
                                            <span class="input-group-addon">

                                            </span>
                                            <input type="text" class="form-control" placeholder="" name="cpf" onkeydown="validar(this,'num')"> </div>
                                    </div>
                                </div>

                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label> </label>
                                        <div class="input-group">
                                            <input type="submit" class="btn green" value="Pesquisar"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>
            <div class="portlet light portlet-fit portlet-datatable bordered" id="containerTable">
                <div class="portlet-title">
                    <div class="caption">
                        <i class=" icon-clock font-green"></i>
                        <span class="caption-subject font-green sbold uppercase">Seus Horários</span>
                    </div>
                </div>
                <div class="portlet-body">
                    <table class="table table-striped table-bordered table-hover table-checkable order-column"  style="text-align: center;" id="sample_2">
                        <thead>
                            <tr>
                                <th>Horário</th>
                                <th>Nome</th>
                                <th>Data</th>
                            </tr>
                        </thead>
                        <tbody id="bodyTable">

                        </tbody>
                    </table>
                </div>
            </div>
            <!-- END EXAMPLE TABLE PORTLET-->
            <div id="respostaServlet"></div>

            <div id="carregando">
                <img src="${SUBDIR}/images/loading.gif"/>
            </div>
        </div>
    </jsp:body>
</t:template>