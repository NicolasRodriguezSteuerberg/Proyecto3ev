package Controller;

import Model.MHospital;
import Model.MMedico;

import javax.swing.*;

public class Controller {
    static MHospital obxH=new MHospital();
    static MMedico obxM= new MMedico();

    public static void ejecutar(){
        obxM.crearMedico("m1","GabiM","h1",new JLabel());
    }
}
