package Controller;

import Clases.*;
import Model.GestionBases;
import Model.MHospital;
import Model.MMedico;
import Model.MPaciente;

import javax.swing.*;
import java.util.ArrayList;

public class Controller {
    static ArrayList<Hospital> lHospital = new ArrayList();
    static ArrayList<Medico> lMedico = new ArrayList();
    static ArrayList<Paciente> lPaciente = new ArrayList();
    static MHospital obxH=new MHospital();
    static MMedico obxM= new MMedico();

    static MPaciente obxP= new MPaciente();

    /**
     * Para iniciar los ArrayList al principio del programa
     * recibiendo los valores de la base de datos
     */
    static void crearArrays(){
        GestionBases.crearArrayList(lHospital, lMedico, lPaciente);
    }

    /**
     * Crear hospital
     * @param codH -> codigo hospital
     * @param nombreH -> nombre del hospital
     * @param tipoH -> tipo del hospital
     * @param nroHabitaciones -> numero habitaciones
     * @param label -> etiqueta de la interfaz para mostrar mensajes
     */
    static void crearHospital(String codH, String nombreH, String tipoH, int nroHabitaciones, JLabel label){
        /**ToDo
         * Contar medicos de un hospital
         */
        int nroMedico = obxM.contarMedicos();
        lHospital.add(new Hospital(codH, nombreH, tipoH, nroMedico, nroHabitaciones));
        obxH.crearHospital(lHospital, label);
    }

    /**
     * Modificar hospital
     * @param codH -> codigo hospital
     * @param nombreH -> nombre del hospital
     * @param tipoH -> tipo del hospital
     * @param nroHabitaciones -> numero habitaciones
     * @param label -> etiqueta de la interfaz para mostrar mensajes
     */
    static void modificarHospital(String codH, String nombreH, String tipoH, int nroHabitaciones, JLabel label){
        obxH.modificarArray(lHospital, codH, nombreH, tipoH, nroHabitaciones);
        obxH.modificarHospital(lHospital, codH, label);
    }

    /**
     * Borrar hospital
     * @param codH -> codigo del hospital
     * @param label -> etiqueta de la interfaz para mostrar mensajes
     */
    static void eliminarHospital(String codH, JLabel label){
        obxH.eliminarHospital(lHospital, codH,label);
    }
}
