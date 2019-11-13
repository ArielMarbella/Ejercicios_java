/*
 * 15. Escribe un programa que pinte una pirámide rellena con un carácter
* introducido por teclado que podrá ser una letra, un número o un
* símbolo como *, +, -, $, &, etc. El programa debe permitir al
* usuario mediante un menú elegir si el vértice de la pirámide está
* apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la
* derecha.

 */


public class Tema04Ej15 {
	
	public static void main (String args[]) {
    
    System.out.println("pinta una pirámide, introduce un símbolo para pintarla");{
      String sim = System.console().readLine();
      
      System.out.println("Elige un tipo de pirámide:  ");
      System.out.println("1.Con el vértice hacia arriba");
      System.out.println("2.Con el vértice hacia abajo");
      System.out.println("3.Con el vértice hacia derecha");
      System.out.println("4.Con el vértice hacia izquierda");
      
      int opcion = Integer.parseInt(System.console().readLine());
      
      switch(opcion){
        case 1 :
        System.out.println("" + sim);
        System.out.println("" + sim + sim + sim);
        System.out.println(sim + sim + sim + sim + sim);
        break;
        case 2 :
        System.out.println(sim + sim + sim + sim + sim);
        System.out.println("" + sim + sim + sim);
        System.out.println("" + sim);
        break;
        case 3 :
        System.out.println("  " + sim);
        System.out.println(" " + sim + " "+sim);
        System.out.println(" "  + " " + sim );
        System.out.println(" " + sim + " "+sim);
        System.out.println("  " + sim);
        break;
     
        case 4:
        System.out.println(sim);
        System.out.println(sim + " " + sim);
        System.out.println(" " + sim + sim + " " + sim);
        System.out.println(sim + " " + sim);
        System.out.println(sim);
        break;
        default:

        
        
        
        
        
        
        
        
        }
      
      
      
      
      
      }
    
		
	}
}

