/*
Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.
Ejemplo 1:
diamante diamante limón
Bien, ha recuperado su moneda
 */


public class Tema06Ejercicio016 {
	
	public static void main (String args[]) {
    
    System.out.println("Simulando tragaperras");
    
    int tirada=0;
   
    int figura1=0;
    int figura2=0;
    int figura3=0;
    
    for(tirada=0;tirada<3;tirada++){
        
        int eligeFigura=(int)(Math.random()*5);
        
        switch(eligeFigura){
           case 0:
           System.out.print("|corazón|");
           break;
           
           case 1:
          System.out.print("|diamante|");
           break;
           
           case 2:
           System.out.print("|herradura|");
           break;

           case 3:
           System.out.print("|campana|");
           break;

           case 4:
          System.out.print("|limón|");
           break;
          default:
        }
       switch(tirada){
         
         case 1:
         figura1 = eligeFigura;
         break;
         case 2 :
          figura2= eligeFigura;
          break;
         case 3:
           figura3 =eligeFigura;
           break;
           default:
        }
    }
		if (figura1==figura2&&figura1==figura3){
    System.out.println("enhorabuena has ganado 10 m0nedas ludopata");  
    }if(figura1!=figura2&&figura2!=figura3&&figura1!=figura3){
      System.out.println("Ahí tienes majarete, el juego no compensa");
      }if(figura1==figura2 && figura1!=figura3||figura1==figura3&&figura1!=figura2){
        System.out.println("Recuperastes tu monedita");
        }
	}
}

