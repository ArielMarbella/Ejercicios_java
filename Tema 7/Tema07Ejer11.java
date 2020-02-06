/*Realiza un programa que pida 10 números por teclado y que los almacene en un array.
* A continuación se mostrará el contenido de ese array junto al índice (0 – 9).
* Seguidamente el programa pasará los primos a las primeras posiciones, desplazando
* el resto de números (los que no son primos) de tal forma que no se pierda ninguno.
* Al final se debe mostrar el array resultante.

 * 
 */


public class Tema07Ejer11 {
	
	public static void main (String args[]) {
    
    int[]num=new int[10];
    int[]primo=new int[10];
    int[]noPrimo=new int[10];
    boolean esprimo=true;
    int primos=0;
    int noprimos=0;
    System.out.println("introduce 10 números por teclado");
    
    for(int i =0;i<10;i++){
      
      num[i]=Integer.parseInt(System.console().readLine());
    }
    for(int i=0;i<10;i++){
      System.out.printf("%3d | ",i);
    }
    System.out.println();
    for(int i=0;i<10;i++){
      System.out.printf("%3d | ",num[i]);
    }

    for(int i=0;i<10;i++){
      esprimo=true;
      for(int j=2;j<num[i];j++){
        if(num[i]%j==0){
          esprimo=false;
          
        }
         
      }
     
      if(esprimo==true){
          primo[primos]=num[i];
          primos++;
      }else{
         noPrimo[noprimos]=num[i];
         noprimos++;
        }
    }
    
    System.out.println();
    for(int i=0;i<primos;i++){
      num[i]=primo[i];
    }
     for(int i=primos;i<primos+noprimos;i++){
      num[i]=noPrimo[i-primos];
    }
    
        
    for(int i=0;i<10;i++){
      System.out.printf("%3d | ",i);
    }
    System.out.println();
    for(int i=0;i<10;i++){
      System.out.printf("%3d | ",num[i]);
    }
    
	}
}

