package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AgregarLaboratorio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <!--Import Google Icon Font-->\n");
      out.write("            <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("            <!--Import materialize.css-->\n");
      out.write("            <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen\"/>\n");
      out.write("            <title>TODO supply a title</title>\n");
      out.write("            <meta charset=\"UTF-8\">\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("        <h1>Agregar Laboratorio</h1>\n");
      out.write("        \n");
      out.write("        <p class=\"caption\">Ingresa el nombre del laboratorio</p>\n");
      out.write("\n");
      out.write("        <form  action=\"ControladorLaboratorio\" method=\"POST\">\n");
      out.write("\n");
      out.write("            <form class=\"col s12\">\n");
      out.write("                \n");
      out.write("                <div class=\"row\"> \n");
      out.write("                    <div class=\"input-field col s4\">\n");
      out.write("                        <input id=\"id_laboratorio\" name=\"id_laboratorio\" type=\"text\" class=\"validate\">\n");
      out.write("                        <label for=\"id_laboratorio\">ID Laboratorio</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\"> \n");
      out.write("                    <div class=\"input-field col s4\">\n");
      out.write("                        <input id=\"nombre\" name=\"nombre_laboratorio\" type=\"text\" class=\"validate\">\n");
      out.write("                        <label for=\"nombre\">Nombre Laboratorio</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"input-field col s4\">\n");
      out.write("                        <input id=\"id_usuario\" name=\"id_usuario\" type=\"text\" class=\"validate\">\n");
      out.write("                        <label for=\"id_usuario\">ID Usuario</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <button class=\"btn waves-effect waves-light\" type=\"submit\" name=\"opcion\" value=\"Agregar\">Agregar</button>\n");
      out.write("                <button class=\"btn waves-effect waves-light\" type=\"reset\" name=\"opcion\" value=\"Cancelar\">Cancelar</button>\n");
      out.write("                <a href=\"MenuProducto.jsp\" class=\"btn-floating btn-large waves-effect waves-light red\"><i class=\"material-icons\">arrow_back</i></a>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("            <script>\n");
      out.write("                $(document).ready(function () {\n");
      out.write("                    $('select').formSelect();\n");
      out.write("                });\n");
      out.write("            </script>\n");
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
