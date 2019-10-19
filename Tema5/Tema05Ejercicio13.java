/*
*
* 13. Escribe un programa que lea una lista de diez números y determine
* cuántos son positivos, y cuántos son negativos.

 */


public class Tema05Ejercicio13 {
	
	public static void main (String args[]) {
    System.out.println("escribe diez números y te diremos cuales son positivos o negativos");
    
		int negativos = 0;
    int positivos = 0;
     
     for(int i= 0;i<10;i++){
       
       if (Integer.parseInt(System.console().readLine())>0){
         positivos++;
       }else{
         negativos++;
         
         }
    }
    
    System.out.print("Ha introducido " + positivos + "positivos y " + negativos + "negativos");
    
	}
}

