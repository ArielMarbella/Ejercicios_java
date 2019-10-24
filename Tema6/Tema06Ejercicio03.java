/*
Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.

 */


public class Tema06Ejercicio03 {
	
	public static void main (String args[]) {
    
    int carta;
    int numero;
    
    carta = (int)(Math.random()* 4+1);
     switch (carta){
       case 1:
       System.out.print("as");
       break; 
         case 2:
       System.out.print("asb  ");
       break; 
         case 3:
       System.out.print("as");
       break; 
         case 4:
       System.out.print("as");
       break; 
    }
    
		
	}
}

