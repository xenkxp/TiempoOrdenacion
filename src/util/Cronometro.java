package util;


public class Cronometro {

    private java.util.Date t1, t2;
    
    public Cronometro () {

    }
    
    // Guarda la hora del sistema
    public void iniciar() {
        t1 = new java.util.Date();               
    }
    
    /* Devuelve el tiempo transcurrido en milisegundos desde 
     *  la última inicializacion.
     */
    public double tiempo() {
        t2 = new java.util.Date();        
        return (t2.getTime () - t1.getTime());
        
    }
    
    
    
    
}
