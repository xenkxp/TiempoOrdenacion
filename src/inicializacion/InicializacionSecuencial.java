
package inicializacion;

import inicializacion.InicializacionDeVectores;

/**
 *
 * @author usuario
 */
public class InicializacionSecuencial implements InicializacionDeVectores {
    
    // Inicialización secuencial descendente (vector totalmente desordenado
    @Override
    public void inicializar (int [] v){
     for (int i=1; i<=v.length; i++){  
            v[v.length-i] = i + 1; 
             
        }
    }
    
    @Override
    public String descripcion() {
        return "Se ha generado un vector con Inicialización Secuencial";
    }
}
