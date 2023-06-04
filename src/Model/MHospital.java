package Model;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import Clases.Hospital;
import com.nicosteuerberg.datos.VentanaLabel;

public class MHospital extends Observable {
    GestionBases auxCon= new GestionBases();
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
            PreparedStatement ps = con.prepareStatement("insert into hospital (codH, nombreH, tipoH, nroM, nroHabt) values (?, ?, ?, ?, ?)");

            ps.setString(1, lista.get((lista.size()-1)).getCodH());
            ps.setString(2, lista.get((lista.size()-1)).getNombreH());
            ps.setString(3, lista.get((lista.size()-1)).getTipoH());
            ps.setInt(4, lista.get((lista.size()-1)).getNroMedicos());
            ps.setInt(5, lista.get((lista.size()-1)).getNroHabitaciones());

            ps.executeUpdate();

            VentanaLabel.mensajeLabel("Hospital añadido", label, Color.black);

            setChanged();
            notifyObservers("hospital");

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
            PreparedStatement ps = con.prepareStatement("update hospital set nombreH=?, tipoH=?,nroHabt=? where codH=?");
            for (int i = 0; i< lista.size();i++){
                if(lista.get(i).getCodH().equals(codH)){
                    numeroAModificar = i;
                }
            }

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
                setChanged();
                notifyObservers("hospital");
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
        try {
            Connection con = auxCon.conectar();
            PreparedStatement ps = con.prepareStatement("DELETE FROM hospital WHERE codH=?");

            ps.setString(1,codH);

            verificacion = ps.executeUpdate();

            if(verificacion==0){
                VentanaLabel.mensajeLabel("No existe el hospital con el código: " + codH,label,Color.red);
            }
            else{
                for (int i = 0; i< lista.size();i++){
                    if(lista.get(i).getCodH().equals(codH)){
                        numeroAModificar = i;
                    }
                }
                lista.remove(numeroAModificar);

                VentanaLabel.mensajeLabel("Hospital eliminado", label, Color.black);

                setChanged();
                notifyObservers("hospital");
            }

        }catch (SQLException e){
            VentanaLabel.mensajeLabel("ERROR en el borrado del hospital", label, Color.red);
        }
    }

    /**
     * Metodo para modificar el arrayList
     * @param lista -> ArrayList tipo hospital con los datos
     * @param codH -> código de hospital
     * @param nombreH -> nombre de hospital
     * @param tipoH -> tipo de hospital
     * @param nroHabitaciones -> número de habitaciones de hospital
     */
    public void modificarArray(ArrayList<Hospital> lista, String codH, String nombreH, String tipoH, int nroHabitaciones){
        for (int i = 0; i< lista.size();i++){
            if(lista.get(i).getCodH().equals(codH)){
                numeroAModificar = i;
            }
        }
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

    public void cambiarNroMedicos(ArrayList<Hospital> lista, JLabel label){
        try {
            Connection con = auxCon.conectar();
            ResultSet rs;

            for (int i = 0; i < lista.size(); i++) {
                PreparedStatement ps = con.prepareStatement("SELECT COUNT(*) FROM medico WHERE codH=?");
                ps.setString(1,lista.get(i).getCodH());
                rs= ps.executeQuery();

                PreparedStatement ps1 = con.prepareStatement("update hospital set nroM=? where codH=?");
                ps1.setInt(1,rs.getInt(1));
                ps1.setString(2, lista.get(i).getCodH());
                rs = ps1.executeQuery();
            }
        }catch (SQLException e){
            VentanaLabel.mensajeLabel("Error al cambiar los médicos",label,Color.red);
        }
    }

}
