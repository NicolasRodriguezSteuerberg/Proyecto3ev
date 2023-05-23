package Model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            //Logger.getLogger(ProyectoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }

    public void desconectar() {
        try {
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: No puede desconectarse a la BD.");
        }

    }
}