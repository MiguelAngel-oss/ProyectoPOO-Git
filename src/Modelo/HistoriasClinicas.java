
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class HistoriasClinicas {
   int idHistoria;
   int numeroHistoria;
   LocalDate fechaCreacion;
   String observaciones;
   Paciente paciente;
   ArrayList<Atencion> listaA;
   
   public HistoriasClinicas(){
   listaA = new ArrayList();
   }
   
}
