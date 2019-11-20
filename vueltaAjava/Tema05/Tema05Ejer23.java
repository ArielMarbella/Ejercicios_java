/*
 23
Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media
 */


public class Tema05Ejer23 {
	
	public static void main (String args[]) {
		System.out.println("Este programa deja introducir números hasta que su suma sea 10000,mostrará el total acumulado, los números introduicidos y la media");
    
    int cont=0;
    int sumaNum=0;
    double media=0;
  
    while(sumaNum<10000){
      System.out.println("Introduce números");
      int num=Integer.parseInt(System.console().readLine());
      sumaNum= sumaNum+num;
      cont++;
    }
    media=sumaNum/cont;
    
    System.out.printf("Se han inroducido %5d números\n", cont);
    System.out.printf("La suma de todos ellos es %5d \n", sumaNum);
    System.out.printf("La media de todos ellos es %5f \n", media);
	} 
}

