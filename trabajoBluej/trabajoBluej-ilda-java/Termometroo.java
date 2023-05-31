
/**
 * termometroo
 * 
 * @author (Casilda) 
 * @version (202202590)
 */
public class Termometroo {
private double temperatura;
    private boolean celsius; // true en celsius, false en fahrenheit
    private double temperaturaMaximaLeida;
    
    public Termometroo (){
        temperatura = 0;
        celsius = true;
        temperaturaMaximaLeida = 0;
    }

    public void leerTemperatura(double temperaturaObjeto){
        temperatura = temperaturaObjeto;
        
        if (temperatura > temperaturaMaximaLeida) {
            temperaturaMaximaLeida = temperatura;            
        } else {
            // nada que hacer
        }
    }
    
    public double decirTemperatura(){  
        return temperatura;
    }
    
    public void cambiarModo(){
        double aux;
        
        aux = 0;
        
        if (celsius) {
            aux = 1.8 * temperatura + 32;   // a fahrenheit
            temperaturaMaximaLeida = 1.8 * temperaturaMaximaLeida + 32;   // a fahrenheit            
        } else {
            aux = (temperatura - 32) / 1.8;  // a celsius
            temperaturaMaximaLeida = (temperaturaMaximaLeida - 32) / 1.8;  // a celsius
        }
        
        temperatura = aux;
        celsius = !celsius; 
    }
    
    public void reset(){
        temperatura = 0;
        celsius = true;
        temperaturaMaximaLeida = 0;
    }
}
