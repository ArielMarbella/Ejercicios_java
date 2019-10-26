/*
 * 19. Realiza un programa que pinte una pirámide por pantalla. La altura
* se debe pedir por teclado. El carácter con el que se pinta la pirámide
* también se debe pedir por teclado.

 */


public class Tema05Ejercicio19 {
	
	public static void main (String args[]) {
    
    System.out.println("Este programa pinta pirámides");
    
    System.out.println("introduce la altura con el que quieres que se pinte la pirámide");
    int altura =Integer.parseInt(System.console().readLine());
    
    
    int caracteres=1;
    int espacios=altura-1;
    int linea=1;

    
    while(linea <= altura){
      
      //pinta espacios
      for(int i =1; i<=espacios;i++){
      System.out.print(" ");
      }
      //pinta caracteres
      for(int i =1;i<=caracteres;i++){
        
        System.out.print("*");
      }
      espacios--;
      caracteres = caracteres+2;
      linea++;
      System.out.println();
    }
      

    }
  }

