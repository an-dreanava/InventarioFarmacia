<%-- 
    Document   : MenuProducto
    Created on : 19-05-2020, 12:48:20
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
        <%
            String nombre_usuario = "";
            nombre_usuario = request.getParameter("nombre");
        %>

        <nav>
            <div class="nav-wrapper">
                <a href="#!" class="brand-logo">Bienvenido, <%=nombre_usuario%></a>
            </div>
        </nav>

        <div class="divider"></div>
        <div class="section">
            <h4>Productos</h4>
            <p>
                <a href="AgregarProducto.jsp" class="waves-effect waves-light btn">Agregar</a>
                <a href="ListarProducto.jsp" class="waves-effect waves-light btn">Listar</a>   
                <a href="BuscarProducto.jsp" class="waves-effect waves-light btn">Buscar</a>
                <a href="ModificarProducto.jsp" class="waves-effect waves-light btn">Modificar</a>  
                <a href="EliminarProducto.jsp" class="waves-effect waves-light btn">Eliminar</a>  
                <a href="ModificarStock.jsp" class="waves-effect waves-light btn">Modificar Stock</a>    
            </p>
        </div>
        <div class="divider"></div>
        <div class="section">
            <h4>Sucursal</h4>
            <p>
                <a href="AgregarSucursal.jsp" class="waves-effect waves-light btn">Agregar</a>
                <a href="ModificarSucursal.jsp" class="waves-effect waves-light btn">Modificar</a>
                <a href="BuscarSucursal.jsp" class="waves-effect waves-light btn">Buscar</a>
                <a href="EliminarSucursal.jsp" class="waves-effect waves-light btn">Eliminar</a>
                <a href="RegistroSucursal.jsp" class="waves-effect waves-light btn">Registro</a> 
            </p>
        </div>
        <div class="divider"></div>
        <div class="section">
            <h4>Laboratorio</h4>
            <p>
                <a href="AgregarLaboratorio.jsp" class="waves-effect waves-light btn">Agregar</a>  
                <a href="EliminarLaboratorio.jsp" class="waves-effect waves-light btn">Eliminar</a> 
                <a href="RegistroLaboratorio.jsp" class="waves-effect waves-light btn">Registro</a> 
            </p>
        </div>

        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script>
            $(document).ready(function () {
                $('select').formSelect();
            });
        </script>
    </body>
</html>
