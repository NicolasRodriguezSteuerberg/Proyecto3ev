package View;

import Controller.Controller;

/**
 *
 * @author dam1
 */
public class IMenu extends javax.swing.JFrame {

    /**
     * Creates new form pMenu
     */
    public IMenu() {
        initComponents();
        this.setTitle("Sergas Revolution");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        pMenu = new javax.swing.JPanel();
        bMedico = new javax.swing.JButton();
        bPaciente = new javax.swing.JButton();
        eLogo = new javax.swing.JLabel();
        eLogo1 = new javax.swing.JLabel();
        bHospital = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pMenu.setBackground(new java.awt.Color(23, 165, 199));

        bMedico.setBackground(new java.awt.Color(0, 102, 153));
        bMedico.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bMedico.setForeground(new java.awt.Color(255, 255, 255));
        bMedico.setText("MÉDICO");
        bMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMedicoActionPerformed(evt);
            }
        });

        bPaciente.setBackground(new java.awt.Color(0, 102, 153));
        bPaciente.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bPaciente.setForeground(new java.awt.Color(255, 255, 255));
        bPaciente.setText("PACIENTE");
        bPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPacienteActionPerformed(evt);
            }
        });

        eLogo.setFont(new java.awt.Font("Nimbus Mono PS", 1, 24)); // NOI18N
        eLogo.setForeground(new java.awt.Color(0, 102, 153));
        eLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eLogo.setText("Mi Sergas");
        eLogo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        eLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 2));
        eLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eLogo1.setFont(new java.awt.Font("Nimbus Mono PS", 1, 10)); // NOI18N
        eLogo1.setForeground(new java.awt.Color(0, 102, 153));
        eLogo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eLogo1.setText("DAM I");
        eLogo1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        eLogo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        bHospital.setBackground(new java.awt.Color(0, 102, 153));
        bHospital.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bHospital.setForeground(new java.awt.Color(255, 255, 255));
        bHospital.setText("HOSPITAL");
        bHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHospitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(pMenu);
        pMenu.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(145, 145, 145)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(bPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(bMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(bHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(eLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 139, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(eLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(eLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(bHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(bMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(bPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(eLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void bMedicoActionPerformed(java.awt.event.ActionEvent evt) {
        Controller.cambiarPaneles(Vista.panelMedico);
    }

    private void bHospitalActionPerformed(java.awt.event.ActionEvent evt) {
        Controller.cambiarPaneles(Vista.panelHospital);
    }

    private void bPacienteActionPerformed(java.awt.event.ActionEvent evt) {
        Controller.cambiarPaneles(Vista.panelPaciente);
    }

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton bHospital;
    private javax.swing.JButton bMedico;
    private javax.swing.JButton bPaciente;
    private javax.swing.JLabel eLogo;
    private javax.swing.JLabel eLogo1;
    public javax.swing.JPanel pMenu;
    // End of variables declaration
}