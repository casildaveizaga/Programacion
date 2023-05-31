
/**
 * Write a description of class Camion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camion{
   private double capacidad;           //en kilos
   private boolean luzFrenoEncendido;
   private Trailer elTrailer;
   
   public Camion (double capacidad){
      capacidadDeArrastre = capacidad;
      luzEcnedida = false;
      elTrailer = null;
    }
    
   public void enganchar(Trailer trailer){
      elTrailer = trailer;
    }
    
   public void Frenar(){
      luzFrenoEncendido = true;
       if(elTrailer != null){
        elTrailer.encenderLuces();
        }else{}
    } 
}
