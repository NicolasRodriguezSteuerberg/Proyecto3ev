package Model;

import Clases.Hospital;
import Clases.Medico;
import Clases.Paciente;
import Controller.Controller;
import View.Vista;
import View.pHospital;

import javax.swing.*;
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

    public void crearArrayList(ArrayList<Hospital> lHospital, ArrayList<Medico> lMedico, ArrayList<Paciente> lPaciente){
        PreparedStatement ps;
        ResultSet rs;

        try{
            Connection con = conectar();

            //Para el hospital
            ps=con.prepareStatement("SELECT codH,nombreH,tipoH,nroM,nroHabt FROM hospital");
            rs=ps.executeQuery();

            while(rs.next()){
                lHospital.add(new Hospital(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5)));
                Controller.añadirFila(Vista.TABLAHOSPITAL,lHospital.size()-1);
            }

            //Para los medicos
            ps=con.prepareStatement("SELECT codM,nomM,codH FROM medico");
            rs=ps.executeQuery();

            while(rs.next()){
                lMedico.add(new Medico(rs.getString(1),rs.getString(2),rs.getString(3)));
                Controller.añadirFila(Vista.TABLAMEDICO, lMedico.size()-1);
            }

            //Para los pacientes
            ps=con.prepareStatement("SELECT codP,nomP,codM FROM paciente");
            rs=ps.executeQuery();

            while(rs.next()){
                lPaciente.add(new Paciente(rs.getString(1),rs.getString(2),rs.getString(3)));
                Controller.añadirFila(Vista.TABLAPACIENTE, lPaciente.size()-1);
            }


        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public void desconectar() {
        try {
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: No puede desconectarse a la BD.");
        }

    }
}