package Model;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import Clases.Paciente;
import com.nicosteuerberg.datos.VentanaLabel;

import javax.swing.*;

public class MPaciente extends Observable {
    GestionBases auxCon= new GestionBases();
    int verificacion;

    int numeroAModificar;

    /**
     * Método para crear un paciente en la base de datos
     * @param lista -> ArrayList de tipo Paciente con el que vamos a añadir un paciente
     * @param label -> etiqueta de la interfaz para mostrar los mensajes
     */
    public void crearPaciente(ArrayList<Paciente>lista, JLabel label){
        try {
            Connection con = auxCon.conectar();
            PreparedStatement ps = con.prepareStatement("INSERT INTO paciente(codP,nomP,codM) VALUES (?,?,?)");

            ps.setString(1, lista.get((lista.size()-1)).getCodP());
            ps.setString(2, lista.get((lista.size())-1).getNomP());
            ps.setString(3, lista.get((lista.size())-1).getCodMed1());

            ps.executeUpdate();

            VentanaLabel.mensajeLabel("Paciente añadido",label, Color.black);

            setChanged();
            notifyObservers("paciente");

        } catch (SQLException e) {
            VentanaLabel.mensajeLabel("ERROR a la hora de hacer el insert",label,Color.red);
        }

    }

    /**
     * Método para modificar un paciente a partir de su código
     * @param lista -> ArrayList de tipo paciente con los datos
     * @param label -> etiqueta de la interfaz para mostrar los mensajes
     */
    public void modificarPaciente(ArrayList<Paciente>lista,String codP, JLabel label){
        try {
            Connection con = auxCon.conectar();
            PreparedStatement ps = con.prepareStatement("UPDATE paciente SET codM=?,nomP=? WHERE codP=?");
            for (int i = 0; i< lista.size();i++){
                if(lista.get(i).getCodP().equals(codP)){
                    numeroAModificar = i;
                }
            }


            ps.setString(1, lista.get(numeroAModificar).getCodMed1());
            ps.setString(2,  lista.get(numeroAModificar).getNomP());
            ps.setString(3,  lista.get(numeroAModificar).getCodP());

            verificacion=ps.executeUpdate();
            if(verificacion==0){
                VentanaLabel.mensajeLabel("No existe el paciente con el codigo "+codP,label,Color.red);
            }else {
                VentanaLabel.mensajeLabel("Paciente modificado", label, Color.black);
                setChanged();
                notifyObservers("paciente");
            }

        }catch(SQLException e){
            VentanaLabel.mensajeLabel("ERROR en la modificación del hospital",label,Color.red);
        }
    }

    /**
     * Método para eliminar un paciente a partir de su código
     * @param lista -> ArrayList de tipo paciente con los datos
     * @param codP -> código del paciente
     * @param label -> etiqueta de la interfaz para mostrar los mensajes
     */
    public void eliminarPaciente(ArrayList<Paciente>lista,String codP, JLabel label){
        try {
            Connection con = auxCon.conectar();
            PreparedStatement ps = con.prepareStatement("DELETE FROM paciente WHERE codP=?");

            ps.setString(1, codP);

            verificacion=ps.executeUpdate();
            if(verificacion==0){
                VentanaLabel.mensajeLabel("No existe el paciente con el codigo "+codP,label,Color.red);
            }else {
                for (int i = 0; i< lista.size();i++){
                    if(lista.get(i).getCodP().equals(codP)){
                        numeroAModificar = i;
                    }
                }
                lista.remove(numeroAModificar);

                VentanaLabel.mensajeLabel("Paciente eliminado", label, Color.black);

                setChanged();
                notifyObservers("paciente");
            }

        }catch(SQLException e){
            VentanaLabel.mensajeLabel("ERROR en la eliminación del paciente",label,Color.red);
        }
    }

    /**
     * Método para modificar el ArrayList
     * @param lista -> ArrayList tipo Paciente con los datos
     * @param codP -> código del paciente
     * @param nombreP -> nombre del paciente
     * @param codM -> código del médico que atiende al paciente respectivamente
     */
    public void modificarArray(ArrayList<Paciente> lista, String codP, String nombreP, String codM){
        for (int i = 0; i< lista.size();i++){
            if(lista.get(i).getCodP().equals(codP)){
                numeroAModificar = i;
            }
        }
        lista.get(numeroAModificar).setNomP(nombreP);
        lista.get(numeroAModificar).setCodP(codP);
        lista.get(numeroAModificar).setCodMed1(codM);
    }
}
