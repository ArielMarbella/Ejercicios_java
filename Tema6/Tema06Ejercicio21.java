/*
 21
Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
posiciones posibles son cara y cruz.
 */


public class Tema06Ejercicio21 {
	
	public static void main (String args[]) {
    
  int moneda;
  int lado;
    
  for(int i=0;i<5;i++){
    
    moneda= (int)(Math.random()*8);
    lado=(int)(Math.random()*2);
    
      switch(moneda){
        case 0:
        System.out.println("1 centimo");
        break;
         case 1:
        System.out.println("2 centimo");
        break;
        case 2:
        System.out.println("5 centimo");
        break;
         case 3:
        System.out.println("10 centimo");
        break;
        case 4:
        System.out.println("50 centimo");
        break;
        case 5:
        System.out.println("1 euro");
        break;
        case 6:
        System.out.println("2 eutro");
        break;
        case 7:
        System.out.println("20 centimo");
        break;
        default:
        }  
        
        switch(lado){
          case 0:
          System.out.println("cara");
          break;
          
          case 1:
          System.out.println("cruz");
          break;
          default:
          }
          System.out.println();
  }  
  
  
  }
} 
	
