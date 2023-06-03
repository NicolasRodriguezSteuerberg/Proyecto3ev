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
    Hospital obxHospital;
    Medico obxMedico;
    Paciente obxPaciente;
    @Override
    public void update(Observable o, Object arg) {
        aux = arg.toString();
        if(aux.contains("hospital")){
            if(aux.contains("1")) {
                Controller.añadirFilaHospital((Controller.lHospital.size()-1));
            } else {
                Controller.crearTablaHospital();
            }
        } else if (aux.equals("medico")) {
            if(aux.contains("1")) {
                Controller.añadirFilaMedico((Controller.lMedico.size()-1));
            } else {
                Controller.crearTablaMedico();
            }
        } else {
            if(aux.contains("1")) {
                Controller.añadirFilaPaciente((Controller.lPaciente.size()-1));
            } else {
                Controller.crearTablaPaciente();
            }
        }
    }

}
