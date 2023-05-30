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
        int nroMedico = obxM.contarMedicos(codH,label);
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

    /**
     *Crear médico
     * @param codM -> código del médico
     * @param nomM -> nombre del médico
     * @param codH -> código del hospital donde trabaja el médico
     */
    static void crearMedico(String codM, String nomM,String codH){
        lMedico.add(new Medico(codM,nomM,codH));

    }

    /**
     * Modificar Médico
     * @param codM -> código del médico
     * @param nomM -> nombre del médico
     * @param codH -> codigo del hospital donde pertenece
     * @param label -> etiqueta de la interfaz para mostrar mensajes
     */
    static void modificarMedico(String codM,String nomM,String codH, JLabel label){
        obxM.modificarArray(lMedico,codM,nomM,codH);
        obxM.modificarMedico(lMedico,codM,label);
    }

    /**
     * Borrar médico
     * @param codM -> codigo del medico
     * @param label -> etiqueta de la interfaz para mostrar mensajes
     */
    static void eliminarMedico(String codM, JLabel label){
        obxH.eliminarHospital(lHospital, codM,label);
    }

    /**
     * Crear Paciente
     * @param codP -> código del paciente
     * @param nomP -> nombre del paciente
     * @param codM -> código del médico que lo atiende
     */
    static void crearPaciente(String codP, String nomP,String codM){
        lPaciente.add(new Paciente(codP,nomP,codM));

    }

    /**
     * Modificar Paciente
     * @param codP -> código del paciente
     * @param nomP -> nombre del paciente
     * @param codM -> codigo del médico que lo atiende
     * @param label -> etiqueta de la interfaz para mostrar mensajes
     */
    static void modificarPaciente(String codP,String nomP,String codM, JLabel label){
        obxP.modificarArray(lPaciente,codP,nomP,codM);
        obxP.modificarPaciente(lPaciente,codP,label);
    }

    /**
     * Borrar paciente
     * @param codP -> codigo del paciente
     * @param label -> etiqueta de la interfaz para mostrar mensajes
     */
    static void eliminarPaciente(String codP, JLabel label){
        obxP.eliminarPaciente(lPaciente, codP,label);
    }
}
