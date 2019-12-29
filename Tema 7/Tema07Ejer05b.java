/*
5.Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.

 */


public class Tema07Ejer05b {
	
	public static void main (String args[]) {
		System.out.println("introduce 10 números por teclado y luego mostraremos los máximos y los mínimos");
    
    int[]num=new int[10];
    int maximo;
    int minimo;
    
    
         for(int i=0;i<10;i++){
       
       num[i]= Integer.parseInt(System.console().readLine());
        } 
        maximo=num[0];
        minimo=num[0];
     
     for(int i=0;i<10;i++){
       
       
       if(num[i]<minimo){
         minimo=num[i];
       }
       if(num[i]>maximo){
          maximo=num[i];
       }
       
     }
     System.out.println();
     System.out.print(minimo);
     System.out.print(" minimo  ");
    
     
     System.out.print(maximo);
      System.out.print(" maximo  ");

	}
}

