/*
 * 
Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).
* 
@Ariel.Rojas.
 */


public class Tema06Ejercicio01{
	
	public static void main (String args[]) {
    
    int tirada;
    int suma = 0;
    
    System.out.println("Tiramos 3 dados y sumamos los resultados:");
    
    for(int i = 0;i<3;i++){
    
    tirada = (int)(Math.random()*6) + 1;
    System.out.println("\n" + tirada + ("\n "));
    suma+= tirada;

    }
    System.out.println("\nSuma: " + suma);

  }
}
    
		
