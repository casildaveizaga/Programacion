import java.util.ArrayList;

/**
 *  Calificaciones 
 *
 * @author (Casilda Veizaga Choque)
 * @version (2022025909 cv)
 */
public class Calificaciones{
    public int[] calificaciones;
    
    public Calificaciones(){
        generarCalificaciones();
    }

    public Calificaciones(int[] cs){
        calificaciones = cs.clone();
    }
    
    private void generarCalificaciones(){
        int aleatorio;
        
        aleatorio = (int)(Math.random()* 990) + 10; 
        calificaciones = new int[aleatorio];
        
        for(int i = 0; i < calificaciones.length; i++){
            if (Math.random() < 0.2) {      // menos del 20% reprueba :)
                calificaciones[i] = (int)(Math.random()* 51);
            } else {
                calificaciones[i] = (int)(Math.random()* 50) + 51;            
            }         
        }
    }
    
    public double calcularPromedio(){
        double promedio = 0;
        for(int i = 0; i < calificaciones.length; i++){
            
            promedio = promedio + calificaciones[i];
        }
        promedio = promedio / calificaciones.length;
        return promedio;
    }
    
    public double calcularPromedio2(){
        
        double promedio = 0;
        
        for (int calificacion: calificaciones){
            promedio = promedio + calificacion;
        }
        
        promedio = promedio / calificaciones.length;
        
        return promedio;
    }
    
    public int notaComun (){
       int rest = 0; // es aggar el numero mayor
       int contador = 0;// contar el nata comun
       int auxiliar = -1;//
       for(int i = 0;i<calificaciones.length; i++){
           if (contador > auxiliar){
               //rest = calificaciones [i-1];
               auxiliar = contador;
               if(i > 0){
                   rest = calificaciones [i-1];
                   
                }
            }
           contador = 0;
            for(int j = 0; j<calificaciones.length; j++){
               
              if (calificaciones[i] == calificaciones[j]){
                  contador ++;
                }
           }
       }   
       return rest;
    }
    
    public int notaComun2 (){
       int rest = 0; // es aggar el numero mayor
       int contador = 0;// contar el nata comun
       int auxiliar = -1;//
       ArrayList<Integer>num = new ArrayList<Integer>();
       for(int i = 0;i<calificaciones.length; i++){
            int n = calificaciones [i];
            if (!num.contains(n)){
                
            }
            if (contador > auxiliar){
               //rest = calificaciones [i-1];
               auxiliar = contador;
               if(i > 0){
                   rest = calificaciones [i-1];
                   
                }
            }
            contador = 0;
            for(int j = 0; j<calificaciones.length; j++){
               
              if (calificaciones[i] == calificaciones[j]){
                  contador ++;
                }
           
            }
       } 
       
       return rest;
    }

}


