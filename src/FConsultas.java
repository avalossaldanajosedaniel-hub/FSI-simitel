
import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class FConsultas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FConsultas.class.getName());
    
   Conexion2 cnx = new Conexion2();
   
    String todo = "SELECT * FROM consultas";
    public FConsultas() {
        initComponents();
        
       
        setLocationRelativeTo(this);
        
        if (cnx.conectar("127.0.0.1", "simitel", "root", "")==1) {
            cnx.entablar(todo, TConsultas);
        } else {
            JOptionPane.showMessageDialog(this, "Error al entar a la base de datos");
            System.exit(0);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        BRegistar = new javax.swing.JButton();
        BActualizar = new javax.swing.JButton();
        BBorrar = new javax.swing.JButton();
        TValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultas = new javax.swing.JTable();
        TFECHA = new javax.swing.JTextField();
        TPeso = new javax.swing.JTextField();
        TEstatura = new javax.swing.JTextField();
        TPresion_arterial = new javax.swing.JTextField();
        TSintomas = new javax.swing.JTextField();
        TDiagnostico = new javax.swing.JTextField();
        TEstado = new javax.swing.JTextField();
        TPacienteCodigo = new javax.swing.JTextField();
        TCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de medicamentos");

        jToolBar1.setBackground(new java.awt.Color(204, 0, 51));
        jToolBar1.setRollover(true);

        BRegistar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BRegistar.setText("Registrar");
        BRegistar.setFocusable(false);
        BRegistar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BRegistar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BRegistar.addActionListener(this::BRegistarActionPerformed);
        jToolBar1.add(BRegistar);

        BActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BActualizar.setText("Actualizar");
        BActualizar.setFocusable(false);
        BActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(BActualizar);

        BBorrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BBorrar.setText("Borrar");
        BBorrar.setFocusable(false);
        BBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(BBorrar);

        TValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TValorKeyPressed(evt);
            }
        });
        jToolBar1.add(TValor);

        TConsultas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TConsultas);

        TFECHA.setText("FECHA");
        TFECHA.addActionListener(this::TFECHAActionPerformed);

        TPeso.setText("PESO");

        TEstatura.setText("ESTATURA");

        TPresion_arterial.setText("PRESION");

        TSintomas.setText("SINTOMAS");

        TDiagnostico.setText("DIAGNOSTICO");

        TEstado.setText("ESTADO");

        TPacienteCodigo.setText("PACIENTE CODIGO");

        TCedula.setText("CEDULA");

        jLabel1.setText("FOLIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TPresion_arterial, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TFECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(TDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(TEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TPacienteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TPresion_arterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TPacienteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(TCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TValorKeyPressed
        char tecla = evt.getKeyChar();
        if (tecla == '\n') {

            String sql = "{call filtar_consultas(?)}";

            try {
                CallableStatement cs = (CallableStatement) cnx.con.prepareCall(sql);
                cs.setString(1, TValor.getText());
                cs.execute();

            } catch (SQLException e) {
                System.err.println("Error al llamar al procedimiento");
            }
        }
    }//GEN-LAST:event_TValorKeyPressed

    private void BRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegistarActionPerformed
    String sql = "{CALL sp_insertar_consulta(?, ?, ?, ?, ?, ?, ?, ?, ?)}";

    try (java.sql.CallableStatement cs = cnx.con.prepareCall(sql)) {

        cs.setTimestamp(1,
            java.sql.Timestamp.valueOf(TFECHA.getText().trim()));

        cs.setFloat(2,
            Float.parseFloat(TPeso.getText().trim()));

        cs.setFloat(3,
            Float.parseFloat(TEstatura.getText().trim()));

        cs.setString(4, TPresion_arterial.getText().trim());
        cs.setString(5, TSintomas.getText().trim());
        cs.setString(6, TDiagnostico.getText().trim());
        cs.setString(7, TEstado.getText().trim());
        cs.setString(8, TPacienteCodigo.getText().trim());
        cs.setString(9, TCedula.getText().trim());

        cs.execute();
        System.out.println("Paciente: [" + TPacienteCodigo.getText() + "]");
        System.out.println("Medico: [" + TCedula.getText() + "]");

        JOptionPane.showMessageDialog(this,
            "Consulta registrada correctamente");

        cnx.entablar(todo, TConsultas);

    } catch (Exception ex) {

        JOptionPane.showMessageDialog(this,
            "Error al registrar: " + ex.getMessage());
    }


    }//GEN-LAST:event_BRegistarActionPerformed

    private void TFECHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFECHAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFECHAActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FConsultas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BActualizar;
    private javax.swing.JButton BBorrar;
    private javax.swing.JButton BRegistar;
    private javax.swing.JTextField TCedula;
    private javax.swing.JTable TConsultas;
    private javax.swing.JTextField TDiagnostico;
    private javax.swing.JTextField TEstado;
    private javax.swing.JTextField TEstatura;
    private javax.swing.JTextField TFECHA;
    private javax.swing.JTextField TPacienteCodigo;
    private javax.swing.JTextField TPeso;
    private javax.swing.JTextField TPresion_arterial;
    private javax.swing.JTextField TSintomas;
    private javax.swing.JTextField TValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
