package Clases;

public class Paciente {
    String codP, nomP, codMed1;

    /**
     * Constructor paciente
     * @param codP -> codigo del paciente
     * @param nomP -> nombre del paciente
     * @param codMed1 -> código del médico que tiene asignado
     */
    public Paciente(String codP, String nomP, String codMed1) {
        this.codP = codP;
        this.nomP = nomP;
        this.codMed1 = codMed1;
    }

    /**
     * @return mensaje con la información del paciente
     */
    @Override
    public String toString() {
        return  "codigo del paciente: " + codP +
                ", nombre: " + nomP +
                ", codigo del médico: " + codMed1;
    }

    //setters y getters
    public String getCodP() {
        return codP;
    }

    public void setCodP(String codP) {
        this.codP = codP;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public String getCodMed1() {
        return codMed1;
    }

    public void setCodMed1(String codMed1) {
        this.codMed1 = codMed1;
    }
}
