<%-- 
    Document   : login-ok
    Created on : 10-abr-2015, 9:35:01
    Author     : edisonarango
--%>

<%@page import="model.Sesion" language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login OK</title>
    </head>
    <body>
    <center>
        <h3>Bienvenido, administrador del sistema</h3>
        <%
            Sesion sesion = (Sesion)request.getAttribute("sesion");
//            out.print("<b>Usuarios <br> Usuario: </b>"+sesion.getUsuarioEnSesion());
        %>
        <br><a href="vista/login-form.jsp">Cerrar Sesión</a>
    </center>  
    </body>
</html>

