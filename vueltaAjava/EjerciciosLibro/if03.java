/*
 El usuario introduce una nota; si esta nota es mayor o igual a 5 se
le mostrará un mensaje diciendo que ha aprobado 
 */
public class if03 {
	
	public static void main (String args[]) {
    
    System.out.println("introduce tu nota");
		
    int nota = Integer.parseInt(System.console().readLine());
    
    if(nota>=5){
      System.out.print("Aprobado");
    }else{
      System.out.print("suspenso");
      }
	}
}

