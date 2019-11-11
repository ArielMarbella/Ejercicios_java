/*
 Crea la variable nombre y asígnale tu nombre completo. Muestra su
* valor por pantalla de tal forma que el resultado del programa sea
* el mismo que en el ejercicio 1 del capítulo 1.

 */


public class OtraVez02 {
	
	public static void main (String args[]) {
		
    String nombre = "Ariel";
    System.out.println(nombre);
    System.out.println("================================");
    /*
     * Crea las variables nombre, direccion y telefono y asígnale los
* valores correspondientes. Muestra los valores de esas variables
* por pantalla de tal forma que el resultado del programa sea el
* mismo que en el ejercicio 2 del capítulo 1.

*/
   
    String direccion = "Calle pepito nº13";
    String teleforno = "666666666";
    
    System.out.println(nombre);
    System.out.println(direccion);
    System.out.println(teleforno);
    
    System.out.println("================================");
    
    /* 4. Realiza un conversor de euros a pesetas. La cantidad en euros que
se quiere convertir deberá estar almacenada en una variable.
*/

    System.out.println("introduce la cantidad de euros a pasar a pesetas");
    
    double euros= Double.parseDouble(System.console().readLine());
    double pesetas= (euros*166.386);
    
    System.out.println(euros + "euros son " + pesetas + "pesetas");
    
    
    
    
	}
}

