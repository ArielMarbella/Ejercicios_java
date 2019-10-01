/**
Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
*/
public class tema04Ejercicio01{
  public static void main(String[] args){
    
      System.out.println("pon un dia de la semana y te diré qiue clase tienes a primera hora \n");
      String diaSemana = System.console().readLine();
      diaSemana.toLowerCase();
      
      switch(diaSemana){
        case "lunes":
        System.out.println("EED");
        break;
        case "martes":
        
        case "miércoles":
      
        case "jueves":
          System.out.println("Programación");
        break;
          
        case "viernes":
          System.out.println("FOL");
        break;
        case "sabado":
        case "domingo":
        System.out.println("¡Ese día no hay clase!");
        break;
        default: 
        System.out.println("Ese día introducido 0 no es un día o te falta un acento por favor escribe el dato correcto");     
        }
    }   
}
