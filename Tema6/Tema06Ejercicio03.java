/*
Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de
* 48 cartas: 2, 3, 4, 5, 6, 7, 8, 9, sota, caballo, rey y as.

 */


public class Tema06Ejercicio03 {
	
	public static void main (String args[]) {
    
    int numeroCarta = (int)(Math.random()*12)+1;
    
    if((numeroCarta>1)&&(numeroCarta<10)){
      System.out.println(numeroCarta);
      } else {
      
      switch (numeroCarta){
          case 1:
            System.out.println("As" );
            break;
          case 10:
            System.out.println("J" );
            break;
          case 11:
            System.out.println("Q" );
            break;
          case 12:
            System.out.println("K" );
            break;
        }
       } 
        System.out.print( "de " );
    
    int numeroPalo=(int)(Math.random()*4)+1;
      switch(numeroPalo){
        case 1:
          System.out.println("bastos " );
          break;
        case 2:
          System.out.println("copas " );
          break;
        case 3:
          System.out.println("espadas " );
          break;
        case 4:
          System.out.println("oros " );
          break;

        }
	}
}

