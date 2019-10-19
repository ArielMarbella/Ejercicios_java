/*
* 15. Escribe un programa que dados dos números, uno real (base) y un
* entero positivo (exponente), saque por pantalla todas las potencias
* con base el numero dado y exponentes entre uno y el exponente introducido.
* No se deben utilizar funciones de exponenciación. Por ejemplo, si
* introducimos el 2 y el 5, se deberán mostrar 2¹, 2², 2³, 20 y 20
 */

public class Tema05Ejercicio15 { 
  public static void main(String[] args) {
    System.out.println("este programa calcula todas las potencias de un número real elevado al número que elijas");
    System.out.println("introduce la base conun número real");
    double base = Double.parseDouble(System.console().readLine());
    System.out.println("introduce el exponente com un entero");
    int exponenteFinal = Integer.parseInt(System.console().readLine());
    
    double potencia;
    int exponente;
    
    for(int i = 1;i<=exponenteFinal;i++){
      
       potencia = 1;
       exponente = i;
       
       for(int j = 1; j<=exponente;j++){
         potencia = potencia*base;
         }
         System.out.println(base + "^" + i + " = " + potencia);

    }
    
    

    
  }
}


