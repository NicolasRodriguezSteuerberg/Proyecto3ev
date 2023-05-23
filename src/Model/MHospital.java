package Model;

import java.util.ArrayList;

public class MHospital{
    GestionBases auxCon= new GestionBases();

    public void crearHospital(String codH,String nombreH,String tipoH,int nroMedico, int nroHabit){
        auxCon.conectar();
    }
}
