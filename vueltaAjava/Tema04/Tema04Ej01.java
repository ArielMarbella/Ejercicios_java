/*
 Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
 */


public class Tema04Ej01 {
	
	public static void main (String args[]) {
		
    System.out.println("día de la semana y asignatura a primera hora");
    String dia = System.console().readLine();
    
    switch(dia){
      case "lunes":
      case "martes":
      case "miercoles":
      System.out.println("programación");
      break;
      case "jueves":
      System.out.println("BBdd");
      break;
      case"viernes":
      System.out.println("otra");
      break;
      case "sabado":
      case "domingo":
      System.out.println("no hay clases ese día ribrunt");
      break;
      default:
      
      System.out.println("el día introducido n es correcto o está en mayúsculas o tiene acentos");
      
      
      
      
      }
	}
}

