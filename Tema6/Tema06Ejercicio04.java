/*
 Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
 * 
 */


public class Tema06Ejercicio04 {
	
	public static void main (String args[]) {
		
    System.out.println("muestra 20 números aleatorios entre 0 y 10 separados por espacios");
     
     for(int i = 0; i<20;i++){
       System.out.println((int)(Math.random() * 10));
       }
	}
}

