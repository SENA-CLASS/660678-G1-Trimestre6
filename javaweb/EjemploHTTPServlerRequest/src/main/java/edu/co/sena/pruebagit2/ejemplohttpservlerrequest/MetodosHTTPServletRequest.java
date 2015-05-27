/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.pruebagit2.ejemplohttpservlerrequest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hernando
 */
@WebServlet(name = "MetodosHTTPServletRequest", urlPatterns = {"/MetodosHTTPServletRequest"})
public class MetodosHTTPServletRequest extends HttpServlet {

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
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MetodosHTTPServletRequest</title>");            
            out.println("</head>");
            out.println("<body>"
                    + "<i>"+response.getBufferSize()+" KB</i>");
            
            
            out.println("autenticacion: "+request.getAuthType()+"</br>");
            out.println("URL: "+request.getContextPath()+"</br>");
            
            Cookie cokkies[] = request.getCookies();
            out.println("-----------------cookies--------------------</br>");
//            try {
//                 for(int i=0;i<cokkies.length;i++){
//                out.println("-----------------cookies "+i+"--------------------</br>");
//                out.println("nombre: "+cokkies[i].getName()+"</br");
//                out.println("Patch: "+cokkies[i].getPath()+"</br");
//                out.println("secure: "+cokkies[i].getSecure()+"</br");
//                out.println("value: "+cokkies[i].getValue()+"</br");
//                out.println("version: "+cokkies[i].getVersion()+"</br");
//                out.println("maxAge: "+cokkies[i].getMaxAge()+"</br");
//                out.println("Domain: "+cokkies[i].getDomain()+"</br");
//                out.println("Comment: "+cokkies[i].getComment()+"</br");
//            
//            }
//            } catch (Exception e) {
//                out.println(e.getMessage());
//            }
                
                
           
            out.println("no hay");
            Enumeration<String> cabe = request.getHeaderNames();
            out.println(cabe.toString());
            if(cabe != null){
            out.println("no hay");
            }
            while (cabe.hasMoreElements()) {
                String nextElement = cabe.nextElement();
                out.println(nextElement+": "+request.getHeader(nextElement)+"</br>");
                
            }
            
            out.println(request.getPathInfo()+"</br>");
            out.println(request.getPathTranslated()+"</br>");
            out.println(request.getQueryString()+"</br>");
            
            HttpSession sesion = request.getSession();
            out.println(sesion.getId()+"</br>");
            
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
