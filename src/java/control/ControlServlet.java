/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ModelLoginBean;

/**
 *
 * @author edisonarango
 */
@WebServlet(name = "ControlServlet", urlPatterns = {"/ControlServlet"})
public class ControlServlet extends HttpServlet {
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws java.io.IOException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html");
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        ModelLoginBean mlbean = new ModelLoginBean();
        mlbean.setUsuario(usuario);
        mlbean.setPassword(password);
        
        boolean status = mlbean.validate();
        
        RequestDispatcher rd;
        if (status) {
            request.setAttribute("sesion", mlbean.getSesion());
            if (mlbean.getSesion().getTipoUsuario()==1) {
                rd = request.getRequestDispatcher("/vista/login-ok.jsp");
            }
            else if (mlbean.getSesion().getTipoUsuario()==0){
                rd = request.getRequestDispatcher("/vista/login-admin.jsp");
            }
            else{
                request.setAttribute("mensaje", "Error!! Usuario o contraseña incorrecta");
                rd = request.getRequestDispatcher("/vista/login-form.jsp");
            }
            
        }
        else{
            request.setAttribute("mensaje", "Error!! Usuario o contraseña incorrecta");
            rd = request.getRequestDispatcher("/vista/login-form.jsp");
        }
        rd.forward(request, response);
        
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
