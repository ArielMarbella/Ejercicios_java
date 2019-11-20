/*
21. Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y
* nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares.
* El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no
 se incluye en el cómputo.
 * 
 */


public class Tema05Ejer21Bis {
	
	public static void main (String args[]) {
		System.out.println("Introduce números , para finalizar un negativo,\n"+
    "daremos la media de los impares y el mayor de los pares\n");
    
    int n=0;
    int numTot=0;
    int numsImp=0;
    int mayorPar=0;
    double media=0;
    int contImp=0;
    while(n>=0){
      
      System.out.println("Empieza a introducir números");
      n=Integer.parseInt(System.console().readLine());
      
      if(n<0){
        System.out.println("\nEse número negativo ha sido el último en introducirse\n");
      }
      if (n%2==0 && n>mayorPar) {
        mayorPar=n;
        numTot++;
      }
      if(n!=0){
        numsImp=numsImp+n;
        numTot++;
        contImp++;
      }
    
    }
    media=numsImp/contImp;
    
    System.out.printf("Los números totales introducidos son: %5d\n",numTot);
    System.out.printf("La media de los impares es:           %5.2f\n",media);
    System.out.printf("El número mayor par es:               %5d\n",mayorPar);
   
	}
}

