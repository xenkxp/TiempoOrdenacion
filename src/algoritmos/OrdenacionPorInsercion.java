
package algoritmos;

/**
 *
 * @author Eva
 */
public class OrdenacionPorInsercion extends OrdenacionDeVectores {
    
    private int [] v1 = null;
           
    /**
     *
     * @param v
     */
    public OrdenacionPorInsercion(int [] v) {
       super(v);
       v1 = v;
       
    }
    
    /**
     *
     */
    @Override
    public void ordenar() {
        v = v1.clone();

        int i, j;
        int x;

        for (i=1; i<v.length; i++) {
            j=i;
            x=v[i];
            while (j>0 && v[j-1]>x) {
                v[j] = v[j-1];
                j--;
            }
            v[j] = x;
        }
    }
    
    /**
     *
     * @return
     */
    @Override
    public String descripcion() {
    
       return "Ordena el vector utilizando Ordenación por Inserción";
    }
    @Override
    public int[] devolverVector() {
        return v;
    }
    
 
}
