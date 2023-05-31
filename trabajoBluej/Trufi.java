
/**
 * trufi.
 * 
 * @author Casilda 
 * @version 20220418 vcj
 */
public class Trufi{
    private double recaudo;
    private int numeroAdultos;
    private int numeroUnivesitarios; 
    private int numeroEscolares;
    private int numeroGratis;
    private int capacidadPasajeros;
    
    public Trufi(int capacidadPasajeros){
        recaudo= 0;
        numeroAdultos = 0; 
        numeroUnivesitarios = 0; 
        numeroEscolares = 0; 
        numeroGratis = 0; 
        this.capacidadPasajeros = capacidadPasajeros;
    } 
    
      /* tipo pasajero
       * "a" adulto
       * "u" univesitario
       * "e" escolar
       * "g" gratuito
         */
    public void subirPasajeros(char tipoPasajero, int cantidad){
        if( numeroAdultos + numeroUnivesitarios + numeroEscolares + numeroGratis < capacidadPasajeros){
            if (capacidadPasajeros - numeroAdultos + numeroUnivesitarios + numeroEscolares + numeroGratis >= cantidad )
            { 
                if (tipoPasajero == 'a' ){
                   recaudo = recaudo + 1.90 * cantidad;
                   numeroAdultos = numeroAdultos + cantidad;
                } else if (tipoPasajero == 'u' ){
                   recaudo = recaudo + 1.00 * cantidad;
                   numeroAdultos = numeroAdultos + cantidad;
                } else if (tipoPasajero == 'e'){
                   recaudo = recaudo + 0.50 * cantidad;
                   numeroAdultos = numeroAdultos + cantidad;
                } else if ( tipoPasajero == 'g'){
                   recaudo = recaudo + 0.00 * cantidad;
                   numeroAdultos = numeroAdultos + cantidad;
                } else{}
            } else {
                // solo algunos podran subir
            }
        } else{
            // nadie puede subir
        }
    }
    public void bajarPasajeros(){
       // los pasajeros bajan
    }
}