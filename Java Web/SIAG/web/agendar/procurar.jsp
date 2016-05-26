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
        <script src="${SUBDIR}/assets/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/bootstrap-timepicker/js/bootstrap-timepicker.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/clockface/js/clockface.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/pages/scripts/components-date-time-pickers.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/js/ajax/selectDependente.js" type="text/javascript"></script>
        <script src="${SUBDIR}/js/form/validar.js" type="text/javascript"></script>
        <!-- END PAGE LEVEL PLUGINS -->

        <!-- END PAGE LEVEL PLUGINS -->     
    </jsp:attribute>
    <jsp:body>
        ${erroMsg}
        <script>
            window.history.pushState("", "", "/SIAG/Horario/procurar");
        </script>
        <div class="portlet light bordered">
            <div class="portlet-title">
                <div class="caption font-red-sunglo">
                    <i class="fa fa-clock-o font-red-sunglo"></i>
                    <span class="caption-subject bold uppercase"> Agendar Horário</span>
                </div>
            </div>
            <div class="portlet-body form">
                <form role="form" id="form" action="${SUBDIR}/Horario/horariosDisponiveis" method="POST">
                      <fieldset>
                        <div class="form-body">
                            <div class="form-group">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>CPF:</label>
                                        <div class="input-group">
                                            <span class="input-group-addon">

                                            </span>
                                            <input type="text" class="form-control" autocomplete="off" name="cpf" maxlength="11" minlength="11" required="required" onkeydown="validar(this, 'num')"></div>
                                    </div>
                                </div>

                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Data:</label>
                                        <div class="input-group">
                                            <span class="input-group-addon">

                                            </span>
                                            <input class="form-control date-picker" size="16" data-date-format="dd/mm/yyyy" required="required" type="text" value="" name="dataAtendimento" data-date-start-date="0+" /></div>
                                    </div>
                                </div>
                                

                            </div>

                            <div class="form-group">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Categoria:</label>
                                        <div class="input-group">
                                            <span class="input-group-addon">

                                            </span>
                                            <select class="form-control" name="categoria" id="catServico">
                                                <option value="999"> - SELECIONE - </option>
                                                <c:forEach items="${cat_serv}" var="cat">
                                                    <option value="${cat.id_categoria}">${cat.nome_categoria}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Serviço:</label>
                                        <div class="input-group">
                                            <span class="input-group-addon">

                                            </span>
                                            <select class="form-control" name="servico" id="servico">
                                                <option value="999"> - SELECIONE - </option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                           <div class="form-group">
                                <label></label>   
                            </div>
                        <div class="form-actions left">
                            <button type="submit" class="btn blue"><i class="fa fa-search"></i> Pesquisar</button>
                        </div>
                    </fieldset>
                </form>
            </div>
        </div>
    </jsp:body>
</t:template>