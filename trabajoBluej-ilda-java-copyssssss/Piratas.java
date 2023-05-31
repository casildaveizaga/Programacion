
/**
 * Pirata
 * 
 * @author Casilda 
 * @version 202202590
 */
public class Piratas{
  int numLiberarSaqueadores = 0;
  int esfuerzoLiberarSaqueadores = 15;
  int presioLiberarSaqueadores = 3050;
  
  int numBusquedaDesaparesidos = 0;
  int esfuerzoBusquedaDesaparesidos = 8;
  int presioBusquedaDesaparesidos = 2000;
  
  int numRecoletarAlimentos = 0;
  int esfuerzoRecoletarAlimentos = 4;
  int presioRecoletarAlimentos = 1050;
  
  int numTripulantes = 5;
  int totalGanado = 0;
  int totalGastado = 0;
  
  public Piratas(int numLiberarSaqueadores, int numBusquedaDesaparesidos, int numRecoletarAlimentos){
      this.numLiberarSaqueadores = numLiberarSaqueadores;
      this.numBusquedaDesaparesidos = numBusquedaDesaparesidos;
      this.numRecoletarAlimentos = numRecoletarAlimentos;
  }
  
  public int calcularEsfuerzo(){
      int formulaEsfuerzo = this.numLiberarSaqueadores * this.esfuerzoLiberarSaqueadores +
      this.numBusquedaDesaparesidos * this.esfuerzoBusquedaDesaparesidos + 
      this.numRecoletarAlimentos * this.esfuerzoRecoletarAlimentos;
      return formulaEsfuerzo;
  }
  
    //cara => thue
    //cruzz => false
  public boolean lanzarMoneda(){
       //0.0 a 1.0       -> 0.50
       boolean moneda = Math.random()<0.50;
      if(moneda){
        System.out.println("salio cara");
      } else{
          System.out.println("salio cruz");
      }
      return moneda;
  }
  
  //lazar dado
  public int lanzarDado(){
     int dado = (int) (Math.random() * 6 + 1);
     return dado;
  }
  
  public void calcularGanancias(){
     this.totalGanado = this.numLiberarSaqueadores * this.presioLiberarSaqueadores +
     this.numBusquedaDesaparesidos * this.presioBusquedaDesaparesidos + 
     this.numRecoletarAlimentos * this.presioRecoletarAlimentos - totalGastado; 
    }
  
  public void agregarNuevoMiembro(){
    boolean moneda = this.lanzarMoneda();
    if(moneda == true){
         this.numTripulantes = this.numTripulantes + 1;
         if(numTripulantes % 2 ==0){
            int dado = this.lanzarDado();
            System.out.println ("Dado:"+ dado);
            // if (dado>=1 && dado <= 2) {
               if(dado == 1 || dado == 2){
                  System.out.println ("Todos bailan"); 
                }else if (dado == 3){
                   int incrementa = 500;
                   this.presioBusquedaDesaparesidos = this.presioBusquedaDesaparesidos + incrementa;
                   this.presioLiberarSaqueadores = this.presioLiberarSaqueadores + incrementa;
                   this.presioRecoletarAlimentos = this.presioRecoletarAlimentos + incrementa;
                   System.out.println ("Se icrementa los presios");
                }else if (dado == 4){
                   numTripulantes = this.numTripulantes - 1;
                   System.out.println ("Un tripulante se pone a explorar");
                   if (this.numTripulantes <= 0) {
                        this.numTripulantes = 0;
                        System.out.println("El barco se pone triste");
                    }
                }else if (dado ==5 || dado == 6){
                   int costoJugoCoco = 1250 * this.numTripulantes;
                   this.totalGastado = this.totalGastado + costoJugoCoco;
                   this.calcularGanancias();
                   System.out.println("Se compraron jugos de coco, se gasto: "+ costoJugoCoco);
                }
            }
    } else{
          System.out.println("El nuevo postulante no pudo ingresar");
    }
  }
  
  public void misionAlazar(){
        int cualquierMision;
        
        cualquierMision = (int)(Math.random () * (3 - 1) + 1);
        if (cualquierMision == 1){
            System.out.println ("liberar isla de saqueadores");
            totalGanado = this.totalGanado + presioLiberarSaqueadores;
            calcularRiesgo();
        }else if (cualquierMision == 2){
            System.out.println ("buscar desaparecidos");
            totalGanado = this.totalGanado + presioBusquedaDesaparesidos;
            calcularRiesgo();
        }else{
            System.out.println ("recolectar alimentos");
            totalGanado = this.totalGanado + presioRecoletarAlimentos;
            calcularRiesgo();
        }
    }
    
    public void calcularRiesgo(){
        int muereTripulante;
        
        muereTripulante = (int) (Math.random() * (100 - 0) + 0);
        if (muereTripulante <= 10){
            numTripulantes = this.numTripulantes - 1;
        }else{}
    }
}
