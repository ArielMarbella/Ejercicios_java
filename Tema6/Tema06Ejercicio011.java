/*
 ** 11. Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de\
la
* forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el númer\
o de
* suspensos, el número de suficientes, el número de bienes, etc.

 */


public class Tema06Ejercicio011 {
	
	public static void main (String args[]) {
    
    System.out.println("generando notas al azar\n");
    
    int nota;
    int suspenso=0;
    int suficiente=0;
    int bien=0;
    int notable=0;
    int sobresaliente=0;
		
    for(int i=0;i<20;i++){
      
      nota=(int)(Math.random()*5);
      
      switch(nota){
      case 0:
      System.out.print("suspenso");
      suspenso++;
      System.out.println();
      
      case 1:
      System.out.print("suficinete");
      suficiente++;
       System.out.println();
      
      case 2:
      System.out.print("bien");
      bien++;
       System.out.println();
      
      case 3:
      System.out.print("notable");
      notable++;
       System.out.println();
      
      case 4:
      System.out.print("sobresaliente");
      sobresaliente++;
       System.out.println();
      
      }
    
    }
     System.out.println(); System.out.println();
    System.out.println("nº de suspensos:\n"+ suspenso);
    System.out.println("nº de suficientes:\n"+ suficiente);
    System.out.println("nº de bienes:\n"+ bien);
    System.out.println("nº de notables:\n"+ notable);
    System.out.println("nº de sobresalientes:\n"+ sobresaliente);
	}
}

