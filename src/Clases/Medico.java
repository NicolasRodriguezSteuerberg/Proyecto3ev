package Clases;

public class Medico {
    String codMed, nomMed, codH1;

    public Medico(String codMed, String nomMed, String codH1) {
        this.codMed = codMed;
        this.nomMed = nomMed;
        this.codH1 = codH1;
    }

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
