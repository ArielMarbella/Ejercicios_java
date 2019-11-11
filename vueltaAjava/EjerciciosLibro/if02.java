/*
. El usuario introducirá un número por
teclado y el programa dirá si se trata de un número positivo o negativo
 */


public class if02 {
	
	public static void main (String args[]) {
		System.out.println("introduc un número por teclado");
    int numero = Integer.parseInt(System.console().readLine());
    
    if(numero<0){
      System.out.print("el número es negativo");
      }else{
      System.out.print("el número es positivo");
      }
	}
}

