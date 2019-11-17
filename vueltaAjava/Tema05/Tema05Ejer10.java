/*
10.
Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.
 */


public class Tema05Ejer10 {
	
	public static void main (String args[]) {
    
    double numero=0;
    double contador=0;
    double suma=0;
    
		System.out.println("introduce números y te dire la media\n" + "Para dejar de introducir números itroduce un número negativa");
    
    
    while(numero>=0){
      numero = Double.parseDouble(System.console().readLine());
      contador++;
      suma +=numero;
    }
    System.out.println("la media de los números ntroducidos es "  + (suma-numero)/(contador-1));
	}
}

