/*
 * 6. Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
* adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el
* programa dirá cuántas oportunidades quedan y si el número introducido es menor o
* mayor que el que ha pensado.

 */


public class Tema06Ejercicio06 {
	
	public static void main (String args[]) {
    
    int oportunidades= 5;
    int numeroIntroducido;
    boolean acertado = false;
    int numeroMisterioso=(int)(Math.random()*101);
    
    
  System.out.println("adivina un número, tienes 5 oportunidades");
    do{
      System.out.println("introduce un número:");
      numeroIntroducido=Integer.parseInt(System.console().readLine());
      oportunidades --;
      
      if(numeroIntroducido>numeroMisterioso && oportunidades>0){
        System.out.println("El número es menor que el que has introducido\n");
        System.out.println("te quedadn "+ oportunidades+" oportunidades");
        }
        
      if(numeroIntroducido<numeroMisterioso && oportunidades>0){
        System.out.println("El número es mayor que el que has introducido\n");
        System.out.println("te quedadan "+ oportunidades+" oportunidades");
        }
        
        if(numeroIntroducido==numeroMisterioso){
          acertado=true;
          System.out.println("Felicidades!!! has acertado!!!!!! bieeennn");
        }
    }while(!acertado&&oportunidades>0);
    if(!acertado){
      System.out.println("lo siento no has acertado, el número era:\n " + numeroMisterioso);
      }
	}
}

