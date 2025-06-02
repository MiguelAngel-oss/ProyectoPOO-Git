package Modelo;

import java.time.LocalDate;

public class Doctor {
  private int idDoctor;
  private String nombreDoc;
  private String apellidosDoc;
  private String telefono;
  private String correo;
  private LocalDate fechaRegistro;
  private String numeroColegiatura;
  private Especialidad especialidad; // COMPOSICIÓN en lugar de int idEspecialidad

  public Doctor(){
  }

    public int getIdDoctor() {return idDoctor;}
    public void setIdDoctor(int idDoctor) {this.idDoctor = idDoctor;}
    public String getNombreDoc() {return nombreDoc;}
    public void setNombreDoc(String nombreDoc) {this.nombreDoc = nombreDoc;}
    public String getApellidosDoc() { return apellidosDoc;}
    public void setApellidosDoc(String apellidosDoc) { this.apellidosDoc = apellidosDoc;}
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;}
    public LocalDate getFechaRegistro() {return fechaRegistro;}
    public void setFechaRegistro(LocalDate fechaRegistro) {this.fechaRegistro = fechaRegistro;}
    public String getNumeroColegiatura() {return numeroColegiatura;}
    public void setNumeroColegiatura(String numeroColegiatura) {this.numeroColegiatura = numeroColegiatura;}
    public Especialidad getEspecialidad() {return especialidad;}
    public void setEspecialidad(Especialidad especialidad) {this.especialidad = especialidad;}
  
}
