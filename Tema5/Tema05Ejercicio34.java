/*
Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos.
* 
Ejemplo 1:
Por favor, introduzca un número: 9402
Introduzca otro número: 6782
El número formado por los dígitos pares es 640822
El número formado por los dígitos impares es 97
* 
Ejemplo 2:
Por favor, introduzca un número: 137
Introduzca otro número: 909
El número formado por los dígitos pares es 0
El número formado por los dígitos impares es 19379

 */


import java.util.Scanner;

public class Tema05Ejercicio34 {
	
  public static void main (String[] args) {
    
    Scanner s =  new Scanner(System.in);
    long num1, num2;
    long inverso1 = 0;
    long inverso2 = 0;
    long pares = 0;
    long impares = 0;
    int contador = 0;
    
    System.out.println("Introduce un numero: ");  
    num1 = s.nextLong();  
    
    System.out.println("Introduce otro numero de la misma longitud: ");
    num2 = s.nextLong();
    
    // Damos la vuelta a ambos números para poder leerlos de izq a derecha
    
    // Da la vuelta al primer número 
    while(num1 > 0){
      inverso1 = (inverso1 * 10) + (num1 % 10);
      num1 /= 10;
      contador++;
    }
    
    // Da la vuelta al segundo número
    while(num2 > 0){
      inverso2 = (inverso2 * 10) + (num2 % 10);
      num2 /= 10;
    }
    
    while(contador > 0){
      
      if (((inverso1 % 10) % 2) == 0){
	pares = (pares * 10) + (inverso1 % 10);
      } else {
	impares = (impares * 10) + (inverso1 % 10);
      }
      inverso1 /= 10;
      
      if (((inverso2 % 10) % 2) == 0){
	pares = (pares * 10) + (inverso2 % 10);
      } else {
	impares = (impares * 10) + (inverso2 % 10);
      }
      inverso2 /= 10;
      
      contador--;
    }
    
    System.out.println("Digitos pares: " + pares);
    System.out.println("Digitos impares: " + impares);
  }
}

