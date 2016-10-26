
package util;

//Algunos m�todos de ejemplo por si los quer�is utilizar. 

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
                         + "algoritmos de ordenaci�n tardan en ordenar un vector de un tama�o\n"
                         + "N.\n\nLos posibles valores de N son: 1.000, 10.000, 100.000, 1.000.000\n\n"
                         + "Los algoritmos de ordenaci�n dependen de la naturaleza de los datos,"
                         + "\nen la medida en la que estos est�n m�s o menos ordenados. Por ello, \n"
                         + "existen distintas opciones de inicializaci�n.");
        System.out.println("\n El programa permite almacenar las muestras en una peque�a base \n"
                         + "de datos para su an�lisis posterior, mediante la generaci�n de \n"
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
            System.out.println("\nElija una opci�n:");
            try {
                    Scanner stdin = new Scanner (System.in);
                    opcion = stdin.nextInt(); 
            } catch (InputMismatchException ime) {

                    System.out.println("\n\nF�jese e introduzca un n�mero de la opci�n.\n\n");

            }
            if(opcion<1 || opcion>3)
            {
               System.out.println("\n\nEl n�mero introducido no es una opci�n del menu.");
            }
            else
            {
                switch(opcion)
                 {
                 case 1:
                     solicitarTama�o();
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
    // Solicitar tama�o del vector
    public void solicitarTama�o(){
        int opcion = 0;
        do 
        {
            System.out.print("\n\nIntroduzca el tama�o del vector: \n");
             try {
                    System.out.println("1 - 1.000");
                    System.out.println("2 - 10.000");
                    System.out.println("3 - 100.000");
                    System.out.println("4 - 1.000.000");
                    System.out.println("\nSelecione uno de los posibles valores de N:");
                    Scanner stdin = new Scanner (System.in);
                    opcion = stdin.nextInt();
               } catch (InputMismatchException ime) {
                   System.out.println("\n\n F�jese e introduzca un entero.\n\n");
            }
            if(opcion<1 || opcion>4)
            {
                System.out.println("\n\nEl n�mero introducido no es una opci�n.");
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
            
            System.out.println("\n\nActualmente, est�n disponibles las siguentes consultas: ");
            System.out.println("1. Mejor tiempor de ejecuci�n con vector Tama�o = N.");
            System.out.println("2. Listado de tiempos especificado Ordenaci�n, Inicializaci�n y Tama�o.");
            System.out.println("3. Listado de tiempos especificado Ordenaci�n e Inicializaci�n.");
            System.out.println("4. Listado de todos los tiempos.");
            System.out.println("5. Volver al inicio.");
            System.out.println("\nSeleccione una Opcion:");
            try {
                    Scanner stdin = new Scanner (System.in);
                    opcion = stdin.nextInt(); 
            } catch (InputMismatchException ime) {

                    System.out.println("\n\nF�jese e introduzca un n�mero de la opci�n.\n\n");

            }
            if(opcion<1 || opcion>3)
            {
                System.out.println("\n\nEl n�mero introducido no es una opci�n del menu.");
            }
            else
            {
                switch(opcion)
                {
                    case 1:
                        solicitarTama�o();
                        
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
            
            System.out.println("1. Ordenaci�n Aleatorea");
            System.out.println("2. Ordenaci�n Secuencial");
            System.out.println("\nSeleccione la forma de inializaci�n:");
            try {
                    Scanner stdin = new Scanner (System.in);
                    opcion = stdin.nextInt(); 
            } catch (InputMismatchException ime) {

                    System.out.println("\n\nF�jese e introduzca un n�mero de la opci�n.\n\n");

            }
            if(opcion<1 || opcion>2)
            {
                System.out.println("\n\nEl n�mero introducido no es una opci�n del menu.");
                
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
        
    // Elegir algoritmo de ordenaci�n
    public OrdenacionDeVectores seleccionarOrdenacion(OrdenacionDeVectores ord,int []v) {
        
        int opcion = 0; 
        do {
            System.out.println("\nSeleccione el algoritmo de ordenaci�n:");
            System.out.println("1. Ordenaci�n por Inserci�n");
            System.out.println("2. Ordenaci�n por Burbuja");
            System.out.println("3. Ordenaci�n por Selecci�n");
            System.out.println("4. Ordenaci�n por Quicksort");
            System.out.print("\nOPCI�N:");

            try {
                    Scanner stdin = new Scanner (System.in);
                    opcion = stdin.nextInt(); 
            } catch (InputMismatchException ime) {

                    System.out.println("\n\nF�jese e introduzca un n�mero de la opci�n.\n\n");

            }
            if(opcion<1 || opcion>4)
            {
                System.out.println("\n\nEl n�mero introducido no es una opci�n del menu.");
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

                    System.out.println("\n\nF�jese e introduzca un n�mero de la opci�n.\n\n");

            }
            if(opcion<1 || opcion>3)
            {
                System.out.println("\n\nEl n�mero introducido no es una opci�n del menu.");
            }
            else
            {
                switch(opcion)
                {
                    case 1:
                         gestCons.a�adirUsuaro();
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
