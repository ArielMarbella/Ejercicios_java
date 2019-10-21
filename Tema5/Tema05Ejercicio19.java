/*
 * 19. Realiza un programa que pinte una pirámide por pantalla. La altura
* se debe pedir por teclado. El carácter con el que se pinta la pirámide
* también se debe pedir por teclado.

 */


public class Tema05Ejercicio19 {
	
	public static void main (String args[]) {
     
    int alturaIntroducida;
    String caracter;
    
    System.out.print("Introduzca altura: ");
    alturaIntroducida = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca caracter: ");
    caracter = System.console().readLine();
    
    for (int fila=0; fila<alturaIntroducida; fila++) {
      
      for (int i=0; i<alturaIntroducida-fila; i++) {
        System.out.print(" ");
      }
      
      for (int i=alturaIntroducida-fila; i<=alturaIntroducia; i++) {
        System.out.printf("%s ", caracter);
      }
            
      System.out.printf("\n");
    
    }
  }
}

