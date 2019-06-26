package helpers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Calendar;

/**
 *
 * @author kdieg
 */
public class Date {

    private int dia;
    private int mes;
    private int anio;

    /**
     *
     */
    public Date() {
        /*
        this.dia = Calendar.DAY_OF_MONTH;
        this.mes = Calendar.MONTH;
        this.anio = Calendar.YEAR;
         */
    }

    /**
     *
     * @param dia Día de la Fecha a Ingresar
     * @param mes Mes de la Fecha a Ingresar
     * @param anio Año de la Fecha a Ingresar
     */
    public Date(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /**
     *
     * @param fecha
     */
    public Date(String fecha) {
        if (fecha.contains("-")) {
            this.dia = Integer.valueOf(fecha.split("-")[0]);
            this.mes = Integer.valueOf(fecha.split("-")[1]);
            this.anio = Integer.valueOf(fecha.split("-")[2]);
        } else if (fecha.contains("/")) {
            this.dia = Integer.valueOf(fecha.split("/")[0]);
            this.mes = Integer.valueOf(fecha.split("/")[1]);
            this.anio = Integer.valueOf(fecha.split("/")[2]);
        } else {
            this.dia = 0;
            this.mes = 0;
            this.anio = 0;
        }
    }

    /**
     *
     * @return
     */
    public int getDia() {
        return dia;
    }

    /**
     *
     * @param dia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     *
     * @return
     */
    public int getMes() {
        return mes;
    }

    /**
     *
     * @param mes
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     *
     * @return
     */
    public int getAnio() {
        return anio;
    }

    /**
     *
     * @param anio
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    /**
     *
     * @return
     */
    public boolean fechaCorrecta() {
        boolean diaCorrecto, mesCorrecto, añoCorrecto;
        añoCorrecto = anio > 0;
        mesCorrecto = mes >= 1 && mes <= 12;
        switch (mes) {
            case 2:
                if (esBisiesto()) {
                    diaCorrecto = dia >= 1 && dia <= 29;
                } else {
                    diaCorrecto = dia >= 1 && dia <= 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                diaCorrecto = dia >= 1 && dia <= 31;
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }

    //Método privado para comprobar si el año es bisiesto
    //Este método lo utiliza el método fechaCorrecta
    private boolean esBisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0);
    }
}
