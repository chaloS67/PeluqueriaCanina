
package sampini_gonzalo_tpo2;
import controlador.Controlador;
import modelo.ConsultaMascota;
import modelo.Mascota;
import vista.Login;
import vista.Principal;
/**
 *
 * @author gonza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
       Principal miPrincipal = new Principal();
       Login miLogin = new Login();
       Mascota mac = new Mascota();
       ConsultaMascota miModelo = new ConsultaMascota();
       Controlador ctrl = new Controlador(mac,miPrincipal,miModelo,miLogin);
       ctrl.iniciar();
       
    }
    
}
