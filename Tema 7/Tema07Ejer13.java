/*
13
Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 
0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos.
 * 
 */


public class Tema07Ejer13 {
	
	public static void main (String args[]) {
    int[]n=new int[100];
    int max=0;
    int min=500;
    int sel=0;
    
		for(int i=0;i<100;i++){
      
    n[i]=(int)(Math.random()*501);
    System.out.print(n[i]+" ");
    
      if(n[i]<min){
          min=n[i];
      }
       if(n[i]>max){
          max=n[i];
      }
    }
    for (int i = 0; i < 100; i++) {
      System.out.print(n[i]+ " ");
    }
    System.out.println();
    System.out.println("\nSi quieres destacar el máximo introduce 1 - si queires destacar el mínimo, introduce 2 - para destacar el minimo");
    
    sel=Integer.parseInt(System.console().readLine());
    
    if(sel==1){
      System.out.println("**"+max+"**");
    }else{
      System.out.println("**"+min+"**");
     }
    
}
}
