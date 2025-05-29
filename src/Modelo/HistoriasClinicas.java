
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class HistoriasClinicas {
   int idHistoria;
   int numeroHistoria;
   LocalDate fechaCreacion;
   String observaciones;
   ArrayList<Atencion> listaA;
   
   public HistoriasClinicas(){
   listaA = new ArrayList();
   }
   
}
