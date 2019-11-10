/*
 * * 8. Escribe un programa que calcule el salario semanal de un empleado
* en base a las horas trabajadas, a razón de 12 euros la hora.
*/
public class OtraVez08{
  public static void main(String args[]){
    int horasTrabajadas = 0;
    System.out.println("Escribe las horas trabajadas");
    horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    System.out.println("tu salario es: " + (horasTrabajadas*12) + "");

  }
}
