/*
 
Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.

 */


public class Tema05Ejercicio20Bis {
	
	public static void main (String args[]) {
    System.out.println("Este programa pinta pirámides huecas");
    
    System.out.println("introduce la altura con el que quieres que se pinte la pirámide");
    int altura = Integer.parseInt(System.console().readLine());
    
    int espacios = altura-1;
    int linea = 1;
    int hueco = 1;
    int base=1;
    
    while (linea<=altura){
      //insertea espacios a la izquierda
      for(int i = 1; i<=espacios;i++){
        System.out.print(" ");
      }
      //me pinta el asterisco dp de los espacios
      System.out.print("*");
      
    
      
      if (linea>1 && linea<=altura-1){
        for(int i=1;i<=hueco;i++){
          System.out.print(" ");
        }
        System.out.print("*");
        hueco+=2;
        
      }else if(linea==altura){
        
        for(int i= 1; i<=base-1;i++){
          
          System.out.print("*");
          }
      }
        

      
      System.out.println();
      linea++;
      espacios--;
      
      base+=2;
      
    }
    
	}
}

