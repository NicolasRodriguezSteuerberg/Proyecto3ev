package Clases;

public class Paciente extends Persona{
    String codMed1;

    /**
     * Constructor paciente
     * @param codP -> codigo del paciente
     * @param nomP -> nombre del paciente
     * @param codMed1 -> código del médico que tiene asignado
     */
    public Paciente(String codP, String nomP, String codMed1) {
        super(codP,nomP);
        this.codMed1 = codMed1;
    }

    /**
     * @return mensaje con la información del paciente
     */
    @Override
    public String toString() {
        return  "codP: " + codP + ", nomP: " + nomP + "codMed1: " + codMed1;
    }

    public String getCodMed1() {
        return codMed1;
    }

    public void setCodMed1(String codMed1) {
        this.codMed1 = codMed1;
    }
}
