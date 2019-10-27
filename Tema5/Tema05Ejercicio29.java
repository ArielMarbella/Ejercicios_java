/*
 * Ejercicio 29
Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.
 */


public class Tema05Ejercicio29 {
	
 public static void main (String[] args) {
    
    int n1;
    int n2;
    int i;
    
    System.out.println("Este programa muestra todos los numeros enteros "
      + "positivos menores a uno leído por teclado que no sean divisibles entre"
      + " otro también leído por teclado.");
    
    do {
      System.out.println("Introduce el numero mayor:");
      n1 = Integer.parseInt(System.console().readLine());
      
      System.out.println("Introduce el numero del que no queremos que sea "
	+ "divisible:");
      n2 = Integer.parseInt(System.console().readLine());
 
      
    } while(n1 <= 0 && n2 <= 0 && n1 < n2);
    
    for(i = 1; i <= n1; i++){
      if(i % n2 != 0){
	System.out.print(i + " ");
      }
    }
    
  }
}
