package Procesos;

import DTO.UsuarioDTO;
import Vista.FrmLogin;

public class ProcesosFrmLogin {
    
   public static void Presentacion(FrmLogin fl){
    fl.setTitle("Login"); 
    fl.setLocationRelativeTo(null);
    fl.setVisible(true);
   }
   
   public static void LimpiarEntradas(FrmLogin fl){
       fl.txtUsuario.setText("");
       fl.txtContraseña.setText("");
       fl.txtUsuario.requestFocus();
   }
   public static UsuarioDTO LeerDatos(FrmLogin fl){
       UsuarioDTO u = new UsuarioDTO();//el id no ha sido añadido
       u.setNombreUsuario(fl.txtUsuario.getText());
       u.setContraseña(fl.txtContraseña.getText());
       return u;
   }
    
}
