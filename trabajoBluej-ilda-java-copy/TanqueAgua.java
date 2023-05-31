
/**
 * TanqueAgua
 * 
 * @author Casilda Veizaga 
 * @version 20220419
 */
public class TanqueAgua{
     private double cantidad;  // agua
     private double ingresar;   // agua
     private double acumulado;   // agua
     
     public TanqueAgua(){
        this.cantidad = 0;
        this.ingresar = 0;
        this.acumulado = 0;
    }
    
    public void ponerCantidad(int cantidad){
       if(cantidad<0){
           this.cantidad = 0;
        }else{
           this.cantidad = cantidad;
        }
    }
    
    public void llenarTanque(int totalmente){
        this.ingresar = this.cantidad;
        this.acumulado = acumulado + cantidad;
    }
    
    public void vaciarTanque(int totalmente){
        this.ingresar = 0;
    }
    
    public void ingresarAgua(double agua){
        if(agua >= cantidad){
              ingresar = cantidad;
              this.acumulado = acumulado + cantidad;
        }else if (agua<0){
               this.ingresar = 0;
               this.acumulado = acumulado + 0;
        }else if (agua>0 && agua<cantidad){
                 if(ingresar + agua <= cantidad){
                    this.ingresar = ingresar + agua;
                    this.acumulado = acumulado + agua;
                 }else{}
        } else{
        } ingresar = cantidad;
          acumulado = cantidad;
    }
}