package Model;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import Clases.Hospital;
import com.nicosteuerberg.*;
import com.nicosteuerberg.datos.VentanaLabel;

public class MHospital{
    GestionBases auxCon= new GestionBases();
    MMedico auxMed = new MMedico();
    int numeroAModificar;
    int verificacion;
    /**
     * Método para crear un hospital en la base de datos
     * @param lista -> ArrayList de tipo Hospital con el que vamos a añadir un hospital
     * @param label -> etiqueta de la interfaz para mostrar los mensajes
     */
    public void crearHospital(ArrayList<Hospital> lista, JLabel label){
        try {
            Connection con = auxCon.conectar();
            PreparedStatement ps = con.prepareStatement("insert into hospital (codH, nombreH, tipoH, nroHabt) values (?, ?, ?, ?)");

            ps.setString(1, lista.get((lista.size()-1)).getCodH());
            ps.setString(2, lista.get((lista.size())-1).getNombreH());
            ps.setString(3, lista.get((lista.size())-1).getTipoH());
            ps.setInt(4, lista.get((lista.size()-1)).getNroHabitaciones());

            ps.executeUpdate();

            VentanaLabel.mensajeLabel("Hospital añadido", label, Color.black);

        }catch (SQLException e){
            VentanaLabel.mensajeLabel("ERROR a la hora de hacer el insert", label, Color.red);
        }
    }

    /**
     * Modificar el hospital identificandolo por el codigo
     * @param lista -> ArrayList de tipo hospital con los datos
     * @param codH -> Codigo del hospital que se va a modificar
     * @param label -> etiqueta de la interfaz para mostrar los mensajes
     */
    public void modificarHospital(ArrayList<Hospital> lista, String codH, JLabel label){
        try {
            Connection con = auxCon.conectar();
            PreparedStatement ps = con.prepareStatement("update hospital set nombreH=?, tipoH=?,nroHabit=? where codH=?");

            ps.setString(1, lista.get(numeroAModificar).getNombreH());
            ps.setString(2,  lista.get(numeroAModificar).getTipoH());
            ps.setInt(3,  lista.get(numeroAModificar).getNroHabitaciones());
            ps.setString(4,  codH);

            verificacion = ps.executeUpdate();

            if(verificacion==0){
                VentanaLabel.mensajeLabel("No existe el hospital con el código: " +  codH, label, Color.red);
            }
            else{
                VentanaLabel.mensajeLabel("Hospital modificado",label,Color.black);
            }

        } catch (SQLException e) {
            VentanaLabel.mensajeLabel("ERROR en la modificación del hospital",label,Color.red);
        }
    }

    /**
     * Eliminar un hospital de la base de datos a partir de su código
     * @param lista -> ArrayList de tipo hospital con los datos
     * @param codH -> código del hospital
     * @param label -> etiqueta de la interfaz para mostrar los mensajes
     */
    public void eliminarHospital(ArrayList<Hospital> lista, String codH, JLabel label){
        numeroAModificar = lista.indexOf(codH);
        lista.remove(numeroAModificar);
        try {
            Connection con = auxCon.conectar();
            PreparedStatement ps = con.prepareStatement("delete from hospital where nif=?");

            ps.setString(1,codH);

            verificacion = ps.executeUpdate();

            if(verificacion==0){
                VentanaLabel.mensajeLabel("No existe el hospital con el código: " + codH,label,Color.black);
            }
            else{
                VentanaLabel.mensajeLabel("Alumno eliminado", label, Color.red);
            }

        }catch (SQLException e){
            VentanaLabel.mensajeLabel("ERROR en el borrado del hospital", label, Color.red);
        }
    }

    public void cambiarTabla(ArrayList<Hospital> lista, JTable tabla){

    }

    public void modificarArray(ArrayList<Hospital> lista, String codH, String nombreH, String tipoH, int nroHabitaciones){
        numeroAModificar = lista.indexOf(codH);
        lista.get(numeroAModificar).setNombreH(nombreH);
        lista.get(numeroAModificar).setNroHabitaciones(nroHabitaciones);
        lista.get(numeroAModificar).setTipoH(tipoH);
    }

    /**
     * Metodo para modificar el numero de médicos cuando se añada un médico o se modifique
     * @param lista -> ArrayList de tipo hospital con los datos
     * @param codH -> código del hospital
     * @param numeroMedico -> numero de médicos
     * @param label -> etiqueta de la interfaz para mostrar los mensajes
     */
    public void modificarNroMedico(ArrayList<Hospital> lista, String codH, int numeroMedico,JLabel label){
        numeroAModificar = lista.indexOf(codH);
        lista.get(numeroAModificar).setNroMedicos(numeroMedico);
        try {
            Connection con = auxCon.conectar();

            PreparedStatement ps = con.prepareStatement("update hospital set nroM=? where codH=?");

            ps.setInt(1, numeroMedico);
            ps.setString(2,  codH);

            verificacion = ps.executeUpdate();

            if(verificacion==0){
                VentanaLabel.mensajeLabel("No existe el hospital con el código: " +  codH, label, Color.red);
            }
            else{
                VentanaLabel.mensajeLabel("Hospital modificado",label,Color.black);
            }

        } catch (SQLException e) {
            VentanaLabel.mensajeLabel("ERROR en la modificación del hospital",label,Color.red);
        }
    }
}
