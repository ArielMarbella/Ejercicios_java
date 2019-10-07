/**
Escribe un programa que calcule el total de una factura a partir de la base
imponible
*/
public class tema03Ejercicio07{
  public static void main(String[] args){
    System.out.print("Introduce el dinero pagado sin IVA");
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.printf("Base impnible %8.2f/n", baseImponible);
    System.out.printf("Iva           %8,2f\n", (baseImponible*0.21));
    System.out.printf("----------------------\n");
    System.out.printf("Total           %8.2f\n\n",(baseImponible*1.21));  
    }
}
