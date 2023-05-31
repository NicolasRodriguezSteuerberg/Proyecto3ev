package View;

import javax.swing.*;

public class Vista {
    public static final int panelMenu = 0;
    public static final int panelHospital = 1;
    public static final int panelMedico = 2;
    public static final int panelPaciente = 3;

    JPanel pMenu, pHospital, pMedico, pPaciente;
    IMenu ventana = new IMenu();

    public void crearPaneles(){
        pMenu = ventana.pMenu;
        pHospital = new pHospital();
        pMedico = new pMedico();
        pPaciente = new pPaciente();
    }

    public void visualizarMenu(){
        ventana.setBounds(0,0,400,300);
        pMenu.setVisible(true);
    }

    public void visualizarHospital(){

    }

    public void visualizarMedico(){

    }

    public void visualizarPaciente(){

    }
}
