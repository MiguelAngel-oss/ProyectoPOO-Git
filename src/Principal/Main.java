
package Principal;

import Controlador.*;
import Vista.*;
public class Main {
    public static FrmUsuarios fu;
    public static ControladorFrmUsuario controlfu;
    
    public static FrmLogin lg;
    public static ControladorLogin controllg;
    
    public static FrmPaciente fp;
    public static ControladorFrmPaciente controlpac;

    public static void main(String[] args) {
        lg = new FrmLogin();             // Crea la vista del login
        controllg = new ControladorLogin(lg); // Crea el controlador y lo muestra
    }
    
}
