/*23
 Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 */


public class Tema06Ejercicio23 {
	
	public static void main (String args[]) {
    
    String figuras="";
    
    
    for(int i=0;i<5;i++){
    int tirada=(int)(Math.random()*6);
      
      switch(tirada){
        case 0:
        figuras="as";
        break;
        
        case 1:
        figuras="k";
        break;
        
        case 2:
        figuras="q";
        break;
        
        case 3:
        figuras="j";
        break;
        
        case 4:
        figuras="7";
        break;
        
        case 5:
        figuras="8";
        break;
        }
        
        System.out.print(figuras + " - ");
      }
		
	}
}

