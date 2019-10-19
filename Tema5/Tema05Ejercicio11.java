/*
 * * 11. Escribe un programa que muestre en tres columnas, el cuadrado y
* el cubo de los 5 primeros números enteros a partir de uno que se
* introduce por teclado.
 * 
 */


public class Tema05Ejercicio11 {
	
	public static void main (String args[]) {
    System.out.println("Introduzca un número: ");
    
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int cuadrado;
    int cubo;
    
    for(int i=numeroIntroducido;i<numeroIntroducido + 5; i++){
       
       cuadrado = i*i;
       cubo = i*i*i;
       
    System.out.printf("%4d %6d %8d\n" , i, cuadrado , cubo);
    }
  }
}  
  

		
	
