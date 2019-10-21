/*
 * 19. Realiza un programa que pinte una pirámide por pantalla. La altura
* se debe pedir por teclado. El carácter con el que se pinta la pirámide
* también se debe pedir por teclado.

 */


public class Tema05Ejercicio19 {
	
	public static void main (String args[]) {
     
  
  System.out.println("Este programa pinta pirámides");
  System.out.println("Indica el número de alturas que quieres");
  int alturaPiramide = Integer.parseInt(System.console().readLine());
  System.out.println("Indica que carácter quieres la pirámide");
  String caracterIntroducido = System.console().readLine();
  int espacio = alturaPiramide -1;
  int anchoCaracteres= 1;
  
    for(int fila=0;fila <alturaPiramide;fila++){
      for(int i=0; i<espacio;i++){
         System.out.print(" ");
      }
      for(int i=0; i<anchoCaracteres;i++){
        System.out.print(caracterIntroducido);
      }
      System.out.println();
      anchoCaracteres+=2;
      espacio--;
      
    }

  
  }
}

