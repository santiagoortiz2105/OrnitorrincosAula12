package mixrepaso.tp2;


//Integrantes: Manceñido Xenia, Ortiz Lourdes, Ortiz Santiago, Ozan Santiago

import java.util.Random;



//Clase base castor
public class Castor {
    // Atributos
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
     
    // Método para nadar
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
