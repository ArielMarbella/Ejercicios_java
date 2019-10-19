/**
* 3. Lectura de datos desde teclado
*
* 3. Realiza un conversor de pesetas a euros. La cantidad de pesetas
* que se quiere convertir debe ser introducida por teclado.
*/
public class tema03Ejercicio03{
  public static void main(String[] arg){
    
    System.out.print("introduce la cantidad de PESETAS que quieres convertir");
    int pesetas = Integer.parseInt(System.console().readLine());
    double euros = pesetas/166.386;
    
    System.out.printf("%d pesetas son %f euros",pesetas,euros);
    
    }
}
