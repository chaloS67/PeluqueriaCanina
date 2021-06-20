/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ConsultaMascota;
import modelo.Mascota;
import vista.Login;
import vista.Principal;

/**
 *
 * @author gonza
 */
public class Controlador implements ActionListener {
    
    private Mascota mac;
    private Principal miPrincipal;
    private ConsultaMascota miModelo;
    private Login miLogin;
    
    
    public Controlador (Mascota mac,Principal miPrincipal,ConsultaMascota miModelo,Login miLogin){
    
    
        this.mac = mac;
        this.miPrincipal = miPrincipal;
        this.miModelo = miModelo;
        this.miPrincipal.jbGuardar.addActionListener(this);
        this.miLogin = miLogin;
        this.miLogin.jbIngresar.addActionListener(this);
        
        
    
    
    }
    
    public void iniciar(){
        miLogin.setVisible(true);
       
       
        miPrincipal.setLocationRelativeTo(null);
        miPrincipal.setTitle("Peluqueria de perros");

    }
    
  
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String alergico = "";
        String especial= "";
        Object control = ae.getSource();
       
      
        
        if (control.equals(miPrincipal.jbGuardar)){
        
            if (miPrincipal.rbSiAlerg.isSelected()){
                
                alergico = "SI";}
              
            if (miPrincipal.rbNoAlerg.isSelected()){
                
                alergico = "NO" ; }
              
            if (miPrincipal.rbEspecial.isSelected()){
                
                especial = "SI";}
            
            if (miPrincipal.rbNoEspecial.isSelected()){
                
                especial = "NO"; }
            
        
        
            mac.setNumCliente(miPrincipal.jtNcliente.getText());
            mac.setNom_perro(miPrincipal.jtNombre.getText());
            mac.setRaza(miPrincipal.jtRaza.getText());
            mac.setColor(miPrincipal.jtColor.getText());
            mac.setAlergico(alergico);
            mac.setAtencion_especial(especial);
            mac.setNom_dueño(miPrincipal.jtDueño.getText());
            mac.setCel_dueño(miPrincipal.jtTel.getText());
            mac.setObservacion(miPrincipal.jtObs.getText());
            if (miModelo.Registrar(mac)){
                JOptionPane.showInternalMessageDialog(null, "Se guardo registro");
           
            }
            
        } 
        
        if (control.equals(miLogin.jbIngresar)){
            
            
             miPrincipal.setVisible(true);
        
        
        }
            
      } // final 
        
            
            
        
        
    
    
}
