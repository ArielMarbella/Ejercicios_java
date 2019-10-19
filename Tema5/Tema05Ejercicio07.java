/*
* 7. Realiza el control de acceso a una caja fuerte. La combinación
* será un número de 4 cifras. El programa nos pedirá la combinación
* para abrirla. Si no acertamos, se nos mostrará el mensaje
* “Lo siento, esa no es la combinación” y si acertamos se nos dirá
* “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
* oportunidades para abrir la caja fuerte.

 */


public class Tema05Ejercicio07  {
	
	public static void main(String args[]) {
    
    int intentos = 4;
    int numeroIntroducido;
    int clave = 1111;
    
    do{
      System.out.println("\n\nIntroduce la combinación de la caja fuerte");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if(numeroIntroducido==clave){
        System.out.println("\nLa caja fuera se ha abierto satisfactoriamente.");
         intentos = -1;
      }else{
        System.out.print("clave incorrecta\nInténtalo de nuevo a ver si hay suerte");
        intentos--;
      }
      
      
    }  while (intentos>0);
    
    if(intentos==0){
      System.out.println("*************************************************************");
      System.out.println("*******************\  n¡¡¡¡¡OH NOOOO!!!!!!!*************************");
      System.out.println("\nOportunidades agotadas, llama al cerrajero");
    } System.out.println("*****************************************************************");
    
  }
}
 

