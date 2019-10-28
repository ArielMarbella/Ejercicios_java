/*
Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
long en lugar de int ya que el primero admite números más largos.
* 
Ejemplo 1:
Por favor, introduzca un número entero positivo: 678
El 678 no es capicúa.
* 
Ejemplo 2:
Por favor, introduzca un número entero positivo: 2019102
El 2019102 es capicúa.

 */


public class Tema05Ejercicio36 {
	
	public static void main (String[] args) {
    
    long num;
    long aux;
    long inverso = 0;
    int i = 0;
    
    System.out.println("Este programa comprueba si el numero es capicua: ");    
    
    System.out.println("Introduce un numero entero positivo: ");
    num = Long.parseLong(System.console().readLine());
    
    aux = num; 
    
    while (aux > 0){
      inverso = (inverso * 10) + (aux % 10);
      aux /= 10;
    }
    
    if(num == inverso){
      System.out.println("El " + num + " es capicúa.");
      
    } else {
      System.out.println("El " + num + " no es capicúa.");
    }
  }
}


