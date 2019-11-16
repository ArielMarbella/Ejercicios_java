/*
7. Realiza el control de acceso a una caja fuerte. La combinación
* será un número de 4 cifras. El programa nos pedirá la combinación
* para abrirla. Si no acertamos, se nos mostrará el mensaje
* “Lo siento, esa no es la combinación” y si acertamos se nos dirá
* “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
* oportunidades para abrir la caja fuerte.
 */


public class Tema05Ejer07 {
	
	public static void main (String args[]) {
		
    System.out.println("escribe la combinación de la caja fuerte\n" + "Tienes 4 oportunidades");
    
    int i = 0;
    int intento = 0;
    boolean correct = false;
    
    for (i = 0; i<4;i++){
      
      System.out.println("introdce la combinación de la caja fuerte");
      intento= Integer.parseInt(System.console().readLine());
    
      if(intento==1520){
        correct = true;
        break;
      } else{
        System.out.println("combinación incorrecta");
        }
    }
    if (correct){
      System.out.println("la caja se ha abierto correctamente");
    } else{
      System.out.println("Has agotado los intentos.Gualtraps");
      }
	}
}

