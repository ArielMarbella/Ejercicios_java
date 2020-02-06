/*
8.
Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.
 */


public class Tema07Ejer08 {
	
	public static void main (String args[]) {
    
   /* string[]mes={"Ener";"feb";"mar";"abr";"may";"jun";"jul";"ago";"sep";"oct";"nov";"dic"};*/
    
    
    String[]mes={"Enero","Febrero","Marzo","Abril","mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		int[] temperatura=new int[12];
    int i,j;
    
    for(i=0;i<12;i++){
      System.out.println("Introduce la temperatura media del mes: "+mes[i]+":");
      temperatura[i]=Integer.parseInt(System.console().readLine());
    }
    for (i = 0; i < 12; i++) {
    System.out.printf("%9s"+"|",mes[i]);
      for (j = 0; j < temperatura[i]; j++) {
      System.out.print("*");
      }
      
    System.out.println(temperatura[i] + "ºC");
	  }
  }
}

