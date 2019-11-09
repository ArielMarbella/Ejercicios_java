/*
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
* */
  public class OtraVez01{
  public static void main(String args[]){
    
    int mult;
    System.out.println("introduce un número");
    int primerNumero=Integer.parseInt(System.console().readLine());
    
    System.out.println("introduce segundo numero");
    int segundoNumero=Integer.parseInt(System.console().readLine());
    
    mult= primerNumero * segundoNumero;
    
    System.out.print("primer número * segundo número = " + mult);

  }
}
