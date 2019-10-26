/*
 Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.

 * 
 */


public class Tema05Ejercicio23 {
	
	public static void main (String args[]) {
		
    int numero;
    int suma=0;
    int contador=0;
    double media;
    
    System.out.println("introduce números , pararemos hast que la suma de todos ellos llegue a 10000");
	
     while(suma<10000){
       System.out.println("introduce un numero");
       numero=Integer.parseInt(System.console().readLine());
       
       suma=suma+numero;
       contador++;
       }
       
       media= suma/contador;
       
      System.out.println("el valor total es " + suma + " \nse han introducido " + contador + " numeros " + " \nla media es " + media);
  }
}
                                                         
