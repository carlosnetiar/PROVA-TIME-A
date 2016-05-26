<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@attribute name="SUBDIR" fragment="true" %>
<%@attribute name="MENU" fragment="true" %>
<%@attribute name="titulo" fragment="true" %>
<%@attribute name="css" fragment="true" %>
<%@attribute name="jsfiles" fragment="true" %>





<!DOCTYPE html>
<!-- 
Template Name: Metronic - Responsive Admin Dashboard Template build with Twitter Bootstrap 3.3.6
Version: 4.5.4
Author: KeenThemes
Website: http://www.keenthemes.com/
Contact: support@keenthemes.com
Follow: www.twitter.com/keenthemes
Like: www.facebook.com/keenthemes
Purchase: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
License: You must have a valid license purchased only from themeforest(the above link) in order to legally use the theme for your project.
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
    <!--<![endif]-->
    <!-- BEGIN HEAD -->
    <head>
        <meta charset="utf-8" />
        <title>SIAG Tecnologia</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta content="width=device-width, initial-scale=1" name="viewport" />
        <meta content="" name="description" />
        <meta content="" name="author" />
        <!-- BEGIN GLOBAL MANDATORY STYLES -->
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" href="${SUBDIR}/assets/validation_js/qunit-1.11.0.css" type="text/css" media="all">
        <!-- END GLOBAL MANDATORY STYLES -->                       
        <!-- BEGIN THEME GLOBAL STYLES -->
        <link href="${SUBDIR}/assets/global/css/components-rounded.min.css" rel="stylesheet" id="style_components" type="text/css" />
        <link href="${SUBDIR}/assets/global/css/plugins.min.css" rel="stylesheet" type="text/css" />
        <!-- END THEME GLOBAL STYLES -->
        <jsp:invoke fragment="css"/>
        <!-- BEGIN THEME LAYOUT STYLES -->
        <link href="${SUBDIR}/assets/layouts/layout4/css/layout.min.css" rel="stylesheet" type="text/css" />
        <link href="${SUBDIR}/assets/layouts/layout4/css/themes/light.min.css" rel="stylesheet" type="text/css" id="style_color" />
        <link href="${SUBDIR}/assets/layouts/layout4/css/custom.min.css" rel="stylesheet" type="text/css" />
        <!-- END THEME LAYOUT STYLES -->
        <script type="text/javascript">GLOBAL_SUBDIR = "${SUBDIR}";</script>
        <link rel="shortcut icon" href="${SUBDIR}/images/favicon.ico" />
    </head>
    <!-- END HEAD -->

    <body class="page-container-bg-solid page-header-fixed page-sidebar-closed-hide-logo page-boxed">
        <!-- BEGIN HEADER -->
        <div class="page-header navbar navbar-fixed-top">
            <!-- BEGIN HEADER INNER -->
            <div class="page-header-inner container">
                <!-- BEGIN LOGO -->
                <div class="page-logo">
                    <a href="${SUBDIR}">
                        <img src="${SUBDIR}/images/siag01.png" alt="logo" class="logo-default" style="height: 60px; padding-top: 5px; margin-top: 5px" /> </a>
                    <div class="menu-toggler sidebar-toggler">
                        <!-- DOC: Remove the above "hide" to enable the sidebar toggler button on header -->
                    </div>
                </div>
                <!-- END LOGO -->
                <!-- BEGIN RESPONSIVE MENU TOGGLER -->
                <a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse"> </a>
                <!-- END RESPONSIVE MENU TOGGLER -->
               
                <!-- BEGIN PAGE TOP -->
                <div class="page-top">
                    <!-- BEGIN HEADER SEARCH BOX -->
                    <!-- DOC: Apply "search-form-expanded" right after the "search-form" class to have half expanded search box -->
                    <!--
                    <form class="search-form" action="page_general_search_2.html" method="GET">
                        <div class="input-group">
                            <input type="text" class="form-control input-sm" placeholder="Search..." name="query">
                            <span class="input-group-btn">
                                <a href="javascript:;" class="btn submit">
                                    <i class="icon-magnifier"></i>
                                </a>
                            </span>
                        </div>
                    </form>
                    -->
                    <!-- END HEADER SEARCH BOX -->

                  
                    <!-- END TOP NAVIGATION MENU -->
                </div>
                <!-- END PAGE TOP -->
            </div>
            <!-- END HEADER INNER -->
        </div>
        <!-- END HEADER -->

        <!-- BEGIN HEADER & CONTENT DIVIDER -->
        <div class="clearfix"> </div>
        <div class="clearfix"> &nbsp;</div>
        <!-- END HEADER & CONTENT DIVIDER -->
        <div class="container">
            <!-- BEGIN CONTAINER -->
            <div class="page-container">
                <!-- BEGIN SIDEBAR -->
                <div class="page-sidebar-wrapper">
                    <!-- BEGIN SIDEBAR -->
                    <!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
                    <!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
                    <div class="page-sidebar navbar-collapse collapse">
                        <jsp:include page="/menu/menu_${MENU}.jsp" />
                    </div>
                    <!-- END SIDEBAR -->
                </div>
                <!-- END SIDEBAR -->
                <!-- BEGIN CONTENT -->
                <div class="page-content-wrapper">
                    <!-- BEGIN CONTENT BODY -->
                    <div class="page-content">
                        <!-- BEGIN PAGE HEAD-->
                        <div class="page-head">
                            <!-- BEGIN PAGE TITLE -->
                            <div class="page-title">
                                <h1><jsp:invoke fragment="titulo"/></h1>
                            </div>
                            <!-- END PAGE TITLE -->

                        </div>
                        <!-- END PAGE HEAD-->

                        <!-- BEGIN PAGE BASE CONTENT -->
                        <jsp:doBody/>
                        <!-- END PAGE BASE CONTENT -->
                    </div>
                    <!-- END CONTENT BODY -->
                </div>
                <!-- END CONTENT -->
            
            </div>
            <!-- END CONTAINER -->
            <!-- BEGIN FOOTER -->
            <div class="page-footer">
                <div class="page-footer-inner"> 2016 &copy; SIAG Tecnologia</div>
                <div class="scroll-to-top">
                    <i class="icon-arrow-up"></i>
                </div>
            </div>
            <!-- END FOOTER -->
        </div>
        <!--[if lt IE 9]>
<script src="${SUBDIR}/assets/global/plugins/respond.min.js"></script>
<script src="${SUBDIR}/assets/global/plugins/excanvas.min.js"></script> 
<![endif]-->
        <!-- BEGIN CORE PLUGINS -->
        <script src="${SUBDIR}/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>      
       <!-- END CORE PLUGINS -->
        <!-- BEGIN THEME GLOBAL SCRIPTS -->
        <script src="${SUBDIR}/assets/global/scripts/app.min.js" type="text/javascript"></script>
        <!-- END THEME GLOBAL SCRIPTS -->                 
        <!-- BEGIN THEME LAYOUT SCRIPTS -->
        <script src="${SUBDIR}/assets/layouts/layout4/scripts/layout.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/layouts/layout4/scripts/demo.min.js" type="text/javascript"></script>
        <script src="${SUBDIR}/assets/layouts/global/scripts/quick-sidebar.min.js" type="text/javascript"></script>
        <!-- END THEME LAYOUT SCRIPTS -->
        <jsp:invoke fragment="jsfiles"/>
    </body>

</html>
