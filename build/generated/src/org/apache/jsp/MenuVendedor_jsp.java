package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Usuario;

public final class MenuVendedor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <!--Import Google Icon Font-->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <!--Import materialize.css-->\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen\"/>\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");

            String nombre_usuario="";
            nombre_usuario=request.getParameter("nombre");

                Usuario user=null;
                String estadoSesion="off";

                HttpSession sesion = request.getSession(true);  //área en la RAM

                user=(Usuario)sesion.getAttribute("usuario");
                estadoSesion=(String) sesion.getAttribute("estadoSesion");   

                if(estadoSesion == null )
                {
                     response.sendRedirect("MensajeError.jsp?mensaje=Error, usuario no autorizado&retorno=index.jsp");
                }       
               else{
                    //usuario válido
                    // tiene nivel de acceso?
                     if(user.getTipo_usuario().equals("FARMACEUTICO") )
                     {                         
                         response.sendRedirect("CerrarSesion.jsp?mensaje=Usuario NO autorizado"); //cerrar sesion 
                     }
                
                }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <nav>\r\n");
      out.write("            <div class=\"nav-wrapper\">\r\n");
      out.write("                <a href=\"#!\" class=\"brand-logo\">Bienvenido, ");
      out.print(nombre_usuario);
      out.write("</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"divider\"></div>\r\n");
      out.write("        <div class=\"section\">\r\n");
      out.write("            <h4>Productos</h4>\r\n");
      out.write("            <p>\r\n");
      out.write("                <a href=\"ListarProducto.jsp\" class=\"waves-effect waves-light btn\">Registro</a>   \r\n");
      out.write("                <a href=\"BuscarProducto.jsp\" class=\"waves-effect waves-light btn\">Buscar</a>\r\n");
      out.write("                <a href=\"ModificarStock.jsp\" class=\"waves-effect waves-light btn\">Modificar Stock</a>    \r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"divider\"></div>\r\n");
      out.write("        <div class=\"section\">\r\n");
      out.write("            <h4>Sucursal</h4>\r\n");
      out.write("            <p>\r\n");
      out.write("                <a href=\"BuscarSucursal.jsp\" class=\"waves-effect waves-light btn\">Buscar</a>\r\n");
      out.write("                <a href=\"RegistroSucursal.jsp\" class=\"waves-effect waves-light btn\">Registro</a> \r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"divider\"></div>\r\n");
      out.write("        <div class=\"section\">\r\n");
      out.write("            <h4>Laboratorio</h4>\r\n");
      out.write("            <p>\r\n");
      out.write("                <a href=\"AgregarLaboratorio.jsp\" class=\"waves-effect waves-light btn\">Agregar</a>  \r\n");
      out.write("                <a href=\"EliminarLaboratorio.jsp\" class=\"waves-effect waves-light btn\">Eliminar</a> \r\n");
      out.write("                <a href=\"RegistroLaboratorio.jsp\" class=\"waves-effect waves-light btn\">Registro</a> \r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                $('select').formSelect();\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
