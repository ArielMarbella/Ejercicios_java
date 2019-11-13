/*
* 6. Realiza un programa que calcule el tiempo que tardará en caer un
* objeto desde una altura h.
* t = raiz(2h/g) siendo g = 9.81 m/s2
 */


public class Tema04Ej06 {
	
	public static void main (String args[]) {
		
    System.out.println("el tiempo qu tardará en caer un objeto" + "\nIntroduce la altura del objeto");
    
    double h = Double.parseDouble(System.console().readLine());
    
    double t = Math.sqrt((2*h)/9.81);
    
     System.out.printf("tarda en caer %10.2f",t);
     
	}
}

