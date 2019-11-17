/*
Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
 */


public class Tema05Ejer11 {
	
	public static void main (String args[]) {
		
    System.out.println("Escribe in número y te diré el cuadrado y el cubo de los 5 primeros");
    System.out.println("INtroduce unnúmero\n");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    for (int i = numero;i<numero + 5;i++){
        
       System.out.printf("\n%4d %8d %12d\n" ,i,i*i,i*i*i);
    }
    
    
    
    
    
	}
}

