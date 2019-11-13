/*
 * Tema04Ej14.java
 14. Realiza un programa que diga si un número introducido por teclado
* es par y/o divisible entre 5
 */


public class Tema04Ej14 {
	
	public static void main (String args[]) {
    
    System.out.println("diga si un número introducido por teclado es par y/o divisible entre 5");
    
    int num = Integer.parseInt(System.console().readLine());
    if(num%2==0){
      System.out.println("el número es par\n");
    }else{
      System.out.print("el número es impar\n");
     }
    if(num%5==0){
      System.out.print("\ttambién es dividible por 5");
    }else{
      System.out.println("\tno es divisible entre 5");
     }
	}
}

