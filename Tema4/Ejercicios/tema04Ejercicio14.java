/*
Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5.
 */


public class tema04Ejercicio14 {
	
	public static void main (String args[]) {
    
    System.out.println("escribe un número y veremos si es par o impar");
    int numero = Integer.parseInt(System.console().readLine());
    if((numero % 2) == 0 ){
     System.out.print("el número introducido es par");
     }else{
       System.out.print("El número ese es impar");
       }		
	}
}

