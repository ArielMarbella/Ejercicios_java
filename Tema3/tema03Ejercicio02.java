/**
Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
convertir debe ser introducida por teclado.
*/
public class tema03Ejercicio02{
  public static void main(String[] args){
    
    System.out.print("oor favor introduce la cantidad de EUROS que quieras convertir\n");
    
    double euros = Double.parseDouble(System.console().readLine());
    int pesetas = (int) (euros*166.386);
  
    System.out.printf(euros + "euros son " + pesetas + " pesetas");
    }
  
}
