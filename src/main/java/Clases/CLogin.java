/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import com.mycompany.sign_language.FormMenuPrincipal;
import com.mycompany.sign_language.Login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Ricardo
 */
public class CLogin {
    public void validarUsuario (JTextField usuario, JPasswordField contrasenia){
        try {
            ResultSet rs = null; 
            PreparedStatement ps = null; 
            Clases.ConexionBD objetoConexion = new Clases.ConexionBD();
            String consulta = "select * from app.tabla_prueba_netbeans  where app.tabla_prueba_netbeans.nombre_usuario  = (?) and tabla_prueba_netbeans.contrasenia_usuario = (?)";
            ps = objetoConexion.estableceConexion().prepareStatement(consulta);
            String contra = String.valueOf(contrasenia.getPassword());
            ps.setString(1, usuario.getText());
            ps.setString(2, contra);
            
            rs = ps.executeQuery();
            
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "Usuario Correcto");
                FormMenuPrincipal objetoMenu = new FormMenuPrincipal();
                objetoMenu.setVisible(true); 

            }
            else{
            JOptionPane.showMessageDialog(null, "El usuario es incorrecto");
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
