import java.util.Scanner;
public class LeeDatosScanner01 {
public static void main(String[] args) {
Scanner a = new Scanner(System.in);
System.out.print("Introduce tu nombre: ");
String nombre = a.nextLine();
System.out.print("Introduce tu edad: ");
int edad = Integer.parseInt(a.nextLine());
System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
}
}
