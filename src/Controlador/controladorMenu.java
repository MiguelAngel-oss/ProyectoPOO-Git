package Controlador;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class controladorMenu {
    
    public JMenuBar crearMenu(){
        JMenuBar mbMenu = new JMenuBar();
        
        JMenu Usuario = new JMenu("Usuario");
        JMenuItem itemgestionarUsuario = new JMenuItem("Gestionar Usuario");
        Usuario.add(itemgestionarUsuario);
        
        JMenu Paciente = new JMenu("Paciente");
        JMenuItem itemAñadirPaciente= new JMenuItem("Añadir Paciente");
        JMenuItem itemmantenimientoPaciente = new JMenuItem("pantenimiento Paciente");
        Paciente.add(itemAñadirPaciente);
        Paciente.add(itemmantenimientoPaciente);
        
        JMenu Doctor = new JMenu("Doctor");
        JMenuItem itemAñadirDoctor = new JMenuItem("Añadir Doctor");
        JMenuItem itemmantenimientoDoctor = new JMenuItem("Mantenimiento Doctor");
        Doctor.add(itemAñadirDoctor);
        Doctor.add(itemmantenimientoDoctor);
        
        JMenu Especialidades = new JMenu("Especialidades");
        JMenuItem itemEspecialidadAtencion = new JMenuItem("Especialidad Atencion");
        JMenuItem itemMantenimientoEspecialidad = new JMenuItem("Mantenimiento Especialidad");
        Especialidades.add(itemEspecialidadAtencion);
        Especialidades.add(itemMantenimientoEspecialidad);
        
        JMenu HistoriaClinica = new JMenu("Historia Clinica");
        JMenuItem itemRegistroHistoriaClinica = new JMenuItem("Registrar Historia Clinica");
        JMenuItem itemDetallesAtencionEsp = new JMenuItem("Detalles Atencion Esp");
        JMenuItem itemgenerarPDF = new JMenuItem("Generar PDF");
        HistoriaClinica.add(itemRegistroHistoriaClinica);
        HistoriaClinica.add(itemDetallesAtencionEsp );
        HistoriaClinica.add(itemgenerarPDF);
        
        JMenu Atencion = new JMenu("Atencion");
        JMenuItem itemVisualizarDia = new JMenuItem("Visualizar Dia");
        JMenuItem itemVisualizarporFechaEsp= new JMenuItem("Visualizar por Feha Esp");
        Atencion.add(itemVisualizarDia );
        Atencion.add(itemVisualizarporFechaEsp);
        
        mbMenu.add(Usuario);
        mbMenu.add(Paciente);
        mbMenu.add(Doctor);
        mbMenu.add(Especialidades);
        mbMenu.add(HistoriaClinica);
        mbMenu.add(Atencion);
        
        return mbMenu;
    }
}
