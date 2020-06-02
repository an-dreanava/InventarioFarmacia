<%-- 
    Document   : Login
    Created on : 24-05-2020, 17:12:41
    Author     : drean
--%>

<%@page import="dao.UsuarioDAO"%>
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

        <form name="login" action="ControladorLogin" method="POST">

            <div class="row">
                <form class="col s12">
                    <div class="row">
                        <div class="input-field col s6">
                            <input id="usuario_id" type="text" class="validate" name="usuario_id">
                            <label for="usuario_id">Usuario</label>
                        </div>
                    </div>

                    <button class="btn waves-effect waves-light" type="submit" name="opcion" value="Enviar">Enviar</button>
                </form>


                <script type="text/javascript" src="js/materialize.min.js"></script>
            </body>
    </html>
