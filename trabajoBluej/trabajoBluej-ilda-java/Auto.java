

   /**
 * Auto
 *
 * @author Vladimir Costas
 * @version 20220322 vcj  
 */
public class Auto {
    private double precio;
    private String   color;  
    
    public Auto(double costo, String suColor){
        precio = costo;
        color = suColor;
    }
    
    public void cambiarPrecio(double nuevoPrecio){
        precio = nuevoPrecio;
    }
    
    public double precio(){
        return precio;
    }
    
    public String color(){
        return color;
    }
}
