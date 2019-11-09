/**
 * piedra papel o tijera
 * */

public class ejerLib5{
  
  public static void main(String[] args){
    
  System.out.println("genera piedra papelo tijera");
  
  int tirada = (int)(Math.random()*3); //para genera un numero entre o y 2 ambos incl.
 
   switch (tirada){
     case 0:
     System.out.print("piedra");
     break;
     case 1:
     System.out.print("papel");
     break;
     case 2:
     System.out.print("tijera");
     break;
     default:
     
     }
  }
}
