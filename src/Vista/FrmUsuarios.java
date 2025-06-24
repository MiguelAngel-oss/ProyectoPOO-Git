package Vista;
import Controlador.ControladorFrmUsuario;
public class FrmUsuarios extends javax.swing.JInternalFrame {

    public FrmUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        btnConsultarU = new javax.swing.JButton();
        btnActualizarU = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtidUsuario = new javax.swing.JTextField();
        txtNombresU = new javax.swing.JTextField();
        txtApellidosU = new javax.swing.JTextField();
        txtUsuarioU = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtContraseñaU = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnEliminarU = new javax.swing.JButton();
        jlblCantidaddeUsuarios = new javax.swing.JLabel();
        btnAñadirU = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtblDatos);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 600, 520));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 540));

        btnConsultarU.setText("Consultar");
        jPanel1.add(btnConsultarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 150, 50));

        btnActualizarU.setText("Actualizar");
        jPanel1.add(btnActualizarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 150, 50));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtidUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 250, 40));
        jPanel3.add(txtNombresU, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, 40));
        jPanel3.add(txtApellidosU, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, 40));
        jPanel3.add(txtUsuarioU, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 250, 40));

        jLabel1.setText("ID Usuario");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel2.setText("Nombres");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3.setText("Apellidos");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setText("Usuario");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        jPanel3.add(txtContraseñaU, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 250, 40));

        jLabel5.setText("Contraseña");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 290, 400));

        btnEliminarU.setText("Eliminar");
        jPanel1.add(btnEliminarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 140, 50));

        jlblCantidaddeUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        jlblCantidaddeUsuarios.setText("Cantidad de Usuarios");
        jPanel1.add(jlblCantidaddeUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, -1, -1));

        btnAñadirU.setText("Añadir");
        jPanel1.add(btnAñadirU, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarU;
    public javax.swing.JButton btnAñadirU;
    public javax.swing.JButton btnConsultarU;
    public javax.swing.JButton btnEliminarU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel jlblCantidaddeUsuarios;
    public javax.swing.JTable jtblDatos;
    public javax.swing.JTextField txtApellidosU;
    public javax.swing.JTextField txtContraseñaU;
    public javax.swing.JTextField txtNombresU;
    public javax.swing.JTextField txtUsuarioU;
    public javax.swing.JTextField txtidUsuario;
    // End of variables declaration//GEN-END:variables
}
