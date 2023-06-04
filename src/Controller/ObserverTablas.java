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
                Controller.crearTabla(Vista.TABLAHOSPITAL);

        } else if (aux.equals("medico")) {
                Controller.crearTabla(Vista.TABLAMEDICO);
        } else {
                Controller.crearTabla(Vista.TABLAPACIENTE);
        }
    }

}
