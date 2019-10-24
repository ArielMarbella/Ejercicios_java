/*
* 21. Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativ\
o y
* nos diga cuantos números se han introducido, la media de los impares y el mayor de los p\
ares.
* El número negativo sólo se utiliza para indicar el final de la introducción de datos per\
o no
* se incluye en el cómputo.

 */


public class Tema05Ejercicio21 {
	
	public static void main (String args[]) {
    
    System.out.println("introduce numeros hasta que te digamos , cuando metas uno negativo pararemos y haremos la media de los impares y diremos el mayor de los pares");
    int num = 0;
    int contador = 0;
    int contadorImpares=0;
    int sumaImpares = 0;
    int mayorPar= 0;
    int mediaImpares =0;
    
    while(num>=0){
      num = Integer.parseInt(System.console().readLine());
      
       if (num<0){
         System.out.println("Salimos del bucle.");
       } 
       else if(num%2 ==0 && num>mayorPar){
         mayorPar=num;
         contador++;
         }else{
            sumaImpares= sumaImpares + num;
            contadorImpares++;
            contador++;
          }
    }
        mediaImpares= sumaImpares/contadorImpares;
        
    System.out.println("se han introducido " + contador + "numeros");
    System.out.println(" el mayor numero par es "  + mayorPar);
    System.out.println("la media de los impares es " + mediaImpares);
    }
    
		
	}


