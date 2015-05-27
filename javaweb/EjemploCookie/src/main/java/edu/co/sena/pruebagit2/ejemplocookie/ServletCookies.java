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
@WebServlet(name = "ServletCookies", urlPatterns = {"/ServletCookies"})
public class ServletCookies extends HttpServlet {

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
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Muestra y crea cookies</title>");
            out.println("</head>");
            out.println("<body bgcolor=\"white\">");
            out.println("<h1>Muestra y crea cookies</h1>");
//se muestran las cookies existentes en la petición
            out.println("<TABLE BORDER=1>"
                    + "<caption>cookies exitentes</caption>"
                    + "<TR BGCOLOR=\"#FFAD00\">"
                    + " <TH>Nombre de la cookie</TH>"
                    + " <TH>valor de la cookie</TH></TR>"
            );
            Cookie[] cookies = request.getCookies();
            Cookie cookie;
            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                out.println("<TR>"
                        + " <TD>" + cookie.getName() + "</TD>"
                        + " <TD>" + cookie.getValue() + "</TD></TR>"
                );
            }
            out.println("</TABLE>");
            out.println("<P><b>Creación de una nueva cookie</b><br>");
//se crea el formulario
            out.print("<form action=\"ServletCookies\" method=GET>");
            out.print("<b>Nombre:</b>");
            out.println("<input type=text length=20 name=nombreCookie><br>");
            out.print("<b>Valor:</b>");
            out.println("<input type=text length=20 name=valorCookie><br>");
            out.println("<input type=submit value=Enviar></form>");
//se recuperan los valores del formulario
            String nombreCookie = request.getParameter("nombreCookie");
            String valorCookie = request.getParameter("valorCookie");
//se crea la nueva cookie
            if (nombreCookie != null && valorCookie != null) {
                cookie = new Cookie(nombreCookie, valorCookie);
                response.addCookie(cookie);
                out.println("<P>Se ha añadido la cookie " + nombreCookie);
                out.print(" con el valor " + valorCookie);
            }
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
