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
        pHospital.setBounds(0, 0, 1280, 720);
        ventana.add(pHospital);
        pHospital.setVisible(false);

        pMedico = new pMedico();
        pMedico.setBounds(0, 0, 1280, 720);
        ventana.add(pMedico);
        pMedico.setVisible(false);

        pPaciente = new pPaciente();
        pPaciente.setBounds(0, 0, 1280, 720);
        ventana.add(pPaciente);
        pPaciente.setVisible(false);


    }

    public void quitarPaneles(){
        pMenu.setVisible(false);
        pHospital.setVisible(false);
        pMedico.setVisible(false);
        pPaciente.setVisible(false);
    }

    public void visualizarMenu(){
        ventana.setBounds(0,0,400,300);
        quitarPaneles();
        pMenu.setVisible(true);
    }

    public void visualizarHospital(){
        ventana.setBounds(0,0,1280,720);
        quitarPaneles();
        pHospital.setVisible(true);
    }

    public void visualizarMedico(){
        ventana.setBounds(0,0,1280,720);
        quitarPaneles();
        pMedico.setVisible(true);
    }

    public void visualizarPaciente(){
        ventana.setBounds(0,0,1280,720);
        quitarPaneles();
        pPaciente.setVisible(true);
    }
}
