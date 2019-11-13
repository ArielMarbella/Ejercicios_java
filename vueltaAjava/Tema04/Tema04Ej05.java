/*

 Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =0).
 */


public class Tema04Ej05 {
	
	public static void main (String args[]) {
		System.out.println("Este programa que resuelva una ecuación de primer grado del tipo ax+b =0"+"i\nntroduce el valor de a");
    double a = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce el valor de b");
    double b = Double.parseDouble(System.console().readLine());
     if(a==0){
       System.out.println("no solución");
     }else{
       System.out.println("el valor de x = " + (-b/a));
      }
	
}
}

