/**
* 3. Lectura de datos desde teclado
*
* 5. Escribe un programa que calcule el área de un rectángulo.
*
* @author Ariel Rojas
*/
public class tema03Ejercicio05{
  public static void main(String [] ags){
    System.out.print("cálculo del área de un rectángulo");
    System.out.print("por favor introduce la longitud de la base: ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la altura (cm): ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.print("el área de un rectángulo es :  " + (base*altura));
    
    
    }
}
