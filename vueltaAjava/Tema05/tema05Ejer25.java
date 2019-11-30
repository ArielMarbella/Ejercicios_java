/*25. Realiza un programa que pida un número por teclado y que luego
* muestre ese número al revés.*/
public class tema05Ejer25{
  public static void main(String args[]){
    
    System.out.println("Itroduzca un número por teclado y lo pondremos al revés");
    int n = Integer.parseInt(System.console().readLine());
    int girado=0;
    
    while (n>0){
    girado=(girado*10)+(n%10);
    n=n/10;
    }
    System.out.println("el número " + n + "dado la vuelta es " + girado);
  }
}
 
