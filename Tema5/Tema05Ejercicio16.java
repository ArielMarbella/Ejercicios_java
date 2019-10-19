/*
 * 16. Escribe un programa que diga si un número introducido por teclado
* es o no primo. Un número primo es aquel que sólo es divisible entre
* él mismo y la unidad.

 */


public class Tema05Ejercicio16 {
	
	public static void main (String args[]) {
   int numIntro;
    boolean primo = true;
    
    System.out.println("Este programa te dice si el numero que introduzcas es primo o no");
    
    System.out.println("Introduce aqui el numero");
    numIntro = Integer.parseInt(System.console().readLine());
    
    for (int i = 2; i < numIntro; i++){
      if ((numIntro % i) == 0){
        primo = false;
      }
    }
    
    if (primo) {
      System.out.println ("El numero es primo");
    } else {
      System.out.println ("El numero no es primo");
    }
  }
}

