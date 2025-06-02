package Vista;

import Controlador.ControladorMenu;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        new ControladorMenu(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dspContenedor = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        UsuarioM = new javax.swing.JMenu();
        ItemAdministrarUsuarios = new javax.swing.JMenuItem();
        PacienteM = new javax.swing.JMenu();
        ItemAñadirPaciente = new javax.swing.JMenuItem();
        DoctorM = new javax.swing.JMenu();
        ItemAñadirDoctor = new javax.swing.JMenuItem();
        EspecialidadesM = new javax.swing.JMenu();
        ItemAñadirEspecialidad = new javax.swing.JMenuItem();
        HistoriaClinicaM = new javax.swing.JMenu();
        ItemRegistrarHistoriaClinica = new javax.swing.JMenuItem();
        ItemMantenimientoHC = new javax.swing.JMenuItem();
        AtencionesM = new javax.swing.JMenu();
        ItemVisualizarDia = new javax.swing.JMenuItem();
        ItemVisualizarFechaEspecialidad = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dspContenedorLayout = new javax.swing.GroupLayout(dspContenedor);
        dspContenedor.setLayout(dspContenedorLayout);
        dspContenedorLayout.setHorizontalGroup(
            dspContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        dspContenedorLayout.setVerticalGroup(
            dspContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        UsuarioM.setText("Usuario");
        UsuarioM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        ItemAdministrarUsuarios.setText("Administrar Usuarios");
        UsuarioM.add(ItemAdministrarUsuarios);

        jMenuBar1.add(UsuarioM);

        PacienteM.setText("Paciente");
        PacienteM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        ItemAñadirPaciente.setText("Añadir Paciente");
        ItemAñadirPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAñadirPacienteActionPerformed(evt);
            }
        });
        PacienteM.add(ItemAñadirPaciente);

        jMenuBar1.add(PacienteM);

        DoctorM.setText("Doctor");
        DoctorM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        ItemAñadirDoctor.setText("Añadir Doctor");
        ItemAñadirDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAñadirDoctorActionPerformed(evt);
            }
        });
        DoctorM.add(ItemAñadirDoctor);

        jMenuBar1.add(DoctorM);

        EspecialidadesM.setText("Especialidades");
        EspecialidadesM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        ItemAñadirEspecialidad.setText("Añadir Especialidad");
        EspecialidadesM.add(ItemAñadirEspecialidad);

        jMenuBar1.add(EspecialidadesM);

        HistoriaClinicaM.setText("Historia Clinica");
        HistoriaClinicaM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        ItemRegistrarHistoriaClinica.setText("Registrar Historia Clinica");
        ItemRegistrarHistoriaClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRegistrarHistoriaClinicaActionPerformed(evt);
            }
        });
        HistoriaClinicaM.add(ItemRegistrarHistoriaClinica);

        ItemMantenimientoHC.setText("Mantenimiento Historia Clinica");
        ItemMantenimientoHC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMantenimientoHCActionPerformed(evt);
            }
        });
        HistoriaClinicaM.add(ItemMantenimientoHC);

        jMenuBar1.add(HistoriaClinicaM);

        AtencionesM.setText("Atenciones");
        AtencionesM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        ItemVisualizarDia.setText("Visualizar Dia");
        AtencionesM.add(ItemVisualizarDia);

        ItemVisualizarFechaEspecialidad.setText("Visualizar Fecha/Especialidad");
        AtencionesM.add(ItemVisualizarFechaEspecialidad);

        jMenuBar1.add(AtencionesM);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspContenedor)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dspContenedor)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemAñadirPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAñadirPacienteActionPerformed

    }//GEN-LAST:event_ItemAñadirPacienteActionPerformed

    private void ItemRegistrarHistoriaClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRegistrarHistoriaClinicaActionPerformed
    
    }//GEN-LAST:event_ItemRegistrarHistoriaClinicaActionPerformed

    private void ItemMantenimientoHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMantenimientoHCActionPerformed

    }//GEN-LAST:event_ItemMantenimientoHCActionPerformed

    private void ItemAñadirDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAñadirDoctorActionPerformed

    }//GEN-LAST:event_ItemAñadirDoctorActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu AtencionesM;
    public javax.swing.JMenu DoctorM;
    public javax.swing.JMenu EspecialidadesM;
    public javax.swing.JMenu HistoriaClinicaM;
    public javax.swing.JMenuItem ItemAdministrarUsuarios;
    public javax.swing.JMenuItem ItemAñadirDoctor;
    public javax.swing.JMenuItem ItemAñadirEspecialidad;
    public javax.swing.JMenuItem ItemAñadirPaciente;
    public javax.swing.JMenuItem ItemMantenimientoHC;
    public javax.swing.JMenuItem ItemRegistrarHistoriaClinica;
    public javax.swing.JMenuItem ItemVisualizarDia;
    public javax.swing.JMenuItem ItemVisualizarFechaEspecialidad;
    public javax.swing.JMenu PacienteM;
    public javax.swing.JMenu UsuarioM;
    public javax.swing.JDesktopPane dspContenedor;
    public javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
