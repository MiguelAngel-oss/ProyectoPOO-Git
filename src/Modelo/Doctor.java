package Modelo;

import java.time.LocalDate;

public class Doctor {
  int idDoctor;
  String nombreDoc;
  String apellidosDoc;
  String telefono;
  String correo;
  LocalDate fechaRegistro;
  String numeroColegiatura;
  Especialidad especialidad; // COMPOSICIÓN en lugar de int idEspecialidad

  public Doctor(){
  }
}
