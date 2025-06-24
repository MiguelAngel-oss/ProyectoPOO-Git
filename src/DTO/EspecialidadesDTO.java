package DTO;

public class EspecialidadesDTO {
    private int idEspecialidad;
    private String nombreEspecialidad;  
    private String descripcion;
    
    public EspecialidadesDTO(){}

    public int getIdEspecialidad() {return idEspecialidad;}
    public void setIdEspecialidad(int idEspecialidad) {this.idEspecialidad = idEspecialidad;}
    public String getNombreEspecialidad() { return nombreEspecialidad;}
    public void setNombreEspecialidad(String nombreEspecialidad) {this.nombreEspecialidad = nombreEspecialidad;}
    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
}
