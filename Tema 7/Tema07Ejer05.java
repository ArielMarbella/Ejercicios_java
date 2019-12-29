/*
5.Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.

 */


public class Tema07Ejer05 {
	
	public static void main (String args[]) {
		System.out.println("introduce 10 números por teclado y luego mostraremos los máximos y los mínimos");
    
    int [] num= new int[10];
    int min;
    int max;
    
    
    for(int i=0;i<10;i++){
      
      num[i]=Integer.parseInt(System.console().readLine());
      max=num[0];
      min=num[0];
      
      if(num[i]<min){
        min=num[i];
        System.out.print(min);
      }
      if(num[i]>max){
        max=num[i];
        System.out.print(max);
      }
    }
    
      
    
    
}
}
