package Controller;

import Clases.*;
import Model.GestionBases;
import Model.MHospital;
import Model.MMedico;
import Model.MPaciente;
import View.Vista;
import javax.swing.*;
import java.util.ArrayList;

public class Controller {
    static ArrayList<Hospital> lHospital = new ArrayList();
    static ArrayList<Medico> lMedico = new ArrayList();
    static ArrayList<Paciente> lPaciente = new ArrayList();
    static MHospital obxH=new MHospital();
    static MMedico obxM= new MMedico();
    static MPaciente obxP= new MPaciente();
    static Vista miVista = new Vista();

    //CREAR
    /**
     * Para iniciar los ArrayList al principio del programa
     * recibiendo los valores de la base de datos
     */
    public static void crearArrays(){
        GestionBases.crearArrayList(lHospital, lMedico, lPaciente);
    }

    /**
     * Crear Paciente
     * @param codP -> código del paciente
     * @param nomP -> nombre del paciente
     * @param codM -> código del médico que lo atiende
     * Primero se añade el nuevo paciente al array y después se llama a crear paciente
     */
    public static void crearPaciente(String codP, String nomP,String codM, JLabel label){
        lPaciente.add(new Paciente(codP,nomP,codM));
        obxP.crearPaciente(lPaciente, label);
    }

    /**
     * Crear médico
     * @param codM -> código del médico
     * @param nomM -> nombre del médico
     * @param codH -> código del hospital donde trabaja el médico
     * Primero creamos el médico en el array para luego crear ell médico
     */
    public static void crearMedico(String codM, String nomM,String codH, JLabel label){
        lMedico.add(new Medico(codM,nomM,codH));
        obxM.crearMedico(lMedico, label);
        int nMedicos = obxM.contarMedicos(codH, label);
        obxH.modificarNroMedico(lHospital, codH,nMedicos, label);
    }

    /**
     * Crear hospital
     * @param codH -> codigo hospital
     * @param nombreH -> nombre del hospital
     * @param tipoH -> tipo del hospital
     * @param nroHabitaciones -> numero habitaciones
     * @param label -> etiqueta de la interfaz para mostrar mensajes
     * Primero contamos los médicos que tienen su código, normalmente al principio será 0
     * Seguido de esto añadimos el hospital al ArrayList y creamos el hospital en la base de datos
     */
    public static void crearHospital(String codH, String nombreH, String tipoH, int nroHabitaciones, JLabel label){
        int nroMedico = obxM.contarMedicos(codH,label);
        lHospital.add(new Hospital(codH, nombreH, tipoH, nroMedico, nroHabitaciones));
        obxH.crearHospital(lHospital, label);
    }


    //MODIFICACIONES
    /**
     * Modificar Paciente
     * @param codP -> código del paciente
     * @param nomP -> nombre del paciente
     * @param codM -> codigo del médico que lo atiende
     * @param label -> etiqueta de la interfaz para mostrar mensajes
     * Primero modificamos el ArrayList y seguido de esto la base de datos
     */
    public static void modificarPaciente(String codP,String nomP,String codM, JLabel label){
        obxP.modificarArray(lPaciente,codP,nomP,codM);
        obxP.modificarPaciente(lPaciente,codP,label);
    }

    /**
     * Modificar Médico
     * @param codM -> código del médico
     * @param nomM -> nombre del médico
     * @param codH -> codigo del hospital donde pertenece
     * @param label -> etiqueta de la interfaz para mostrar mensajes
     * Primero modificamos el ArrayList y seguido de esto la base de datos
     */
    public static void modificarMedico(String codM,String nomM,String codH, JLabel label){
        obxM.modificarArray(lMedico,codM,nomM,codH);
        obxM.modificarMedico(lMedico,codM,label);
    }

    /**
     * Modificar hospital
     * @param codH -> codigo hospital
     * @param nombreH -> nombre del hospital
     * @param tipoH -> tipo del hospital
     * @param nroHabitaciones -> numero habitaciones
     * @param label -> etiqueta de la interfaz para mostrar mensajes
     * Primero modificamos el ArrayList y seguido de esto la base de datos
     */
    public static void modificarHospital(String codH, String nombreH, String tipoH, int nroHabitaciones, JLabel label){
        obxH.modificarArray(lHospital, codH, nombreH, tipoH, nroHabitaciones);
        obxH.modificarHospital(lHospital, codH, label);
    }


    //ELIMINAR DATOS
    /**
     * Borrar paciente
     * @param codP -> codigo del paciente
     * @param label -> etiqueta de la interfaz para mostrar mensajes
     * A la hora de eliminarlo en la base de datos se elimina en el ArrayList tambien
     */
    public static void eliminarPaciente(String codP, JLabel label){
        obxP.eliminarPaciente(lPaciente, codP,label);
    }

    /**
     * Borrar médico
     * @param codM -> codigo del medico
     * @param label -> etiqueta de la interfaz para mostrar mensajes
     * A la hora de eliminarlo en la base de datos se elimina en el ArrayList tambien
     */
    public static void eliminarMedico(String codM, JLabel label){
        int auxiliar = lMedico.indexOf(codM);
        String auxiliarCodigo = lMedico.get(auxiliar).getCodH1();
        obxM.eliminarMedico(lMedico, codM,label);
        int nMedicos = obxM.contarMedicos(auxiliarCodigo, label);
        obxH.modificarNroMedico(lHospital, auxiliarCodigo,nMedicos, label);
    }

    /**
     * Borrar hospital
     * @param codH -> codigo del hospital
     * @param label -> etiqueta de la interfaz para mostrar mensajes
     * A la hora de eliminarlo en la base de datos se elimina en el ArrayList tambien
     */
    public static void eliminarHospital(String codH, JLabel label){
        obxH.eliminarHospital(lHospital, codH,label);
    }

    public static void cambiarPaneles(int numero){
        switch (numero){
            case Vista.panelMenu:
               Vista.visualizarMenu();
                break;
            case Vista.panelHospital:
                miVista.visualizarHospital();
                break;
            case Vista.panelMedico:
                miVista.visualizarMedico();
                break;
            case Vista.panelPaciente:
                miVista.visualizarPaciente();
                break;

        }
    }
}
