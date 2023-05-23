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
            PreparedStatement ps = con.prepareStatement("INSERT INTO proyecto3(codM,nomM,codH) VALUES (?,?,?)");

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

    /**
     * método para contar la cantidad de médicos en un hospital en específico
     * @param codH -> código de hospital donde trabaja
     * @param label -> mensaje popout  en interfaz
     * @return
     */
        public int contarMedico(String codH, JLabel label){
            int numero=0;
            try{
                Connection con=auxCon.conectar();
                PreparedStatement ps=con.prepareStatement("SELECT COUNT(*) FROM medico WHERE codH=?");
                ps.setString(1, codH);
                ResultSet rs= ps.executeQuery();

                numero=((Number) rs.getObject(1)).intValue();


            }catch(SQLException e){
                label.setText("ERROR: select fallido");
                label.setForeground(Color.red);
            }
            return numero;
        }

}
