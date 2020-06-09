<%-- 
    Document   : RegistroStock
    Created on : 08-06-2020, 20:38:19
    Author     : anair
--%>

<%@page import="modelo.Stock"%>
<%@page import="java.util.ArrayList"%>
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
        <%
                ProductoDAO dao = new ProductoDAO();
            
            ArrayList<Stock> lista=new ArrayList<>();
            lista.clear();
            lista=dao.ListarStockProducto();

        %>
        <h1>Registro de Stock</h1>

        <table border="1">  
            <tr>
                <th>Id Stock
                <th>Producto
                <th>Stock Anterior
                <th>Stock Posterior
                <th>Detalle Modificación
                <th>Sucursal
                <th>Usuario
                <th>Fecha</th>
            </tr>

            <%                
                
                for (Stock stock:lista) {
                    out.println("<tr>");
                    out.println("<td>" + stock.getId_stock() + "</td>");
                    out.println("<td>" + stock.getId_producto() + "</td>");
                    out.println("<td>" + stock.getStockI() + "</td>");
                    out.println("<td>" + stock.getStockM() + "</td>");
                    out.println("<td>" + stock.getDescripcion() + "</td>");
                    out.println("<td>" + stock.getNumero_local() + "</td>");
                    out.println("<td>" + stock.getUsuario_id() + "</td>");
                    out.println("<td>" + stock.getFecha_modificacion() + "</td>");
                    out.println("</tr>");
                }
            %>
        </table> 
        <br><br>
        <a href="javascript:history.back(-1);" class="btn-floating btn-large waves-effect waves-light red"><i class="material-icons">arrow_back</i></a>

        <script type="text/javascript" src="js/materialize.min.js"></script>

    </body>
</html>
