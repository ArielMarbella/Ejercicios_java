/*
Realiza un programa que diga si un número entero positivo
* introducido por teclado es capicúa. Se permiten números de
* hasta 5 cifras.

 */


public class tema04Ejercicio20{
	
	public static void main (String args[]) {
		System.out.println("introduce un número entero y te diremos si es capicúa");
    int n;
    boolean capicua = false;
    
    n= Integer.parseInt(System.console().readLine());
    //número de una cifra
    if (n<10){
      capicua = true;
    }
    //número de dos cifras
    if (n>=10 && n<100){
       if((n/10) == (n%10)){
         capicua = true;
        }
    }
    //número de 3 cifras
    if ((n>=100) && (n<1000)){
      if ((n/100) == (n%10)) {
        capicua = true;
      }
    }
    //número de 4 cifras    
    if((n>=1000) && (n<10000)){
      if (((n/1000)==(n%10)) && (((n/100)%10) == ((n/10)%10))){
        capicua = true;
      }
    }
    //numero de 5 cifras
    if(n>=10000){
      if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
        capicua = true;
      }
    }
    if (capicua){
      System.out.println("el numero es capicua");
    }else{
      System.out.println("no lo es");
    }
    
    
    
	}
}

