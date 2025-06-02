package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.*;
import Vista.*;
import Formatos.*;
import Persistencia.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class ControladorLogin implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public boolean loginUser(Usuario us) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String sql = "select usuario, contraseña from USUARIO where USUARIO = '" + us.getNombreUsuario() + "'and contraseña = '" + us.getContraseña() + "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesion");
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
        }
        return respuesta;
    }
}
