/*
 * 4. Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
* separados por espacios.
 */


public class Tema06Ejercicio04 {
	
	public static void main (String args[]) {
    
    System.out.println("Mostramos 100 números aleatorios entre 0 y 10 separados por espacios\n\n");
     
    for(int i=0;i<100;i++){
      
      System.out.print ("-"+"|" + (int)(Math.random()*11)+"|"+"-");
      }
		
	}
}

