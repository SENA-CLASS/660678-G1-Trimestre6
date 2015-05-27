<%-- 
    Document   : newjsp
    Created on : 25/05/2015, 05:51:08 PM
    Author     : hernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<%!public String ambito(int ambi) {
        if (ambi == PageContext.SESSION_SCOPE) {
            return "SESSION_SCOPE";
        }
        if (ambi == PageContext.APPLICATION_SCOPE) {
            return "APPLICATION_SCOPE";
        }
        if (ambi == PageContext.REQUEST_SCOPE) {
            return "REQUEST_SCOPE";
        }
        if (ambi == PageContext.PAGE_SCOPE) {
            return "PAGE_SCOPE";
        }
        return "";
    }%>
<html>
    <head>
        <title>Objeto pageContext</title>
    </head>
    <body>
        <%session.setAttribute("ciudad", new String("Madrid"));
            pageContext.setAttribute("nombre", new String("Angel"),
                    PageContext.SESSION_SCOPE);
            pageContext.setAttribute("pais", new String("España"),
                    PageContext.PAGE_SCOPE);
            pageContext.setAttribute("pais", new String("Francia"),
                    PageContext.SESSION_SCOPE);
            Enumeration atributos = pageContext.getAttributeNamesInScope(
                    PageContext.SESSION_SCOPE);
            while (atributos.hasMoreElements()) {
                String nombre = (String) atributos.nextElement();%>
        <%=nombre%>=<%=pageContext.getAttribute(nombre, PageContext.SESSION_SCOPE)%><br>
        <%}%><br>
        pais=<%=pageContext.findAttribute("pais")%><br><br>
        Ámbito de país=<%=ambito(pageContext.getAttributesScope("pais"))%>
    </body>
</html>