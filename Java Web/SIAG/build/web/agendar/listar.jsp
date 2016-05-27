<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template>
    <jsp:attribute name="css">
        <link href="${SUBDIR}/assets/global/plugins/datatables/datatables.min.css" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.css" rel="stylesheet" type="text/css" />
    </jsp:attribute>

    <jsp:attribute name="jsfiles">
        <!-- BEGIN PAGE LEVEL PLUGINS -->
        <script src="${SUBDIR}/assets/global/scripts/datatable.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/datatables/datatables.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js" type="text/javascript"></script>
        <!-- END PAGE LEVEL PLUGINS -->

    </jsp:attribute>
    <jsp:body>
        
        <div class="portlet light bordered">
            <div class="portlet-title">
                <div class="caption font-red-sunglo">
                    <i class="fa fa-clock-o font-red-sunglo"></i>
                    <span class="caption-subject bold uppercase"> Agendar Horário</span>
                </div>
            </div>
            <div class="portlet-body form">
                <h4><b>Nome:</b> ${usuario.nome_user}</h4>
                <!-- BEGIN EXAMPLE TABLE PORTLET-->
                <div class="portlet-body">
                    <table class="table table-striped table-bordered table-hover table-checkable order-column" id="sample_2">
                        <thead>
                            <tr>
                                <th> Horário Disponível </th>
                                <th class="text-center"> Dia Corrente </th>
                                <th class="text-center"> Ação </th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${datasDisponiveis}" var="datas">
                        
                            <tr class="odd gradeX">
                                <td> ${datas.hora} </td>
                                <td class="text-center">
                                    ${datas.dia}
                                </td>
                                <td class="text-center col-sm-4">
                                    <a href="${SUBDIR}/Horario/confirmar/${datas.id_data_hora}/${usuario.id_user}/${categoria}/${servico}"><input type="button" class="btn green" value="Confirmar Agendamento"/></a>
                                </td>
                            </tr>
                       
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <!-- END EXAMPLE TABLE PORTLET-->
            </div>
        </div>
    </jsp:body>
</t:template>