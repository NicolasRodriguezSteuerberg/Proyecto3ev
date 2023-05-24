package Model;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import Clases.Paciente;
import com.nicosteuerberg.datos.VentanaLabel;

import javax.swing.*;

public class MPaciente{
    GestionBases auxCon= new GestionBases();
    int verificacion;

    public void crearPaciente(String codP, String nomP, String codM, JLabel label){
        try {
            Connection con = auxCon.conectar();
            PreparedStatement ps = con.prepareStatement("INSERT INTO paciente(codP,nomP,codM) VALUES (?,?,?)");

            ps.setString(1, codP);
            ps.setString(2, nomP);
            ps.setString(3, codM);

            ps.executeUpdate();
            VentanaLabel.mensajeLabel("Paciente creado",label, Color.black);

        } catch (SQLException e) {
            VentanaLabel.mensajeLabel("ERROR a la hora de hacer el insert",label,Color.red);
        }

    }

    public void modificarPaciente(String codP, String nomP, String codM, JLabel label){
        try {
            Connection con = auxCon.conectar();
            PreparedStatement ps = con.prepareStatement("UPDATE paciente SET codM=?,nomP=? WHERE codP=?");

            ps.setString(1, codM);
            ps.setString(2, nomP);
            ps.setString(3, codP);

            verificacion=ps.executeUpdate();
            if(verificacion==0){
                VentanaLabel.mensajeLabel("No existe el paciente con el codigo "+codP,label,Color.red);
            }else {
                VentanaLabel.mensajeLabel("Paciente modificado", label, Color.black);
            }

        }catch(SQLException e){
            VentanaLabel.mensajeLabel("ERROR en la modificación del hospital",label,Color.red);
        }
    }

    public void eliminarPaciente(String codP, JLabel label){
        try {
            Connection con = auxCon.conectar();
            PreparedStatement ps = con.prepareStatement("DELETE FROM paciente WHERE codP=?");

            ps.setString(1, codP);

            verificacion=ps.executeUpdate();
            if(verificacion==0){
                VentanaLabel.mensajeLabel("No existe el paciente con el codigo "+codP,label,Color.red);
            }else {
                VentanaLabel.mensajeLabel("Paciente eliminado", label, Color.black);
            }

        }catch(SQLException e){
            VentanaLabel.mensajeLabel("ERROR en la eliminación del paciente",label,Color.red);
        }
    }
}
