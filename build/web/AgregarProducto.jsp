<%-- 
    Document   : CRUDProducto
    Created on : 19-05-2020, 11:05:51
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
        <h1>Agregar Producto</h1>
        
        <p class="caption">Ingresa los datos del producto</p>

        <form  action="ControladorProducto" method="POST">

            <form class="col s12">

                <div class="row"> 
                    <div class="input-field col s4">
                        <input id="nombre_producto" name="nombre_producto" type="text" class="validate">
                        <label for="nombre_producto">Nombre</label>
                    </div>
                </div>
                
                <div class="row col s4">
                        <label>Tipo de Producto</label>
                        <select name="tipo_producto" class="browser-default">
                            <option value=" " disabled selected>Selecciona un tipo de usuario</option>
                            <option value="TIPO_1">Medicamento</option>
                            <option value="TIPO_2">Cosmetico</option>
                            <option value="TIPO_3">Alimento</option>
                        </select>
                    </div>

                <div class="row">
                    <div class="input-field col s4">
                        <input id="id_laboratorio" name="id_laboratorio" type="text" class="validate">
                        <label for="id_laboratorio">ID Laboratorio</label>
                    </div>
                </div>

                <div class="row">
                    <div class="input-field col s4">
                        <input id="usuario_id" name="usuario_id" type="text" class="validate">
                        <label for="usuario_id">Usuario ID</label>
                    </div>
                </div>

                <button class="btn waves-effect waves-light" type="submit" name="opcion" value="Agregar">Agregar</button>
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
