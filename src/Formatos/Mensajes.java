package Formatos;

import javax.swing.JOptionPane;

public class Mensajes {
       
    public static void M1 (String msj){
        JOptionPane.showMessageDialog(null, msj);
    }

    public static String M2 (String msj){
        return JOptionPane.showInputDialog( msj);
    }
    
    public static int M3 (String titulo, String msj){
        return  JOptionPane.showConfirmDialog(null, msj,titulo,
                                             JOptionPane.OK_CANCEL_OPTION);
    } 
}
