/*
 26
Realiza un programa que pinte una tableta de turrón con un bocado realizado de
forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
da alrededor del turrón, obviamente no se puede dar un bocado por en medio
de la tableta.
 */


public class Tema06Ejercicio26 {
	
	public static void main (String args[]) {
    
    System.out.println("Pinta una tableta de turrón con un bocado.\nIntroduce el ancho y el alto");
    
    System.out.println("Introduce el alto");
		int alto=Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el ancho");
    int ancho=Integer.parseInt(System.console().readLine());
    
    for(int i=0;i<alto;i++){
      System.out.println();
       for(int j=0;j<ancho;j++){
         System.out.print("*");
       }
    }
   
    
	}
}
