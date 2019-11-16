/*

 8
Muestra la tabla de multiplicar de un número introducido por teclado. 
 */


public class Tema05Ejer08 {
	
	public static void main (String args[]) {
		
    System.out.println("muestra la tabla de multiplicar del número elegido\n" + "Elige un número");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    for (int i = 0;i<10;i++){
      
      System.out.println(numero + "x" + i + "=" + (numero*i ));
    }
	}
}

