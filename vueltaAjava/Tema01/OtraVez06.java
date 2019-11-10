/*
6. Escribe un programa que pinte por pantalla una pirámide rellena a
* base de asteriscos. La base de la pirámide debe estar formada por
* 9 asteriscos.
 */


public class OtraVez06 {
	
	public static void main (String args[]) {
		System.out.println("       *");
    System.out.println("      ***");
    System.out.println("     *****");
    System.out.println("    *******");
    System.out.println("   *********");
    System.out.println("==============================================");
    
    System.out.printf("%10s\n","*");
    System.out.printf("%11s\n","***");
    System.out.printf("%12s\n","*****");
    System.out.printf("%13s\n","*******");
    System.out.printf("%14s\n","*********");
    System.out.println("==============================================");
    
    
   /* 7. Igual que el programa anterior, pero esta vez la pirámide estará
* hueca (se debe ver únicamente el contorno hecho con asteriscos).
    */
    
    System.out.println("       *");
    System.out.println("      * *");
    System.out.println("     *   *");
    System.out.println("    *     *");
    System.out.println("   *********");
    
    
    System.out.printf("%8s %9s\n"," ","*");
    System.out.printf("%7s %8s %1s %1s\n","       ","*"," ","*");
    System.out.printf("%6s %7s %2s %4s\n","      ","*"," ","*");
    System.out.printf("%23s\n","**********");

 
    
    
	}
}

