
/**
 * Ejemplo.
 * 
 * @author Casilda 
 * @version 20220505 cv
 */
public class Ejemplo{
    
    public int sumaturia(int valorInicial, int valorFinal){
      int resultado;
      resultado = 0;
       if(valorInicial <= valorFinal){
          for (int i = valorInicial ; i <= valorFinal ; i++){
          resultado = resultado + i;
          }
       }else{
           // la sumatoria es cero
        }
      return resultado;
    }
}
