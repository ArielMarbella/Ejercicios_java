/*
 9. Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.

 */


public class Tema05Ejercicio09{
	
	public static void main (String args[]) {
    
    System.out.println("inroduce numero, diré digitos");
    int numeroIntroducido=  Integer.parseInt(System.console().readLine());
    int numeroDigitos= 1;
    int n = numeroIntroducido;
     
    while(n>10){
      n/=10;
      numeroDigitos++;
    }
    
		System.out.println(numeroIntroducido + " tiene " + numeroDigitos + " digitos");
	}
}

