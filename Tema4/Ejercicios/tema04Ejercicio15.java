/*
 Escribe un programa que pinte una pirámide rellena con un carácter
* introducido por teclado que podrá ser una letra, un número o un
* símbolo como *, +, -, $, &, etc. El programa debe permitir al
* usuario mediante un menú elegir si el vértice de la pirámide está
* apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la
* derecha.
 */


public class tema04Ejercicio15 {
	
	public static void main (String args[]) {
    System.out.println("este programa pinta una pirámide como tu elijas");
    System.out.println("introduce un caracter para pintar la pirámide con él");
    
    String a = System.console().readLine();
    System.out.println("Elija un tipo de pirámide");
    System.out.println("1. Con el vértice hacia arriba");
    System.out.println("2. Con el vértice hacia abajo");
    System.out.println("3. Con el vértice hacia la izquierda");
    System.out.println("4. Con el vértice hacia la derecha");
    
    int eleccion = Integer.parseInt(System.console().readLine());
    
    switch (eleccion){
      case 1 :
      System.out.println(" " + a);
      System.out.println(" " + a + a + a);
      System.out.println(a + a + a + a + a);
      break;
      case 2 :
      System.out.println(a + a + a + a + a);
      System.out.println(" " + a + a + a);
      System.out.println(" " + a);
      break;
      case 3 :
      System.out.println(" " + a);
      System.out.println(" " + a + " " + a);
      System.out.println(a + " " + a + " " + a);
      System.out.println(" " + a + " " + a);
      System.out.println(" " + a);
      break;
      case 4 :
      System.out.println(a);
      System.out.println(a + " " + a);
      System.out.println(a + " " + a + " " + a);
      System.out.println(a + " " + a);
      System.out.println(a);
      break;
      default:


      }


		
	}
}

