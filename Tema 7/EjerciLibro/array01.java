/*
 Veamos con un ejemplo cómo se crea y se utiliza un array.
 */


public class array01 {
	
	public static void main (String args[]) {
		int n;//definimos un array como un entero.
	  n = new int[4]; //así es como se define que un array está compuesto por 4 caracteres
    n[0] = 26;
    n[1] = -30;
    n[2] = 0;
    n[3] = 100;
    
    System.out.print("los valores del array n son los siguientes:");
    System.out.print([0] + "," + n[1] + "," + n[2] + "," + n[3]);
    
    int suma= n[0] + n[3];
    System.out.println("\nEl primer elemento del array más el último suman" + suma);
  }
}

