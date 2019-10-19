/**
Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
*/
public class tema04Ejercicio03{
  public static void main(String[] args){
    System.out.print("pon un numero del 1 al 7 y te dire que dia de la semana es\n");
    int numero = Integer.parseInt(System.console().readLine());
    String nombredia;
    switch(numero){
      case 1:
      nombredia= "lunes";
      break;
      case 2:
      nombredia = "martes";
      break;
      case 3 :
      nombredia = "miercoles";
      break;
      case 4 :
      nombredia = "jueves";
      break;
      case 5 :
      nombredia = "viernes";
      break;
      case 6 :
      nombredia = "sabaspo";
      break;
      case 7 :
      nombredia = "domingo";
      break;
      default:
      nombredia = "no existe ese numero de dia melón";
      break;
      }
      System.out.print("el número  " + numero + " corresponde al día: " + nombredia);
    }
}
