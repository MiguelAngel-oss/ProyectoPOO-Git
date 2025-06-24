package DTO;

public abstract class PersonaDTO {
    protected String nombres;
    protected String apellidos;
    protected String dni;
    protected String sexo;
    protected String fechaN;
    protected String telefono;
    protected String direccion;
    
    public PersonaDTO(){}
    
    public String getNombres() {return nombres;}
    public void setNombres(String nombres) {this.nombres = nombres;}
    public String getApellidos() {return apellidos;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni = dni;}
    public String getSexo() {return sexo;}
    public void setSexo(String sexo) {this.sexo = sexo;}
    public String getFechaN() {return fechaN;}
    public void setFechaN(String fechaN) {this.fechaN = fechaN;}
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}      
    
}
