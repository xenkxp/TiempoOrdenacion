
package inicializacion;


public class InicializacionAleatoria implements InicializacionDeVectores{
    
    @Override
    /* public void inicializar (int [] v) {
        java.util.Random rand = new java.util.Random();
        for (int i=0; i<v.length; i++) {
            v[i] = rand.nextInt() % 101;
            
        }    
    } */
    
    public void inicializar (int [] v) {
        
        java.util.Random rand = new java.util.Random();
        
        for (int i=0; i<v.length; i++){
            // Rellenamos el vector con n�meros aleatorios con valor m�x. 10.000.000
            v[i] = rand.nextInt(10000000); 
            //System.out.println("Posicion: " +i+ " N�mero: " +v[i]);
       
        }
    }
    
    @Override
    public String descripcion () {
        return "Se ha generado un vector con Inicializaci�n Aleatoria";
    
    }

    public void inicializar(int tamanio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
              
    
    
}
