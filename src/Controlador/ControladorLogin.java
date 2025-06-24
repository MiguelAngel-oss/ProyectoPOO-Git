package Controlador;

import DAO.DAOusuarios;
import DTO.UsuarioDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import Formatos.*;
import Procesos.ProcesosFrmLogin;

public class ControladorLogin implements ActionListener {
    
    public static FormularioMenu fm;
    public static ControladorMenu controlfm;
    
    FrmLogin vista;
    DAOusuarios dao;
    UsuarioDTO  usu;
    
    public ControladorLogin(FrmLogin fl){
        vista=fl;
        vista.btnIniciarSesion.addActionListener(this);
        ProcesosFrmLogin.Presentacion(fl);
        ProcesosFrmLogin.LimpiarEntradas(fl); 
        dao = new DAOusuarios();
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == vista.btnIniciarSesion) {
        String user = vista.txtUsuario.getText().trim();
        String pass = vista.txtContraseña.getText().trim();
            usu= dao.verificarLogin(user,pass);

            if (usu != null) {
                Mensajes.M1("Bienvenido " + usu.getNombres());
                vista.dispose(); // cerrar login
                //Abrimoos el Formulario Menu con su rpesentacion y metodos correspondientes
                fm = new FormularioMenu();
        controlfm = new ControladorMenu(fm);
            } else {
                Mensajes.M1("Usuario o contraseña incorrectos");
                ProcesosFrmLogin.LimpiarEntradas(vista); // Limpia para volver a intentar
            }
        }
    }

}
