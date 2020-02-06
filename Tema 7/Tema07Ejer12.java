/*12.
  Realiza un programa que pida 10 números por teclado y que los almacene en
  un array. A continuación se mostrará el contenido de ese array junto al índice
  (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
  “inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
  números están entre 0 y 9. El programa deberá colocar el número de la posición
  inicial en la posición final, rotando el resto de números para que no se pierda
  ninguno. Al final se debe mostrar el array resultante.
*/
public class Tema07Ejer12 {
	
	public static void main (String args[]) {
		
    int[]num=new int[10];
    int[]num2=new int[10];
    int inicial;
    int fin;
    int con=1;
 
    
    for(int i =0;i<10;i++){
       num[i]=Integer.parseInt(System.console().readLine());
       num2[i]=num[i];
    }
    for(int i=0;i<10;i++){
      System.out.printf("%4d  |",i);
    }
    System.out.println();
    for(int i=0;i<10;i++){
      System.out.printf("%4d  |",num[i]);
    }
    System.out.print("elige posicion inicial");
    inicial=Integer.parseInt(System.console().readLine());
    
       while(inicial>9||inicial<0){
           System.out.print("mal,repite");
           inicial=Integer.parseInt(System.console().readLine());
      }
    
    System.out.print("elige posición final");
    fin=Integer.parseInt(System.console().readLine());
  
         
    while(inicial>fin||fin>9||fin<0){
           System.out.print("mal,repite");
           fin=Integer.parseInt(System.console().readLine());
      }
      
    for(int j=0;j<4;j++){
      num[0]=num[9];
      for(int i=0;i<9;i++){
        
        num[i+1]=num2[i];
      }
    }

    for(int i=0;i<10;i++){
      System.out.printf("%4d  |",i);
    }
    System.out.println();
    for(int i=0;i<10;i++){
      System.out.printf("%4d  |",num[i]);
    }

      /* while(salir==false){
      if(inicio>fin){
         System.out.print("mal,repite");
         fin=Integer.parseInt(System.console().readLine());
      }else{
        salir=true;
      }
    
   
    }*/
    
    
    /*
    
    int[] num = new int[10];
    int[] aux = new int[2];
    int i;
    int auxI;
    int auxF;
    
    //Pedimos los valores que formaran el array
    System.out.println("Introduce 10 números por teclado: ");
    for (i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    // Imprime array inicial
    System.out.println("Array inicial: ");
    System.out.print("Indice: ");
   
    for (i = 0; i < 10; i++) {
      System.out.printf("%5d", i);
    }
    System.out.print("\nValor:  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("%5d", num[i]);
    }
  
    System.out.println();
    
    do {
      // Comprueba que se haya introducido correctamente la posicion inicial
      do{
	System.out.print("\nIntroduce la posición inicial (0-9): ");
	auxI = Integer.parseInt(System.console().readLine());
	
	if (auxI < 0 || auxI > 9) {
	  System.out.println("ERROR: posición inicial fuera del rango.");
	}
      } while ((auxI < 0)||(auxI > 9));
      
      // Comprueba que se haya introducido correctamente la posicion final
      do {
	System.out.print("Introduce la posición final (0-9): ");
	auxF = Integer.parseInt(System.console().readLine());
	
	if (auxF < 0 || auxF > 9) {
	  System.out.println("ERROR: posición final fuera del rango.");
	}
      } while ((auxF < 0)||(auxF > 9));
      
      // Manda mensaje de error si la posicion inicial es igual o mayor que la 
      // final
      if (auxI > auxF) {
	System.out.println("ERROR: la posición inicial introducida es mayor "
	  + "que la posición final. Vuelve a introducir los datos.");
      } else if (auxI == auxF) {
	System.out.println("ERROR: la posición inicial introducida es igual "
	  + "que la posición final. Vuelve a introducir los datos.");
      }
    } while ((auxI > auxF)||(auxI == auxF));
    
    // Intercambia la posición de los número indicados
    aux[0] = num[auxI];
    aux[1] = num[auxF];
    
    num[auxI] = aux[1];
    num[auxF] = aux[0];
    
    // Imprime array final
    System.out.println("\nArray final: ");
    System.out.print("Indice: ");
    for (i = 0; i < 10; i++) {
      System.out.printf("%5d", i);
    }
    System.out.print("\nValor:  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("%5d", num[i]);
    }*/
  } 
}
