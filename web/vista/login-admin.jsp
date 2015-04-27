<%-- 
    Document   : login-ok
    Created on : 10-abr-2015, 9:35:01
    Author     : edisonarango
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Usuario"%>
<%@page import="model.Sesion" language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="vista/funciones.js"></script>
    </head>
    <body>
    <center>
        <h3>Bienvenido, administrador del sistema</h3><br>
        <h3><i>Modificación de Usuarios</i></h3>
        <%
            Sesion sesion = (Sesion)request.getAttribute("sesion");
            ArrayList<Usuario> usuarios = (ArrayList<Usuario>)request.getAttribute("usuarios");
            for  (int i=0; i<usuarios.size();i++){
                String usuario = usuarios.get(i).getUsuario();
                String usuarioConComillas = "\""+usuario+"\"";
                out.print("<br><b>Usuario:</b> "+usuario+" <a href='#' onclick='agregarModificacion("+usuarioConComillas+");'>Modificar</a> <a href='#' onclick='eliminarUsuario("+usuarioConComillas+");'>Eliminar</a>"
                        + "<div id='modify"+usuario+"'></div>");
            }
//            out.print("<b>Usuarios <br> Usuario: </b>"+sesion.getUsuarioEnSesion());
        %>
        <br><br><a href="vista/login-form.jsp">Cerrar Sesión</a>
    </center>
        <iframe id="frame" style='display:none'>
    </body>
</html>

