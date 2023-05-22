package Clases;

public class Medico {
    String codMed, nomMed, codH1;

    /**
     * Constructor del médico
     * @param codMed -> codigo del médico (codigo primario)
     * @param nomMed -> nombre del médico
     * @param codH1 -> código del hospital donde trabaja
     */
    public Medico(String codMed, String nomMed, String codH1) {
        this.codMed = codMed;
        this.nomMed = nomMed;
        this.codH1 = codH1;
    }

    /**
     * @return mensaje con la información del médico
     */
    @Override
    public String toString() {
        return  "Codigo del médico: " + codMed +
                ", nombre: " + nomMed +
                ", codigo del hospital: " + codH1;
    }

    //setters y getters
    public String getCodMed() {
        return codMed;
    }

    public void setCodMed(String codMed) {
        this.codMed = codMed;
    }

    public String getNomMed() {
        return nomMed;
    }

    public void setNomMed(String nomMed) {
        this.nomMed = nomMed;
    }

    public String getCodH1() {
        return codH1;
    }

    public void setCodH1(String codH1) {
        this.codH1 = codH1;
    }
}
