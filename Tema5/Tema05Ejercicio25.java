/*
 * Tema05Ejercicio25.java
 * 
Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.
 * 
 */


public class Tema05Ejercicio25{
	
	public static void main (String args[]) {
		System.out.print("escribe un número y lo pondremos al reves");
    int numero = Integer.parseInt(System.console().readLine());
    
    int numInvertido=0;
    
    System.out.println("\nEl numero invertido es:");
    
    // Invierte el numero
    while(numero > 0){
      numInvertido = numero % 10;
      numero = numero / 10;
      
    }
    System.out.print(numInvertido);
	}
}

