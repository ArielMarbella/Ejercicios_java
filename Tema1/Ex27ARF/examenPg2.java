/*
 * ARIEL HERNÁN ROJAS FAVERO
 * 
[2,5 puntos] Implemente un programa que dibuje pirámides de una altura (medida desde el vértice a la base) que
oscile entre 1 y 10, y que vayan orientadas a voluntad del usuario (izquierda, derecha, arriba o abajo).
Además, el programa pedirá dos caracteres con los que pintar (alternándolos) dichas pirámides.
Ejemplos de ejecución (se incluyen varias orientaciones de una misma pirámide):
* 
* Este programa pinta piramides.
* 
Introduzca la altura (1-10): 23
Incorrecto. Introduzca la altura (1-10): 11
Incorrecto. Introduzca la altura (1-10): 7
Introduzca la orientación (izquierda, derecha, arriba, abajo): centro
Incorrecto. Introduzca la orientación (izquierda, derecha, arriba, abajo): arriba
Introduzca el primer carácter: +
Introduzca el segundo carácter: o
* 
 +
 +o+
 +o+o+
 +o+o+o+
 +o+o+o+o+
+o+o+o+o+o+
+o+o+o+o+o+o+
 */


public class examenPg2 {
	
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
	
		.

