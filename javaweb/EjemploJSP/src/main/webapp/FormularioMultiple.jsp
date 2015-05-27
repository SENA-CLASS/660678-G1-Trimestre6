<%-- 
    Document   : FormularioMultiple
    Created on : 15/05/2015, 02:07:29 PM
    Author     : hernando
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="FormularioMultiple.jsp" method="POST">
            <table>
                <tr>
                    <td>Id Persona</td>
                    <td><input type="text" name="personaId" /></td>
                </tr>
                <tr>
                    <td>Nombre(s)</td>
                    <td><input type="text" name="primerNombre" /></td>
                </tr>
                <tr>
                    <td>Apellido(s)</td>
                    <td><input type="text" name="ultimoNombre" /></td>
                </tr>
                <tr>
                    <td>Edad</td>
                    <td><input type="text" name="edad"  /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Crear" />
                        <input type="submit" name="action" value="Editar" />
                        <input type="submit" name="action" value="Eliminar" />
                        <input type="submit" name="action" value="Buscar" />
                    </td>                
                </tr>            
            </table>
        </form>    
        
   
        
    </body>
</html>
