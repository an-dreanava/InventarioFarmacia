<%-- 
    Document   : RegistroLaboratorio
    Created on : 29-05-2020, 19:46:29
    Author     : drean
--%>

<%@page import="modelo.Laboratorio"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Sucursal"%>
<%@page import="dao.LaboratorioDAO"%>
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
            LaboratorioDAO dao = new LaboratorioDAO();

            ArrayList<Laboratorio> lista = new ArrayList<>();
            lista.clear();
            lista = dao.ObtenerDatos();

        %>
        <h1>Registro de Laboratorios</h1>

        <table border="1">  
            <tr>
                <th>ID Laboratorio
                <th>Nombre Laboratorio
                <th>Fecha de Creación
                <th>Creado Por</th>
            </tr>

            <%                
                
                    for (Laboratorio laboratorio : lista) {
                    out.println("<tr>");
                    out.println("<td>" + laboratorio.getId_laboratorio() + "</td>");
                    out.println("<td>" + laboratorio.getNombre_laboratorio() + "</td>");
                    out.println("<td>" + laboratorio.getF_creacion_lab() + "</td>");
                    out.println("<td>" + laboratorio.getUsuario_id() + "</td>");
                    out.println("</tr>");
                }
            %>
        </table> 
        <br><br>
        <a href="javascript:history.back(-1);" class="btn-floating btn-large waves-effect waves-light red"><i class="material-icons">arrow_back</i></a>

        <script type="text/javascript" src="js/materialize.min.js"></script>

    </body>
</html>
