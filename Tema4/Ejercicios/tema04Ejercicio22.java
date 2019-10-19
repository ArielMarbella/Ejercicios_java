/*
 22. Realiza un programa que, dado un día de la semana (de lunes a viernes) y
* una hora (horas y minutos), calcule cuántos minutos faltan para el fin de
* semana. Se considerará que el fin de semana comienza el viernes a las 15:00h.
* Se da por hecho que el usuario introducirá un día y hora correctos,
* anterior al viernes a las 15:00h.

 */


public class tema04Ejercicio22 {
	
	public static void main (String[] args){
  System.out.println("Introduce un día de la semana y te averiguaremos cuantos minutos faltan para el finde");
  String diaQueEs = System.console().readLine();
  int diasQueLlevamos = 0;
  switch(diaQueEs){
    case "lunes":
      diasQueLlevamos = 0;
      break;
    case "martes":
      diasQueLlevamos = 1;
      break;
    case "miercoles":
      diasQueLlevamos= 2;
      break;
    case "jueves":
      diasQueLlevamos = 3;
      break;
    case "viermes" :
      diasQueLlevamos = 4;
      break;
    default:
    System.out.print("introduce los días de la semana  todo en minúsculas y sin acentos, de lunes a viernes");
    break;
  }
  System.out.println("itroduce la hora que es (solo la hora sin los minutos , enformato 24 horas)");
  int hora = Integer.parseInt(System.console().readLine());
  System.out.print("Ahora introduce los minutos");
  int minuto = Integer.parseInt(System.console().readLine());
  
  int minutosdeunasemana = 6600;
  int minutosquellevamos = (diasQueLlevamos * 24 * 60) + ((hora * 60) + minuto);
  int minutosquefaltan = (minutosdeunasemana - minutosquellevamos);
  
  System.out.println("faltan " + minutosquefaltan + " minutos para la llegada del finde");
  }
  
}
