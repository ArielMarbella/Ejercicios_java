/*
 Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
 */


public class Tema04Ej03 {
	
	public static void main (String args[]) {
    
    System.out.println("escribe un número y te dire el día de la semna");
    
    int dia= Integer.parseInt(System.console().readLine());
    String diadelasemana;
    
    switch(dia){
      case 1 :
      diadelasemana = "lunes";
      break;
      case 2 :
      diadelasemana = "martes";
      break;
      case 3 :
      diadelasemana = "miercoles";
      break;
      case 4 :
      diadelasemana = "jueves";
      break;
      case 5 :
      diadelasemana = "viernes";
      break;
      case 6 :
      diadelasemana = "sabado";
      break;
      case 7 :
      diadelasemana = "domingo";
      break;
      default:
      System.out.println("numero enre 1 y 7"); 
      }
		System.out.println(dia);
	}
}

