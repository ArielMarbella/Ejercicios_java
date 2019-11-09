/*
Ejercicio 1
Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).
 */


public class Tema06Ejercicio01 {
	
	public static void main (String args[]) {
    
    int tirada;
    int suma = 0;
    
    System.out.println("escribimos la terada de tres daddos\n" + "y debajo la suma de los mismos\n");
    
    for (int i = 0; i < 3; i++){
      
      tirada = (int)(Math.random()*6) +1;
      System.out.print(tirada + " \n");
      suma += tirada;
    }
     System.out.println("\nsuma:" + suma);

		
	}
}

