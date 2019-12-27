/*
9. Realiza un programa que vaya generando números aleatorios pares
* entre 0 y 100 y que no termine hasta que no saque el número 24. El
* programa deberá decir al final cuántos números se han generado.

 */


public class Tema06Ejercicio09 {
	
	public static void main (String args[]) {
    
    int n= 0;
    int cuentaNumeros=0;
    
    while(n!=24){
      n=(int)(Math.random()*51)*2;
      System.out.println(n);
      cuentaNumeros++;
      }
      
      System.out.println("Los números introducidos hasta el 24 son: \n" + cuentaNumeros);
		
	}
}

