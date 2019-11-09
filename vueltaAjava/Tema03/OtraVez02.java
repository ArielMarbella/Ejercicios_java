/*Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
*/
public class OtraVez02{
  public static void main(String args[]){
  System.out.print("este programa realiza un cambio de euros a pesetas" + "\nintroduce una cantidad en euros\n");
  
  double euros = Double.parseDouble(System.console().readLine());
  double conversor = (euros*166.6);
   
   System.out.println(euros + " euros son " + "\n"+conversor + " pesetas");
  }
}
