package Procesos;

import DTO.PacienteDTO;
import Formatos.ManejadorTablas;
import Vista.FrmPaciente;
import Vista.FrmUsuarios;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ProcesosFrmPaciente {
    
   public static void Presentacion(FrmPaciente fp){
    fp.setTitle("Mantenimiento de Pacientes");    
    fp.txtidpaciente.setEnabled(false);
    fp.setVisible(true);
   }
   
  public static void Estado1(FrmPaciente fp){
      fp.btnRegistrarP.setEnabled(true);
      fp.btnConsultarP.setEnabled(true);
      fp.btnActualizarP.setEnabled(false);
      fp.btnEliminarP.setEnabled(false);
  }
  public static void Estado2(FrmPaciente fp){
      fp.btnRegistrarP.setEnabled(false);
      fp.btnConsultarP.setEnabled(true);
      fp.btnActualizarP.setEnabled(true);
      fp.btnEliminarP.setEnabled(true);
  }
    public static void LimpiarEntradas(FrmPaciente fp){
       fp.txtNombresP.setText("");
       fp.txtApellidosP.setText("");
       fp.txtDniP.setText("");
       fp.txtSexo.setText("");
       fp.txtFechaNP.setText("");
       fp.txtTelefonoP.setText("");
       fp.txtDireccionP.setText("");
       fp.txtTiposangre.setText("");
       fp.txtTallaP.setText("");
       fp.txtPesoP.setText("");
       fp.txtEstadocivilP.setText("");
       fp.dtFechaRegistro.setDate(null);//DatePicker
       fp.txtNombresP.requestFocus();
   }
    
    public static PacienteDTO LeerDatos(FrmPaciente fp){
       PacienteDTO p = new PacienteDTO();
       p.setNombres(fp.txtNombresP.getText());
       p.setApellidos(fp.txtApellidosP.getText());
       p.setDni(fp.txtDniP.getText());
       p.setSexo(fp.txtSexo.getText());
       p.setFechaN(fp.txtFechaNP.getText());
       p.setTelefono(fp.txtTelefonoP.getText());
       p.setDireccion(fp.txtDireccionP.getText());
       p.setTipoSangre(fp.txtTiposangre.getText());
       p.setTalla(fp.txtTallaP.getText());
       p.setPeso(fp.txtPesoP.getText());
       p.setEcivil(fp.txtEstadocivilP.getText());
       p.setFecharegistro(fp.dtFechaRegistro.getDate());
       return  p;   
    }
    
    public static void MostrarPacientes(FrmPaciente fp,ArrayList<PacienteDTO> lista){
       String[] titulos={"Nro","ID Paciente","Nombre","Apellidos","DNI","Sexo","F.Nacimiento","Telefono","Direccion",
                         "Tipo Sangre","Talla","Peso","E.Civil","F.Registro"};
       DefaultTableModel modelo = new DefaultTableModel(null,titulos);
       fp.tbldatos.setModel(modelo);
       for(int i=0;i<lista.size();i++){
           modelo.addRow(lista.get(i).Registropaciente(i+1));
       }
       ManejadorTablas.FormatoTablaUsuarios(fp.tbldatos);
       fp.jlblCantidadRegistros.setText("Cantidad de Registros: "+lista.size());
   } 
    
}
