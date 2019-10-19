/*
* 12. Escribe un programa que muestre los n primeros términos de la
* serie de Fibonacci. El primer término de la serie de Fibonacci
* es 0, el segundo es 1 y el resto se calcula sumando los dos
* anteriores, por lo que tendríamos que los términos son 0, 1, 1,
* 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe
* introducir por teclado.

 */


public class Tema05Ejercicio12 {
	
	public static void main (String args[]) {
    
    System.out.println("Introduce un numero y se te dará la secuencia fibonacci hasta el número que elijas");
    int n=Integer.parseInt(System.console().readLine());
    
    //declaro y doy valor a las variables
    int a=0;
    int b=1;
    int c;
    
    //imprimo los números iniciales de la serie, con sus espacios
    System.out.print(a + "\t" + b +"\t");
    
    //inicio el cucle
    for(int i =2; i<n;i++){
      
    //en una variable guardo la suma de los dos números    
      c = a+b;
      //la imprimo
    System.out.print(c +"\t");
    /*y ahora le digo que en la siguiente vuelta del bucle le digo que coja com ael segundo numero y
     * como b el resultado de la suma. al iterar el bucle el valor de la c habrá cambiado en el sentido que queremos*/
      a=b;
      b=c;
      
      
     
    }
  }
}
      
