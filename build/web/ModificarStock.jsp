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
        <h1>Modificar Stock</h1>

        <p class="caption">Ingresa los datos requeridos en los campos</p>

        <form  action="ControladorProducto" method="POST">

            <form class="col s12">

                <div class="row"> 
                    <div class="input-field col s4">
                        <input id="id_producto" name="id_producto" type="text" class="validate">
                        <label for="id_producto">ID Producto</label>
                    </div>
                </div>
                
                <div class="row">
                    <div class="input-field col s4">
                        <input id="descripcion" name="descripcion" type="text" class="validate">
                        <label for="descripcion">Detalle Modificacion</label>
                    </div>
                </div>

                <div class="row col s4">
                    <div class="input-field col s2">
                        <input id="StockI" name="StockI" type="number" value=0 class="validate">
                        <label for="StockI">Stock Anterior</label>
                    </div>
                    
                     <div class="input-field col s2">
                        <input id="StockM" name="StockM" type="number" value=0 class="validate">
                        <label for="StockM">Stock Posterior</label>
                    </div>
                </div>

                <div class="row">
                    <div class="input-field col s4">
                        <input id="numero_local" name="numero_local" type="text" class="validate">
                        <label for="numero_local">Numero Local</label>
                    </div>
                </div>
                

                <button class="btn waves-effect waves-light" type="submit" name="opcion" value="ModificarStock">Modificar</button>
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
