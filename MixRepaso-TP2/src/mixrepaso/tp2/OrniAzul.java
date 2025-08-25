package mixrepaso.tp2;

//Integrantes: Manceñido Xenia, Ortiz Lourdes, Ortiz Santiago, Ozan Santiago

// El OrniAzul también hereda de Castor
public class OrniAzul extends Castor {
    
    private double propulsion;  // valor interno de propulsión 
    private String nombre; 

    public OrniAzul(double longitudCola, double velocidad, String nombre, double propulsion) {
        super(longitudCola, velocidad);
        this.nombre= nombre; 
         // velocidad inicial se genera aleatoria entre 5 y 10
        this.velocidad= 5.0 + Math.random() * 5.0; 
        this.propulsion= propulsion; 
    }
     
       // Calcula la propulsión en base a la cola y la velocidad
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
