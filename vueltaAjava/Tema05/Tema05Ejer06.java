/*
Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
do-while.
 */


public class Tema05Ejer06 {
	
	public static void main (String args[]) {
		
    System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while.");
    
    int i = 320;
    do{
      i= i-20;
      System.out.println(i);  
    }while(i>160);
    
	}
}

