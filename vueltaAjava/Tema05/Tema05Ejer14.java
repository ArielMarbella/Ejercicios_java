/*

 * Copyright 2019 Linux User <tux@slitaz>
 * 14. Escribe un programa que pida una base y un exponente (entero positivo)
* y que calcule la potencia.
 */


public class Tema05Ejer14 {
	
	public static void main (String args[]) {
		
    System.out.println("Introduce dos números uno será la base y otro el exponente:");
    System.out.println("introduce la base:");
    int base = Integer.parseInt(System.console().readLine());
    
	  System.out.println("introduce la altura:");
    int exponente = Integer.parseInt(System.console().readLine());
    
    double potencia = 1;
    
    if(exponente==0){
      potencia= 1;
    }
    
    if(exponente>0){
      for(int i=0;i<exponente;i++){
        potencia=potencia*base;
      }
    }
    
    if(exponente<0){
      for(int i=0;i<-exponente;i++){
        potencia=potencia*base; 
      }
    potencia = 1/potencia;
    }
    
    System.out.println("la base es  " + base + "el exponente es: " + exponente + "y la potencia = " + potencia);
  } 
}

