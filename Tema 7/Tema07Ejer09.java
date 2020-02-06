/*
9
Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda.
 */


public class Tema07Ejer09 {
	
	public static void main (String args[]) {
    
    
    System.out.println("Introduce 8 números enteros y muéstralos con la palabra par o impar");
    int[]n=new int[8];
    for(int i=0;i<8;i++){
      n[i]=Integer.parseInt(System.console().readLine()); 
    }
    for(int i=0;i<8;i++){
      if(n[i]%2==0){
          System.out.print(n[i]+" par "+"|");
      }else{
        System.out.print(n[i] +" impar "+"|");
      }
    }
    
    
    
    
    
    
    
    
   /* System.out.println("introduce 8 números enteros y muestralos con la palabra par o impar");
    int[]n=new int[8];
    for(int i=0;i<8;i++){
       n[i]= Integer.parseInt(System.console().readLine());  
     }
     for(int i=0;i<8;i++){
       if(n[i] % 2==0){
        System.out.println("par"+n[i]); 
        }else{
          System.out.println("impar" + n[i]);
        }
     
      }	*/	
	}
}

