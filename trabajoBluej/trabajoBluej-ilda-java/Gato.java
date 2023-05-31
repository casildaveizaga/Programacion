
/**
 * Write a description of class Gato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gato{

    String color;
    String raza;
    double tamanio;
    String nombre;
    String genero;
    int edad;
    
    public void ponerNombre(String nombre){
        this.nombre = nombre; //perla
    }
    
    public String obtenerNombre(){
        return this.nombre;  // perla
    }
    
    public void ponerRaza(String raza){
        this.raza = raza; 
    }
    
    public String obtenerRaza(){
        return this.raza;
    }

}
