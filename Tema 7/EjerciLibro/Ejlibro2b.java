/*
En el siguiente ejemplo se muestra un array de números de tipo double que almacena
notas de alumnos.
 */


public class Ejlibro2b {
	
	public static void main (String args[]) {
		
    double[] nota=new double[4];
    double suma=0;
    
    System.out.println("introduce las notas:\n");
    
    for(int i=0;i<4;i++){
      System.out.println("Introduce la nota del exámen número "+(i+1)+" y pulsa enter"+" :\n");
      nota[i]= Double.parseDouble(System.console().readLine());
      if(i==2){
        
        System.out.println("INTRODUCE ESTA ÚLTIMA NOTA, DALE AL ENTER Y TE DAREMOS LA MEDIA");
      
      }
    }
    System.out.println("tus notas son: ");
    
    for(int i=0;i<4;i++){
      System.out.print(nota[i] +" ");
      suma= suma+nota[i];
    }
    
    System.out.println ("tu media es:  " + (suma/4));
	}
}

