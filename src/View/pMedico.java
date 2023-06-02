package View;

import Controller.Controller;
import com.nicosteuerberg.datos.VentanaLabel;
import java.awt.Color;
import javax.swing.table.TableModel;

/**
 *
 * @author dam1
 */
public class pMedico extends javax.swing.JPanel {
    /**
     * Creates new form pHospital
     */
    public pMedico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        bVolverMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tHospital = new javax.swing.JTable();
        lcodM = new javax.swing.JTextField();
        lnombreM = new javax.swing.JTextField();
        lcodH = new javax.swing.JTextField();
        bCrear = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bBorrar = new javax.swing.JButton();
        bVaciar = new javax.swing.JButton();
        eCodm = new javax.swing.JLabel();
        eNomH = new javax.swing.JLabel();
        eNHabitaciones = new javax.swing.JLabel();
        eMensaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(23, 165, 199));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        bVolverMenu.setBackground(new java.awt.Color(0, 102, 153));
        bVolverMenu.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bVolverMenu.setForeground(new java.awt.Color(255, 255, 255));
        bVolverMenu.setText("MENÚ");
        bVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverMenuActionPerformed(evt);
            }
        });

        tHospital.setAutoCreateRowSorter(true);
        tHospital.setBackground(new java.awt.Color(204, 255, 255));
        tHospital.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "codM", "nombreM", "codH1"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tHospital.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tHospital.setMinimumSize(new java.awt.Dimension(1000, 80));
        tHospital.setShowHorizontalLines(true);
        tHospital.setShowVerticalLines(true);
        tHospital.setSurrendersFocusOnKeystroke(true);
        tHospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tHospitalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tHospital);
        if (tHospital.getColumnModel().getColumnCount() > 0) {
            tHospital.getColumnModel().getColumn(0).setResizable(false);
            tHospital.getColumnModel().getColumn(1).setResizable(false);
            tHospital.getColumnModel().getColumn(2).setResizable(false);
        }

        lcodM.setBackground(new java.awt.Color(204, 255, 255));
        lcodM.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        lcodM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lcodM.setToolTipText("Solo 3 caracteres. No se pueden repetir");
        lcodM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lcodMKeyTyped(evt);
            }
        });

        lnombreM.setBackground(new java.awt.Color(204, 255, 255));
        lnombreM.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        lnombreM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lnombreM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lnombreMKeyTyped(evt);
            }
        });

        lcodH.setBackground(new java.awt.Color(204, 255, 255));
        lcodH.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        lcodH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lcodH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lcodHKeyTyped(evt);
            }
        });

        bCrear.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bCrear.setForeground(new java.awt.Color(0, 102, 153));
        bCrear.setText("CREAR");
        bCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearActionPerformed(evt);
            }
        });

        bModificar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bModificar.setForeground(new java.awt.Color(0, 102, 153));
        bModificar.setText("MODIFICAR");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        bBorrar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bBorrar.setForeground(new java.awt.Color(0, 102, 153));
        bBorrar.setText("BORRAR");
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        bVaciar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bVaciar.setForeground(new java.awt.Color(0, 102, 153));
        bVaciar.setText("VACIAR CAMPOS");
        bVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVaciarActionPerformed(evt);
            }
        });

        eCodm.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        eCodm.setForeground(new java.awt.Color(255, 255, 255));
        eCodm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eCodm.setText("Código del médico");
        eCodm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eNomH.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        eNomH.setForeground(new java.awt.Color(255, 255, 255));
        eNomH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eNomH.setText("Nombre del médico");
        eNomH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eNHabitaciones.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        eNHabitaciones.setForeground(new java.awt.Color(255, 255, 255));
        eNHabitaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eNHabitaciones.setText("Código del hospital");
        eNHabitaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eMensaje.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        eMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eMensaje.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Nimbus Mono PS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mi Sergas");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 2, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(65, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(eMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(82, 82, 82)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(eCodm, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(eNomH, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lcodM, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(92, 92, 92)
                                                                .addComponent(lnombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(92, 92, 92)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lcodH, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(eNHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(bModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(bBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(bCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(bVaciar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(bVolverMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(bVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(eNHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(eNomH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(eCodm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lcodM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lnombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lcodH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(eMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(bCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(163, 163, 163)
                                                .addComponent(bModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(bBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(65, 65, 65))
        );
    }// </editor-fold>

    private void tHospitalMouseClicked(java.awt.event.MouseEvent evt) {
        int fila = tHospital.getSelectedRow();
        TableModel model = tHospital.getModel();
        lcodM.setText(model.getValueAt(fila, 0).toString());
        lnombreM.setText(model.getValueAt(fila, 1).toString());
        lcodH.setText(model.getValueAt(fila, 2).toString());
    }

    private void bVaciarActionPerformed(java.awt.event.ActionEvent evt) {
        lcodM.setText("");
        lnombreM.setText("");
        lcodH.setText("");
    }

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {
        if(lcodM.getText().equals("") || lcodH.getText().equals("") || lnombreM.getText().equals("")){
            VentanaLabel.mensajeLabel("LOS CAMPOS NO PUEDEN ESTAR VACIOS, RELLENELOS Y VUELVA A INTENTARLO", eMensaje, Color.red);
        }
        else{
            VentanaLabel.mensajeLabel("", eMensaje, Color.red);
            Controller.crearMedico(lcodM.getText(),lnombreM.getText(), lcodH.getText(),eMensaje);
        }
    }

    private void lcodMKeyTyped(java.awt.event.KeyEvent evt) {
        if(lcodM.getText().length() >= 3){
            evt.consume();
        }
    }

    private void lnombreMKeyTyped(java.awt.event.KeyEvent evt) {
        if(lnombreM.getText().length() >= 20){
            evt.consume();
        }
    }

    private void lcodHKeyTyped(java.awt.event.KeyEvent evt) {
        if(lcodH.getText().length() >= 3){
            evt.consume();
        }
    }

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {
        if(lcodM.getText().equals("") || lcodH.getText().equals("") || lnombreM.getText().equals("")){
            VentanaLabel.mensajeLabel("LOS CAMPOS NO PUEDEN ESTAR VACIOS, RELLENELOS Y VUELVA A INTENTARLO", eMensaje, Color.red);
        }
        else{
            Controller.modificarMedico(lcodM.getText(), lnombreM.getText(), lcodH.getText(), eMensaje);
        }
    }

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {
        if(lcodM.getText().equals("")){
            VentanaLabel.mensajeLabel("EL CÓDIGO DEL HOSPITAL NO PUEDE ESTAR VACIO", eMensaje, Color.red);
        }
        else{
            Controller.eliminarMedico(lcodM.getText(), eMensaje);
        }
    }

    private void bVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {
        Controller.cambiarPaneles(Vista.panelMenu);
    }



    // Variables declaration - do not modify
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bCrear;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bVaciar;
    private javax.swing.JButton bVolverMenu;
    private javax.swing.JLabel eCodm;
    private javax.swing.JLabel eMensaje;
    private javax.swing.JLabel eNHabitaciones;
    private javax.swing.JLabel eNomH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lcodH;
    private javax.swing.JTextField lcodM;
    private javax.swing.JTextField lnombreM;
    private javax.swing.JTable tHospital;
    // End of variables declaration
}