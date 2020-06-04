<%-- 
    Document   : CerrarSesion
    Created on : 13-05-2020, 23:00:49
    Author     : drean
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="yellow">

        <%
            String mensaje = "";

            HttpSession sesion = request.getSession(true);
            sesion.setAttribute("usuario", null);
            sesion.setAttribute("estadoSesion", "off");
            sesion.invalidate();

            mensaje = request.getParameter("mensaje");


        %>

    <center><h1>Fin de la Sesión</h1>
        <br><br><br>
        <br><br><br>

        <h2><%=mensaje%></h2>

        <br><br>
        <br><br>
    </center>
    <a href="Login.jsp" class="btn-floating btn-large waves-effect waves-light black"><i class="material-icons">arrow_back</i></a>

    <script type="text/javascript" src="js/materialize.min.js"></script>


    <script>
        $(document).ready(function () {
            $('select').formSelect();
            // $('.datepicker').datepicker();
            // $('.timepicker').timepicker();
        });
    </script>
</body>
</html>
