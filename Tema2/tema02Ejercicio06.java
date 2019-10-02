/**
Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable.
*/

public class tema02Ejercicio06{
  public static void main(String[] args){
    
    double baseImponible = 182.35;
    
    System.out.printf("base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA            %8.2f\n", (baseImponible *0.21));
    System.out.print("-----------------------\n");
    System.out.printf("Total %8.2f\n", (baseImponible * 1.21));
    
    
    }
  
  
}
