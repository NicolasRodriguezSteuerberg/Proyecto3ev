package Model;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.nicosteuerberg.*;
import com.nicosteuerberg.datos.VentanaLabel;

public class MHospital{
    GestionBases auxCon= new GestionBases();
    MMedico auxMed = new MMedico();
    int verificacion;
    /**
     * Método para crear un hospital en la base de datos
     * @param codH -> codigo del hospital
     * @param nombreH -> nombre del hospital
     * @param tipoH -> tipo del hospital (público, privado)
     * @param nroHabit -> numero de habitaciones que hay en el hospital
     * @param label -> etiqueta de la interfaz para mostrar los mensajes
     */
    public void crearHospital(String codH, String nombreH, String tipoH, int nroHabit, JLabel label){
        try {
            Connection con = auxCon.conectar();
            PreparedStatement ps = con.prepareStatement("insert into hospital (codH, nombreH, tipoH, nroHabt) values (?, ?, ?, ?)");

            ps.setString(1, codH);
            ps.setString(2, nombreH);
            ps.setString(3, tipoH);
            ps.setInt(4, nroHabit);

            ps.executeUpdate();

            VentanaLabel.mensajeLabel("Hospital añadido", label, Color.black);

        }catch (SQLException e){
            VentanaLabel.mensajeLabel("ERROR a la hora de hacer el insert", label, Color.red);
        }
    }

    /**
     * Modificar el hospital identificandolo por el codigo
     * @param codH -> codigo del hospital
     * @param nombreH -> nombre del hospital
     * @param tipoH -> tipo del hospital (público, privado)
     * @param nroHabit -> numero de habitaciones que hay en el hospital
     * @param label -> etiqueta de la interfaz para mostrar los mensajes
     */
    public void modificarHospital(String codH, String nombreH, String tipoH, int nroHabit, JLabel label){
        try {
            Connection con = auxCon.conectar();
            PreparedStatement ps = con.prepareStatement("update hospital set nombreH=?, tipoH=?,nroHabit=? where codH=?");

            ps.setString(1, nombreH);
            ps.setString(2, tipoH);
            ps.setInt(3, nroHabit);
            ps.setString(4, codH);

            verificacion = ps.executeUpdate();

            if(verificacion==0){
                VentanaLabel.mensajeLabel("No existe el hospital con el código: " + codH, label, Color.red);
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
     * @param codH -> código del hospital
     * @param label -> etiqueta de la interfaz para mostrar los mensajes
     */
    public void eliminarHospital(String codH, JLabel label){
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
}
