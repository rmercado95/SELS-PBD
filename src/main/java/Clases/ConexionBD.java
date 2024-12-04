/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class ConexionBD {
    Connection conectar = null; 
    String usuario = "postgres";
    String contrasenia = "Rm3rc@d0";
    String bd = "bd_lenguaje";
    String ip = "localhost";
    String puerto = "5432";
    
    String cadena = "jdbc:postgresql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
        try { 
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
            JOptionPane.showMessageDialog(null, "Se conecto correctamente a la base de datos");
            
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas en la conexion a la base de datos" + e.toString());
            }
        return conectar;
        }
}

