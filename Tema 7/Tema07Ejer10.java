/*
10
Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario.
 */


public class Tema07Ejer10 {
	
	public static void main (String args[]) {
    
    int[]n=new int[20];
    int[]par=new int[20];
    int[]impar=new int[20];
    int pares=0;
    int impares=0;
    

    for(int i=0;i<20;i++){
      n[i]=(int)(Math.random()*101);
      
      if(n[i]%2==0){
        par[pares]=n[i];
        pares++;
      }else{
        impar[impares++]=n[i];
        impares++;
       }
    }
    
    for(int i=0;i<20;i++){
        System.out.println(n[i]);
    }
    
    System.out.println();
    
    for(int i=0;i<pares;i++){
      n[i]=par[i];
    }
    
    for(int i=pares;i<20;i++){
      n[i]=impar[i-pares];
    }
    
    System.out.println("Array con los pares ordenados:");
    for(int i=0;i<20;i++){
      System.out.println(n[i]+"");
    
    
    
    
    
    /*int[]n=new int[20];
    int[]par=new int[20];
    int[]impar=new int[20];
    int pares=0;
    int impares=0;
    
    for(int i=0;i<20;i++){
      n[i]=(int)(Math.random()*101);
      
      if(n[i]%2==0){
        par[pares]=n[i];
        pares++;
      }else{
        impar[impares]=n[i];
        impares++;
       }
    }
    
    for(int i=0;i<20;i++){
      System.out.println(n[i]+"");
    }
    
    for(int i =0;i<pares;i++){
      n[i]=par[i];
    }
    
    for(int i=pares;i<20;i++){
      n[i]=impar[i-pares];
    }
    
    System.out.println("Array con los pares ordenados:");
    for(int i=0;i<20;i++){
      System.out.println(n[i]+"");
    }*/
  } 
}
}

