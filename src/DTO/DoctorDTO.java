package DTO;

import java.time.LocalDate;

public class DoctorDTO extends PersonaDTO {
    
  private int idDoctor;
  private String correo;
  private String numeroColegiatura;
  private String universidad;
  private int añosExp;
  private String gradoA;
  private EspecialidadesDTO especialidad; // COMPOSICIÓN en lugar de int idEspecialidad
  private LocalDate fechaRegistro;
  
  public DoctorDTO(){}
  
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
    public EspecialidadesDTO getEspecialidad() {return especialidad;}
    public void setEspecialidad(EspecialidadesDTO especialidad) {this.especialidad = especialidad;}
    public LocalDate getFechaRegistro() {return fechaRegistro;}
    public void setFechaRegistro(LocalDate fechaRegistro) {this.fechaRegistro = fechaRegistro;}  

     public Object[] Registrodoctor (int num){
        Object[] fila= {num,idDoctor,nombres,apellidos,dni,sexo,fechaN,telefono,direccion,
                       correo,numeroColegiatura,universidad,añosExp,gradoA,especialidad,fechaRegistro};
        return fila;
    }
    
}
