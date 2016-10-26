
package algoritmos;

/**
 *
 * @author PROGRAMACION
 */
public class OrdenacionPorSeleccion extends OrdenacionDeVectores {
  
    int [] v1 = null;
    
    /**
     *
     * @param v
     */
    public OrdenacionPorSeleccion(int [] v){
    
       super(v);
       v1 = v;
    }
    
    /**
     *
     */
    @Override
    public void ordenar() {
        
         v = v1.clone();
    
        for(int i=0; i<v.length-1; ++i){
            
            int posMin = i;
            
            for (int j=i+1; j<v.length; j++){
                
                if (v[j]<v[posMin]){
                    posMin = j;
                }
            }
            
            // intercambio
            int aux = v[i];
            v[i] = v[posMin];
            v[posMin]= aux;
        }
        /*
        String texto="";
         for (int i = 0; i<v.length; i++)
        {
            texto = texto + v[i]+ ", ";       
        }
        System.out.println(texto);*/
    }
    
    /**
     *
     * @return
     */
    @Override
    public String descripcion() {
    
       return "Ordena el vector utilizando Ordenación por Selección";
    }
    @Override
    public int[] devolverVector() {
        return v;
    }
}
