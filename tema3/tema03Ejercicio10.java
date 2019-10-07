/**
. Realiza un conversor de Mb a Kb
*/
public class tema03Ejercicio10{
  public static void main(String[]args){
  
  System.out.println("Introduce la cantidad de megas que quieras convertir:\n");
  int megas = Integer.parseInt(System.console().readLine());
    
    System.out.print(megas + "megas son " + (megas*1024) + " kilobytes"); 
  
  }
}
