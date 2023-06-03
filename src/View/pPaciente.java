package View;

import Controller.Controller;
import com.nicosteuerberg.datos.VentanaLabel;
import java.awt.Color;
import javax.swing.table.TableModel;

/**
 *
 * @author dam1
 */
public class pPaciente extends javax.swing.JPanel {
    /**
     * Creates new form pHospital
     */
    public pPaciente() {
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
        tPaciente = new javax.swing.JTable();
        lcodP = new javax.swing.JTextField();
        lnombreP = new javax.swing.JTextField();
        lcodM = new javax.swing.JTextField();
        bCrear = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bBorrar = new javax.swing.JButton();
        bVaciar = new javax.swing.JButton();
        eCodp = new javax.swing.JLabel();
        eNomP = new javax.swing.JLabel();
        eCodM = new javax.swing.JLabel();
        eMensaje = new javax.swing.JLabel();
        eLogo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
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

        tPaciente.setAutoCreateRowSorter(true);
        tPaciente.setBackground(new java.awt.Color(102, 102, 255));
        tPaciente.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "codP", "nombreP", "codM"
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
        tPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tPaciente.setMinimumSize(new java.awt.Dimension(1000, 80));
        tPaciente.setShowHorizontalLines(true);
        tPaciente.setShowVerticalLines(true);
        tPaciente.setSurrendersFocusOnKeystroke(true);
        tPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tPaciente);
        if (tPaciente.getColumnModel().getColumnCount() > 0) {
            tPaciente.getColumnModel().getColumn(0).setResizable(false);
            tPaciente.getColumnModel().getColumn(1).setResizable(false);
            tPaciente.getColumnModel().getColumn(2).setResizable(false);
        }

        lcodP.setBackground(new java.awt.Color(102, 102, 255));
        lcodP.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        lcodP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lcodP.setToolTipText("Solo 3 caracteres. No se pueden repetir");
        lcodP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lcodPKeyTyped(evt);
            }
        });

        lnombreP.setBackground(new java.awt.Color(102, 102, 255));
        lnombreP.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        lnombreP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lnombreP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lnombrePKeyTyped(evt);
            }
        });

        lcodM.setBackground(new java.awt.Color(102, 102, 255));
        lcodM.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        lcodM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lcodM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lcodMKeyTyped(evt);
            }
        });

        bCrear.setBackground(new java.awt.Color(102, 102, 255));
        bCrear.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bCrear.setForeground(new java.awt.Color(255, 255, 255));
        bCrear.setText("CREAR");
        bCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearActionPerformed(evt);
            }
        });

        bModificar.setBackground(new java.awt.Color(102, 102, 255));
        bModificar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bModificar.setForeground(new java.awt.Color(255, 255, 255));
        bModificar.setText("MODIFICAR");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        bBorrar.setBackground(new java.awt.Color(102, 102, 255));
        bBorrar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bBorrar.setForeground(new java.awt.Color(255, 255, 255));
        bBorrar.setText("BORRAR");
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        bVaciar.setBackground(new java.awt.Color(102, 102, 255));
        bVaciar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bVaciar.setForeground(new java.awt.Color(255, 255, 255));
        bVaciar.setText("VACIAR CAMPOS");
        bVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVaciarActionPerformed(evt);
            }
        });

        eCodp.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        eCodp.setForeground(new java.awt.Color(255, 255, 255));
        eCodp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eCodp.setText("Código del paciente");
        eCodp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eNomP.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        eNomP.setForeground(new java.awt.Color(255, 255, 255));
        eNomP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eNomP.setText("Nombre del paciente");
        eNomP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eCodM.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        eCodM.setForeground(new java.awt.Color(255, 255, 255));
        eCodM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eCodM.setText("Código del médico");
        eCodM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eMensaje.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        eMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eMensaje.setRequestFocusEnabled(false);

        eLogo.setFont(new java.awt.Font("Nimbus Mono PS", 1, 24)); // NOI18N
        eLogo.setForeground(new java.awt.Color(0, 102, 153));
        eLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eLogo.setText("Mi Sergas");
        eLogo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 2, true));

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
                                                .addComponent(eLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(82, 82, 82)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(eCodp, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(eNomP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lcodP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(92, 92, 92)
                                                                .addComponent(lnombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(92, 92, 92)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lcodM, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(eCodM, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                                        .addComponent(eCodM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(eNomP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(eCodp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(eLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lcodP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lnombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lcodM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tPacienteMouseClicked(java.awt.event.MouseEvent evt) {
        int fila = tPaciente.getSelectedRow();
        TableModel model = tPaciente.getModel();
        lcodP.setText(model.getValueAt(fila, 0).toString());
        lnombreP.setText(model.getValueAt(fila, 1).toString());
        lcodM.setText(model.getValueAt(fila, 2).toString());
    }

    private void bVaciarActionPerformed(java.awt.event.ActionEvent evt) {
        lcodP.setText("");
        lnombreP.setText("");
        lcodM.setText("");
    }

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {
        if(lcodP.getText().equals("") || lcodM.getText().equals("") || lnombreP.getText().equals("")){
            VentanaLabel.mensajeLabel("LOS CAMPOS NO PUEDEN ESTAR VACIOS, RELLENELOS Y VUELVA A INTENTARLO", eMensaje, Color.red);
        }
        else{
            VentanaLabel.mensajeLabel("", eMensaje, Color.red);
            Controller.crearPaciente(lcodP.getText(),lnombreP.getText(), lcodM.getText(), eMensaje);
        }
    }

    private void lcodPKeyTyped(java.awt.event.KeyEvent evt) {
        if(lcodP.getText().length() >= 3){
            evt.consume();
        }
    }

    private void lnombrePKeyTyped(java.awt.event.KeyEvent evt) {
        if(lnombreP.getText().length() >= 20){
            evt.consume();
        }
    }

    private void lcodMKeyTyped(java.awt.event.KeyEvent evt) {
        if(lcodM.getText().length() >= 3){
            evt.consume();
        }
    }

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {
        if(lcodP.getText().equals("") || lcodM.getText().equals("") || lnombreP.getText().equals("")){
            VentanaLabel.mensajeLabel("LOS CAMPOS NO PUEDEN ESTAR VACIOS, RELLENELOS Y VUELVA A INTENTARLO", eMensaje, Color.red);
        }
        else{
            Controller.modificarPaciente(lcodP.getText(), lnombreP.getText(), lcodM.getText(), eMensaje);
        }
    }

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {
        if(lcodP.getText().equals("")){
            VentanaLabel.mensajeLabel("EL CÓDIGO DEL HOSPITAL NO PUEDE ESTAR VACIO", eMensaje, Color.red);
        }
        else{
            Controller.eliminarPaciente(lcodP.getText(), eMensaje);
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
    private javax.swing.JLabel eCodM;
    private javax.swing.JLabel eCodp;
    private javax.swing.JLabel eLogo;
    private javax.swing.JLabel eMensaje;
    private javax.swing.JLabel eNomP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lcodM;
    private javax.swing.JTextField lcodP;
    private javax.swing.JTextField lnombreP;
    public static javax.swing.JTable tPaciente;
    // End of variables declaration
}