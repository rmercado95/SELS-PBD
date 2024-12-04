/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sign_language;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author Ricardo
 */
public class Sign_language {

   public static void main(String[] args) {
      Login objetoLogin = new Login ();
      objetoLogin.setVisible(true);
       try {
           UIManager.setLookAndFeel(new NimbusLookAndFeel());
       } catch (UnsupportedLookAndFeelException ex) {
           Logger.getLogger(Sign_language.class.getName()).log(Level.SEVERE, null, ex);
       }
    
      
    }
    
}
