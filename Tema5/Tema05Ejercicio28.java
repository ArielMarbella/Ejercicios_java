/*
Ejercicio 28
* 
Escribe un programa que calcule el factorial de un número entero leído por
teclado.
 * 
 */


public class Tema05Ejercicio28 {
	
	public static void main (String args[]) {
    System.out.println("Este programa calcula el factorial.");
    System.out.println("Introduce el numero con el que calcular el factorial:");
    int n = Integer.parseInt(System.console().readLine());
		
    int factorial=1;
    
     for(int i=n;i>0;i--){
       factorial= factorial*i;
      }
      
      System.out.println(n+"!= " + factorial);
	}
}

