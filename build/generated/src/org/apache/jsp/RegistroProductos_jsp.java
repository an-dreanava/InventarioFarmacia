package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import modelo.Producto;
import dao.ProductoDAO;
import dao.SucursalDAO;
import modelo.Sucursal;

public final class RegistroProductos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");

            ProductoDAO dao = new ProductoDAO();

            ArrayList<Producto> lista_productos = new ArrayList<>();
            lista_productos = null;
            lista_productos = dao.ObtenerDatosProducto();

        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <h1>Registro de Productos</h1>\r\n");
      out.write("\r\n");
      out.write("        <form  action=\"ControladorProducto\" method=\"POST\">\r\n");
      out.write("\r\n");
      out.write("            <form class=\"col s12\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <table border=\"1\">  \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>ID\r\n");
      out.write("                        <th>Nombre\r\n");
      out.write("                        <th>Tipo de Producto\r\n");
      out.write("                        <th>Laboratorio\r\n");
      out.write("                        <th>Fecha de Creación\r\n");
      out.write("                        <th>Creado Por</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
                        for (Producto producto : lista_productos) {
                            out.println("<tr>");
                            out.println("<td>" + producto.getId_producto() + "</td>");
                            out.println("<td>" + producto.getNombre_producto() + "</td>");
                            out.println("<td>" + producto.getTipo_producto() + "</td>");
                            out.println("<td>" + producto.getId_laboratorio() + "</td>");
                            out.println("<td>" + producto.getFecha() + "</td>");
                            out.println("<td>" + producto.getUsuario_id() + "</td>");
                            out.println("</tr>");
                        }

                    
      out.write("\r\n");
      out.write("                </table> \r\n");
      out.write("\r\n");
      out.write("                <a href=\"javascript:history.back(-1);\" class=\"btn-floating btn-large waves-effect waves-light red\"><i class=\"material-icons\">arrow_back</i></a>\r\n");
      out.write("            </form>\r\n");
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
