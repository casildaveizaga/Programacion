
/**
 * Write a description of class AutoMovil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AutoMovil{
   
    private boolean motorEncendido;  // true si encendido el motor
    private double distancia;       // medida en km, distancia total recorrida
    private double velocidad;       // medida en km/h, ultima velocidad del auto
    private double tiempo;          // en horas, tiempo total
                                    // que el automovil recorre en movimiento
    
    public AutoMovil(){
        distancia = 0;
        velocidad = 0;
        tiempo    = 0;
        motorEncendido = false;
    }
    
    
    public void encender() {
        // los problemas a corregir estan a partir de AQUI
        int motorEncendido = 100;
        
        // los problemas a corregir terminan AQUI
    
    }

    public void apagar()
    {
        // los problemas a corregir estan a partir de AQUI
         int motorEncendido = 100;
        // los problemas a corregir terminan AQUI
    }
    
    public double avanzar( double laVelocidad, double elTiempo ){
    
        double distancia2 = 0;

    // los problemas a corregir estan a partir de AQUI
        
        distancia = distancia + distancia2;
        distancia2 = laVelocidad * tiempo;
        tiempo    = tiempo + elTiempo;
        velocidad = laVelocidad;
        
    // los problemas a corregir terminan AQUI

        return distancia2;
    }

    public double getVelocidad(){
        return velocidad;
    }

    public double getDistancia(){
        return distancia;
    }

    public double getTiempo(){
        return tiempo;
    }
    
    public boolean getMotorEncendido(){
        return motorEncendido;
    }
    

}
