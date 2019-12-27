/*
Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.
 * 
 */


public class Tema06Ejercicio05 {
	
	public static void main (String args[]) {
		
    System.out.println("50 números enteros entre 100 y 199");
    
    int max=100;
    int min=199;
    int suma=0;
    int n=0;
    
    
    System.out.println("Los números son:\n ");
    for(int i=0;i<50;i++){
      
      n=((int)(Math.random()*100)+100);
 System.out.println(n+"");
      suma = suma + n;
      
      if(n<min){
        min=n;
        }
      
      if(n>max){
        max=n; 
        }
      }
     
      int media=suma/50;
      System.out.println("el número mínimo es : "+min+"el máximo es: "+max+"La suma es: "+suma+"La media es: "+media);
	}
}

