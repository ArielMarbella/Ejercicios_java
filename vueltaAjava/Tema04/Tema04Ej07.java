/*
* 7. Realiza un programa que calcule la media de tres notas.
 */


public class Tema04Ej07 {
	
	public static void main (String args[]) {
		
    System.out.print("introduce las notas" + "\nIntroduce la prrimera nota");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la segunda nota");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la tercera nota");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1+nota2+nota3)/3;
    
    System.out.printf("la nota es %50.2f\n", media);
    
     
	}
}

