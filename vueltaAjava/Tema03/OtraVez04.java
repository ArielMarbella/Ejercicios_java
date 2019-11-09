/**
* 3. Lectura de datos desde teclado
*
* 4. Escribe un programa que sume, reste, multiplique y divida dos
* números introducidos por teclado.
*
* @author Luis José Sánchez
*/
public class OtraVez04{
  public static void main (String args []){
    
    int numeroUno;
    int numeroDos;
    
    int suma= 0;
    int resta = 0;
    int multiplicacion = 1;
    int division = 1;

    System.out.println("vamos a sumar restar y dividir dos números introducidos por pantalla\n");
    System.out.println("introduce el primer número");
    numeroUno = Integer.parseInt(System.console().readLine());
    
    System.out.println("introduce el segundo  número");
    numeroDos = Integer.parseInt(System.console().readLine());
    
    suma = (numeroUno + numeroDos);
    resta = (numeroUno - numeroDos);
    multiplicacion = (numeroUno * numeroDos);
    division = (numeroUno / numeroDos);
    
    System.out.println("el resultado de la división es: " + division);
    System.out.println("el resultado de la suma es: " + suma);
    System.out.println("el resultado de la resta es: " + resta);
    System.out.println("el resultado de la multiplicación es: " + division);
    
    

    

  }
}
