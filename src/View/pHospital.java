package View;

import Clases.Hospital;
import Clases.Medico;
import Controller.Controller;
import com.nicosteuerberg.datos.VentanaLabel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author dam1
 */
public class pHospital extends javax.swing.JPanel {
    Integer posicion;

    /**
     * Creates new form pHospital
     */
    public pHospital() {
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
        lcodH = new javax.swing.JTextField();
        lnombreH = new javax.swing.JTextField();
        lnHabitaciones = new javax.swing.JTextField();
        bCrear = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bBorrar = new javax.swing.JButton();
        bVaciar = new javax.swing.JButton();
        eCodh = new javax.swing.JLabel();
        eNomH = new javax.swing.JLabel();
        eTipoH = new javax.swing.JLabel();
        eNHabitaciones = new javax.swing.JLabel();
        eMensaje = new javax.swing.JLabel();
        cTipoH = new javax.swing.JComboBox<>();

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
                new Object [] {
                        "codH", "nombreH", "tipoH", "nºMedicos", "nºHabitaciones"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
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
            tHospital.getColumnModel().getColumn(3).setResizable(false);
            tHospital.getColumnModel().getColumn(4).setResizable(false);
        }

        lcodH.setBackground(new java.awt.Color(204, 255, 255));
        lcodH.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        lcodH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lcodH.setToolTipText("Solo 3 caracteres. No se pueden repetir");
        lcodH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lcodHKeyTyped(evt);
            }
        });

        lnombreH.setBackground(new java.awt.Color(204, 255, 255));
        lnombreH.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        lnombreH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lnombreH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lnombreHKeyTyped(evt);
            }
        });

        lnHabitaciones.setBackground(new java.awt.Color(204, 255, 255));
        lnHabitaciones.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        lnHabitaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lnHabitaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lnHabitacionesKeyTyped(evt);
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

        eCodh.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        eCodh.setForeground(new java.awt.Color(255, 255, 255));
        eCodh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eCodh.setText("Código del hospital");
        eCodh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eNomH.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        eNomH.setForeground(new java.awt.Color(255, 255, 255));
        eNomH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eNomH.setText("Nombre del hospital");
        eNomH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eTipoH.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        eTipoH.setForeground(new java.awt.Color(255, 255, 255));
        eTipoH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eTipoH.setText("Tipo del hospital");
        eTipoH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eNHabitaciones.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        eNHabitaciones.setForeground(new java.awt.Color(255, 255, 255));
        eNHabitaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eNHabitaciones.setText("Nº de habitaciones");
        eNHabitaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        eMensaje.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        eMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eMensaje.setRequestFocusEnabled(false);

        cTipoH.setBackground(new java.awt.Color(204, 255, 255));
        cTipoH.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        cTipoH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "publico", "privado" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lcodH, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(eCodh, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lnombreH, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(eNomH, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(127, 127, 127)
                                                                .addComponent(eTipoH, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(127, 127, 127)
                                                                .addComponent(cTipoH, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(127, 127, 127)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(eNHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(eMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addContainerGap()
                                .addComponent(bVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(eNHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eTipoH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eNomH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eCodh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lcodH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lnombreH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cTipoH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        lcodH.setText(model.getValueAt(fila, 0).toString());
        lnombreH.setText(model.getValueAt(fila, 1).toString());
        cTipoH.setSelectedItem(model.getValueAt(fila, 2).toString());
        lnHabitaciones.setText(model.getValueAt(fila, 3).toString());
    }

    private void bVaciarActionPerformed(java.awt.event.ActionEvent evt) {
        lcodH.setText("");
        lnombreH.setText("");
        lnHabitaciones.setText("");
    }

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            posicion = Integer.parseInt(lnHabitaciones.getText());
        }catch (Exception e){}

        if(lcodH.getText().equals("") || lnHabitaciones.getText().equals("") || lnombreH.getText().equals("")){
            VentanaLabel.mensajeLabel("LOS CAMPOS NO PUEDEN ESTAR VACIOS, RELLENELOS Y VUELVA A INTENTARLO", eMensaje, Color.red);
        }
        else if(posicion == null){
            VentanaLabel.mensajeLabel("EL NUMERO DE HABITACIONES NO PUEDE CONTENER LETRAS O SIGNOS", eMensaje, Color.red);
        }
        else{
            VentanaLabel.mensajeLabel("", eMensaje, Color.red);
            Controller.crearHospital(lcodH.getText(),lnombreH.getText(),cTipoH.getSelectedItem().toString(), posicion,eMensaje);
        }

    }

    private void lcodHKeyTyped(java.awt.event.KeyEvent evt) {
        if(lcodH.getText().length() >= 3){
            evt.consume();
        }
    }

    private void lnombreHKeyTyped(java.awt.event.KeyEvent evt) {
        if(lnombreH.getText().length() >= 20){
            evt.consume();
        }
    }

    private void lnHabitacionesKeyTyped(java.awt.event.KeyEvent evt) {
        if(lnHabitaciones.getText().length() >= 3){
            evt.consume();
        }
    }

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            posicion = Integer.parseInt(lnHabitaciones.getText());

            if(lcodH.getText().equals("") || lnHabitaciones.getText().equals("") || lnombreH.getText().equals("")){
                VentanaLabel.mensajeLabel("LOS CAMPOS NO PUEDEN ESTAR VACIOS, RELLENELOS Y VUELVA A INTENTARLO", eMensaje, Color.red);
            }
            else{
                Controller.modificarHospital(lcodH.getText(), lnombreH.getText(), cTipoH.getSelectedItem().toString(), posicion, eMensaje);
            }
        }catch(Exception e){
            VentanaLabel.mensajeLabel("EL NUMERO DE HABITACIONES NO PUEDE CONTENER LETRAS O SIGNOS", eMensaje, Color.red);
        }
    }

    private void bBorrarActionPerformed(ActionEvent evt) {
        if(lcodH.getText().equals("")){
            VentanaLabel.mensajeLabel("EL CÓDIGO DEL HOSPITAL NO PUEDE ESTAR VACIO", eMensaje, Color.red);
        }
        else{
            Controller.eliminarHospital(lcodH.getText(), eMensaje);
        }
    }

    private void bVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {
        Controller.cambiarPaneles(Vista.panelMenu);
    }

    public void añadirFila(ArrayList<Hospital> lista, int posicion){
        DefaultTableModel mHospital = (DefaultTableModel) tHospital.getModel();
        Object[] fHosp = {
                lista.get(posicion).getCodH(),
                lista.get(posicion).getNombreH(),
                lista.get(posicion).getTipoH(),
                lista.get(posicion).getNroMedicos(),
                lista.get(posicion).getNroHabitaciones()
        };
        mHospital.addRow(fHosp);
    }

    public void crear(ArrayList<Hospital> lista){
        DefaultTableModel mMedico = (DefaultTableModel) tHospital.getModel();
        mMedico.setRowCount(0);

        for (int i = 0; i<lista.size(); i++) {
            añadirFila(lista,i);
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bCrear;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bVaciar;
    private javax.swing.JButton bVolverMenu;
    private javax.swing.JComboBox<String> cTipoH;
    private javax.swing.JLabel eCodh;
    private javax.swing.JLabel eMensaje;
    private javax.swing.JLabel eNHabitaciones;
    private javax.swing.JLabel eNomH;
    private javax.swing.JLabel eTipoH;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lcodH;
    private javax.swing.JTextField lnHabitaciones;
    private javax.swing.JTextField lnombreH;
    private javax.swing.JTable tHospital;
    // End of variables declaration
}