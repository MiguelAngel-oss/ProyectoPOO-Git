package DAO;
import DTO.UsuarioDTO;
import Formatos.Mensajes;
import java.util.ArrayList;

public class DAOusuarios extends ConectarBD{
    
    public DAOusuarios(){}
    
    public ArrayList<UsuarioDTO> ListaUsuarios(){
        ArrayList<UsuarioDTO> lista = new ArrayList();
        try {
            rs = st.executeQuery(
                    "select id_usuario,nombres,apellidos,usuario,contraseña,estado from  USUARIO where estado= 'A';");
            while(rs.next()){
                UsuarioDTO usu = new UsuarioDTO();
                usu.setIdusuario(rs.getInt(1));
                usu.setNombres(rs.getString(2));
                usu.setApellidos(rs.getString(3));
                usu.setNombreUsuario(rs.getString(4));
                usu.setContraseña(rs.getString(5));
                usu.setEstado(rs.getString(6));
                lista.add(usu);
            }
            conexion.close();
        } catch (Exception e) {
            Mensajes.M1("Error no se puede recuperar la lista usu"+e);
        }
        return lista;
    }
    
    public void InsertarUsuario(UsuarioDTO usu){
        try{
            ps= conexion.prepareStatement(
            "insert into USUARIO(nombres,apellidos,usuario,contraseña,estado) values (?,?,?,?,'A');");
            
            ps.setString(1, usu.getNombres());
            ps.setString(2, usu.getApellidos());
            ps.setString(3, usu.getNombreUsuario());
            ps.setString(4, usu.getContraseña());
            ps.executeUpdate();
            Mensajes.M1("Registro insertado correctacmente");
            conexion.close();
        }catch (Exception e){
            Mensajes.M1("ERROR al insertar Usuario"+e);
        }
    }
    
    
     public UsuarioDTO ConsultarRegistro( int id_usuario){
        UsuarioDTO usu=null;
        try{
            rs = st.executeQuery(
            "select id_usuario,nombres,apellidos,usuario,contraseña,"
            + " estado from USUARIO where estado ='A' and id_usuario="+id_usuario+";");
            if(rs.next()){
                usu = new UsuarioDTO();
                usu.setIdusuario(rs.getInt(1));
                usu.setNombres(rs.getString(2));
                usu.setApellidos(rs.getString(3));
                usu.setNombreUsuario(rs.getString(4));
                usu.setContraseña(rs.getString(5));
                usu.setEstado(rs.getString(6));
            }
            rs.close();
        }catch(Exception e){
            Mensajes.M1("ERROR no se puedo consultar el Usuario"+e);
        }
        return usu;
    }
     
    public void ActualizarRegistro(UsuarioDTO usu){
        try{
            ps = conexion.prepareStatement(
            "update USUARIO set nombres=?, apellidos=?, usuario=?, contraseña=?  where id_usuario=?");
            ps.setString(1, usu.getNombres());
            ps.setString(2, usu.getApellidos());
            ps.setString(3, usu.getNombreUsuario());
            ps.setString(4, usu.getContraseña());
            ps.setInt(5, usu.getIdusuario());
            ps.executeUpdate();
            Mensajes.M1("Registro actualizado correctamente");
            ps.close();
        }catch (Exception e){
            Mensajes.M1("ERROR al actualizar el usuario"+e);
        }
    }
    
    public void EliminarRegistro (int id_usuario){
        try{
            ps = conexion.prepareStatement("update USUARIO set estado='N' where id_usuario=?;");
            ps.setInt(1, id_usuario);
            ps.executeUpdate();
            Mensajes.M1("Registro eliminado de la tabla Usuarios");
            ps.close();
        }catch(Exception e){
            Mensajes.M1("ERROR al eliminar el registro usu...."+e);
        }
    }
    
    public UsuarioDTO verificarLogin(String usuario, String contraseña) {
    UsuarioDTO usu = null;
    try {
        ps = conexion.prepareStatement(
            "SELECT id_usuario, nombres, apellidos, usuario, contraseña, estado FROM USUARIO " +
            "WHERE usuario = ? AND contraseña = ? AND estado = 'A'");
        ps.setString(1, usuario);
        ps.setString(2, contraseña);
        rs = ps.executeQuery();
        if (rs.next()) {
            usu = new UsuarioDTO();
            usu.setIdusuario(rs.getInt(1));
            usu.setNombres(rs.getString(2));
            usu.setApellidos(rs.getString(3));
            usu.setNombreUsuario(rs.getString(4));
            usu.setContraseña(rs.getString(5));
            usu.setEstado(rs.getString(6));
        }
        rs.close();
        ps.close();
    } catch (Exception e) {
        Mensajes.M1("Error en login: " + e);
    }
    return usu;
}
    
}
