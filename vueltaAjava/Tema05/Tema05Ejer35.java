/*
 35
Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
igual a 3, en caso contrario se debe mostrar un mensaje de error.
 */


public class Tema05Ejer35 {
	
	public static void main (String args[]) {
    
    System.out.println("Introduce la altura de la x");
    int h=Integer.parseInt(System.console().readLine());
    int altura = 1;
    int espaciosExternos=0;
    int espaciosInternos= h-1;
    
    
    if (h<3&&h%2==0){
      
      System.out.println("vuelve a introducir la altura , tiene que ser mayor de tres e impar");
    }else{
      //primera mitad de la x
      while(altura<(h/2)+1){
        
        //ponemos los espacios externos
        
        for(int i=1;i<=espaciosExternos;i++){
          System.out.print(" ");
        }
        //ponemos primer asterisco
          System.out.print("*");
          
        //espacio interno
        for(int i=1;i<espaciosInternos;i++);{
          System.out.print(" ");
        }
        //ponemos segundo asterisco
        System.out.print("*");
        System.out.println();
        
        altura++;
        espaciosExternos++;
        espaciosInternos=espaciosInternos-2;
        
      }//while  
    }//else
    // parte de abajo /////////////////////////////////////
    espaciosInternos = 0;
    espaciosExternos = h / 2;
    altura = 1;
    while (altura <= h / 2 + 1) {
    // inserta espacios delante
    for (int i = 1; i <= espaciosExternos; i++) {
    System.out.print(" ");
    }
    // pinta la línea
    System.out.print("*");
    for (int i = 1; i < espaciosInternos; i++) {
    System.out.print(" ");
    }
    if(altura>1) {
    System.out.print("*");
    }
    System.out.println();
    altura++;
    espaciosExternos--;
    espaciosInternos+=2;
    } // while parte de abajo ///////////////////////
    } // else
    }
  
    
    
		
	


