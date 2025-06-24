package Controlador;
import Procesos.ProcesosFrmUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Formatos.*;
import DTO.UsuarioDTO;
import Vista.FrmUsuarios;
import DAO.*;

public class ControladorFrmUsuario implements ActionListener {
    
    FrmUsuarios vista;
    DAOusuarios crud;
    UsuarioDTO  usu;
    
    public ControladorFrmUsuario(FrmUsuarios fu){
        vista=fu;
        vista.btnAñadirU.addActionListener(this);
        vista.btnConsultarU.addActionListener(this);
        vista.btnActualizarU.addActionListener(this);
        vista.btnEliminarU.addActionListener(this);
        ProcesosFrmUsuarios.Presentacion(fu);
        ActualizarForma();
    }
    
     void ActualizarForma(){
        crud= new DAOusuarios();
        ProcesosFrmUsuarios.Estado1(vista);
        ProcesosFrmUsuarios.LimpiarEntradas(vista);
        ProcesosFrmUsuarios.MostrarUsuarios(vista, crud.ListaUsuarios());
     }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== vista.btnAñadirU){
          usu = ProcesosFrmUsuarios.LeerDatos(vista);
          crud = new DAOusuarios();
          crud.InsertarUsuario(usu);
          ActualizarForma();
       }
       if(e.getSource()== vista.btnConsultarU){
           int id_usuario= Mensajes.M2("Ingrese el Id del usuario que desea buscar....");
           crud = new DAOusuarios();
           usu= crud.ConsultarRegistro(id_usuario);
           if(usu==null){
               Mensajes.M1("El ID "+id_usuario+" no existe en la tabla");
           }else{
               vista.txtidUsuario.setText(Integer.toString(usu.getIdusuario()));
               vista.txtNombresU.setText(usu.getNombres());
               vista.txtApellidosU.setText(usu.getApellidos());
               vista.txtUsuarioU.setText(usu.getNombreUsuario());
               vista.txtContraseñaU.setText(usu.getContraseña());
               ProcesosFrmUsuarios.Estado2(vista);
           }
          }
       
       if(e.getSource()== vista.btnActualizarU){
           usu = ProcesosFrmUsuarios.LeerDatos(vista);
           usu.setIdusuario(Integer.parseInt(vista.txtidUsuario.getText()));
           crud= new DAOusuarios();
           crud.ActualizarRegistro(usu);
           ActualizarForma();
       }
       if(e.getSource()== vista.btnEliminarU){
           int respuesta = Mensajes.M3("Confirmar","Desea eliminar el registro?");
           if(respuesta==0){
               int id_usuario = Integer.parseInt(vista.txtidUsuario.getText());
               crud = new DAOusuarios();
               crud.EliminarRegistro(id_usuario);
               ActualizarForma();
           }
       }
    }
    
}
