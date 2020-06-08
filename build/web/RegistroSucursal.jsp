<%-- 
    Document   : ReporteSucursal
    Created on : 29-05-2020, 19:17:22
    Author     : drean
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Sucursal"%>
<%@page import="dao.SucursalDAO"%>
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
        <%
                SucursalDAO dao = new SucursalDAO();
            
            ArrayList<Sucursal> lista=new ArrayList<>();
            lista.clear();
            lista=dao.ListarSucursal();

        %>
        <h1>Registro de Sucursal</h1>

        <table border="1">  
            <tr>
                <th>Numero de Local
                <th>Fecha de Creación
                <th>Dirección
                <th>Creado Por</th>
            </tr>

            <%                
                
                for (Sucursal sucursal:lista) {
                    out.println("<tr>");
                    out.println("<td>" + sucursal.getNumero_local() + "</td>");
                    out.println("<td>" + sucursal.getFecha_creacion() + "</td>");
                    out.println("<td>" + sucursal.getDireccion() + "</td>");
                    out.println("<td>" + sucursal.getUsuario_id() + "</td>");
                    out.println("</tr>");
                }
            %>
        </table> 
        <br><br>
        <a href="javascript:history.back(-1);" class="btn-floating btn-large waves-effect waves-light red"><i class="material-icons">arrow_back</i></a>

        <script type="text/javascript" src="js/materialize.min.js"></script>

    </body>
</html>
