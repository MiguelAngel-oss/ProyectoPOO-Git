package Modelo;

import java.time.LocalDate;

public class Doctor extends Persona {
  private int idDoctor;
  private String correo;
  private String numeroColegiatura;
  private String universidad;
  private int añosExp;
  private String gradoA;
  private Especialidad especialidad; // COMPOSICIÓN en lugar de int idEspecialidad
  private LocalDate fechaRegistro;

  public Doctor(){}

    public int getIdDoctor() {return idDoctor;}
    public void setIdDoctor(int idDoctor) {this.idDoctor = idDoctor;}
    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;}
    public String getNumeroColegiatura() {return numeroColegiatura;}
    public void setNumeroColegiatura(String numeroColegiatura) {this.numeroColegiatura = numeroColegiatura;}
    public String getUniversidad() {return universidad;}
    public void setUniversidad(String universidad) {this.universidad = universidad;}
    public int getAñosExp() {return añosExp;}
    public void setAñosExp(int añosExp) {this.añosExp = añosExp;}
    public String getGradoA() {return gradoA;}
    public void setGradoA(String gradoA) {this.gradoA = gradoA;}
    public Especialidad getEspecialidad() {return especialidad;}
    public void setEspecialidad(Especialidad especialidad) {this.especialidad = especialidad;}
    public LocalDate getFechaRegistro() {return fechaRegistro;}
    public void setFechaRegistro(LocalDate fechaRegistro) {this.fechaRegistro = fechaRegistro;}  
}
