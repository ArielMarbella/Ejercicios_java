public class tema04Ejercicio04{
  public static void main(String[] args){
  System.out.print("introduce las horas trabajados esta semana\n");
  int numero = Integer.parseInt(System.console().readLine());
  int dineroganado;
  if(numero <=40){
    dineroganado = 12 * numero;
    }else{
      dineroganado= (40*12) + ((numero-40) * 16);
      }
      System.out.print("El sueldo de esta semana es de:\n" + dineroganado + "euros");
    }
  
  }

