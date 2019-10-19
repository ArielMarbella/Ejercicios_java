/**
Realiza un programa que calcule la media de tres notas
*/
public class tema04Ejercicio07{
  public static void main(String[] args){
    System.out.print("introduce primer numero ");
    double x = Integer.parseInt(System.console().readLine());
    System.out.print("introduce primer numero ");
    double y = Integer.parseInt(System.console().readLine());
    System.out.print("introduce primer numero ");
    double z = Integer.parseInt(System.console().readLine());
    
    Double media = (x + y + z)/3;
    System.out.printf("la media es %.2f\n",media);
    
    
    
    
    }
}
