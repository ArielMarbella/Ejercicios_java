/*
 Realiza un conversor del sistema decimal al sistema de “palotes”.
Ejemplo:
Por favor, introduzca un número entero positivo: 47021
El 47021 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de palotes.
 * 
 */


public class Tema05Ejercicio37 {
	
	public static void main (String args[]) {
    
		 int num;
    int inverso = 0;
    int i = 0;
    int contador = 0;
    
    System.out.println("Conversor del sistema decimal al sistema palotes: ");    
    
    System.out.println("Introduce un numero entero positivo: ");
    num = Integer.parseInt(System.console().readLine());
    
    // Hay que imprimir los paloes desde la izquierda
    while(num > 0){
      inverso = (inverso * 10) + (num % 10);
      num /= 10;
      contador++;
    }
    
    // pinta los numeros como palotes
    while(inverso > 0){
      for(i = 0; i < inverso % 10; i++){
	System.out.print("|");
      }
      
      if(contador > 1){
      System.out.print("-");
      }
      
      contador--;
      inverso /= 10;
    } // While
  }
}


