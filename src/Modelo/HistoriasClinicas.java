
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class HistoriasClinicas {
   private int idHistoria;
   private int numeroHistoria;
   private LocalDate fechaCreacion;
   private String observaciones;
   private Paciente paciente;
   private ArrayList<Atencion> listaA;
   
   public HistoriasClinicas(){
   listaA = new ArrayList();
   }

    public int getIdHistoria() {return idHistoria;}
    public void setIdHistoria(int idHistoria) {this.idHistoria = idHistoria;}
    public int getNumeroHistoria() {return numeroHistoria;}
    public void setNumeroHistoria(int numeroHistoria) {this.numeroHistoria = numeroHistoria;}
    public LocalDate getFechaCreacion() {return fechaCreacion;}
    public void setFechaCreacion(LocalDate fechaCreacion) {this.fechaCreacion = fechaCreacion;}
    public String getObservaciones() {return observaciones;}
    public void setObservaciones(String observaciones) {this.observaciones = observaciones;}
    public Paciente getPaciente() {return paciente;}
    public void setPaciente(Paciente paciente) {this.paciente = paciente;}
    public ArrayList<Atencion> getListaA() {return listaA;}
    public void setListaA(ArrayList<Atencion> listaA) {this.listaA = listaA;}
   
}
