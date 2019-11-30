/*
 31
Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera e
 */


public class Tema05Ejer31 {
	
	public static void main (String args[]) {
    System.out.println("Introduce un h");
    int h= Integer.parseInt(System.console().readLine());
		
   for (int i = 0; i < h; i++) {
    System.out.println("*");
   }
   for (int i=0;i<(h/2)+1;i++){
     System.out.print("* ");
    }

	}
}

