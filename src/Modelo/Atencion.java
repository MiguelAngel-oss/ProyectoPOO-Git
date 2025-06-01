package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Atencion {
   int idAtencion;
   Doctor doctor;                 // COMPOSICIÓN con doctor y especialidad
   LocalDate fechaAtencion;
   LocalTime horaAtencion;
   String motivoConsulta;
   String diagnostico;
   String tratamiento;
   String observaciones;
 
}
