package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MenuProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <!--Import Google Icon Font-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <!--Import materialize.css-->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen\"/>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"nav-wrapper\">\n");
      out.write("                <a href=\"#!\" class=\"brand-logo\">Menu de Productos</a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"divider\"></div>\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <h4>Productos</h4>\n");
      out.write("            <p>\n");
      out.write("                <a href=\"AgregarProducto.jsp\" class=\"waves-effect waves-light btn\">Agregar</a>\n");
      out.write("                <a href=\"ListarProducto.jsp\" class=\"waves-effect waves-light btn\">Listar</a>   \n");
      out.write("                <a href=\"BuscarProducto.jsp\" class=\"waves-effect waves-light btn\">Buscar</a>\n");
      out.write("                <a href=\"ModificarProducto.jsp\" class=\"waves-effect waves-light btn\">Modificar</a>  \n");
      out.write("                <a href=\"EliminarProducto.jsp\" class=\"waves-effect waves-light btn\">Eliminar</a>  \n");
      out.write("                <a href=\"ModificarStock.jsp\" class=\"waves-effect waves-light btn\">Modificar Stock</a>    \n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"divider\"></div>\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <h4>Sucursal</h4>\n");
      out.write("            <p>\n");
      out.write("                <a href=\"AgregarSucursal.jsp\" class=\"waves-effect waves-light btn\">Agregar</a>\n");
      out.write("                <a href=\"BuscarSucursal.jsp\" class=\"waves-effect waves-light btn\">Buscar</a>\n");
      out.write("                <a href=\"EliminarSucursal.jsp\" class=\"waves-effect waves-light btn\">Eliminar</a>\n");
      out.write("                <a href=\"RegistroSucursal.jsp\" class=\"waves-effect waves-light btn\">Registro</a> \n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"divider\"></div>\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <h4>Laboratorio</h4>\n");
      out.write("            <p>\n");
      out.write("                <a href=\"AgregarLaboratorio.jsp\" class=\"waves-effect waves-light btn\">Agregar</a>  \n");
      out.write("                <a href=\"EliminarLaboratorio.jsp\" class=\"waves-effect waves-light btn\">Eliminar</a> \n");
      out.write("                <a href=\"RegistroLaboratorio.jsp\" class=\"waves-effect waves-light btn\">Registro</a> \n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('select').formSelect();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
