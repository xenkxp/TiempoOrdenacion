
package util;

//Algunos métodos de ejemplo por si los queréis utilizar. 

import GestionBD.*;
import algoritmos.*;
import inicializacion.*;
import java.util.*;
import tiempoordenacion.Muestras;



public class Pantalla {
    public ConsultasBD gestCons = new ConsultasBD();
    public Muestras genMuestra = new Muestras();
    
    public void mostrarBienvenida() {
        
        System.out.println("******************************************************************");
        System.out.println("\nBIENVENIDO AL PROGRAMA ALGOrdenacion...");
        System.out.println("\nEste programa permite tomar muestras del tiempo que distintos\n"
                         + "algoritmos de ordenación tardan en ordenar un vector de un tamaño\n"
                         + "N.\n\nLos posibles valores de N son: 1.000, 10.000, 100.000, 1.000.000\n\n"
                         + "Los algoritmos de ordenación dependen de la naturaleza de los datos,"
                         + "\nen la medida en la que estos estén más o menos ordenados. Por ello, \n"
                         + "existen distintas opciones de inicialización.");
        System.out.println("\n El programa permite almacenar las muestras en una pequeña base \n"
                         + "de datos para su análisis posterior, mediante la generación de \n"
                         + "informes.\n");
        System.out.println("******************************************************************");
        System.out.print("\n\nPulse cualquier tecla para continuar...");
        try {
            Scanner stdin = new Scanner (System.in);
            String s = stdin.nextLine(); 
        } catch (Exception e) {
            
        }
    }
    
    //Menu de inicio
    public int menuini()
    {
        int opcion = 0; 
        do {
            
            System.out.println("1. Generar una Muestra");
            System.out.println("2. Visualizar un Informe");
            System.out.println("3. Salir");
            System.out.println("\nElija una opción:");
            try {
                    Scanner stdin = new Scanner (System.in);
                    opcion = stdin.nextInt(); 
            } catch (InputMismatchException ime) {

                    System.out.println("\n\nFíjese e introduzca un número de la opción.\n\n");

            }
            if(opcion<1 || opcion>3)
            {
               System.out.println("\n\nEl número introducido no es una opción del menu.");
            }
            else
            {
                switch(opcion)
                 {
                 case 1:
                     solicitarTamaño();
                     break;
                 case 2:
                     informes();
                     break;
                 case 3:
                     System.out.println("Gracias por usar este programa bye bye!!!");
                     break;
                 }  
            }
        } while (opcion<1 || opcion>3);
        return opcion;
    }
    // Solicitar tamaño del vector
    public void solicitarTamaño(){
        int opcion = 0;
        do 
        {
            System.out.print("\n\nIntroduzca el tamaño del vector: \n");
             try {
                    System.out.println("1 - 1.000");
                    System.out.println("2 - 10.000");
                    System.out.println("3 - 100.000");
                    System.out.println("4 - 1.000.000");
                    System.out.println("\nSelecione uno de los posibles valores de N:");
                    Scanner stdin = new Scanner (System.in);
                    opcion = stdin.nextInt();
               } catch (InputMismatchException ime) {
                   System.out.println("\n\n Fíjese e introduzca un entero.\n\n");
            }
            if(opcion<1 || opcion>4)
            {
                System.out.println("\n\nEl número introducido no es una opción.");
            }
            else
            {
                switch(opcion)
                {
                    case 1:
                        genMuestra.setTam(1000);
                        break;
                    case 2:
                        genMuestra.setTam(10000);
                        break;
                    case 3:
                        genMuestra.setTam(100000);
                        break;
                    case 4:
                        genMuestra.setTam(1000000);
                        break;
                }
            }
        }while(opcion<1 || opcion>4);
    }
    public void informes()
    {
        int opcion = 0; 
        do {
            
            System.out.println("\n\nActualmente, están disponibles las siguentes consultas: ");
            System.out.println("1. Mejor tiempor de ejecución con vector Tamaño = N.");
            System.out.println("2. Listado de tiempos especificado Ordenación, Inicialización y Tamaño.");
            System.out.println("3. Listado de tiempos especificado Ordenación e Inicialización.");
            System.out.println("4. Listado de todos los tiempos.");
            System.out.println("5. Volver al inicio.");
            System.out.println("\nSeleccione una Opcion:");
            try {
                    Scanner stdin = new Scanner (System.in);
                    opcion = stdin.nextInt(); 
            } catch (InputMismatchException ime) {

                    System.out.println("\n\nFíjese e introduzca un número de la opción.\n\n");

            }
            if(opcion<1 || opcion>3)
            {
                System.out.println("\n\nEl número introducido no es una opción del menu.");
            }
            else
            {
                switch(opcion)
                {
                    case 1:
                        solicitarTamaño();
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                }
            }
        } while (opcion<1 || opcion>5);
    }
    //Elegir Inicializacion
    public InicializacionDeVectores inicializacion(){
        int opcion = 0;
        InicializacionDeVectores ini = null;
        do {
            
            System.out.println("1. Ordenación Aleatorea");
            System.out.println("2. Ordenación Secuencial");
            System.out.println("\nSeleccione la forma de inialización:");
            try {
                    Scanner stdin = new Scanner (System.in);
                    opcion = stdin.nextInt(); 
            } catch (InputMismatchException ime) {

                    System.out.println("\n\nFíjese e introduzca un número de la opción.\n\n");

            }
            if(opcion<1 || opcion>2)
            {
                System.out.println("\n\nEl número introducido no es una opción del menu.");
                
            }
            else
            {
                if(opcion==1)
                {
                    ini = new InicializacionAleatoria();
                    genMuestra.setTipoIni(devuelveInicializacion(opcion));
                }
                if(opcion==2)
                {
                    ini = new InicializacionSecuencial();
                    genMuestra.setTipoIni(devuelveInicializacion(opcion));
                }
                    
            }
            
        } while (opcion<1 || opcion>2);
        
        return ini;
    }
        
    // Elegir algoritmo de ordenación
    public OrdenacionDeVectores seleccionarOrdenacion(OrdenacionDeVectores ord,int []v) {
        
        int opcion = 0; 
        do {
            System.out.println("\nSeleccione el algoritmo de ordenación:");
            System.out.println("1. Ordenación por Inserción");
            System.out.println("2. Ordenación por Burbuja");
            System.out.println("3. Ordenación por Selección");
            System.out.println("4. Ordenación por Quicksort");
            System.out.print("\nOPCIÓN:");

            try {
                    Scanner stdin = new Scanner (System.in);
                    opcion = stdin.nextInt(); 
            } catch (InputMismatchException ime) {

                    System.out.println("\n\nFíjese e introduzca un número de la opción.\n\n");

            }
            if(opcion<1 || opcion>4)
            {
                System.out.println("\n\nEl número introducido no es una opción del menu.");
            }
            else
            {
                switch(opcion)
                    {
                        case 1:
                            ord = new OrdenacionPorInsercion(v); //Para cada caso
                            genMuestra.setTipoOrd(devuelveOrdenacion(opcion));
                            break;
                        case 2:
                            ord = new OrdenacionPorBurbuja(v);
                            genMuestra.setTipoOrd(devuelveOrdenacion(opcion));
                            break;

                        case 3:
                            ord = new OrdenacionPorSeleccion(v);
                            genMuestra.setTipoOrd(devuelveOrdenacion(opcion));
                            break;

                        case 4:
                            ord = new OrdenacionPorQsortMedio(v);
                            genMuestra.setTipoOrd(devuelveOrdenacion(opcion));
                            break;    
                    }
            }
        } while (opcion<1 || opcion>4);
        
        return ord;
        
     }
     public int guardarMuestras(){
        int opcion = 0; 
        do {
            
            System.out.println("\n\nQue opcion desea :");
            System.out.println("1. Guardar  Muestra");
            System.out.println("2. Volver al menu");
            System.out.println("3. Salir");
            System.out.println("\nSeleccione una Opcion:");
            try {
                    Scanner stdin = new Scanner (System.in);
                    opcion = stdin.nextInt(); 
            } catch (InputMismatchException ime) {

                    System.out.println("\n\nFíjese e introduzca un número de la opción.\n\n");

            }
            if(opcion<1 || opcion>3)
            {
                System.out.println("\n\nEl número introducido no es una opción del menu.");
            }
            else
            {
                switch(opcion)
                {
                    case 1:
                         gestCons.añadirUsuaro();
                        break;
                    case 2:
                        //Volver al menu
                        break;
                    case 3:
                        //Salir del Programa
                        break;
                }
            }
                
            
        } while (opcion<1 || opcion>3);
       return opcion;
    }

     public String imprimeVector(int [] v) {
        String texto;
        texto ="Vector: ";
        for (int i = 0; i<v.length; i++)
        {
            texto = texto + v[i]+ ", ";       
        }
        return texto;
    }
    
    public String devuelveInicializacion(int i)
    {
        String ini ="";
        switch(i)
        {
            case 1:
               ini = "aleatoria";
               break;
               
                
            case 2:
               ini = "secuencial";
               break;
               
                  
        }
        return ini;
                
    }
    
    public String devuelveOrdenacion(int i)
    {
        String ini ="";
        switch(i)
        {
            case 1:
               ini = "insercion";
               break;
               
                
            case 2:
               ini = "burbuja";
               break;
            
            case 3:
               ini = "seleccion";
               break;
            
            case 4:
               ini = "quicksort";
               break;
                  
        }
        return ini;
                
    }
   
    
    public void consultaInformes()
    {
        
    }
     
}
