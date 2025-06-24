package Controlador;
import Procesos.ProcesosFrmPaciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Formatos.*;
import DTO.PacienteDTO;
import Vista.FrmPaciente;
import DAO.*;

public class ControladorFrmPaciente implements ActionListener{
    
    FrmPaciente vista;
    DAOpacientes crud;
    PacienteDTO  usu;
    
    public ControladorFrmPaciente(FrmPaciente fp){
        vista=fp;
        vista.btnRegistrarP.addActionListener(this);
        vista.btnConsultarP.addActionListener(this);
        vista.btnActualizarP.addActionListener(this);
        vista.btnEliminarP.addActionListener(this);
        ProcesosFrmPaciente.Presentacion(fp);
        ActualizarForma();
    }
    
     void ActualizarForma(){
        crud= new DAOpacientes();
        ProcesosFrmPaciente.Estado1(vista);
        ProcesosFrmPaciente.LimpiarEntradas(vista);
        ProcesosFrmPaciente.MostrarPacientes(vista, crud.ListaPacientes());
     }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== vista.btnRegistrarP){
          usu = ProcesosFrmPaciente.LeerDatos(vista);
          crud = new DAOpacientes();
          crud.InsertarPaciente(usu);
          ActualizarForma();
       }
       if(e.getSource()== vista.btnConsultarP){
           int id_paciente= Mensajes.M2("Ingrese el Id del paciente que desea buscar....");
           crud = new DAOpacientes();
           usu= crud.ConsultarRegistro(id_paciente);
           if(usu==null){
               Mensajes.M1("El ID "+id_paciente+" no existe en la tabla");
           }else{
               vista.txtidpaciente.setText(Integer.toString(usu.getIdPaciente()));
               vista.txtNombresP.setText(usu.getNombres());
               vista.txtApellidosP.setText(usu.getApellidos());
               vista.txtApellidosP.setText(usu.getApellidos());
               vista.txtDniP.setText(usu.getDni());
               vista.txtSexo.setText(usu.getSexo());
               vista.txtFechaNP.setText(usu.getFechaN());
               vista.txtTelefonoP.setText(usu.getTelefono());
               vista.txtDireccionP.setText(usu.getDireccion());
               vista.txtTiposangre.setText(usu.getTipoSangre());
               vista.txtTallaP.setText(usu.getTalla());
               vista.txtPesoP.setText(usu.getPeso());
               vista.txtEstadocivilP.setText(usu.getEcivil());
               vista.dtFechaRegistro.setDate(usu.getFecharegistro());
               ProcesosFrmPaciente.Estado2(vista);
           }
          }
       
       if(e.getSource()== vista.btnActualizarP){
           usu = ProcesosFrmPaciente.LeerDatos(vista);
           usu.setIdPaciente(Integer.parseInt(vista.txtidpaciente.getText()));
           crud= new DAOpacientes();
           crud.ActualizarRegistro(usu);
           ActualizarForma();
       }
       if(e.getSource()== vista.btnEliminarP){
           int respuesta = Mensajes.M3("Confirmar","Desea eliminar el registro?");
           if(respuesta==0){
               int id_paciente = Integer.parseInt(vista.txtidpaciente.getText());
               crud = new DAOpacientes();
               crud.EliminarRegistro(id_paciente);
               ActualizarForma();
           }
       }     
    }
    
}
