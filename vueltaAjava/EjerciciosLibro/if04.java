/*
Vamos a ver cómo funcionan los operadores lógicos con un ejemplo. Mediante if ((n <
1) || (n > 100)) se pueden detectar los números que no están en el rango de 1 a 100;
literalmente sería “si n es menor que 1 o n es mayor que 100”.
 */
public class if04 {
	
	public static void main (String args[]) {
		
    System.out.println("Introduce un número entre 0 y 100\n" + "a ver si aciertas el número que estoy pensando");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    if(numero<1||numero>100){
      System.out.println("el número debe estar entre 0 y 100");
      System.out.println("Tienes otra oportunidad, introduce un número: ");
      numero = Integer.parseInt(System.console().readLine());
      
    }
    if(numero==24){
      System.out.println("Acertaste");
    }else{
      System.out.println("lo siento ");
      
      
	}
}

