package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Atencion {
   private int idAtencion;
   private Doctor doctor;                 // COMPOSICIÓN con doctor y especialidad
   private LocalDate fechaAtencion;
   private LocalTime horaAtencion;
   private String motivoConsulta;
   private String diagnostico;
   private String tratamiento;
   private String observaciones;
 
   
   public Atencion(){}

    public int getIdAtencion() {return idAtencion;}
    public void setIdAtencion(int idAtencion) {this.idAtencion = idAtencion;}
    public Doctor getDoctor() {return doctor;}
    public void setDoctor(Doctor doctor) {this.doctor = doctor;}
    public LocalDate getFechaAtencion() {return fechaAtencion;}
    public void setFechaAtencion(LocalDate fechaAtencion) {this.fechaAtencion = fechaAtencion;}
    public LocalTime getHoraAtencion() {return horaAtencion;}
    public void setHoraAtencion(LocalTime horaAtencion) {this.horaAtencion = horaAtencion;}
    public String getMotivoConsulta() {return motivoConsulta;}
    public void setMotivoConsulta(String motivoConsulta) {this.motivoConsulta = motivoConsulta;}
    public String getDiagnostico() {return diagnostico;}
    public void setDiagnostico(String diagnostico) {this.diagnostico = diagnostico;}
    public String getTratamiento() {return tratamiento;}
    public void setTratamiento(String tratamiento) {this.tratamiento = tratamiento;}
    public String getObservaciones() {return observaciones;}
    public void setObservaciones(String observaciones) {this.observaciones = observaciones;}
   
}
