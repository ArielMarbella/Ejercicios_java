/*
Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los números desde el 1 al número introducido junto
con su factorial.
Ejemplo:
Por favor, introduzca un número entero positivo: 7
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120
6! = 720
7! = 5040

 */

import java.util.Scanner;
public class Tema05Ejercicio39 {
	
	public static void main (String args[]) {
    
     Scanner s = new Scanner(System.in);
    int num;
    int i;
    int factorial = 1;
    
    System.out.println("Muestra los factoriales desde el 1 hasta el numero "
      + "introducido");
    System.out.println("Introduce un número entero positivo:");    
    num = s.nextInt();
    
    for(i = 1; i <= num; i++){
      
      factorial *= i;
      
      System.out.println(i + "! = " + factorial);
    }
    
  }
}
	
