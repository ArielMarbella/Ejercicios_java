/*Escribe un programa que muestre por pantalla un array de 10 números enteros
generados al azar entre 0 y 100. A continuación, el programa debe pedir un
número al usuario. Se debe comprobar que el número introducido por teclado
se encuentra dentro del array, en caso contrario se mostrará un mensaje por
pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
correctamente. A continuación, el programa rotará el array hacia la derecha
las veces que haga falta hasta que el número introducido quede situado en la
posición 0 del array. Por último, se mostrará el array rotado por pantalla.

 * 
 */


public class Tema07Ejer017 {
	
	public static void main (String args[]) {
  int numeroIntroducido;
  boolean existe=false;
  int[] numero= new int[10];
   /*int[] aux= new int[10];*/
   int aux;
   int posi=0;
  
  for(int i=0;i<10;i++){
    numero[i]= (int)(Math.random()*101);
    /*aux[i]=numero[i];*/
  }
  System.out.println("| indice");
  for (int i=0;i<10;i++){
    System.out.printf("|%4d",i);
  }
  System.out.println();
  System.out.println("│ Valor ");
  for (int i=0;i<10;i++){
    System.out.printf("|%4d",numero[i]);
	}
  System.out.println();
  numeroIntroducido=Integer.parseInt(System.console().readLine());
  
  while(existe==false){
    for(int i=0; i<(numero.length)&&(existe==false);i++){
      
      if(numeroIntroducido==numero[i]){
          existe=true;
          
      }
      posi=i;
    }
    
    if (existe==false){
      System.out.println("vuelve a introducir");
      numeroIntroducido=Integer.parseInt(System.console().readLine());
     
    } 
   
  }
   /*for(int i=0;i<numero.length-posi;i++){
     numero[0]=numero[9];
     numero[posi+i+1]=aux[posi+i];
     

    }*/
    while (numero[0] != numeroIntroducido) {
 aux = numero[9];
// Rotación a la derecha
for (int i = 10; i > 0; i--) {
numero[i] = numero[i -1];
}
numero[0] = aux;
}
    for (int i=0;i<10;i++){
    System.out.printf("|%4d",numero[i]);
	}
  }
}
