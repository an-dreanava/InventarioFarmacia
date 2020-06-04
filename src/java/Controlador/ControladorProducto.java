/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import dao.ProductoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Producto;

/**
 *
 * @author drean
 */
public class ControladorProducto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ProductoDAO dao = new ProductoDAO();
        String usuario_id = "", tipo_producto = "", nombre_producto = "", opcion = "", id_laboratorio = "",id_producto="";

        id_producto=request.getParameter("id_producto");
        usuario_id = request.getParameter("usuario_id");
        nombre_producto = request.getParameter("nombre_producto");
        tipo_producto = request.getParameter("tipo_producto");
        id_laboratorio = request.getParameter("id_laboratorio");
        opcion = request.getParameter("opcion");

        if (opcion.equals("Agregar")) {
            if (dao.AgregarProducto(nombre_producto, usuario_id, tipo_producto, id_laboratorio)==true) {
                response.sendRedirect("MensajeOk.jsp?mensaje=Producto agregado correctamente&retorno=MenuProducto.jsp");
            } else {
                response.sendRedirect("MensajeError.jsp?mensaje=Producto NO agregado correctamente&retorno=MenuProducto.jsp");
            }
        }
        
        if (opcion.equals("Buscar")) {
            
            if (dao.BuscarProducto(id_producto)!=null) {
                response.sendRedirect("ResultadoProducto.jsp?id_producto="+dao.BuscarProducto(id_producto).getId_producto());
            } else {
                response.sendRedirect("MensajeError.jsp?mensaje=Producto NO encontrado&retorno=MenuProducto.jsp");
            }
        }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorProducto</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorProducto at " + request.getContextPath() + "</h1>");
            /*out.println("<h1>" + usuario_id + "</h1>");
            out.println("<h1>" + nombre + "</h1>");
            out.println("<h1>" + id_laboratorio + "</h1>");
            out.println("<h1>" + tipo_producto + "</h1>");
            out.println("<h1>" + opcion + "</h1>");*/
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
