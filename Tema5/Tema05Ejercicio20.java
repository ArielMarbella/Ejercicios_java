/*
* 20. Igual que el ejercicio anterior pero esta vez se debe pintar una
* pirámide hueca.
 */


public class Tema05Ejercicio20 {
	
	public static void main (String args[]) {
  System.out.println("Este programa pinta pirámides");
  System.out.println("Indica el número de alturas que quieres");
  int alturaPiramide = Integer.parseInt(System.console().readLine());
  System.out.println("Indica que carácter quieres la pirámide");
  String caracterIntroducido = System.console().readLine();
  int espacio = alturaPiramide -1;
  int anchoCaracteres= 1;
  
     for(int i=0; i<espacio;i++){
         System.out.print(" ");
      }
       espacio--;
       anchoCaracteres+=2;
      System.out.println("*");
  
    for(int fila=2--;fila <alturaPiramide;fila++){
      for(int i=0; i<espacio;i++){
         System.out.print(" ");
      }
       espacio--;
       
      System.out.print("*");
      for(int i=0; i<(anchoCaracteres-2);i++){
        System.out.print(" ");
      }
            System.out.print(caracterIntroducido);

      System.out.println();
      anchoCaracteres+=2;
    }
    for(int i=0; i<(2*alturaPiramide);i++)
    System.out.print("*");
    
    
	}
}


