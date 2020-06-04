<%-- 
    Document   : MensajeOk
    Created on : 16-04-2020, 11:01:28
    Author     : admin
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
    <body>

        <%
            String mensaje = "";
            String retorno = "";

            mensaje = request.getParameter("mensaje");
            retorno = request.getParameter("retorno");

        %>

    <center><h1>Bien!</h1>
        <br><br><br>
        <h3><%=mensaje%></h3>
        <br><br><br>
    </center>

    <br><br>
    <br><br>

    <a href="<%=retorno%>" class="btn-floating btn-large waves-effect waves-light red"><i class="material-icons">arrow_back</i></a>

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
