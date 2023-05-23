package Clases;

public class Persona {
    String codP, nomP;

    public Persona(String codP, String nomP) {
        this.codP = codP;
        this.nomP = nomP;
    }

    @Override
    public String toString() {
        return "codP: " + codP + ", nomP: " + nomP;
    }

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
}
