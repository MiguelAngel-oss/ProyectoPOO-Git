package Modelo;

public class Usuario {
    private int idusuario;
    private String nombres;
    private String apellidos;
    private String nombreUsuario;
    private String contraseña;
    
    public Usuario(){}

    public int getIdusuario() {return idusuario;}
    public void setIdusuario(int idusuario) {this.idusuario = idusuario;}
    public String getNombreUsuario() {return nombreUsuario;}
    public void setNombreUsuario(String nombreUsuario) {this.nombreUsuario = nombreUsuario;}
    public String getContraseña() {return contraseña;}
    public void setContraseña(String contraseña) {this.contraseña = contraseña;}
    public String getNombres() {return nombres;}
    public void setNombres(String nombres) {this.nombres = nombres;}
    public String getApellidos() {return apellidos;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}   
       
}
