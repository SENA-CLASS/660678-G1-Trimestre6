<%-- 
    Document   : ejemplo
    Created on : 14/05/2015, 03:10:40 PM
    Author     : hernando
--%>

<%@page import="java.util.Date"%>
<%@page  contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.math.*" info="autor=hernando"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! int a=0; int b=10; %>
        <%!
        public int suma(int a, int b){
        return a+b;
        }
        
        %>
        <h1>Hello World!</h1>
        <% out.println(a); %>
        <% out.println(suma(8,5));%>
        
        <%! int cccc = 50; %>
        <% out.println(cccc); %>
        
        
        
        <%=new Date()   %>
        
        <%
        out.println(new Date());
        
        %>
        
        <%-- sdfasdfasdfsadfasdf --%>
        
        <jsp:declaration>
        
        int aasdfasdf=345;
        
        </jsp:declaration>
        
        
        
        
    </body>
</html>
