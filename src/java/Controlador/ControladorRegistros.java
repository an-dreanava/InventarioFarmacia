/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import dao.LaboratorioDAO;
import dao.ProductoDAO;
import dao.SucursalDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author drean
 */
public class ControladorRegistros extends HttpServlet {

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
        ProductoDAO dao_p = new ProductoDAO();
        SucursalDAO dao_s = new SucursalDAO();
        LaboratorioDAO dao_l = new LaboratorioDAO();
        String opcion = "";

        opcion = request.getParameter("opcion");

        if (opcion.equals("RegistroSucursal")) {
            if (dao_s.ListarSucursal() != null) {
                response.sendRedirect("RegistroSucursal.jsp");
            } else {
                response.sendRedirect("MensajeError.jsp?mensaje=No se encuentran sucursales registradas.");
            }
        }

        if (opcion.equals("RegistroLaboratorio")) {
            if (dao_l.ObtenerDatos() != null) {
                response.sendRedirect("RegistroLaboratorio.jsp");
            } else {
                response.sendRedirect("MensajeError.jsp?mensaje=No se encuentran laboratorios registrados.");
            }
        }
        if (opcion.equals("RegistroProducto")) {

            if (dao_p.ObtenerDatosProducto() != null) {
                response.sendRedirect("RegistroProductos.jsp");
            } else {
                response.sendRedirect("MensajeError.jsp?mensaje=No hay productos registrados&retorno=MenuProducto.jsp");
            }
        }

        if (opcion.equals("RegistroStock")) {

            if (dao_p.ObtenerDatosProducto() != null) {
                response.sendRedirect("RegistroStock.jsp");
            } else {
                response.sendRedirect("MensajeError.jsp?mensaje=No hay productos registrados&retorno=MenuProducto.jsp");
            }
        }

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorRegistros</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorRegistros at " + request.getContextPath() + "</h1>");
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
