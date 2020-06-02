/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import dao.LaboratorioDAO;
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
public class ControladorLaboratorio extends HttpServlet {

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

        String nombre_laboratorio = "", id_usuario = "", opcion = "", id_laboratorio="";
        LaboratorioDAO dao = new LaboratorioDAO();

        nombre_laboratorio = request.getParameter("nombre_laboratorio");
        id_usuario = request.getParameter("id_usuario");
         id_laboratorio = request.getParameter("id_laboratorio");
        opcion = request.getParameter("opcion");

        if (opcion.equals("Agregar")) {
            if(dao.AgregarLaboratotio(nombre_laboratorio,id_usuario)==true){
                response.sendRedirect("MensajeOk.jsp?mensaje=Laboratorio agregado correctamente&retorno=MenuProducto.jsp");
            }else{
                response.sendRedirect("MensajeError.jsp?mensaje=Laboratorio NO agregado correctamente&retorno=MenuProducto.jsp");
            }
        }
        
        if (opcion.equals("Eliminar")) {
            if(dao.Eliminar(id_laboratorio)==1){
                response.sendRedirect("MensajeOk.jsp?mensaje=Laboratorio eliminado correctamente&retorno=MenuProducto.jsp");
            }else{
                response.sendRedirect("MensajeError.jsp?mensaje=Laboratorio NO eliminado correctamente&retorno=MenuProducto.jsp");
            }
        }
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorLaboratorio</title>");
            out.println("</head>");
            out.println("<body>");
            /*out.println("<h1>" + nombre_laboratorio + "</h1>");
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
