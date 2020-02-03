/*
 * 3. Escribe un programa que lea 10 números por teclado y que luego
* los muestre en orden inverso, es decir, el primero que se
* introduce es el último en mostrarse y viceversa.
 */


public class Tema07Ejer03 {
	
	public static void main (String args[]) {
    
    int[]num=new int[10];
    System.out.println("Escribe números y los pondre al revés\n"+"No olvides dar al enter cada vez");
		
    for(int i=0;i<10;i++){
      num[i]=Integer.parseInt(System.console().readLine());
    }
    System.out.println("Los números del revés son:");
    for(int i=9;i>=0;i--){
      System.out.print(" "+num[i]);
    }
    
    }
    /*int[]n=new int[10];
    int i=0;
    
    System.out.println("Escribe números y los pondre al revés\n"+"No olvides dar al enter cada vez");
    
    for(i=0;i<10;i++){
      n[i]=Integer.parseInt(System.console().readLine());
      }
      
      System.out.println("Los números del revés son:");
      for(i=9;i>=0;i--){
        System.out.print(" "+n[i]);}*/
        
	}


