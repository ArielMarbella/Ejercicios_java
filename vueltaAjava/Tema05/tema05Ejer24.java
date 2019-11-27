/*
24
Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
 */


public class tema05Ejer24 {
	
	public static void main (String args[]) {
		
    System.out.println("Este programa pinta una pirámide a base de números");
    System.out.println("introduce la altura de la pirámide");
    int alturaIntroducida=Integer.parseInt(System.console().readLine());
    
    int espacios=alturaIntroducida-1;
    int i=0;
    int numeros=1;
    
    while (numeros<=alturaIntroducida){
      //pintar espacios
      for(i=0;i<=espacios;i++){
        System.out.print(" ");
      }
        //pinto primera mitad
      for(i=0;i<numeros;i++){
        System.out.print(i);
      }
        //pinto segunda mitad
      for(i=numeros;i>0;i--){
        System.out.print(i);   
      }
      System.out.println();
      numeros++;
      espacios--;
    }
  }
}

