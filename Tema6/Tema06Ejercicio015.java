/*
 Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual
a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
con dos barras.
d) La última nota de la melodía debe coincidir con la primera.
Ejemplo 1:
do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
Ejemplo 2:
la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
 */


public class Tema06Ejercicio015 {
	
	public static void main (String args[]) {
		
    System.out.println("realiza un generador de melodía: ");
    
    int generaNotas=0;
    int melodia=(int)(Math.random()*7);
    int compas=0;
    String notas="";
    
   
    
    for(int i=1;i<=melodia;i++){
      for(compas=0;compas<4;compas++){
         generaNotas=(int)(Math.random()*7);
        switch (generaNotas){
           
          case 0:
          notas="do";
          break;
          
           case 1:
          notas="re";
          break;
          
           case 2:
          notas="mi";
          break;
          
           case 3:
          notas="fa";
          break;
          
           case 4:
          notas="sol";
          break;
          
           case 5:
          notas="la";
          break;
          
           case 6:
          notas="si";
          break;
          default:
     
        }   
         System.out.print(notas + " ");   
      }
      if(i!= melodia){
        System.out.print("|");
        }else{
          System.out.print("||");
          }
    }
   
	}
}


