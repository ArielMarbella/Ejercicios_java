/*
13.
* Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.

 */


public class Tema05Ejer13 {
	
	public static void main (String args[]) {
		
    System.out.println("Introduzca 10 números enteros");
    int pos=0;
    int neg=0;
    
    for (int i = 0;i<10;i++){
       
      int n = Integer.parseInt(System.console().readLine());
        if (n>0){
          pos++;
        }
        else{
          neg++;
        }
        System.out.println("positivos " + pos + " negativos " + neg);
      }
    
	}
}

