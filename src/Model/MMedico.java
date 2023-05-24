package Model;

import java.awt.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import Clases.Medico;
import com.nicosteuerberg.datos.VentanaLabel;

import javax.swing.*;
import java.sql.*;

public class MMedico{
    GestionBases auxCon= new GestionBases();
    int verificacion;

    /**
     * Crear Médico en la base de Datos
     * @param codM -> codigo del médico
     * @param nombreM -> nombre del médico
     * @param codH -> codigo referente del hospital donde trabaja
     * @param label -> mensaje popout en interfaz
     */
    public void crearMedico(String codM, String nombreM,String codH, JLabel label) {
        try {
            Connection con = auxCon.conectar();

            PreparedStatement ps = con.prepareStatement("INSERT INTO medico (codM,nomM,codH) VALUES (?,?,?)");


            ps.setString(1, codM);
            ps.setString(2, nombreM);
            ps.setString(3, codH);

            ps.executeUpdate();

                VentanaLabel.mensajeLabel("Médico creado", label, Color.black);

        } catch (SQLException e) {
            VentanaLabel.mensajeLabel("ERROR a la hora de hacer el insert",label,Color.red);
        }

    }

    public void modificarMedico(String codM, String nombreM,String codH, JLabel label){
        try {
            Connection con = auxCon.conectar();
            PreparedStatement ps = con.prepareStatement("UPDATE medico SET nomM=?,codH=? WHERE codM=?");

            ps.setString(1, nombreM);
            ps.setString(2, codH);
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

    public void eliminarMedico(String codM, JLabel label){
        try {
            Connection con = auxCon.conectar();
            PreparedStatement ps = con.prepareStatement("DELETE FROM medico WHERE codM=?");

            ps.setString(1, codM);

            ps.executeUpdate();
            VentanaLabel.mensajeLabel("Médico eliminado",label,Color.black);

        }catch(SQLException e){
            VentanaLabel.mensajeLabel("Error en la eliminación del medico",label,Color.red);
        }
    }

}
