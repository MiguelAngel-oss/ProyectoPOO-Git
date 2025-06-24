package DTO;

public class UsuarioDTO {
    private int idusuario;
    private String nombres;
    private String apellidos;
    private String nombreUsuario;
    private String contraseña;
    private String estado;
    
    public UsuarioDTO(){}

    public int getIdusuario() {return idusuario;}
    public void setIdusuario(int idusuario) {this.idusuario = idusuario;}
    public String getNombreUsuario() {return nombreUsuario;}
    public void setNombreUsuario(String nombreUsuario) {this.nombreUsuario = nombreUsuario;}
    public String getContraseña() {return contraseña;}
    public void setContraseña(String contraseña) {this.contraseña = contraseña;}
    public String getNombres() {return nombres;}
    public void setNombres(String nombres) {this.nombres = nombres;}
    public String getApellidos() {return apellidos;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;} public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}
        
    public Object[] Registrousuario(int num){
        Object[] fila= {num,idusuario,nombres,apellidos,nombreUsuario,contraseña,estado};
        return fila;
    }
}
