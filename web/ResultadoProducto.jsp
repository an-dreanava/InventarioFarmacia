<%-- 
    Document   : BuscarSucursal
    Created on : 19-05-2020, 20:26:15
    Author     : drean
--%>

<%@page import="modelo.Producto"%>
<%@page import="dao.ProductoDAO"%>
<%@page import="dao.SucursalDAO"%>
<%@page import="modelo.Sucursal"%>
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
            ProductoDAO dao = new ProductoDAO();
            String id_producto="";
            id_producto =request.getParameter("id_producto");

            Producto producto = dao.BuscarProducto(id_producto);

        %>

        <h1>Resultado Busqueda de Producto</h1>

        <h4>Producto: <%=producto.getId_producto()%></h4>

        <form  action="ControladorProducto" method="POST">

            <form class="col s12">


                <table border="1">  
                    <tr>
                        <th>Nombre
                        <th>Tipo de Producto
                        <th>Laboratorio
                        <th>Fecha de Creación
                        <th>Creado Por</th>
                    </tr>
                    <%                        
                        out.println("<tr>");
                        out.println("<td>" + producto.getNombre_producto() + "</td>");
                        out.println("<td>" + producto.getTipo_producto() + "</td>");
                        out.println("<td>" + producto.getId_laboratorio() + "</td>");
                        out.println("<td>" + producto.getFecha() + "</td>");
                        out.println("<td>" + producto.getUsuario_id() + "</td>");
                        out.println("</tr>");
                    %>
                </table> 

                <a href="MenuProducto.jsp" class="btn-floating btn-large waves-effect waves-light red"><i class="material-icons">arrow_back</i></a>
            </form>
</html>
