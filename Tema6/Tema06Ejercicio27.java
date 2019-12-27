/*
 27
Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
introduce una opción incorrecta, el programa deberá mostrar un mensaje de
error.

 */


public class Tema06Ejercicio27 {
	
	public static void main (String args[]) {
		System.out.println("el juego de piedra papel o tijera\nPulsa enter para empezar");
    
    String tirada=System.console().readLine();
    int tiradaOrdenador=(int)(Math.random()*3);
    int opcion = -1;
    boolean salir;
    
    do{
      System.out.println("Introduce piedra papel o tijera:");
      tirada=System.console().readLine();
      
       if(tirada.equals("piedra")||tirada.equals("tijera")||tirada.equals("papel")){
        salir=true;
      } else {
          salir=false;
          System.out.println("opción errónea, vuelve a introducir tu tirarada, recuerda: piedra,papel o tijera");
        }
      
    } while(salir=false);
    
    do{
    switch(tirada){
      case "piedra":
      opcion= 0;
      break;
      
      case "papel":
      opcion= 1;
      break;
      
      case "tijera":
      opcion= 2;
      break;
      default:
    }
    
    
    switch(tiradaOrdenador){
        case 0:
        System.out.print("tirada ordenador: piedra\n");
        
        break;
        
        case 1:
        System.out.print("tirada ordenador: papel\n");
        break;
        
        case 2:
        System.out.print("tirada ordenador: tijera");
        break;
        default:
    }
    }while(salir==true);
    
     
    
    //imprime quein es el ganador
    
    if(opcion==tiradaOrdenador){
      System.out.println("Aquí hay un empate");
    } else if(tiradaOrdenador==0&&opcion==1){
      System.out.println("Has ganado al ordenador!!");
      }
      else if(tiradaOrdenador==0&&opcion==2){
        System.out.println("Has perdido con el ordenador!!");
      }
      else if(tiradaOrdenador==1&&opcion==0){
        System.out.println("Has perdido con el ordenador!!"); 
      }
      else if(tiradaOrdenador==1&&opcion==2){
        System.out.println("Has ganado al ordenador!!");
      }
      else if(tiradaOrdenador==2&&opcion==0){
        System.out.println("Has ganado al ordenador!!");
      }
      else if(tiradaOrdenador==2&&opcion==1){
        System.out.println("Has perdido capuyo!!!!");
      }
    
  }
}

