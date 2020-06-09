<%-- 
    Document   : MenuProducto
    Created on : 19-05-2020, 12:48:20
    Author     : drean
--%>

<%@page import="modelo.Usuario"%>
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

            Usuario user = null;
            String estadoSesion = "off";

            HttpSession sesion = request.getSession(true);  //área en la RAM

            user = (Usuario) sesion.getAttribute("usuario");
            estadoSesion = (String) sesion.getAttribute("estadoSesion");

            if (estadoSesion == null) {
                response.sendRedirect("MensajeError.jsp?mensaje=Error, usuario no autorizado&retorno=index.jsp");
            } else {
                //usuario válido
                // tiene nivel de acceso?
                if (user.getTipo_usuario().equals("FARMACEUTICO")) {
                    response.sendRedirect("CerrarSesion.jsp"); //cerrar sesion 
                }

            }
        %>

          <nav>
            <div class="nav-wrapper teal lighten-2">
                <a href="#!" class="brand-logo">Bienvenido, <%=nombre_usuario%></a>
                <ul class="right hide-on-med-and-down">
                    <li><a href="CerrarSesion.jsp?mensaje=¡Vuelva pronto!">Cerrar Sesion</a></li>
                </ul>
            </div>
        </nav>

        <div class="divider"></div>
        <div class="section">
            <h4>Productos</h4>
            <p>
            <form action="ControladorProducto" method="POST">
                <button class="btn waves-effect waves-light" type="submit" name="opcion" value="Registro">Registro</button>
                <a href="BuscarProducto.jsp" class="waves-effect waves-light btn">Buscar</a>
                <a href="ModificarStock.jsp" class="waves-effect waves-light btn">Modificar Stock</a>
                <button class="btn waves-effect waves-light" type="submit" name="opcion" value="RegistroStock">Registro Stock</button>
            </form>
        </p>
    </div>
    <div class="divider"></div>
    <div class="section">
        <h4>Sucursal</h4>
        <p>
            <a href="BuscarSucursal.jsp" class="waves-effect waves-light btn">Buscar</a>
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
