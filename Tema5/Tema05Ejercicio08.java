/*
* 8. Muestra la tabla de multiplicar de un número introducido por teclado.
*
* @author Ariel Rojas.
 */


public class Tema05Ejercicio08 {
	
	public static void main (String args[]) {
		
    System.out.println("\nTabla de multiplicar (maximo de 100) :");
    System.out.print("\nNumero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int i = numero;
    int m = 1;
    
    do   {
      System.out.println("\n"+ m +" x "+ numero +" = "+ i);
      i += numero;
      m ++;
    }   
    
    while (i <= 100); 
    
  }
}
