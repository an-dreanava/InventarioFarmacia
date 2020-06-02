<%-- 
    Document   : AgregarSucursal
    Created on : 19-05-2020, 19:44:35
    Author     : drean
--%>

<%@page import="modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen"/>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>
    <body>

        <%Usuario user = null;
            String estadoSesion = "off";
            HttpSession sesion = request.getSession(true);

            user = (Usuario) sesion.getAttribute("usuario");
            estadoSesion = (String) sesion.getAttribute("estadoSesion");
            
        %>

        <h1> Buscar Sucursal</h1>

        <p class="caption">Ingresa el numero de local de la sucursal</p>


        <form  action="ControladorSucursal" method="POST">

            <form class="col s12">

                <div class="row"> 
                    <div class="input-field col s4">
                        <input id="numero_local" name="numero_local" type="text" class="validate">
                        <label for="numero_local">Numero de Local</label>
                    </div>
                </div>


                <button class="btn waves-effect waves-light" type="submit" name="opcion" value="Buscar">Buscar</button>
                <button class="btn waves-effect waves-light" type="reset" name="opcion" value="Cancelar">Cancelar</button>
                <a href="MenuProducto.jsp" class="btn-floating btn-large waves-effect waves-light red"><i class="material-icons">arrow_back</i></a>
            </form>

            <script type="text/javascript" src="js/materialize.min.js"></script>
            <script>
                $(document).ready(function () {
                    $('select').formSelect();
                });
            </script>
    </body>
</html>
