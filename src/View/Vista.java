package View;

import Controller.Controller;

import javax.swing.*;
import java.util.ArrayList;

public class Vista {
    Controller miController = new Controller();
    public static final int panelMenu = 0;
    public static final int panelHospital = 1;
    public static final int panelMedico = 2;
    public static final int panelPaciente = 3;
    public static final int TABLAHOSPITAL = 0;
    public static final int TABLAMEDICO = 1;
    public static final int TABLAPACIENTE = 3;
    JPanel pMenu;
    pHospital pH = new pHospital();
    pMedico pM = new pMedico();
    pPaciente pP = new pPaciente();
    IMenu ventana = new IMenu();

    public Vista() {
        crearPaneles();
        ventana.setVisible(true);
    }

    public void crearPaneles(){
        pMenu = ventana.pMenu;

        pH.setBounds(0, 0, 1280, 720);
        ventana.add(pH);
        pH.setVisible(false);


        pM.setBounds(0, 0, 1280, 720);
        ventana.add(pM);
        pM.setVisible(false);


        pP.setBounds(0, 0, 1280, 720);
        ventana.add(pP);
        pP.setVisible(false);
    }

    public void quitarPaneles(){
        pMenu.setVisible(false);
        pH.setVisible(false);
        pM.setVisible(false);
        pP.setVisible(false);
    }

    public void visualizarMenu(){
        ventana.setBounds(0,0,400,350);
        quitarPaneles();
        pMenu.setVisible(true);
    }

    public void visualizarHospital(){
        ventana.setBounds(0,0,1280,720);
        quitarPaneles();
        pH.eMensaje.setText("");
        pH.setVisible(true);
    }

    public void visualizarMedico(){
        ventana.setBounds(0,0,1280,720);
        quitarPaneles();
        pM.eMensaje.setText("");
        pM.setVisible(true);
    }

    public void visualizarPaciente(){
        ventana.setBounds(0,0,1280,720);
        quitarPaneles();
        pP.eMensaje.setText("");
        pP.setVisible(true);
    }

    /**
     * Método para crear la tabla
     * @param lista -> ArrayList dependiendo de lo que se va a crear
     * @param numero -> número identificador para saber que tabla crear
     */
    public void crearTabla(ArrayList lista, int numero){
        switch (numero){
            case TABLAHOSPITAL:
                pH.crear(lista);
                break;
            case TABLAMEDICO:
                pM.crear(lista);
                break;
            case TABLAPACIENTE:
                pP.crear(lista);
                break;
        }
    }
}
