

/**
 * NumeroFechero
 *
 * @author Casilda Veizaga Choque
 * @version 20220418
 */
public class NumeroFechero {
    private int valor;  //atributo en rango [1,31]
    
    public NumeroFechero(){
        valor = 1;
    }
    
    public NumeroFechero( int valorInicial ){
        // verificar primero que valorInicial 
        // cumple la especificacion
      if (valorInicial >= 1 && valorInicial <= 31){
            valor = valorInicial;
        } else {
            valor = 1;
        }
    }
    
    public int valor(){
        return valor;
    }
    
    public void incrementar(){
        valor = valor + 1;
        if ( valor > 31 ){
           valor = 1;
        } else {
           valor = valor;
        }
    }

    public void decrementar(){
        valor = valor - 1;
        if ( valor < 1){
           valor = 31;
        } else{
           valor = valor;
        }
    }

}
