/*
Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.
*/
public class tema04Ejercicio18{
  public static void main(String[]args){
  int n;
  int primera = 0;
  
  System.out.println("Introduce un número de 5 cifras, veremos cual es el primero");
  
  n = Integer.parseInt(System.console().readLine());
  
  if(n<10){
    primera = n;
  }
  if ((n>=10) && (n<=100)){
  primera = n/10;
  }
  if ((n>=100) && (n<=1000)){
  primera = n/100;
  }
  if ((n>=1000) && (n<=10000)){
  primera = n/100;
  }
  if ((n>=10000)){
  primera = n/10000;
  }     
  System.out.print("la primera cifra es el:\n" + primera);
}
  
}
