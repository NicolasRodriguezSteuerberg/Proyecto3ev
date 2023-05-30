package Model;

import java.awt.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import Clases.Hospital;
import Clases.Medico;
import com.nicosteuerberg.datos.VentanaLabel;

import javax.swing.*;
import java.sql.*;

public class MMedico{
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
            PreparedStatement ps = con.prepareStatement("UPDATE medico SET nomM=?,codH=? WHERE codM=?");

            ps.setString(1, lista.get(numeroAModificar).getNomP());
            ps.setString(2, lista.get(numeroAModificar).getCodH1());
            ps.setString(3, codM);

            verificacion=ps.executeUpdate();
            if(verificacion==0){
                VentanaLabel.mensajeLabel("No existe el medico con el codigo "+codM,label,Color.red);
            }else {
                VentanaLabel.mensajeLabel("Medico modificado", label, Color.black);
            }

        }catch(SQLException e){
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
        numeroAModificar=lista.indexOf(codM);
        lista.remove(numeroAModificar);
        try {
            Connection con = auxCon.conectar();
            PreparedStatement ps = con.prepareStatement("DELETE FROM medico WHERE codM=?");

            ps.setString(1, codM);

            verificacion= ps.executeUpdate();

            if(verificacion==0){
                VentanaLabel.mensajeLabel(" No existe el médico con tal codigo",label,Color.red);

            }else{
                VentanaLabel.mensajeLabel("Médico eliminado",label,Color.black);

            }

        }catch(SQLException e){
            VentanaLabel.mensajeLabel("Error en la eliminación del medico",label,Color.red);
        }
    }

    /**
     * Método para contar la cantidad de médicos en la base de datos
     * @param codH -> codigo del hospital al que pertenece el medico
     * @param label -> etiqueta de la interfaz para mostrar los mensajes
     * @return cantidad de médicos en el hospital respectivamente
     */
    public int contarMedicos(String codH, JLabel label){
        int valor=0;
        try {
            Connection con = auxCon.conectar();
            ResultSet rs;
            PreparedStatement ps = con.prepareStatement("SELECT COUNT(*) FROM medico WHERE codH=?");

            ps.setString(1, codH);

            rs=ps.executeQuery();
            valor = rs.getInt(1);
        }catch(SQLException e){
            VentanaLabel.mensajeLabel("Error al contar los medicos",label,Color.red);
        }

        return valor;
    }

    /**
     * Método para modificar el ArrayList
     * @param lista -> ArrayList tipo Médico con los datos
     * @param codM -> código del medico
     * @param nombreM -> nombre del médico
     * @param codH -> código del hospital al que pertenece
     */
    public void modificarArray(ArrayList<Medico> lista, String codM, String nombreM, String codH){
        numeroAModificar = lista.indexOf(codM);
        lista.get(numeroAModificar).setNomP(nombreM);
        lista.get(numeroAModificar).setCodP(codM);
        lista.get(numeroAModificar).setCodH1(codH);
    }

}
