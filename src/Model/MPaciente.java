package Model;

import java.util.ArrayList;
import Clases.Paciente;

public class MPaciente{
    GestionBases auxCon= new GestionBases();

    public void crearPaciente(String codP, String nomP, String codM){
        auxCon.conectar();
    }
}
