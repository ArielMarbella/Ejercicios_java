/*
* 11. Realiza un programa que pida 10 números por teclado y que los almacene en un array.
* A continuación se mostrará el contenido de ese array junto al índice (0 – 9).
* Seguidamente el programa pasará los primos a las primeras posiciones, desplazando
* el resto de números (los que no son primos) de tal forma que no se pierda ninguno.
* Al final se debe mostrar el array resultante.

 */


public class Tema07Ejer11 {
	
	public static void main (String args[]) {
    
     int[] num = new int[10];
    int[] primo = new int[10];
    int[] noPrimo = new int[10];
    int i;
    int j;
    int primos = 0;
    int noPrimos = 0;
    boolean esPrimo = false;
		System.out.println("introduce 10 números y serán ordenados");
    
    for (i=0;i< 10;i++) {
      esPrimo = true;
      num[i] = Integer.parseInt(System.console().readLine());
      
    for (j = 2; j < num[i]; j++) {
      if (num[i] % j == 0) {
      esPrimo = false;
	    }
    }
      
      if (esPrimo) {
      primo[primos++] = num[i];
      } else {
      noPrimo[noPrimos++] = num[i];
      }
    }
    
    // Imprime array inicial
    System.out.println("Array inicial: ");
    System.out.print("Indice: ");
    for (i = 0; i < 10; i++) {
      System.out.printf("%5d", i);
    }
    System.out.print("\nValor:  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("%5d", num[i]);
    }
    
    // Introduce los números primos al princio del array final
    for (i = 0; i < primos; i++) {
      num[i] = primo[i];
    }
    // Introduce los no primos una vez se hayan introducido los primos
    for (i = primos; i < 10; i++) {
      num[i] = noPrimo[i - primos];
    }
    
    // Imprime array final
    System.out.println("\n\nArray final: ");
    System.out.print("Indice: ");
    for (i = 0; i < 10; i++) {
      System.out.printf("%5d", i);
    }
    System.out.print("\nValor:  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("%5d", num[i]);
    }
    
	}
}

