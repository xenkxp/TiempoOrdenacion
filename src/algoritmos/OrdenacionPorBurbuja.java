
package algoritmos;

/**
 *
 * @author Eva
 */
public class OrdenacionPorBurbuja extends OrdenacionDeVectores{
    
    private int [] v1 = null; // Vector original - desordenado
    
    /**
     *
     * @param v
     */
    public OrdenacionPorBurbuja(int [] v){
        super(v);
        v1 = v;
    
    }
    
    /**
     *
     */
    @Override
    public void ordenar() {
        v = v1.clone();
        
        int aux;
        
        for (int i=0; i<v.length-1; i++) {
            for (int j=v.length-1; j>i; j--) {
                if (v[j] < v[j-1]){
                    aux = v[j];
                    v[j] = v[j-1];
                    v[j-1] = aux;
                }
            }
        }
    }
    
    /**
     *
     * @return
     */
    @Override
    public String descripcion() {
        return "Ordena el vector utilizando Ordenacion por Burbuja";
    }

    @Override
    public int[] devolverVector() {
        return v;
    }
    
   
}
