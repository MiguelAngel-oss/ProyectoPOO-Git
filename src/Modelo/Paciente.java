package Modelo;

import java.time.LocalDate;

public class Paciente extends Persona {
    private int idPaciente;
    private String tipoSangre;
    private String talla;
    private String peso;
    private String Ecivil;
    private LocalDate fecharegistro;
    
    public Paciente(){}

    public int getIdPaciente() {return idPaciente;}
    public void setIdPaciente(int idPaciente) {this.idPaciente = idPaciente;}
    public String getTipoSangre() {return tipoSangre;}
    public void setTipoSangre(String tipoSangre) {this.tipoSangre = tipoSangre;}
    public String getTalla() {return talla;}
    public void setTalla(String talla) {this.talla = talla;}
    public String getPeso() {return peso;}
    public void setPeso(String peso) {this.peso = peso;}
    public LocalDate getFecharegistro() {return fecharegistro;}
    public void setFecharegistro(LocalDate fecharegistro) {this.fecharegistro = fecharegistro;} 
    public String getEcivil() {return Ecivil;}
    public void setEcivil(String Ecivil) {this.Ecivil = Ecivil;}
}
