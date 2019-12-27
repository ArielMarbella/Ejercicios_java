/*
38
Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
programa debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
Ejemplo:
Por favor, introduzca la altura del reloj de arena: 5

                       *****
                        ***
                         *
                        ***
                       *****
 */


public class Tema05Ejer38 {
	
	public static void main (String args[]) {
		
   int h= Integer.parseInt(System.console().readLine());
   int mitad=1;
   int espaciosDelante=1;
   int asteriscos=h;
    
    while(mitad<=(h/2+1)){
      
      //pinto espacios
      for(int i=1;i<espaciosDelante;i++){
        System.out.print(" ");
      }
      //pinto asteriscos
      for(int i=0;i<asteriscos;i++){
        System.out.print("*");
      }
      System.out.println();
      espaciosDelante++;
      mitad++;
      asteriscos=asteriscos-2;
      
    }//fin del primer while   
    //pinto la parte de abajo
    
     espaciosDelante=h/2;
     mitad=1;
     asteriscos=h/2+1;
     
     //primero pinto espacios:
     while(mitad<=h/2){
       for (int i=1;i<espaciosDelante;i++){
         System.out.print(" ");  
       }
       for(int i=1;i<=asteriscos;i++){
        System.out.print("*");
        }
        System.out.println();
       mitad++;
       espaciosDelante--;
       asteriscos=asteriscos+2;
       
      
     }//segundo while
        
    }
	}


