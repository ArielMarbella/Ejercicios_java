/*Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado.
*/

  public class OtraVez03{
  public static void main (String args[]){
  
  int pesetas;
  
  System.out.println("este programa cambia de pesetas a euros\n" + "introduce la cantidad de pesetas\n");
    pesetas = Integer.parseInt(System.console().readLine());
    double euros = (pesetas/166.6);
  
  System.out.println(pesetas + " pesetas son " + euros + " euros");
  }
}
