


public class ejerLib6 {
	
	public static void main (String args[]) {
    
    System.out.println("generación de piedra papel o tijera");
    
    int mano=(int)(Math.random()*3);
    
    switch(mano){
      case 0:
      System.out.println("piedra");
      break;
      case 1:
      System.out.println("papel");
      break;
      case 2:
      System.out.println("tijera");
      break;
      default:
      
      }
	}
}

