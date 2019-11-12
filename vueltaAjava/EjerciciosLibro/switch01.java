/*
A continuación tienes un ejemplo completo en Java. Se pide al usuario un número de
mes y el programa da el nombre del mes que corresponde a ese número.
 */
public class switch01 {
	
	public static void main (String args[]) {
		System.out.print("Por favor, introduzca un numero de mes: ");
    int mes = Integer.parseInt(System.console().readLine());
    
    String nombreMes;
    
    switch(mes){
      case 1:
      nombreMes = "enero";
      break;
      case 2:
      nombreMes = "febrero";
      break;
      case 3:
      nombreMes = "Marzo";
      break;
      case 4:
      nombreMes = "Abril";
      break;
      case 5:
      nombreMes = "Mayo";
      break;
      case 6:
      nombreMes = "Junio";
      break;
      case 7:
      nombreMes = "Julio";
      break;
      case 8:
      nombreMes = "Agosto";
      break;
      case 9:
      nombreMes = "Septiembre";
      break;
      case 10:
      nombreMes = "Octubre";
      break;
      case 11:
      nombreMes = "Noviembre";
      break;
      case 12:
      nombreMes = "Diciembre";
      break;
      default:
      nombreMes = "no existe ese mes";
      
      
      }
      
      System.out.println("Mes " + mes + ": " + nombreMes);

    
	}
}

