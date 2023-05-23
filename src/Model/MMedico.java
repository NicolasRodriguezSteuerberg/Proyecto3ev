package Model;

import java.util.ArrayList;
import Clases.Medico;

public class MMedico{
    GestionBases auxCon= new GestionBases();

    public void crearMedico(String codM, String nombreM,String codH){
        auxCon.conectar();
    }
}
