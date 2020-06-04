<%-- 
    Document   : BuscarSucursal
    Created on : 19-05-2020, 20:26:15
    Author     : drean
--%>

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
            SucursalDAO dao = new SucursalDAO();
            int numero_local = 0;
            numero_local = Integer.parseInt(request.getParameter("numero_local"));

            Sucursal sucursal = dao.BuscarSucursal(numero_local);

        %>

        <h1>Resultado Busqueda de Sucursal</h1>

        <h4>Sucursal <%=sucursal.getNumero_local()%></h4>>

        <form  action="ControladorSucursal" method="POST">

            <form class="col s12">


                <table border="1">  
                    <tr>
                        <th>Numero de Local
                        <th>Fecha de Creación
                        <th>Dirección
                        <th>Creado Por</th>
                    </tr>
                    <%                        
                        out.println("<tr>");
                        out.println("<td>" + sucursal.getNumero_local() + "</td>");
                        out.println("<td>" + sucursal.getFecha_creacion() + "</td>");
                        out.println("<td>" + sucursal.getDireccion() + "</td>");
                        out.println("<td>" + sucursal.getUsuario_id() + "</td>");
                        out.println("</tr>");
                    %>
                </table> 

                <a href="MenuProducto.jsp" class="btn-floating btn-large waves-effect waves-light red"><i class="material-icons">arrow_back</i></a>
            </form>
</html>
