/*
 * 
 * * Generación de números aleatorios.
 */


public class ejerLibro2 {
	
	public static void main (String args[]) {
    
    System.out.println("20 números aleatorios entre 0 y 10");
    System.out.println("Sin llegar a 10 (con decimales):\n");
    
    for(int i = 1; i<=20;i++){
      System.out.println(Math.random()*10+ "");
      } 
	}
}

