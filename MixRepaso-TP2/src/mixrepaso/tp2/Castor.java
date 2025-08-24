
package mixrepaso.tp2;


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
 

    
    
    
}
