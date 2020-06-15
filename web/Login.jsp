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
        
        <br><br>

        <form name="login" action="ControladorLogin" method="POST">
            <div class="container">
                <form class="col s10">
                    <div class="row">
                        <div class="input-field col s10">
                            <input id="usuario_id" type="text" class="validate" name="usuario_id">
                            <label for="usuario_id">Usuario</label>
                        </div>
                        
                         <div class="input-field col s10">
                            <input id="usuario_clave" type="password" class="validate" name="usuario_clave">
                            <label for="usuario_clave">Clave</label>
                        </div>
                    </div>

                    <button class="btn waves-effect waves-light col s6 offset-s6" type="submit" name="opcion" value="Enviar">Enviar</button>
            </div>
        </form>


        <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
</html>
