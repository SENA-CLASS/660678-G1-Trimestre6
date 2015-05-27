/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.pruebagit2.ejemplocookie;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hernando
 */
@WebServlet(name = "ServletAccedeCookies", urlPatterns = {"/ServletAccedeCookies"})
public class ServletAccedeCookies extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Cookie[] cookies = request.getCookies();
            response.setContentType("text/html");
           
            out.println("<html>"
                    + "<head><title>Servlet que obtiene una cookie"
                    + " y borra otra</title></head>"
                    + "<body><b>Valor de la cookie "
                    + request.getParameter("nombreDevuelve") + ": </b>");
            String valor = Utilidades.devuelveValorCookie(
                    cookies, request.getParameter("nombreDevuelve"));
            if (valor.equals("")) {
                out.println("La cookie indicada no existe");
            } else {
                out.println(valor);
            }
            out.println("<br><br>");
            Cookie cookie = Utilidades.devuelveCookie(
                    cookies, request.getParameter("nombreBorra"));
            if (cookie != null) {
                cookie.setMaxAge(0);
                response.addCookie(cookie);
                out.println("<b>La cookie " + request.getParameter("nombreBorra")
                        + " ha sido borrada</b>");
            } else {
                out.println("<b>La cookie indicada no existe</b>");
            }
            out.println("<br><br><a href=\"/ejemplos/cookies.html\"/>Volver</a>");
            out.println("</body></html>");
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
