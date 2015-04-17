/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author edisonarango
 */
public class ModelLoginBean {
    
    private String usuario;
    private String password;
    private Sesion sesion;
    private Conexion conexion;
    
    public ModelLoginBean(){
        sesion = new Sesion();
        conexion = new Conexion();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String contraseña) {
        this.password = contraseña;
    }

    public Sesion getSesion() {
        return sesion;
    }
    
    
    public boolean validate () {
        
        if (conexion.conectar()) {
            if (conexion.usuarioExiste(usuario, password)) {
                sesion.usuarioLogueado(usuario);
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;    
        }   
    }
    
}
