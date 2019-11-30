/*
36
Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
long en lugar de int ya que el primero admite números más largos.
 */


public class Tema05Ejer36 {
	
	public static void main (String args[]) {
    
    System.out.println("Este pograma te dice si es capicúa el número o no "+"\nIntroduce un número:\n");
    
    long numero = Integer.parseInt(System.console().readLine());
    long volteado=0;
    long n= numero;

      while (n>0){
        volteado=(volteado*10)+(n%10);
        n=n/10;
      }//while
     
     
     if(numero<10){
       System.out.println("El número al ser de una cifra es capicúa");
       }

      if(volteado==numero){
        System.out.println("El número es capicúa");
      }else{
        System.out.println("El número no es capicúa");
       }
 
    
    
  }
}

