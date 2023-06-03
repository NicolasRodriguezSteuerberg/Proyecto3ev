package Controller;

import Clases.Hospital;
import Clases.Medico;
import Clases.Paciente;
import View.Vista;
import View.pHospital;

import javax.swing.table.DefaultTableModel;
import java.util.Observable;
import java.util.Observer;

public class ObserverTablas implements Observer {
    String aux;
    @Override
    public void update(Observable o, Object arg) {
        aux = arg.toString();
        if(aux.contains("hospital")){
            if(aux.contains("1")) {
                Controller.añadirFila(Vista.TABLAHOSPITAL,Controller.lHospital.size()-1);
            } else {
                Controller.crearTabla(Vista.TABLAHOSPITAL);
            }
        } else if (aux.equals("medico")) {
            if(aux.contains("1")) {
                Controller.añadirFila(Vista.TABLAMEDICO,Controller.lMedico.size()-1);
            } else {
                Controller.crearTabla(Vista.TABLAMEDICO);
            }
        } else {
            if(aux.contains("1")) {
                Controller.añadirFila(Vista.TABLAPACIENTE,Controller.lPaciente.size()-1);
            } else {
                //Controller.crearTablaPaciente();
            }
        }
    }

}
