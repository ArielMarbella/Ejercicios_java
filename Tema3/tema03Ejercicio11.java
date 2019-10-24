/**
. Realiza un conversor de Kb a Mb
*/
public class tema03Ejercicio11{
  public static void main(String[]args){
  
  System.out.println("Introduce la cantidad de Kb que quieras convertir en Mb:\n");
  double kilobytes = Double.parseDouble(System.console().readLine());
    
    System.out.print(kilobytes + " kilobytes son " + (kilobytes/1024) + " Mbytes"); 
  
  }
}
