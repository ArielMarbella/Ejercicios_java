/*
* 19. Realiza un programa que pinte una pirámide por pantalla. La altura
* se debe pedir por teclado. El carácter con el que se pinta la pirámide
* también se debe pedir por teclado.
*/
public class Tema05Ejer19 {
 
	public static void main (String args[]) {
      
      int alturaPiramide;
      int espacioBlanco;
      String caracter;
      int ancho= 1;
    
   System.out.print("este es un programa que pinte pirámides");
      System.out.print("Introduce el número de alturas que quieres que tenga la pirámide:");
      
      alturaPiramide= Integer.parseInt(System.console().readLine());
      
      System.out.print("Introduce el caracter que  quieres que tenga la pirámide:");
      
      caracter = System.console().readLine();
      espacioBlanco= alturaPiramide-1;
      
      for(int j=0;j<alturaPiramide; j++){
        
        //pinto espacios
        for(int i=0; i<espacioBlanco;i++){
          System.out.println("-");
        }
         //pinto caracteres
         
         for(int i=0; i<ancho;i++){
           
           System.out.print(caracter);
           
        }
        System.out.println();
        espacioBlanco-=1;
        ancho+=2;
      }
    }}
