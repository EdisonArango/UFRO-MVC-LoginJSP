/*
 * Conexion.java
 *
 * Programa de prueba para conexión a una base de datos de MySQL.
 * Presupone que el servidor de base de datos está arrancado, disponible,
 * en el puerto por defecto.
 * El usuario y password de conexión con la base de datos debe cambiarse.
 * En la base de datos se supone que hay una base de datos llamada prueba y que
 * tiene una tabla persona con tres campos, de esta manera:
 * mysql> create database prueba;
 * mysql> use prueba;
 * mysql> create table persona (id smallint auto_increment, nombre varchar(60), 
 *      nacimiento date, primary key(id)); 
 */

package model;

import java.sql.*;

/**
 * Clase de prueba de conexión con una base de datos MySQL
 * @author Chudiang, modificado por Edison Arango
 */
public class Conexion {
    
    private String url = "jdbc:mysql://localhost:3306/loginMVCJSP";
    private String user = "root";
    private String contraseña = "";
    
    private Connection conexion;
    
    /** 
     * Crea una instancia de la clase MySQL y realiza todo el código 
     * de conexión, consulta y muestra de resultados.
     */
    public Conexion() 
    {
        // Se mete todo en un try por los posibles errores de MySQL
        try
        {
            // Se registra el Driver de MySQL
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public boolean conectar(){
        try
        {
            
            // Se obtiene una conexión con la base de datos. Hay que
            // cambiar el usuario "root" y la clave "la_clave" por las
            // adecuadas a la base de datos que estemos usando.
            conexion = DriverManager.getConnection (url,user,contraseña);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
    
    public int usuario (String usuario,String contraseña){
        try
        {
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();
            
            // Se realiza la consulta. Los resultados se guardan en el 
            // ResultSet rs
            ResultSet rs = s.executeQuery ("select * from usuario where usuario='"+usuario+"' and clave='"+contraseña+"';");
            
            rs.first();
            return rs.getInt("tipousuario");
            // Se recorre el ResultSet, mostrando por pantalla los resultados.
//            while (rs.next())
//            {
//                System.out.println (rs.getInt ("Id") + " " + rs.getString (2)+ 
//                    " " + rs.getDate(3));
//            }
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return -1;
        }
    }
    
    public void desconectar (){
        try
        {
            // Se cierra la conexión con la base de datos.
            conexion.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}