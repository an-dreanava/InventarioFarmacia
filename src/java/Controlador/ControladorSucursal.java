/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import dao.SucursalDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Usuario;

/**
 *
 * @author drean
 */
public class ControladorSucursal extends HttpServlet {

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

        String direccion = "", id_usuario = "", opcion = "";
        int numero_local = 0;
        SucursalDAO dao = new SucursalDAO();

        numero_local = Integer.parseInt(request.getParameter("numero_local"));
        direccion = request.getParameter("direccion");
        id_usuario = request.getParameter("id_usuario");
        opcion = request.getParameter("opcion");

        Usuario user = null;
        String estadoSesion = "off";
        HttpSession sesion = request.getSession(true);

        user = (Usuario) sesion.getAttribute("usuario");
        estadoSesion = (String) sesion.getAttribute("estadoSesion");

        if (user != null) {
            id_usuario = user.getUsuario_id();
            if (opcion.equals("Agregar")) {

                if (dao.AgregarSucursal(numero_local, direccion, id_usuario) == true) {
                    response.sendRedirect("MensajeOk.jsp?mensaje=Sucursal agregada correctamente");
                } else {
                    response.sendRedirect("MensajeError.jsp?mensaje=Sucursal NO agregada correctamente");
                }
            }

            if (opcion.equals("Eliminar")) {
                if (dao.EliminarSucursal(numero_local) == true) {
                    response.sendRedirect("MensajeOk.jsp?mensaje=Sucursal eliminada correctamente&retorno=MenuProducto.jsp");
                } else {
                    response.sendRedirect("MensajeError.jsp?mensaje=Sucursal NO eliminada correctamente&retorno=MenuProducto.jsp");
                }
            }

            if (opcion.equals("Buscar")) {
                if (dao.BuscarSucursal(numero_local) != null) {
                    response.sendRedirect("ResultadoSucursal.jsp?numero_local=" + numero_local);
                } else {
                    response.sendRedirect("MensajeError.jsp?mensaje=Sucursal NO encontrada&retorno=MenuProducto.jsp");
                }
            }
            if (opcion.equals("Modificar")) {

                if (dao.ModificarSucursal(numero_local, id_usuario, direccion) == true) {
                    response.sendRedirect("MensajeOk.jsp?mensaje=Sucursal modificada&retorno=MenuFarmaceutico.jsp");
                } else {
                    response.sendRedirect("MensajeError.jsp?mensaje=Sucursal NO modificada&retorno=MenuFarmaceutico.jsp");
                }
            }

        } else {
            response.sendRedirect("MensajeError.jsp?mensaje=Error de Usuario");
        }

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorSucursal</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorSucursal at " + request.getContextPath() + "</h1>");
            /*out.println("<h1>" + numero_local + "</h1>");
            out.println("<h1>" + direccion + "</h1>");
            out.println("<h1>" + id_usuario + "</h1>");
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
