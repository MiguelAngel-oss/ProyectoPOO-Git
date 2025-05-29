package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Atencion {
   int idAtencion;
   Doctor doctor;                 // COMPOSICIÓN en lugar de int idDoctor
   Especialidad especialidad;     // COMPOSICIÓN en lugar de int idEspecialidad
   LocalDate fechaAtencion;
   LocalTime horaAtencion;
   String motivoConsulta;
   String diagnostico;
   String tratamiento;
   String observaciones;
 
}
