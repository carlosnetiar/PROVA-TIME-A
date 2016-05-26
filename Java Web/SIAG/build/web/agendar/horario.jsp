<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template>
    <jsp:attribute name="css">
        <link href="${SUBDIR}/assets/global/plugins/bootstrap-daterangepicker/daterangepicker.min.css" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker3.min.css" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/global/plugins/bootstrap-timepicker/css/bootstrap-timepicker.min.css" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/global/plugins/bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/global/plugins/clockface/css/clockface.css" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/validation_js/ajax.css" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/global/plugins/datatables/datatables.min.css" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.css" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/global/css/tabs.css" rel="stylesheet" type="text/css"/>


    </jsp:attribute>

    <jsp:attribute name="jsfiles">
        <!-- BEGIN PAGE LEVEL PLUGINS -->
        <script src="${SUBDIR}/assets/global/plugins/moment.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/bootstrap-daterangepicker/daterangepicker.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/js/tabelas/aulas.js" type="text/javascript"></script>
        <script src="${SUBDIR}/js/tabelas/tmpl.js" type="text/javascript"></script>
        <script src="${SUBDIR}/js/form/submit.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/scripts/datatable.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/datatables/datatables.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js" type="text/javascript"></script>
        <!-- END PAGE LEVEL PLUGINS -->
        <!-- END PAGE LEVEL PLUGINS -->     
    </jsp:attribute>
    <jsp:body>
        <script id="clienteTemplate" type="x-jquery-tmpl">
                        <tr>
                            <td>{{= dia }}</td>
                            <td>{{= hora }}</td>
                            <td>{{= btn}}</td>
                        </tr>
        </script>

        <div class="portlet light bordered">
            <div class="portlet-title">
                <div class="caption font-red-sunglo">
                    <i class="fa fa-clock-o font-red-sunglo"></i>
                    <span class="caption-subject bold uppercase"> Agendar Horário</span>
                </div>
            </div>
            <div class="recebeDados"> </div>
            <div class="portlet-body form">
                <form role="form" action="" class="formHorario" method="POST">
                    <fieldset>
                        <div class="form-body">
                            <div class="form-group">
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label>CPF:</label>
                                        <div class="input-group">
                                            <span class="input-group-addon">

                                            </span>
                                            <input type="text" class="form-control" placeholder="" name="cpf"> </div>
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="form-group">
                                        <label>Data:</label>
                                        <div class="input-group">
                                            <span class="input-group-addon">

                                            </span>
                                            <input class="form-control date-picker" size="16" data-date-format="dd/mm/yyyy" type="text" value="" name="data" data-date-start-date="0+" /></div>
                                    </div>
                                </div>

                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>:</label>
                                        <div class="input-group">
                                            <input type="submit"  id="listaClientes" class="btn green"value="Button">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                </form>
            </div>

            <div class="portlet-body">
                <table class="table table-striped table-bordered table-hover table-checkable order-column" id="sample_2">
                    <thead>
                        <tr>
                            <th>Horário</th>
                            <th>Dia</th>
                            <th>Ação</th>
                        </tr>

                    </thead>
                    <tbody id="bodyTable">
                        
                    </tbody>
                </table>
                <div id="respostaServlet"> </div>

                <div id="carregando">

                </div>
            </div>
        </div>
    </jsp:body>
</t:template>