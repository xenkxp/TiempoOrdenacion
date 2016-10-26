package algoritmos;

/**
 *
 * @author PROGRAMACION
 */
public class OrdenacionPorQsortMedio extends OrdenacionDeVectores {

    private int [] v1 = null;
    
    /**
     *
     * @param v
     */
    public OrdenacionPorQsortMedio(int [] v) {
       super(v);
       v1 = v;
    }
    
   
    private void qsort (int [] v, int izq, int der) {
    
    int i, j;
    int pivote, aux1;

    // Inicializamos los indices
    i=izq;
    j=der;

    pivote = v[(izq+der)/2];


    // Mientras los Ã­ndices no se crucen
    while (i<=j) {

        // Avanzamos i hasta encontrar un elemento mayor o igual que el pivote
        while (v[i]<pivote) {
          i++;
        }
        // Retrocedemos j hasta encontrar un elmento menor o igual que el pivote
        while (v[j]>pivote){
            j--;   
        }
        if (i<=j) {

            // Intercambios los elementos para dejar el menor a la izq y le mayor a la drch
            aux1=v[i];
            v[i]=v[j];
            v[j]=aux1;
            i=i+1;
            j=j-1;
        }

        }

        if (izq < j) {

           qsort(v, izq, j);
        }

        if (der>i) {

           qsort(v, i, der); 
        }
           
    }
    
    /**
     *
     */
    @Override
    public void ordenar() {
        v = v1.clone();
        qsort (v, 0, v.length-1);
    }
    
    /**
     *
     * @return
     */
    @Override
    public String descripcion() {
    
       return "Ordena el vector utilizando Ordenación por Quicksort";
    }
    public int[] devolverVector() {
        return v;
    }
}