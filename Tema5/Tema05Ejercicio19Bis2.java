/*
 * Tema05Ejercicio19Bis2.java
Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.
 */


public class Tema05Ejercicio19Bis2 {
	
	public static void main (String args[]) {
      
      int alturaPiramide;
      int espacioBlanco;
      String caracter;
      int ancho= 0;
    
   System.out.print("este es un programa que pinte pirámides");
      System.out.print("Introduce el número de alturas que quieres que tenga la pirámide:");
      
      alturaPiramide= Integer.parseInt(System.console().readLine());
      
      System.out.print("Introduce el caracter que  quieres que tenga la pirámide:");
      
      caracter = System.console().readLine();
      espacioBlanco= alturaPiramide-1;
      
      for(int i = 0;i<alturaPiramide; i++){
        
        //pinto espacios
        for(i = 0; i<=espacioBlanco;i++){
          System.out.print(" ");
        }
         //pinto caracteres
         
         for(i=0; i < alturaPiramide;i++){
           
           System.out.print(caracter);
           
        }
        System.out.println();
        espacioBlanco-=1;
        ancho+=2;
        
      }
      
      

      

   
    
    
    

	}
}

