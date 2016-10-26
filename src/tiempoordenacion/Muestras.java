/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempoordenacion;

/**
 *
 * @author E008
 */
public class Muestras {
    private String tipoOrd;
    private int tam;
    private String tipoIni;
    private double timeMiliSec;
    private String date;
    
    public Muestras(){
        this.tipoOrd = "";
        this.tam = 0;
        this.tipoIni = "";
        this.timeMiliSec=0;
        this.date = "";
        
    }
     public Muestras(String tipoOrd,int tam,String tipoIni,double timeMiliSec,String date)
     {
        this.tipoOrd = tipoOrd;
        this.tam = tam;
        this.timeMiliSec = timeMiliSec;
        this.tipoIni =  tipoIni;
        this.date = date;
     }

    /**
     * @return the tipoOrd
     */
    public String getTipoOrd() {
        return tipoOrd;
    }

    /**
     * @param tipoOrd the tipoOrd to set
     */
    public void setTipoOrd(String tipoOrd) {
        this.tipoOrd = tipoOrd;
    }

    /**
     * @return the tam
     */
    public int getTam() {
        return tam;
    }

    /**
     * @param tam the tam to set
     */
    public void setTam(int tam) {
        this.tam = tam;
    }

    /**
     * @return the tipoIni
     */
    public String getTipoIni() {
        return tipoIni;
    }

    /**
     * @param tipoIni the tipoIni to set
     */
    public void setTipoIni(String tipoIni) {
        this.tipoIni = tipoIni;
    }

    /**
     * @return the timeMiliSec
     */
    public double getTimeMiliSec() {
        return timeMiliSec;
    }

    /**
     * @param timeMiliSec the timeMiliSec to set
     */
    public void setTimeMiliSec(double timeMiliSec) {
        this.timeMiliSec = timeMiliSec;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    
}
