public class ejerLib7{
public static void main(String[] args){
    
  System.out.println("genera día aleatorio");
  
  int diaAleatorio = (int)(Math.random()*6); //para genera un numero entre o y 6 ambos incl.
 
   switch (diaAleatorio){
     case 0:
     System.out.print("Lunes");
     break;
     case 1:
     System.out.print("Martes");
     break;
     case 2:
     System.out.print("Miercoles");
     break;
     case 3:
     System.out.print("Jueves");
     break;
     case 4:
     System.out.print("Viernes");
     break;
     case 5:
     System.out.print("Sábado");
     break;
     case 6:
     System.out.print("Domingo");
     break;
     default:
     }
  }
}
