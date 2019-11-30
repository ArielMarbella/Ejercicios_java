/*
33 Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
* 
* Introduzca la altura de la U: 5

 */


public class Tema05Ejer33 {
	
	public static void main (String args[]) {
    
    System.out.println("introduce la altura de la U");
     int h= Integer.parseInt(System.console().readLine());
         
     for(int i=0;i<h;i++){
      
        for(int j=0;j<1;j++){
        System.out.print("     *");
        }
          for(int j=0;j<4;j++){
          System.out.print(" ");
          }
           for(int j=0;j<1;j++){
           System.out.print("*");
           }
        
        System.out.println();
      }
      
      for(int j=0;j<6;j++){
          System.out.print(" ");
          }
     for(int j=0;j<3;j++){
      System.out.print("*");
     }

        
       
    
		
	}
}

