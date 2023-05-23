package Model;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class MHospital{
    GestionBases auxCon= new GestionBases();
    MMedico auxMed = new MMedico();

    /**
     * Crear hospital (insert en la tabla hospital)
     * @param codH -> codigo del hospital
     * @param nombreH -> nombre del hospital
     * @param tipoH -> tipo del hospital (público, privado)
     * @param nroHabit -> numero de habitaciones que hay en el hospital
     * @param label -> etiqueta de la interfaz
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

            label.setForeground(Color.black);
            label.setText("Hospital añadido");

        }catch (SQLException e){
            label.setText("ERROR a la hora de hacer el insert");
            label.setForeground(Color.red);
        }
    }

    public void modificarHospital(String codH, String nombreH, String tipoH, int nroHabit, JLabel label){

    }


}
