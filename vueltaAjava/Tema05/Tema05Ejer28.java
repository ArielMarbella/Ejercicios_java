/*
28
Escribe un programa que calcule el factorial de un número entero leído por
teclado.

 */


public class Tema05Ejer28 {
	
	public static void main (String args[]) {
    
    System.out.println("introduce número que te digo el factorial");
    int n = Integer.parseInt(System.console().readLine());
    int f =1;
    for (int i=1;i<=n;i++){
      f=f*i;
    }
		System.out.println(f);
	}
}

