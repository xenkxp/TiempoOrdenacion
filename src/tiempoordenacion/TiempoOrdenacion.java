package tiempoordenacion;


import algoritmos.*;
import inicializacion.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import util.Cronometro;
import util.Pantalla;

/**
 *
 * @author E008
 */
public class TiempoOrdenacion {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salir = false;
        Pantalla pantalla = new Pantalla();
        InicializacionDeVectores ini;
        int option;
        
        pantalla.mostrarBienvenida();
        
        do{
            //Menu inicio
            option = pantalla.menuini();
            if(option==1)
            {
                //Recojemos el tamaño del array
                int[]v = new int[pantalla.genMuestra.getTam()];
                //Iniciamos el vector con la opcion seleccionada
                ini = pantalla.inicializacion();
                
                if(ini != null)
                    ini.inicializar(v);
                //Seleccionamos la ordenacion de la muestra y creamos su respectivo.
                OrdenacionDeVectores ord = null;
                ord = pantalla.seleccionarOrdenacion(ord, v);
                //Tomamos los tiempos de ordenacion
                Cronometro cron = new Cronometro();
                cron.iniciar();
                ord.ordenar();
                double result = cron.tiempo();
                //Comprobamos si 1 no son suficiente
                if(result == 0)
                {
                    System.out.println("\n\t Calculando 100...  1 no eran suficientes!!!\n");
                    cron.iniciar();
                    for (int i = 0; i < 100; i++) {
                       ord.ordenar();
                    }
                    result = cron.tiempo();
                    //Halllamos la media
                    result = result /100;
                    //Comprobamos si 100 no son suficiente
                    if(result == 0)
                    {
                        System.out.println("\n\tCalculando 1000... 100 no eran suficientes!!!\n");
                        cron.iniciar();
                        for (int i = 0; i < 1000; i++) {
                        ord.ordenar();
                        }
                        result = cron.tiempo();
                        //Halllamos la media
                        result = result /1000;
                    }
                     
                }
                //Guardamos el tiempo en su objeto muestra
                pantalla.genMuestra.setTimeMiliSec(result);
                //Formateamos la fecha
                Date date;
                String outDate;
                SimpleDateFormat newDateFormat;
                newDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                date = new Date();
                outDate = newDateFormat.format(date);
                //Ingresamos la fecha en el objeto muestra.
                pantalla.genMuestra.setDate(outDate);
                //Visualizamos el resultado
                System.out.printf("%-20s %-20s %-20s %-20s %-20s \n","Tipo Ordenación","Tamaño" ,"Tipo Ini." ,"Tiempo Milisegundos","Fecha");
                System.out.printf("%-20s %-20s %-20s %-20.2f %-20s \n",pantalla.genMuestra.getTipoOrd(),pantalla.genMuestra.getTam(),pantalla.genMuestra.getTipoIni(),pantalla.genMuestra.getTimeMiliSec(),pantalla.genMuestra.getDate());
                //Preguntamos que quiere hacer con la muesrta
                option = pantalla.guardarMuestras();
            }
            if(option ==2)
            {
                
            }
            if(option ==3)
                salir = true;
            
        }while(salir != true);
    }

   
}


