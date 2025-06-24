package Controlador;

import Formatos.CentrarForma;
import Principal.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class ControladorMenu implements ActionListener {

    FormularioMenu vista;

    public ControladorMenu(FormularioMenu mn) {
        vista = mn;
        vista.ItemAdministrarUsuarios.addActionListener(this);
        vista.ItemAñadirPaciente.addActionListener(this);
        vista.ItemAñadirDoctor.addActionListener(this);
        vista.ItemAñadirEspecialidad.addActionListener(this);
        vista.ItemRegistrarHistoriaClinica.addActionListener(this);
        vista.ItemMantenimientoHC.addActionListener(this);
        vista.ItemVisualizarDia.addActionListener(this);
        vista.ItemVisualizarFechaEspecialidad.addActionListener(this);
        mn.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mn.setDefaultCloseOperation(mn.EXIT_ON_CLOSE);
        mn.setVisible(true);
        mn.setTitle("Aplicación de Registro de Historias Clinicas");  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.ItemAdministrarUsuarios) {
            Main.fu = new FrmUsuarios();
            Main.controlfu = new ControladorFrmUsuario(Main.fu);
            vista.dspContenedor.add(Main.fu);
            CentrarForma.CPanel(vista.dspContenedor,Main.fu);
        }
        if (e.getSource() == vista.ItemAñadirPaciente) {
            Main.fp = new FrmPaciente();
            Main.controlpac = new ControladorFrmPaciente(Main.fp);
            vista.dspContenedor.add(Main.fp);
            CentrarForma.CPanel(vista.dspContenedor,Main.fu);
        }
        if (e.getSource() == vista.ItemAñadirDoctor) {
        }
        if (e.getSource() == vista.ItemAñadirEspecialidad) {
        }
        if (e.getSource() == vista.ItemRegistrarHistoriaClinica) {
        }
        if (e.getSource() == vista.ItemMantenimientoHC) {
        }
        if (e.getSource() == vista.ItemVisualizarDia) {
        }
        if (e.getSource() == vista.ItemVisualizarFechaEspecialidad) {
        }
    }

    // Método que asegura que solo se muestre un formulario a la vez
    private void mostrarUnicoFormulario(JInternalFrame ventana) {
        cerrarFormularios(); // Cierra los formularios existentes
        vista.dspContenedor.add(ventana);
        ventana.setVisible(true);
        ventana.toFront();
    }
    
     // Método para cerrar cualquier formulario abierto en el contenedor
    private void cerrarFormularios() {
        for (java.awt.Component comp : vista.dspContenedor.getComponents()) {
            if (comp instanceof JInternalFrame) {
                ((JInternalFrame) comp).dispose();
            }
        }
    }
}