
package Vista;
import Controlador.*;
import javax.swing.JDesktopPane;
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
          controladorMenu menu = new controladorMenu(this); // Pasar referencia al JFrame
        setJMenuBar(menu.crearMenu());
        menu.agregarEventos(); // Agrega los eventos separados del constructor

        setTitle("Sistema de Gestión Médica");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dspContenedor = new javax.swing.JDesktopPane();
        mbMenu = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1100, 635));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dspContenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dspContenedorLayout = new javax.swing.GroupLayout(dspContenedor);
        dspContenedor.setLayout(dspContenedorLayout);
        dspContenedorLayout.setHorizontalGroup(
            dspContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        dspContenedorLayout.setVerticalGroup(
            dspContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        getContentPane().add(dspContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 630));
        setJMenuBar(mbMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
 public JDesktopPane getDspContenedor() {
    return dspContenedor;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dspContenedor;
    private javax.swing.JMenuBar mbMenu;
    // End of variables declaration//GEN-END:variables
}
