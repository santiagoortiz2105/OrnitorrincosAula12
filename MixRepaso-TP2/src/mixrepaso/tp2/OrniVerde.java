package mixrepaso.tp2;

//Integrantes: Manceñido Xenia, Ortiz Lourdes, Ortiz Santiago, Ozan Santiago

import java.util.Scanner; 
import java.util.concurrent.ThreadLocalRandom; //generar números aleatorios se puede usar igual Math.random()

// El OrniVerde hereda de Castor y además implementa la interfaz MamaPata
public class OrniVerde extends Castor implements MamaPata {
     private String nombre;
     
    public OrniVerde(double longitudCola, double velocidad, String nombre) {
        super(longitudCola, velocidad);
        this.nombre= nombre; 
    }

    public String getNombre() {
        return nombre;
    }
   
    // Hace sonar 3 cuerdas de la guitarra al azar
    public void tocarGuitarra(){
        System.out.println("Tocando guitarra...");
        for(int i=1; i<=3; i++){
            int cuerda= ThreadLocalRandom.current().nextInt(1,7);
            System.out.println("Toca cuerda: " + cuerda);
        }
        
        
    }
    @Override
    public void tocarOrgano(Scanner sc) {
       System.out.println("Do-Re-Mi");
       
       System.out.println("Presione Enter para continuar..."); 
       
       sc.nextLine(); 
         
        System.out.println("Fa-Sol-La-Si");
    }

    // Toca los dos instrumentos combinados
    public void tocarGuitorgan(Scanner sc) {
    System.out.println("Sonando el GUITORGAN...");
    tocarGuitarra();     
    tocarOrgano(sc);   
    System.out.println( "Fin del guitorgan!");
}
    
    
    @Override
    public void nadar() {
      System.out.println("El Ornitorrinco verde nada a una velocidad de " + velocidad + "km/h"); 
    }
    
    
    
}
