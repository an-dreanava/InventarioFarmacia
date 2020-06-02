<%-- 
    Document   : BuscarSucursal
    Created on : 19-05-2020, 20:26:15
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
        <h1>Eliminar Sucursal</h1>
        
        <p class="caption">Ingresa el numero de local de la sucursal</p>
        
                <form  action="ControladorSucursal" method="POST">

            <form class="col s12">

                <div class="row"> 
                    <div class="input-field col s4">
                        <input id="numero_local" name="numero_local" type="text" class="validate">
                        <label for="numero_local">Numero de Local</label>
                    </div>
                </div>

                <button class="btn waves-effect waves-light" type="submit" name="opcion" value="Eliminar">Eliminar</button>
                <button class="btn waves-effect waves-light" type="reset" name="opcion" value="Cancelar">Cancelar</button>
                <a href="MenuProducto.jsp" class="btn-floating btn-large waves-effect waves-light red"><i class="material-icons">arrow_back</i></a>
            </form>
</html>
