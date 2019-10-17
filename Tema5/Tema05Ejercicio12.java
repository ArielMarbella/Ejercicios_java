/*
* 12. Escribe un programa que muestre los n primeros términos de la
* serie de Fibonacci. El primer término de la serie de Fibonacci
* es 0, el segundo es 1 y el resto se calcula sumando los dos
* anteriores, por lo que tendríamos que los términos son 0, 1, 1,
* 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe
* introducir por teclado.

 */


public class Tema05Ejercicio12 {
	
	public static void main (String args[]) {
    int numero=0; 
    int numero2=numero;
    int fin; 
    
      System.out.println("Introduce un numero y se te dará la secuencia de Fibonacci"); 
      numero = Integer.parseInt(System.console().readLine());
      for (fin=0; fin<6;fin++) {
        if (numero==0) {
          numero++;
          System.out.printf(" %d- " , numero);
        }
        else {
          numero+=numero2;
          numero2+=numero;
            System.out.printf("-%d-" , numero);
            System.out.printf("%d" , numero2);
        }
      }
	}
}
