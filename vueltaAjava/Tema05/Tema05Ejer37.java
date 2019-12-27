/*
 * Tema05Ejer37.java
 * 
37
Realiza un conversor del sistema decimal al sistema de “palotes”.
* 
Ejemplo:
Por favor, introduzca un número entero positivo: 47021
El 47021 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de palotes.

 */


public class Tema05Ejer37 {
	
	public static void main (String args[]) {
    
      System.out.println("Ete programa pasa a palotes un número");
      
      int num = Integer.parseInt(System.console().readLine());
      int volteado=0;
      int contador=0;
      
      //volteamos el número para atacarle después
      
      while (num>0){
        volteado=(volteado*10)+(num%10);
        num=num/10;
        contador++;  
      }//fin de primer while
      
		while (volteado>0){
      
      for(int i=0;i<volteado%10;i++){
        System.out.print("|");
      }
      System.out.print("-");
      volteado=volteado/10;
        
    }//fin del segundo while
	}
}

