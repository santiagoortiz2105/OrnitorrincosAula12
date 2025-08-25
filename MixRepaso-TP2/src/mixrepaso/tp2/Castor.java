
package mixrepaso.tp2;

import java.util.Random;


public class Castor {
    protected double longitudCola ; 
    protected double velocidad; 

    public Castor(double longitudCola, double velocidad) {
        this.longitudCola = longitudCola;
        this.velocidad = velocidad;
    }

    public double getLongitudCola() {
        return longitudCola;
    }

    public void setLongitudCola(double longitudCola) {
        this.longitudCola = longitudCola;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
     public double getVelocidad() {
        return velocidad; 
    }      
    
 public void nadar() { 
     System.out.println("El castor nada a " + velocidad + " km/h con su cola de " + longitudCola + " cm.");   

 }
 
public void tocarGuitarra() {
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            int cuerda = rand.nextInt(6) + 1;
            System.out.println("Toca cuerda " + cuerda);
        }
    }
    
    
    
}
