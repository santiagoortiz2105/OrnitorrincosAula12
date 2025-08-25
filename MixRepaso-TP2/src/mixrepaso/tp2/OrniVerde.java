
package mixrepaso.tp2;

import java.util.Scanner; 
import java.util.concurrent.ThreadLocalRandom; //generar números aleatorios se puede usar igual Math.random()

public class OrniVerde extends Castor implements MamaPata {
     private String nombre;
     
    public OrniVerde(double longitudCola, double velocidad, String nombre) {
        super(longitudCola, velocidad);
        this.nombre= nombre; 
    }

    public String getNombre() {
        return nombre;
    }
   
    
    @Override
    public void tocarOrgano(Scanner sc) {
       System.out.println("Do-Re-Mi");
       
       System.out.println("Presione Enter para continuar..."); 
       
       sc.nextLine(); 
         
        System.out.println("Fa-Sol-La-Si");
    }

    public void tocarGuitorgan(Scanner sc) {
    System.out.println("Sonando el GUITORGAN...");
    super.tocarGuitarra();     
    this.tocarOrgano(sc);   
    System.out.println( "cuack cuack...!");
}
    
   
    
    
    
}
