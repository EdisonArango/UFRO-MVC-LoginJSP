/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function agregarModificacion (usuario){
    var insert = "<form method='post' action='Modificar' target='frame'>\n\
                   Nuevo usuario:<input type='text' name='nuevousuario'>\n\
                    Nueva clave:<input type='text' name='clave'>\n\
                Nuevo Tipo de Usuario<select name='tipo'>\n\
                <option value='0'>Administrador</option>\n\
                <option value='1'>Usuario normal</option>\n\
              </select>\n\
                <input type='hidden' name='usuario' value='"+usuario+"'>\n\
            <input type='hidden' name='tipomodificacion' value='modificar'>\n\
        <input type='submit' value='Modificar'>\n\
<form>";
    document.getElementById("modify"+usuario).innerHTML = insert;
}

/**
 * Comment
 */
function eliminarUsuario(usuario) {
    if (confirm("Estas seguro que deseas eliminar al usuario: "+usuario) == true) {
        document.getElementById("frame").src = window.location.protocol + "//" +window.location.host + "/Login-MVC-JSP/Modificar?usuario="+usuario+"&tipomodificacion=eliminar";
    } else {
        return;
    }
}

