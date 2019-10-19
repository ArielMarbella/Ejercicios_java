/*
* 15. Escribe un programa que dados dos números, uno real (base) y un
* entero positivo (exponente), saque por pantalla todas las potencias
* con base el numero dado y exponentes entre uno y el exponente introducido.
* No se deben utilizar funciones de exponenciación. Por ejemplo, si
* introducimos el 2 y el 5, se deberán mostrar 2¹, 2², 2³, 20 y 20
 */

public class Tema05Ejercicio15 { 
  public static void main(String[] args) {
    System.out.println("vas a elegir la base y el exponente de un número y calcularemos todas sus potencias");
    System.out.println("introduce un número real como base");
    double base = Double.parseDouble(System.console().readLine());
    System.out.println("Escribe el entero positivo para el exponente");
    int exponente = Integer.parseInt(System.console().readLine());

     for(int i = 0; i<exponente;i++){
       System.out.println(" "+base);
       base = base*base;
       }
    
  }
}


