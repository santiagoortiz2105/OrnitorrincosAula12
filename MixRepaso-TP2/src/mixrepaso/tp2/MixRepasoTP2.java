
package mixrepaso.tp2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MixRepasoTP2 {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        
        //Crear las instancias
        
        System.out.println("Ingrese longitud de cola del Ornitorrinco Verde: ");
        double colaVerde= sc.nextDouble(); 
        System.out.println("Ingrese la velocidad del Ornitorrinco Verde: ");      //Ornitorrinco Verde
        double velocidadVerde= sc.nextDouble(); 
        OrniVerde verde= new OrniVerde(colaVerde,velocidadVerde, "OrniVerde"); 
        sc.nextLine(); 
        
        System.out.println("Ingrese longitud de cola del Ornitorrinco Azul1: ");
        double colaAzul1= sc.nextDouble(); 
        System.out.println("Ingrese la velocidad del Ornitorrinco Azul1: ");      //Ornitorrinco Azul1
        double velocidadAzul1= sc.nextDouble(); 
        System.out.println("Ingrese la propulsion del Ornitorrinco Azul1 (5 a 10): ");
        double propulsionAzul1= sc.nextDouble(); 
        OrniAzul azul1= new OrniAzul(colaAzul1,velocidadAzul1, "OrniAzul1", propulsionAzul1); 
        sc.nextLine(); 
        
        System.out.println("Ingrese longitud de cola del Ornitorrinco Azul2: ");
        double colaAzul2= sc.nextDouble(); 
        System.out.println("Ingrese la velocidad del Ornitorrinco Azul2: ");      //Ornitorrinco Azul2
        double velocidadAzul2= sc.nextDouble(); 
        System.out.println("Ingrese la propulsion del Ornitorrinco Azul2 (5 a 10): ");
        double propulsionAzul2= sc.nextDouble(); 
        OrniAzul azul2= new OrniAzul(colaAzul2,velocidadAzul2, "OrniAzul2",propulsionAzul2); 
        sc.nextLine();
        
        System.out.println("\n--- Constantes de MamaPata ---");
        System.out.println("Todos los ornitorrincos tienen " + MamaPata.PATAS + " patas.");
        System.out.println("El pico es de tipo: " + MamaPata.PICO);
        
                       //Ejecutar métodos 
        
        System.out.println("\n---Ejecutar Metodos---");
        
        verde.nadar();
        verde.tocarOrgano(sc);
        verde.tocarGuitarra();
        verde.tocarGuitorgan(sc);
        
        azul1.nadar();
        azul2.nadar();
        
                             //Arreglo con try-cath-finally 
                             
         OrniVerde[] hermanos = new OrniVerde[3];
        try {
            hermanos[1] = verde; // Queda guardada en posición 1
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de índice en el arreglo: " + e.getMessage());
        } finally {
            System.out.println("los ornitohermanos estan juntos al fin...");
        }
        
                      //Lista para los ornitorrincos azules
        List<OrniAzul> nadadores = new ArrayList<>();
        if (azul1 instanceof OrniAzul) nadadores.add(azul1);
        if (azul2 instanceof OrniAzul) nadadores.add(azul2);
       

        
        // Ordenar por propulsión (ascendente)
        Collections.sort(nadadores, new Comparator<OrniAzul>() {
            @Override
            public int compare(OrniAzul o1, OrniAzul o2) {
                return Double.compare(o1.getPropulsion(), o2.getPropulsion());
            }
        });

        //  Mostrar lista con Iterator
        System.out.println("\n--- Ornitorrincos azules ordenados por propulsion ---");
        Iterator<OrniAzul> it = nadadores.iterator();
        while (it.hasNext()) {
            OrniAzul o = it.next();
            System.out.println("Azul con propulsion: " + o.getPropulsion() + " km/h");
        }
      
        sc.close();
       
    }
    
        
        
        
        
    }

    

