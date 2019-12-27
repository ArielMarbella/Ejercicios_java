/*
 19
Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados.
 */


public class Tema06Ejercicio019 {
	
	public static void main (String args[]) {
    
    int n=0;
    int maximoPar=-100;
    int minimoImpar=200;
    int suma=0;

    for(int i=0;i<50;i++){
      n=(int)(Math.random()*301)-100;
      
      System.out.print(n + " ");
      
      if(n%2==0){
        if(n>maximoPar){
        maximoPar=n;
        }
      if(n%2!=0){//es impar
        if(n<minimoImpar){
        minimoImpar=n;
        }
        }
      }
      suma=suma+n;
    }
    System.out.println();
    System.out.println("máximo par:\n"+ maximoPar);
    System.out.println("minimo Impar :\n"+ minimoImpar);
    System.out.println("media:\n"+ suma/50);
	}
}

