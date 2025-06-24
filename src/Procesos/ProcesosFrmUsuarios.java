package Procesos;

import DTO.UsuarioDTO;
import Formatos.ManejadorTablas;
import Vista.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
public class ProcesosFrmUsuarios {
    
   public static void Presentacion(FrmUsuarios fu){
    fu.setTitle("Mantenimiento de Usuarios");    
    fu.txtidUsuario.setEnabled(false);
    fu.setVisible(true);
   }
   
  public static void Estado1(FrmUsuarios fu){
      fu.btnAñadirU.setEnabled(true);
      fu.btnConsultarU.setEnabled(true);
      fu.btnActualizarU.setEnabled(false);
      fu.btnEliminarU.setEnabled(false);
  }
  public static void Estado2(FrmUsuarios fu){
      fu.btnAñadirU.setEnabled(false);
      fu.btnConsultarU.setEnabled(true);
      fu.btnActualizarU.setEnabled(true);
      fu.btnEliminarU.setEnabled(true);
  }
 
   public static void LimpiarEntradas(FrmUsuarios fu){
       fu.txtNombresU.setText("");
       fu.txtApellidosU.setText("");
       fu.txtUsuarioU.setText("");
       fu.txtidUsuario.setText("");
       fu.txtContraseñaU.setText("");
       fu.txtNombresU.requestFocus();
   }
   public static UsuarioDTO LeerDatos(FrmUsuarios fu){
       UsuarioDTO u = new UsuarioDTO();//el id no ha sido añadido
       u.setNombres(fu.txtNombresU.getText());
       u.setApellidos(fu.txtApellidosU.getText());
       u.setNombreUsuario(fu.txtUsuarioU.getText());
       u.setContraseña(fu.txtContraseñaU.getText());
       return u;
   }
   
   public static void MostrarUsuarios(FrmUsuarios f1,ArrayList<UsuarioDTO> lista){
    String[] titulos={"Nro","ID Usuario","Nombre","Apellidos","Nombre usuario","Contraseña","Estado"};
    DefaultTableModel modelo = new DefaultTableModel(null,titulos);
    f1.jtblDatos.setModel(modelo);
    for(int i=0;i<lista.size();i++){
        modelo.addRow(lista.get(i).Registrousuario(i+1));
    }
    ManejadorTablas.FormatoTablaUsuarios(f1.jtblDatos);
    f1.jlblCantidaddeUsuarios.setText("Cantidad de Registros: "+lista.size());
}
}
