/*
Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.

 */


public class Tema05Ejer20 {
	
	public static void main (String args[]) {
    System.out.println("ahora pinntamos pirámides huecas");
		System.out.println("Introduce la altura");
    int h= Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el carácter\n");
    String car= System.console().readLine();
    
    int espExt= h;
    int espInt=0;
    
    for(int j=0;j<h;j++){
      for(int i=0;i<espExt;i++){
        System.out.print(" ");
      }
      System.out.print(car);
      for(int i=1;i<espInt;i++){
        System.out.print(" ");
      }
      if(j>0){
       System.out.print(car);
      }
     
      espExt--;
      espInt=espInt+2;
      System.out.println();
    }
  for(int i=0;i<=h*2;i++){
    System.out.print(car);
  }
	}
}

