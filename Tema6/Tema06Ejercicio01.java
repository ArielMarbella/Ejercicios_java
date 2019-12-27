/*
Ejercicio 1
Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).

 */


public class Tema06Ejercicio01 {
	
	public static void main (String args[]) {
    
    int i;
    int suma=0;
    int tirada;
    System.out.println("Escribe un programa que muestre la tirada de tres dados. \nSe debe mostrar también la suma total\n(los puntos que suman entre los tres dados).");
		
    for(i=0;i<3;i++){
      tirada=((int)(Math.random()*3)+1);
      suma=suma+tirada;
      System.out.println(tirada);
      
      }
      System.out.println("suma= "+ suma);      
	}
}

