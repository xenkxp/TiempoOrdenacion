
package algoritmos;

/**
 *
 * @author PROGRAMACION
 */
public abstract class OrdenacionDeVectores {
     
    /**
     *
     */
    protected int [] v;
    
    /**
     *
     * @param v
     */
    public OrdenacionDeVectores(int [] v){
        this.v = v;
    
    }
    
    /**
     *
     */
    public abstract void ordenar ();
    
    
    public abstract String descripcion();
    
    public abstract int[] devolverVector();
}
