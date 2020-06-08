<%-- 
    Document   : ListarProducto
    Created on : 07-06-2020, 20:09:52
    Author     : anair
--%>

<%@page import="modelo.Producto"%>
<%@page import="dao.ProductoDAO"%>
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

        <h1>Listado de Productos</h1>

        <table border="1">  
            <tr>
                <th>ID Producto
                <th>Nombre Producto
                <th>Fecha de Creación
                <th>Tipo de Prodcuto
                <th>ID Laboratorio
                <th>Creado Por</th>
            </tr>

            <%   
                /*
                for (Producto producto : ProductoDAO.obtenerDatosProducto()  ) {
                    
                    out.println("<tr>");
                    out.println("<td>" + producto.getId_producto() + "</td>");
                    out.println("<td>" + producto.getNombre_producto() + "</td>");
                    out.println("<td>" + producto.getFecha() + "</td>");
                    out.println("<td>" + producto.getTipo_producto() + "</td>");
                    out.println("<td>" + producto.getId_laboratorio() + "</td>");
                    out.println("<td>" + producto.getUsuario_id() + "</td>");

                    out.println("</tr>");
                }
                
                */
            %>
        </table> 
        <br><br>
        <a href="javascript:history.back(-1);" class="btn-floating btn-large waves-effect waves-light red"><i class="material-icons">arrow_back</i></a>

        <script type="text/javascript" src="js/materialize.min.js"></script>

    </body>
</html>