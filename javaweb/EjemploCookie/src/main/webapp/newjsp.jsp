<%-- 
    Document   : newjsp
    Created on : 12/05/2015, 05:56:42 PM
    Author     : hernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        for(int i = 1; i<=10;i++){
        out.println(i+"</br>");
        }    
        
        %>
    </body>
</html>
