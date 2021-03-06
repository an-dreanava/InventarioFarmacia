/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import dao.UsuarioDAO;
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
public class ControladorLogin extends HttpServlet {

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

        String usuario_id,usuario_clave, opcion = "";

        usuario_id = request.getParameter("usuario_id");
        usuario_clave=request.getParameter("usuario_clave");
        opcion = request.getParameter("opcion");
        UsuarioDAO dao = new UsuarioDAO();

        HttpSession sesion = request.getSession(true);

        sesion.setAttribute("usuario", null);
        sesion.setAttribute("estadoSesion", "off");

        Usuario user = dao.ValidarUsuario(usuario_id,usuario_clave);

        if (user != (null)) {
            sesion.setAttribute("usuario", user);
            sesion.setAttribute("estadoSesion", "on");
            
            //dirige al menú respectivo del usuario que inicia sesión. 
            
            if (user.getTipo_usuario().equals("FARMACEUTICO")) {
                response.sendRedirect("MenuFarmaceutico.jsp?nombre=" + user.getNombre_usuario());
            } else {
                if (user.getTipo_usuario().equals("VENDEDOR")) {

                    response.sendRedirect("MenuVendedor.jsp?nombre=" + user.getNombre_usuario());
                }
            }

        }else{
            response.sendRedirect("MensajeError.jsp?mensaje=Usuario y/o Clave Incorrectos");
        }

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorLogin</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorLogin at " + request.getContextPath() + "</h1>");
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
