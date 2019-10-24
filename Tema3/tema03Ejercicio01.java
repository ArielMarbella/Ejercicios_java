/**
 * Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.
*/
public class tema03Ejercicio01{
  public static void main(String[] args){
    
    System.out.print("por favor introduce un número para que pueda multiplicarlo por otro\n");
    
    String metidaDedatos = System.console().readLine();
     int numero1=Integer.parseInt(metidaDedatos);
     
     System.out.print("por favor introduce un número para que pueda multiplicarlo por otro\n");
     int numero2=Integer.parseInt(System.console().readLine());
     int total =(numero1*numero2);
     System.out.print("El resultado de la multiplicación de los dos números introducidos es:\n " + total);
     
    }
}
