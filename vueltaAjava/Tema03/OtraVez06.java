/**
* 3. Lectura de datos desde teclado
*
* 6. Escribe un programa que calcule el área de un triángulo.
*
* @author Luis José Sánchez
*/
public class OtraVez06{
    public static void main(String args []){
    
    double base = 1;
    double altura = 1;
    double area;
    
    System.out.println("cálculo del área de un triángulo");
    System.out.println("\nntroduce la base :\n ");
    base = Double.parseDouble(System.console().readLine());
    
    System.out.println("\nintroduce la altura :\n ");
    altura = Double.parseDouble(System.console().readLine());
    
    area = ((base * altura)/2);
    
    System.out.println("\nel área es : " + area+ "cms cúbicos");
  }
}
