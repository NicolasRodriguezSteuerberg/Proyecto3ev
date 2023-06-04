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
    public static void anadirObserver(){
        ObserverTablas obxObs=new ObserverTablas();
        obxH.addObserver(obxObs);
        obxM.addObserver(obxObs);
        obxP.addObserver(obxObs);
    }
    /**
     * Para iniciar los ArrayList al principio del programa
     * recibiendo los valores de la base de datos
     */
    public static void crearArrays(){
        GestionBases auxGestion=new GestionBases();
        auxGestion.crearArrayList(lHospital, lMedico, lPaciente);
    }

    /**
     * Crear Paciente
     * @param codP -> código del paciente
     * @param nomP -> nombre del paciente
     * @param codM -> código del médico que lo atiende
     * Primero se añade el nuevo paciente al array y después se llama a crear paciente
     */
    public static void crearPaciente(String codP, String nomP,String codM, JLabel label){
        int flag=0;
        for (int i=0; i<lPaciente.size();i++) {
            if(lPaciente.get(i).getCodP().equals(codP)){
                flag = 1;
            }
        }
        if(flag==0) {
            lPaciente.add(new Paciente(codP,nomP,codM));
        }
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
        int flag=0;
        for (int i=0; i<lMedico.size();i++) {
            if(lMedico.get(i).getCodP().equals(codM)){
                flag = 1;
            }
        }
        if(flag==0) {
            lMedico.add(new Medico(codM,nomM,codH));
        }
        obxM.crearMedico(lMedico, label);
        obxH.cambiarNroMedicos(lHospital, label);
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
        int flag=0;
        for (int i=0; i<lHospital.size();i++) {
            if(lHospital.get(i).getCodH().equals(codH)){
                flag = 1;
            }
        }
        if(flag==0) {
            lHospital.add(new Hospital(codH, nombreH, tipoH, 0, nroHabitaciones));
        }
        obxH.crearHospital(lHospital, label);
        obxH.cambiarNroMedicos(lHospital, label);
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
        obxH.cambiarNroMedicos(lHospital, label);
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
        obxM.eliminarMedico(lMedico, codM,label);
        obxH.cambiarNroMedicos(lHospital, label);
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
    /**
     * Cambiar el panel de la IU
     * @param numero -> numero para saber a que panel cambiar
     */
    public static void cambiarPaneles(int numero){
        switch (numero){
            case Vista.panelMenu:
               miVista.visualizarMenu();
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
  


    public static void crearTabla(int numero){
        switch (numero){
            case Vista.TABLAHOSPITAL:
                miVista.crearTabla(lHospital, Vista.TABLAHOSPITAL);
                break;
            case Vista.TABLAMEDICO:
                miVista.crearTabla(lMedico, Vista.TABLAMEDICO);
                break;
            case Vista.TABLAPACIENTE:
                miVista.crearTabla(lPaciente, Vista.TABLAPACIENTE);
                break;
        }
    }

}
