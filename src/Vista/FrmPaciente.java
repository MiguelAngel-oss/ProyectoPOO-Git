
package Vista;

public class FrmPaciente extends javax.swing.JInternalFrame {

    public FrmPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEliminarP = new javax.swing.JButton();
        txtSexo = new javax.swing.JTextField();
        txtDniP = new javax.swing.JTextField();
        txtApellidosP = new javax.swing.JTextField();
        txtFechaNP = new javax.swing.JTextField();
        txtTelefonoP = new javax.swing.JTextField();
        txtidpaciente = new javax.swing.JTextField();
        btnRegistrarP = new javax.swing.JButton();
        btnConsultarP = new javax.swing.JButton();
        btnActualizarP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldatos = new javax.swing.JTable();
        txtTallaP = new javax.swing.JTextField();
        txtTiposangre = new javax.swing.JTextField();
        txtEstadocivilP = new javax.swing.JTextField();
        txtNombresP = new javax.swing.JTextField();
        txtPesoP = new javax.swing.JTextField();
        txtDireccionP = new javax.swing.JTextField();
        dtFechaRegistro = new com.github.lgooddatepicker.components.DatePicker();
        jlblCantidadRegistros = new javax.swing.JLabel();
        dtFechaNacimiento = new com.github.lgooddatepicker.components.DatePicker();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarP.setText("ELIMINAR PACIENTE");
        jPanel1.add(btnEliminarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 180, 50));

        txtSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 160, 50));

        txtDniP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.add(txtDniP, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 160, 50));

        txtApellidosP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellidos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.add(txtApellidosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 160, 50));

        txtFechaNP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha Nacimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.add(txtFechaNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 470, 180, 50));

        txtTelefonoP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.add(txtTelefonoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 160, 50));

        txtidpaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.add(txtidpaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 160, 50));

        btnRegistrarP.setText("REGISTRAR PACIENTE");
        jPanel1.add(btnRegistrarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 180, 50));

        btnConsultarP.setText("CONSULTAR PACIENTE");
        jPanel1.add(btnConsultarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 180, 50));

        btnActualizarP.setText("ACTUALIZAR PACIENTE");
        jPanel1.add(btnActualizarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 180, 50));

        tbldatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbldatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1060, 370));

        txtTallaP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Talla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.add(txtTallaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 160, 50));

        txtTiposangre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Sangre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.add(txtTiposangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 160, 50));

        txtEstadocivilP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado Civil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.add(txtEstadocivilP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, 160, 50));

        txtNombresP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.add(txtNombresP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 160, 50));

        txtPesoP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Peso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.add(txtPesoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 160, 50));

        txtDireccionP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Direccion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.add(txtDireccionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 160, 50));

        dtFechaRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de Registro"));
        jPanel1.add(dtFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 530, 180, 50));

        jlblCantidadRegistros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlblCantidadRegistros.setText("Cantidad de Registros:");
        jPanel1.add(jlblCantidadRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 380, 170, 30));

        dtFechaNacimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de Nacimiento"));
        jPanel1.add(dtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 410, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarP;
    public javax.swing.JButton btnConsultarP;
    public javax.swing.JButton btnEliminarP;
    public javax.swing.JButton btnRegistrarP;
    public com.github.lgooddatepicker.components.DatePicker dtFechaNacimiento;
    public com.github.lgooddatepicker.components.DatePicker dtFechaRegistro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel jlblCantidadRegistros;
    public javax.swing.JTable tbldatos;
    public javax.swing.JTextField txtApellidosP;
    public javax.swing.JTextField txtDireccionP;
    public javax.swing.JTextField txtDniP;
    public javax.swing.JTextField txtEstadocivilP;
    public javax.swing.JTextField txtFechaNP;
    public javax.swing.JTextField txtNombresP;
    public javax.swing.JTextField txtPesoP;
    public javax.swing.JTextField txtSexo;
    public javax.swing.JTextField txtTallaP;
    public javax.swing.JTextField txtTelefonoP;
    public javax.swing.JTextField txtTiposangre;
    public javax.swing.JTextField txtidpaciente;
    // End of variables declaration//GEN-END:variables
}
