package Clases;

public class Hospital {
    String codH, nombreH, tipoH;
    int nroMedicos, nroHabitaciones;

    /**
     * Constructor de Hospital
     * @param codH -> codigo primario (codigo hospital)
     * @param nombreH -> nombre hospital
     * @param tipoH -> tipo de hospital (público o privado)
     * @param nroMedicos -> cuantos médicos tiene el hospital
     * @param nroHabitaciones -> cuantas habitaciones tiene el hospital
     */
    public Hospital(String codH, String nombreH, String tipoH, int nroMedicos, int nroHabitaciones) {
        this.codH = codH;
        this.nombreH = nombreH;
        this.tipoH = tipoH;
        this.nroMedicos = nroMedicos;
        this.nroHabitaciones = nroHabitaciones;
    }

    /**
     * @return mensaje con la información del hospital
     */
    @Override
    public String toString() {
        return  "codigo del hospital: " + codH +
                ", nombre: " + nombreH +
                ", tipo: " + tipoH +
                ", numero de medicos: " + nroMedicos +
                ", numero de habitaciones: " + nroHabitaciones;
    }

    //setters y getters
    public String getCodH() {
        return codH;
    }

    public void setCodH(String codH) {
        this.codH = codH;
    }

    public String getNombreH() {
        return nombreH;
    }

    public void setNombreH(String nombreH) {
        this.nombreH = nombreH;
    }

    public String getTipoH() {
        return tipoH;
    }

    public void setTipoH(String tipoH) {
        this.tipoH = tipoH;
    }

    public int getNroMedicos() {
        return nroMedicos;
    }

    public void setNroMedicos(int nroMedicos) {
        this.nroMedicos = nroMedicos;
    }

    public int getNroHabitaciones() {
        return nroHabitaciones;
    }

    public void setNroHabitaciones(int nroHabitaciones) {
        this.nroHabitaciones = nroHabitaciones;
    }
}
