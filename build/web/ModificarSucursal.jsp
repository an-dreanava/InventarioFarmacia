<%-- 
    Document   : AgregarSucursal
    Created on : 19-05-2020, 19:44:35
    Author     : drean
--%>

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
        <h1>Modificar Sucursal</h1>
        
         <p class="caption">Ingresa el numero de local con los datos de la sucursal respectivamente modificados</p>

        
                <form  action="ControladorSucursal" method="POST">

            <form class="col s12">

                <div class="row"> 
                    <div class="input-field col s4">
                        <input id="numero_local" name="numero_local" type="text" class="validate">
                        <label for="numero_local">Numero de Local</label>
                    </div>
                </div>

                <div class="row">
                    <div class="input-field col s4">
                        <input id="direccion" name="direccion" type="text" class="validate">
                        <label for="direccion">Direccion</label>
                    </div>
                </div>

                <div class="row">
                    <div class="input-field col s4">
                        <input id="usuario" name="id_usuario" type="text" class="validate">
                        <label for="usuario">ID Usuario</label>
                    </div>
                </div>

                <button class="btn waves-effect waves-light" type="submit" name="opcion" value="Modificar">Modificar</button>
                <button class="btn waves-effect waves-light" type="reset" name="opcion" value="Cancelar">Cancelar</button>
                <a href="javascript:history.back(-1);" class="btn-floating btn-large waves-effect waves-light red"><i class="material-icons">arrow_back</i></a>
            </form>

            <script type="text/javascript" src="js/materialize.min.js"></script>
            <script>
                $(document).ready(function () {
                    $('select').formSelect();
                });
            </script>
    </body>
</html>
