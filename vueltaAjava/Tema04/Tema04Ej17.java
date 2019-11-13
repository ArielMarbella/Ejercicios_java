/*
 17. Escribe un programa que diga cuál es la última cifra de un número
* entero introducido por teclado.
 */


public class Tema04Ej17 {
	
	public static void main (String args[]) {
    
		System.out.println("escribe un número y te diré cual es el último");
    
    int n = Integer.parseInt(System.console().readLine());
    
    System.out.println("La última cifra es: " + (n%10));
    
    
      
	}
}

