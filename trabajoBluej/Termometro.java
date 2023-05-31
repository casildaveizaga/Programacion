/**
 * Termometro digital.
 *
 * @author Vladimir Costas
 * @version 20220329 vcj
 */
public class Termometro {
    private double temperatura; // en Celsius
    
    public Termometro (){
        temperatura = 0;
    }

    public void leerTemperatura(double temperaturaObjeto){
        temperatura = temperaturaObjeto;
    }
    
    public void leerTemperatura2(double temperatura){
        this.temperatura = temperatura;
    }

    public double decirTemperatura(){        
        return temperatura;
    }
    
    public double decirTemperaturaFahrenheit(){
        double fahrenheit;
        
        fahrenheit = 1.8 * temperatura + 32;
        
        return fahrenheit;
    }
    
    
}
