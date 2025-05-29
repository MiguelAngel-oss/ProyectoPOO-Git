package Modelo;

import java.time.LocalDate;

public class Paciente {
    int idPaciente;
    String dni;
    String nombrePaciente;
    String apellidosPaciente;
    LocalDate fechaNacimiento;
    String genero;
    String telefono;
    String correo;
    String direccion;
    LocalDate fecharegistro;
    String tipoSangre;
    HistoriasClinicas historiaClinica; //se busca historia clinica a travez de dni
    
}
