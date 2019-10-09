public class tema04Ejercicio04AsignacionCondicional{
  public static void main(String[] args){
    int horas;
    int horasNormales;
    int horasExtra;
    float salario;
    
  System.out.println("introduce las horas trabajados esta semana\n");
  horas = Integer.parseInt(System.console().readLine());
  
  horasNormales = (horas<=0)? horas : 40;
  horasExtra = (horas<=40)? 0 : horas-40;
   
   salario = horasNormales*12+horasExtra*16;
   System.out.println("su salario es de "+ salario);
    }
  
  }
