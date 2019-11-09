/*
 * 7. Escribe un programa que calcule el total de una factura a partir
* de la base imponible
*/
public class OtraVez07{
  public static void main(String args[]){
    System.out.println("introduce la base imponible\n");
    
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.println("\nel total de la factura  es:\n");
    System.out.printf("base imponible %13.2f\n",baseImponible);
    System.out.printf("IVA  %23.2f\n",(baseImponible*0.21));
    System.out.println("-------------------------------------");

    System.out.printf("Total %23.2f\n",baseImponible*1,21);


    
    
  
  }
}
