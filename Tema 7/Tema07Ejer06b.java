/*
 6
Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.

 */


public class Tema07Ejer06b {
	
	public static void main (String args[]) {
    
    int i;
    int [] num = new int[15];
    
    // Genera un array con los elementos rotados una posición a la derecha
    for (i = 0; i < 15; i++) {
      if (i == 14) {
	System.out.print("Introduce un número entero: ");
	num[0] = Integer.parseInt(System.console().readLine());
      } else {
	System.out.print("Introduce un número entero: ");
	num[i + 1] = Integer.parseInt(System.console().readLine());
      }
    }
    
    // Imprime el array generado
    System.out.print("Array Rotado\nIndice: ");
    for (i = 0; i < 15; i++) {
      System.out.printf("%5d", i);
    }
    
    System.out.print("\nValor:  ");
    for (i = 0; i < 15; i++) {
      System.out.printf("%5d", num[i]);
    }
	}
}

