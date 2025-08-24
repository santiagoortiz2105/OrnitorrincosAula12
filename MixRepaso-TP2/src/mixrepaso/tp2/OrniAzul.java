
package mixrepaso.tp2;


public class OrniAzul extends Castor {
    
    private double propulsion;   
    private String nombre; 

    public OrniAzul(double longitudCola, double velocidad, String nombre, double propulsion) {
        super(longitudCola, velocidad);
        this.nombre= nombre; 
        this.velocidad= 5.0 + Math.random() * 5.0; 
        this.propulsion= propulsion; 
    }
     
    public double getPropulsion() {
        return longitudCola * velocidad;
    }

    public void setPropulsion(double propulsion) {
        this.propulsion = propulsion;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public void nadar() {
        System.out.println("El Ornitorrinco azul nada a una velocidad de " + velocidad + "km/h");
    }

    

   
   
    
}
