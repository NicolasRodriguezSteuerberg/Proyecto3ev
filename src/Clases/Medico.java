package Clases;

public class Medico extends Persona{
    String codH1;

    /**
     * Constructor del médico
     * @param codMed -> codigo del médico (codigo primario)
     * @param nomMed -> nombre del médico
     * @param codH1 -> código del hospital donde trabaja
     */
    public Medico(String codMed, String nomMed, String codH1) {
        super(codMed,nomMed);
        this.codH1 = codH1;
    }

    /**
     * @return mensaje con la información del médico
     */
    @Override
    public String toString() {
        return  "codMedico: " + codP + ", nomP: " + nomP + "codH1: " + codH1;
    }

    //setters y getters
    
    public String getCodH1() {
        return codH1;
    }

    public void setCodH1(String codH1) {
        this.codH1 = codH1;
    }
}
