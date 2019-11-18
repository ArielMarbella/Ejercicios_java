/*Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.
 */
public class Tema05Ejer16{
  public static void main(String args []){
    System.out.println("escribe y averiguaremos si es primo o no");
    int n = Integer.parseInt(System.console().readLine());
    
    boolean esPrimo= true;
    
    for(int i=2;i<n;i++){
      if((n%i)==0){
        esPrimo= false;
      }
    }
    if(esPrimo){
      System.out.println("es priomo");
    } else{
      System.out.println("NO es priomo");
      }
    
  }
}
