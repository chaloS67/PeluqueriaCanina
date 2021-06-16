/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author gonza
 */
public class ConsultaMascota extends Conexion {
    
    public boolean Registrar(Mascota mac){
    
        PreparedStatement stmt = null;
        Connection con = getConnection();
        String sql = "INSERT INTO mascotas (num_cliente,nom_perro,raza,color,alergico,atencion_especial,nomb_dueño,cel_dueño,observacion)"
        +"VALUES (?,?,?,?,?,?,?,?,?)";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(mac.getNumCliente()));
            stmt.setString(2, mac.getNom_perro());
            stmt.setString(3, mac.getRaza());
            stmt.setString(4, mac.getColor());
            stmt.setString(5, mac.getAlergico());
            stmt.setString(6, mac.getAtencion_especial());
            stmt.setString(7, mac.getNom_dueño());
            stmt.setString(8, mac.getCel_dueño());
            stmt.setString(9, mac.getObservacion());
            stmt.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            System.err.println("No se ingraron los datos");
            return false;
       
        }finally{
            
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        
        }
    
    }
    
}
