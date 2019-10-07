/**
* 3. Lectura de datos desde teclado
*
* 4. Escribe un programa que sume, reste, multiplique y divida dos
* números introducidos por teclado.

*/
public class tema03Ejercicio04{
  public static void main(String[]args){
    System.out.println("introduce el primer numero = ");
    int x = Integer.parseInt(System.console().readLine());
    System.out.println("introduce el segundo numero = ");
    int y = Integer.parseInt(System.console().readLine());
    
    System.out.println("primer número =  " +x);
    System.out.println("segundo número =  " +y);
    System.out.println("suma del primero + el segundo = \n" + (x+y));
    System.out.println("resta del primero - el segundo =\n " + (x-y));
    System.out.println("multiplicación del primero * el segundo = \n" + (x*y));
    System.out.println("división del primero / el segundo = \n" + (x/y));
    }
  }
  
