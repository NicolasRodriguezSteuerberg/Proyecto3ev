package Model;

import java.awt.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import Clases.Medico;
import com.nicosteuerberg.datos.VentanaLabel;
import javax.swing.*;
import java.sql.*;
import java.util.Observable;

public class MMedico extends Observable {
    GestionBases auxCon= new GestionBases();
    int verificacion;
    int numeroAModificar;

    /**
     * Método para crear un médico en la base de Datos
     * @param lista -> ArrayList de tipo Médico con el que vamos a añadir un médico
     * @param label -> etiqueta de la interfaz para mostrar los mensajes
     */
    public void crearMedico(ArrayList<Medico> lista, JLabel label) {
        try {
            Connection con = auxCon.conectar();

            PreparedStatement ps = con.prepareStatement("INSERT INTO medico (codM,nomM,codH) VALUES (?,?,?)");

            ps.setString(1, lista.get((lista.size()-1)).getCodP());
            ps.setString(2, lista.get((lista.size()-1)).getNomP());
            ps.setString(3, lista.get((lista.size()-1)).getCodH1());

            ps.executeUpdate();

            VentanaLabel.mensajeLabel("Médico añadido", label, Color.black);
            setChanged();
            notifyObservers("medico");

        } catch (SQLException e) {
            VentanaLabel.mensajeLabel("ERROR a la hora de hacer el insert",label,Color.red);
        }

    }

    /**
     * Método para modificar un médico a partir de su código
     * @param lista ->
     * @param codM -> código del médico
     * @param label -> etiqueta de la interfaz para mostrar los mensajes
     */
    public void modificarMedico(ArrayList<Medico> lista, String codM, JLabel label){
        try {
            Connection con = auxCon.conectar();
            PreparedStatement ps = con.prepareStatement("update medico set nomM=?, codH=? where codM=?");
            for (int i = 0; i< lista.size();i++){
                if(lista.get(i).getCodP().equals(codM)){
                    numeroAModificar = i;
                }
            }

            ps.setString(1, lista.get(numeroAModificar).getNomP());
            ps.setString(2,  lista.get(numeroAModificar).getCodH1());
            ps.setString(3,  codM);

            verificacion = ps.executeUpdate();

            if(verificacion==0){
                VentanaLabel.mensajeLabel("No existe el medico con el código: " +  codM, label, Color.red);
            }
            else{
                VentanaLabel.mensajeLabel("Medico modificado",label,Color.black);
                setChanged();
                notifyObservers("medico");
            }

        } catch (SQLException e) {
            VentanaLabel.mensajeLabel("ERROR en la modificación del medico",label,Color.red);
        }
    }

    /**
     * Método para eliminar un médico a partir de su código
     * @param lista -> ArrayList de tipo medico con los datos
     * @param codM -> código del médico
     * @param label -> etiqueta de la interfaz para mostrar los mensajes
     */
    public void eliminarMedico(ArrayList<Medico>lista,String codM, JLabel label){
        try {
            Connection con = auxCon.conectar();
            PreparedStatement ps = con.prepareStatement("DELETE FROM medico WHERE codM=?");

            ps.setString(1, codM);

            verificacion= ps.executeUpdate();

            if(verificacion==0){
                VentanaLabel.mensajeLabel(" No existe el médico con tal codigo",label,Color.red);

            }else{
                for (int i = 0; i< lista.size();i++){
                    if(lista.get(i).getCodP().equals(codM)){
                        numeroAModificar = i;
                    }
                }
                lista.remove(numeroAModificar);

                VentanaLabel.mensajeLabel("Médico eliminado",label,Color.black);

                setChanged();
                notifyObservers("medico");
            }

        }catch(SQLException e){
            VentanaLabel.mensajeLabel("Error en la eliminación del medico",label,Color.red);
        }
    }

    /**
     * Método para modificar el ArrayList
     * @param lista -> ArrayList tipo Médico con los datos
     * @param codM -> código del medico
     * @param nombreM -> nombre del médico
     * @param codH -> código del hospital al que pertenece
     */
    public void modificarArray(ArrayList<Medico> lista, String codM, String nombreM, String codH){
        for (int i = 0; i< lista.size();i++){
            if(lista.get(i).getCodP().equals(codM)){
                numeroAModificar = i;
            }
        }
        lista.get(numeroAModificar).setNomP(nombreM);
        lista.get(numeroAModificar).setCodP(codM);
        lista.get(numeroAModificar).setCodH1(codH);
    }

}
