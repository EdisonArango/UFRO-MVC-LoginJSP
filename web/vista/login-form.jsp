<%-- 
    Document   : login-form
    Created on : 10-abr-2015, 9:34:45
    Author     : edisonarango
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Login</title>
    </head>
    <body>
        <!--
        <% //if(request.getAttribute("sesion")=="true")
//        {
//       response.sendRedirect("http://localhost:8080/Login-MVC-JSP/ControlSesion");
//        }%>
            -->
        <center>
            <h3>Ingresar al sistema</h3>
            <form action="http://localhost:8080/Login-MVC-JSP/ControlServlet" method="post">
                Usuario: <input type="text" name="usuario">
                Password: <input type="password" name="password">
                <input type="submit" value="Ingresar">
            </form>
            <p style="color: red;"> ${mensaje} </p>
        </center> 
    </body>
</html>
