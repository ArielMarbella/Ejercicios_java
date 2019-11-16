/*
19.Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 */


public class Tema04Ej19 {
	
	public static void main (String args[]) {
		
    System.out.println("Introduce un número y te deciomos cuantos dígitos tiene.puede ser positivo o negativo\n");
    int n = Integer.parseInt(System.console().readLine());
    int d = 0;
    
    if(n<0){
    System.out.println("el número es negativo y ");
  }
    else if (n>0) {
    System.out.println("el número es positivo y ");
    }
    if(n<10&&n>-10){
    System.out.println("el número tiene un dígito"); 
    d=1; 
    }
    else if(n>=10&&n<100){
     System.out.println("el número tiene dos dígitos"); 
     d=2;
    }
    else if(n>=100&&n<1000){
      System.out.println("el número tiene tres dígitos");
      d=3;
    }
    else if (n>1000&&n<10000){
      System.out.println("el número tiene cuatro dígitos");
      d=4;
    }
    else if(n>=10000){
      System.out.println("el número tiene cinco dígitos");
      d=5;
    }
    else if(n<10&&n>-10){
    System.out.println("el número tiene un dígito"); 
    d=1; 
    }
    else if(n<=-10&&n>-100){
     System.out.println("el número tiene dos dígitos"); 
     d=2;
    }
    else if(n<=-100&&n>-1000){
      System.out.println("el número tiene tres dígitos");
      d=3;
    }
    else if (n<=-1000&&n>-10000){
      System.out.println("el número tiene cuatro dígitos");
      d=4;
    }
    else if(n<=-10000){
      System.out.println("el número tiene cinco dígitos");
      d=5;
    }
    
    
    System.out.println("Repito, el número tiene exáctamente "  + d +" dígitos");
    
	}
}

