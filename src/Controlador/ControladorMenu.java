package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import Vista.*;

public class ControladorMenu implements ActionListener {

    Menu vista;

    public ControladorMenu(Menu mn) {
        vista = mn;
        vista.ItemAñadirPaciente.addActionListener(this);
        vista.ItemAñadirDoctor.addActionListener(this);
        vista.ItemAñadirEspecialidad.addActionListener(this);
        vista.ItemRegistrarHistoriaClinica.addActionListener(this);
        vista.ItemMantenimientoHC.addActionListener(this);
        vista.ItemVisualizarDia.addActionListener(this);
        vista.ItemVisualizarFechaEspecialidad.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.ItemAñadirPaciente) {
            mostrarUnicoFormulario(new AñadirPaciente());
        }
        if (e.getSource() == vista.ItemAñadirDoctor) {
            mostrarUnicoFormulario(new AñadirDoctor());
        }
        if (e.getSource() == vista.ItemAñadirEspecialidad) {
            mostrarUnicoFormulario(new EspecialidaddeAtencion());
        }
        if (e.getSource() == vista.ItemRegistrarHistoriaClinica) {
            mostrarUnicoFormulario(new RegistroHistoriaClinica());
        }
        if (e.getSource() == vista.ItemMantenimientoHC) {
            mostrarUnicoFormulario(new HistoriaClinica());
        }
        if (e.getSource() == vista.ItemVisualizarDia) {
            mostrarUnicoFormulario(new VisualizarDia());
        }
        if (e.getSource() == vista.ItemVisualizarFechaEspecialidad) {
            mostrarUnicoFormulario(new VisualizarporFechaEspecialidad());
        }
    }

    // Método para cerrar cualquier formulario abierto en el contenedor
    private void cerrarFormularios() {
        for (java.awt.Component comp : vista.dspContenedor.getComponents()) {
            if (comp instanceof JInternalFrame) {
                ((JInternalFrame) comp).dispose();
            }
        }
    }

    // Método que asegura que solo se muestre un formulario a la vez...
    private void mostrarUnicoFormulario(JInternalFrame ventana) {
        cerrarFormularios(); // Cierra los formularios existentes
        vista.dspContenedor.add(ventana);
        ventana.setVisible(true);
        ventana.toFront();
    }
}