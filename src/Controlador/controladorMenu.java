package Controlador;
import java.awt.Font;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;

public class controladorMenu {

    // Atributos públicos o con getters
    public JMenuItem itemgestionarUsuario;
    public JMenuItem itemAñadirPaciente;
    public JMenuItem itemAñadirDoctor;
    public JMenuItem itemEspecialidadAtencion;
    public JMenuItem itemRegistroHistoriaClinica;
    public JMenuItem itemDetallesAtencionEsp;
    public JMenuItem itemVisualizarDia;
    public JMenuItem itemVisualizarporFechaEsp;

    private JFrame framePrincipal; // Referencia al formulario principal

    public controladorMenu(JFrame framePrincipal) {
        this.framePrincipal = framePrincipal;
    }

    public JMenuBar crearMenu() {
        JMenuBar mbMenu = new JMenuBar();
        mbMenu.setBackground(new Color(135, 206, 250)); // Light Sky Blue
        Font fuenteGrande = new Font("Segoe UI", Font.BOLD, 19);

        // --- Menú Usuario
        JMenu Usuario = new JMenu("Usuario");
        Usuario.setFont(fuenteGrande);
        itemgestionarUsuario = new JMenuItem("Gestionar Usuario");
        Usuario.add(itemgestionarUsuario);

        // --- Menú Paciente
        JMenu Paciente = new JMenu("Paciente");
        Paciente.setFont(fuenteGrande);
        itemAñadirPaciente = new JMenuItem("Añadir Paciente");
        Paciente.add(itemAñadirPaciente);

        // --- Menú Doctor
        JMenu Doctor = new JMenu("Doctor");
        Doctor.setFont(fuenteGrande);
        itemAñadirDoctor = new JMenuItem("Añadir Doctor");
        Doctor.add(itemAñadirDoctor);

        // --- Menú Especialidades
        JMenu Especialidades = new JMenu("Especialidades");
        Especialidades.setFont(fuenteGrande);
        itemEspecialidadAtencion = new JMenuItem("Especialidad Atencion");
        Especialidades.add(itemEspecialidadAtencion);

        // --- Menú Historia Clínica
        JMenu HistoriaClinica = new JMenu("Historia Clinica");
        HistoriaClinica.setFont(fuenteGrande);
        itemRegistroHistoriaClinica = new JMenuItem("Registrar Historia Clinica");
        itemDetallesAtencionEsp = new JMenuItem("Detalles Atencion Esp");
        HistoriaClinica.add(itemRegistroHistoriaClinica);
        HistoriaClinica.add(itemDetallesAtencionEsp);

        // --- Menú Atención
        JMenu Atencion = new JMenu("Atencion");
        Atencion.setFont(fuenteGrande);
        itemVisualizarDia = new JMenuItem("Visualizar Dia");
        itemVisualizarporFechaEsp = new JMenuItem("Visualizar por Fecha Esp.");
        Atencion.add(itemVisualizarDia);
        Atencion.add(itemVisualizarporFechaEsp);

        // Agregar todos los menús a la barra
        mbMenu.add(Usuario);
        mbMenu.add(Paciente);
        mbMenu.add(Doctor);
        mbMenu.add(Especialidades);
        mbMenu.add(HistoriaClinica);
        mbMenu.add(Atencion);

        return mbMenu;
    }

    public void agregarEventos() {
        itemgestionarUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(framePrincipal, "Gestionar Usuario");
            }
        });

        itemAñadirPaciente.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        AñadirPaciente ventana = new AñadirPaciente(); // Instancia del formulario
        JDesktopPane escritorio = ((Menu) framePrincipal).getDspContenedor(); // Obtener dspContenedor
        escritorio.add(ventana); // Agregar al contenedor
        ventana.toFront(); // Llevar al frente
        ventana.setVisible(true);
            }
        });


        itemAñadirDoctor.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        AñadirDoctor ventana = new AñadirDoctor(); // Instancia del formulario
        JDesktopPane escritorio = ((Menu) framePrincipal).getDspContenedor(); // Obtener dspContenedor
        escritorio.add(ventana); // Agregar al contenedor
        ventana.toFront(); // Llevar al frente
        ventana.setVisible(true);
            }
        });

        
        itemEspecialidadAtencion.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        EspecialidaddeAtencion ventana = new EspecialidaddeAtencion(); // Instancia del formulario
        JDesktopPane escritorio = ((Menu) framePrincipal).getDspContenedor(); // Obtener dspContenedor
        escritorio.add(ventana); // Agregar al contenedor
        ventana.toFront(); // Llevar al frente
        ventana.setVisible(true);
            }
        });
         
        
        itemRegistroHistoriaClinica.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        RegistroHistoriaClinica ventana = new RegistroHistoriaClinica(); // Instancia del formulario
        JDesktopPane escritorio = ((Menu) framePrincipal).getDspContenedor(); // Obtener dspContenedor
        escritorio.add(ventana); // Agregar al contenedor
        ventana.toFront(); // Llevar al frente
        ventana.setVisible(true);
            }
        });
        
        itemDetallesAtencionEsp.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        HistoriaClinica ventana = new HistoriaClinica(); // Instancia del formulario
        JDesktopPane escritorio = ((Menu) framePrincipal).getDspContenedor(); // Obtener dspContenedor
        escritorio.add(ventana); // Agregar al contenedor
        ventana.toFront(); // Llevar al frente
        ventana.setVisible(true);
            }
        });
        
        
        itemVisualizarDia.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        VisualizarDia ventana = new VisualizarDia(); // Instancia del formulario
        JDesktopPane escritorio = ((Menu) framePrincipal).getDspContenedor(); // Obtener dspContenedor
        escritorio.add(ventana); // Agregar al contenedor
        ventana.toFront(); // Llevar al frente
        ventana.setVisible(true);
            }
        });
        
        itemVisualizarporFechaEsp.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        VisualizarporFechaEspecialidad ventana = new VisualizarporFechaEspecialidad(); // Instancia del formulario
        JDesktopPane escritorio = ((Menu) framePrincipal).getDspContenedor(); // Obtener dspContenedor
        escritorio.add(ventana); // Agregar al contenedor
        ventana.toFront(); // Llevar al frente
        ventana.setVisible(true);
            }
        });
    }
    
}
