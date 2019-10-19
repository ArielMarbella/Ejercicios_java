/*
* 10. Escribe un programa que calcule la media de un conjunto de números
* positivos introducidos por teclado. A priori, el programa no sabe
* cuántos números se introducirán. El usuario indicará que ha terminado
* de introducir los datos cuando meta un número negativo.
 */


public class Tema05Ejercicio10{
	
	public static void main (String args[]) {
    System.out.println("introduce numeros positivos y te dare la media parare de contar números al meter un numero negativo");
		double numeroIntroducido = 0;
    double suma = 0;
    double numeros = 0;
    
    while(numeroIntroducido>=0){
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      numeros++;
      suma +=numeroIntroducido;
    }
    System.out.println("la media es: " + (suma - numeroIntroducido)/(numeros-1));
	}
}

