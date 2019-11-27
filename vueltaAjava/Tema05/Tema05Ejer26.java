/*
26.Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.

 */


public class Tema05Ejer26 {
	
	public static void main (String args[]) {
    
    System.out.print("Introduzca un número entero: ");
      int numeroIntroducido = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca un dígito: ");
      int digito = Integer.parseInt(System.console().readLine());
      
      // le da la vueta al número y calcula la longitud
      int numero = numeroIntroducido;
      int volteado = 0; 
      int posicion = 1;
     
      if (numero == 0) {
        System.out.println("el número 0 está obviamente en la posición 1");
  
      }
      
      while (numero >0||numero<0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
     
      } // while
      // comprueba la posición
      while (volteado >0||volteado<0 ){
      if ((volteado % 10) == digito) {
System.out.print("el número " + digito+ " está en la siguiente posición: " + posicion);      }
      volteado /= 10;
      posicion++;
      } // while

      }
      }

	
