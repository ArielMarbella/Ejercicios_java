/*

 */


public class Ejlibro1 {
	
	public static void main (String args[]) {
    
    int[]n;//definimos n como un array de enteros
    n = new int[4];
    n[0]=26;
    n[1]=-30;
    n[2]=0;
    n[3]=100;
    System.out.print("Los valores del array n son los siguientes: ");
    System.out.print(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);
    
    int suma=n[0]+n[3];
    System.out.println("\nEl primer elemento del array más el último suman " + suma);

		
	}
}

