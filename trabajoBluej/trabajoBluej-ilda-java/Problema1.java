

/**
 * Write a description of class Problema1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problema1{
    private int valor1;
    private int valor2;
    
    public Problema1(int dato1, int dato2){
        valor1 = dato1;
        valor2 = dato2;
    }
    
    public int decirElValor1(){
        return valor1;
    }
    
    public int decirElValor2(){
        return valor2;
    }
    
    public void intercambioDeValores(){
        int decirValor;
        
        decirValor = valor1;
        valor2 = valor1;
        valor1 = decirValor;
    }
    
    
}
