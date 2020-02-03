/*
8.
Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.
 */


public class Tema07Ejer08 {
	
	public static void main (String args[]) {
    
    String[]mes={"Enero","Febrero","Marzo","Abril","mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		int[] temperatura=new int[12];
    int i,j;
    
    for(i=0;i<12;i++){
      System.out.println("Introduce la temperatura media del mes: "+mes[i]+":");
      temperatura[i]=Integer.parseInt(System.console().readLine());
    }
    
	}
}

