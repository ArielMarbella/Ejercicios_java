/*
Realiza un programa que pinte por pantalla un rombo hueco hecho con
asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
mensaje de error.
Ejemplo:
Por favor, introduzca la altura del rombo: 5
 *
* *
* *
* *
 *
 * 
 */


public class Tema05Ejercicio40 {
	
	public static void main (String args[]) {
    
     boolean condicion = true;
    int altura = 0;
    int alturaIntro;
    int espaciosInternos = 0;
    int espaciosExternos;
    int i = 0;
    
    do{
      System.out.println("Introduce la altura del rombo:");    
      alturaIntro = Integer.parseInt(System.console().readLine());
      
      if(alturaIntro < 3 || alturaIntro % 2 == 0){
	System.out.println("Debes introducir un número impar mayor o igual a "
	  + "3.");
	
	condicion =false;
      }
    } while(condicion == false);
    
    System.out.println();
    
    // Pinta la parte de arriba del rombo
    espaciosExternos = alturaIntro / 2;
    
    while(altura < alturaIntro / 2){
      
      //Pinta los espacios
      for(i = 1; i <= espaciosExternos; i++){
	System.out.print(" ");
      }
      
      System.out.print("*");
      
      //Pinta los espacios internos
      for(i = 1; i < espaciosInternos; i++){
	System.out.print(" ");
      }
      
      if(altura >= 1){
	System.out.print("*");
      }
      
      System.out.println();
      
      altura++;
      espaciosExternos--;
      espaciosInternos += 2;
    }
    
     // Pinta la parte de abajo del rombo
    espaciosExternos = 1;
    espaciosInternos = alturaIntro - 2;
    altura = 0;
    
    
    while(altura < alturaIntro / 2 + 1){
      
      //Pinta los espacios
      for(i = 1; i < espaciosExternos; i++){
	System.out.print(" ");
      }
      
      System.out.print("*");
      
      //Pinta los espacios internos
      for(i = 1; i <= espaciosInternos; i++){
	System.out.print(" ");
      }
      
      if(altura < alturaIntro / 2){
	System.out.print("*");
      }
      
      System.out.println();
      
      altura++;
      espaciosExternos++;
      espaciosInternos -= 2;
    }
   
  }
}
		
