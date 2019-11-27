/*
 o 27
Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.
 */


public class Tema05Ejer27 {
	
	public static void main (String args[]) {
		
    System.out.println("Introduce un número:");
    int n=Integer.parseInt(System.console().readLine());
    
    int cuenta= 0;
    int suma=0;
    
    for(int i=0;i<n;i++){
      if(i%3==0){
        System.out.println(i + " ");
        cuenta++;
        suma+=i;  
      }
        
    } 
    System.out.println("\n\nel numero de multiplos es; " + cuenta);
    System.out.println("\nla suma de ells es; " + suma);    
  }
}

