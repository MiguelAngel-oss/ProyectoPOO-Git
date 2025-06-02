    package Modelo;

import java.time.LocalDate;

public class Paciente {
    private int idPaciente;
    private String dni;
    private String nombrePaciente;
    private String apellidosPaciente;
    private LocalDate fechaNacimiento;
    private String genero;
    private String telefono;
    private String correo;
    private String direccion;
    private LocalDate fecharegistro;
    private String tipoSangre;
    
    public Paciente(){}

    public int getIdPaciente() {return idPaciente;}
    public void setIdPaciente(int idPaciente) {this.idPaciente = idPaciente;}
    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni = dni;}
    public String getNombrePaciente() {return nombrePaciente;}
    public void setNombrePaciente(String nombrePaciente) {this.nombrePaciente = nombrePaciente;}
    public String getApellidosPaciente() {return apellidosPaciente;}
    public void setApellidosPaciente(String apellidosPaciente) {this.apellidosPaciente = apellidosPaciente;}
    public LocalDate getFechaNacimiento() {return fechaNacimiento;}
    public void setFechaNacimiento(LocalDate fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;}
    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    public LocalDate getFecharegistro() {return fecharegistro;}
    public void setFecharegistro(LocalDate fecharegistro) {this.fecharegistro = fecharegistro;}
    public String getTipoSangre() {return tipoSangre;}
    public void setTipoSangre(String tipoSangre) {this.tipoSangre = tipoSangre;}
    
}
