/**
. Escribe un programa que calcule el salario semanal de un empleado
* en base a las horas trabajadas, a razón de 12 euros la hora.
*/
public class tema03Ejercicio08{
  public static void main(String[] args){
    System.out.println("Escribe el númeto de horas que has trabajado:\n ");
    int horas=  Integer.parseInt(System.console().readLine());
    
    System.out.print("Tu salario semanal es de : " +  (horas * 12) + "eurazos");
    }
}
