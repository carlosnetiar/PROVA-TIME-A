<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template>
    <jsp:attribute name="titulo">
        
    </jsp:attribute>
    <jsp:attribute name="css">
        <link href="${SUBDIR}/assets/pages/css/error.min.css" rel="stylesheet" type="text/css" />
    </jsp:attribute>
    <jsp:body>
        
      
               <div class="row">
                        <div class="col-md-12 page-404">
                            <div class=" number font-red"> 404 </div>
                            <div class=" details">
                                <h3>Oops! Você está perdido.</h3>
                                <p> Nós não pudemos encontrar a página que você está procurando.
                                    <br/> </p>
                                <p>
                                    <a href="${SUBDIR}/" class="btn red btn-outline"> Retornar a Página Inicial </a>
                                    <br> </p>
                            </div>
                        </div>
                    </div>

    </jsp:body>
</t:template>