package Model;

import java.awt.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import Clases.Medico;

import javax.swing.*;
import java.sql.*;

public class MMedico{
    GestionBases auxCon= new GestionBases();

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
            PreparedStatement ps = con.prepareStatement("INSERT INTO medico(codM,nomM,codH) VALUES (?,?,?)");

            ps.setString(1, codM);
            ps.setString(2, nombreM);
            ps.setString(3, codH);

            ps.executeUpdate();
            label.setForeground(Color.black);
            label.setText("Médico añadido!");

        } catch (SQLException e) {
            label.setText("ERROR: insert fallido");
            label.setForeground(Color.red);
        }

    }

}
