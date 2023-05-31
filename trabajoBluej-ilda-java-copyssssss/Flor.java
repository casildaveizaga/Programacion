
/**
 * Flor
 * 
 * @author Casilda
 * @version 202202590
 */
public class Flor{
     int numeroPetalos;
     String color;
     String aroma;
     
     public Flor (String color, String aroma){
        this.aroma = aroma;
        this.color = color;
        this.numeroPetalos = 10;
     }
     
     public Flor(String Color){
        this.color = color;
        this.aroma = "dule";
        this.numeroPetalos = 10;
     }
     
     public void contarPetalos(){
        System.out.println("tengo" + this.numeroPetalos + "petalo");
     }
     
     public int contarPetalos(int tamanio){
        return this.numeroPetalos;
     }
}
