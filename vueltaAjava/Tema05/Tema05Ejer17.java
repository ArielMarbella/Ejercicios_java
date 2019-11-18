/*
 17
Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).
 */


public class Tema05Ejer17 {
	
	public static void main (String args[]) {
		System.out.println("Realiza un programa que sume los 100 números siguientes a un número entero y positivo introducido por teclado.comprobaremos si es positivo");
    int numero = Integer.parseInt(System.console().readLine());
    suma=0;
    if(numero>0){
      for(int i=0;i<numero;i++)
        suma=suma+numero;
    }
	}
}

