package Model;

import Clases.Hospital;
import Clases.Medico;
import Clases.Paciente;
import java.sql.*;
import java.util.ArrayList;

public class GestionBases {

    String bd = "proyecto3";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;

    public Connection conectar() {
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url + bd, user, password);
            System.out.println("SE HA CONECTADO A BD: " + bd);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("NO SE PUDO CONECTAR A BD: " + bd);
        }
        return cx;
    }

    public static void crearArrayList(ArrayList<Hospital> lHospital, ArrayList<Medico> lMedico, ArrayList<Paciente> lPaciente){

    }

    public void desconectar() {
        try {
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: No puede desconectarse a la BD.");
        }

    }
}