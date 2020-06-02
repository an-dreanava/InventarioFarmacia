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
        <h1>Eliminar Laboratorio</h1>

        <p class="caption">Ingresa el ID del Laboratorio</p>

        <form  action="ControladorLaboratorio" method="POST">

            <form class="col s12">

                <div class="row"> 
                    <div class="input-field col s4">
                        <input id="id_laboratorio" name="id_laboratorio" type="text" class="validate">
                        <label for="id_laboratorio">ID Laboratorio</label>
                    </div>
                </div>

                <button class="btn waves-effect waves-light" type="submit" name="opcion" value="Eliminar">Eliminar</button>
                <button class="btn waves-effect waves-light" type="reset" name="opcion" value="Cancelar">Cancelar</button>
                <a href="MenuProducto.jsp" class="btn-floating btn-large waves-effect waves-light red"><i class="material-icons">arrow_back</i></a>
            </form>
</html>
