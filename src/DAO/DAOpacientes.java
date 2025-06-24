package DAO;
import DTO.PacienteDTO;
import Formatos.Mensajes;
import java.util.ArrayList;


public class DAOpacientes extends ConectarBD{
  
    public DAOpacientes(){}
    
    public ArrayList<PacienteDTO> ListaPacientes(){
        ArrayList<PacienteDTO> lista = new ArrayList();
        try {
            rs = st.executeQuery(
                    "select id_paciente,nombres_p,apellidos_p,dni_p,sexo,fechanac_p,telefono_p,"
                            + "direccion_p,t_Sangre,talla_p,peso_p,Estadocivil_p,f_registro from PACIENTE;");
            while(rs.next()){
                PacienteDTO pac = new PacienteDTO();
                pac.setIdPaciente(rs.getInt(1));
                pac.setNombres(rs.getString(2));
                pac.setApellidos(rs.getString(3));
                pac.setDni(rs.getString(4));
                pac.setSexo(rs.getString(5));
                pac.setFechaN(rs.getString(6));
                pac.setTelefono(rs.getString(7));
                pac.setDireccion(rs.getString(8));
                pac.setTipoSangre(rs.getString(9));
                pac.setTalla(rs.getString(10));
                pac.setPeso(rs.getString(11));
                pac.setEcivil(rs.getString(12));
                pac.setFecharegistro(rs.getDate(13).toLocalDate());
                lista.add(pac);
            }
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("Error no se puede recuperar la lista pac"+e);
        }
        return lista;
    }
    
    public void InsertarPaciente(PacienteDTO pac){
        try{
            ps= conexion.prepareStatement(
            "insert into PACIENTE(nombres_p,apellidos_p,dni_p,sexo,fechanac_p,telefono_p,"+
            "direccion_p,t_Sangre,talla_p,peso_p,Estadocivil_p,f_registro) values (?,?,?,?,?,?,?,?,?,?,?,?);");
            
            ps.setString(1, pac.getNombres());
            ps.setString(2, pac.getApellidos());
            ps.setString(3, pac.getDni());
            ps.setString(4, pac.getSexo());
            ps.setString(5, pac.getFechaN());
            ps.setString(6, pac.getTelefono());
            ps.setString(7, pac.getDireccion());
            ps.setString(8, pac.getTipoSangre());
            ps.setString(9, pac.getTalla());
            ps.setString(10, pac.getPeso());
            ps.setString(11, pac.getEcivil());
            ps.setDate(12, java.sql.Date.valueOf(pac.getFecharegistro()));
            
            ps.executeUpdate();
            Mensajes.M1("Registro insertado correctacmente");
            conexion.close();
        }catch (Exception e){
            Mensajes.M1("ERROR al insertar Paciente"+e);
        }
    }
    
     public PacienteDTO ConsultarRegistro( int id_paciente){
        PacienteDTO pac=null;
        try{
            rs = st.executeQuery(
            " select id_paciente,nombres_p,apellidos_p,dni_p,sexo,fechanac_p,telefono_p,"+
             "direccion_p,t_Sangre,talla_p,peso_p,Estadocivil_p,f_registro from PACIENTE where id_paciente="+id_paciente+";");
            if(rs.next()){
                pac = new PacienteDTO();
                pac.setIdPaciente(rs.getInt(1));
                pac.setNombres(rs.getString(2));
                pac.setApellidos(rs.getString(3));
                pac.setDni(rs.getString(4));
                pac.setSexo(rs.getString(5));
                pac.setFechaN(rs.getString(6));
                pac.setTelefono(rs.getString(7));
                pac.setDireccion(rs.getString(8));
                pac.setTipoSangre(rs.getString(9));
                pac.setTalla(rs.getString(10));
                pac.setPeso(rs.getString(11));
                pac.setEcivil(rs.getString(12));
                pac.setFecharegistro(rs.getDate(13).toLocalDate());
            }
            rs.close();
        }catch(Exception e){
            Mensajes.M1("ERROR no se puedo consultar el Usuario"+e);
        }
        return pac;
    }
     
    public void ActualizarRegistro(PacienteDTO pac){
        try{
            ps = conexion.prepareStatement(
            "update PACIENTE set nombres_p=?, apellidos_p=?, dni_p=?, sexo=?, fechanac_p=?, telefono_p=?,"+
            "direccion_p=?, t_Sangre=?, talla_p=?, peso_p=?, Estadocivil_p=?, f_registro=?  where id_paciente=?");
            ps.setString(1, pac.getNombres());
            ps.setString(2, pac.getApellidos());
            ps.setString(3, pac.getDni());
            ps.setString(4, pac.getSexo());
            ps.setString(5, pac.getFechaN());
            ps.setString(6, pac.getTelefono());
            ps.setString(7, pac.getDireccion());
            ps.setString(8, pac.getTipoSangre());
            ps.setString(9, pac.getTalla());
            ps.setString(10, pac.getPeso());
            ps.setString(11, pac.getEcivil());
            ps.setDate(12,java.sql.Date.valueOf(pac.getFecharegistro()));
            ps.setInt(13, pac.getIdPaciente());
            ps.executeUpdate();
            Mensajes.M1("Registro actualizado correctamente");
            ps.close();
        }catch (Exception e){
            Mensajes.M1("ERROR al actualizar el Paciente"+e);
        }
    }
    
    public void EliminarRegistro (int id_paciente){
        try{
            ps = conexion.prepareStatement("DELETE FROM PACIENTE WHERE id_paciente = ?;");
            ps.setInt(1, id_paciente);
            ps.executeUpdate();
            Mensajes.M1("Registro eliminado de la tabla Paciente");
            ps.close();
        }catch(Exception e){
            Mensajes.M1("ERROR al eliminar el registro pac...."+e);
        }
    }
}
