/*
26
Realiza un programa que calcule el precio de unas entradas de cine en función
del número de personas y del día de la semana. El precio base de una entrada
son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
1 individual que son 41 euros (33 + 8).
 
 */


public class Tema04Ejer26 {
	
	public static void main (String args[]) {
    
    System.out.println("Venta de entradas cines Campa , los mejores");
    System.out.println("Introduczca el número de entradas");
    
    int entradas = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca el día de la semana");
    String dia= System.console().readLine();
    
    System.out.println("¿Tiene carnet de socio? si/no");
    boolean carnet= System.console().readLine().toLowerCase().equals("si");
    
    int entradasIndividuales = entradas;
    double precioEntradaIndividual = 8;
    int entradasPareja = 0;
    double total=0;
    double descuento=0;
    double aPagar=0;
    
    switch(dia){
      case "miercoles":
      precioEntradaIndividual = 5;
      case "jueves":
      entradasPareja= entradas / 2;
      entradasIndividuales= entradas % 2;
      default:
      }
    total= precioEntradaIndividual*entradasIndividuales;
    total = (total+11)*entradasPareja;
     if (carnet){
        descuento= total*0.1;
     } 
     aPagar = total-descuento;
     
     System.out.println("Aquí tiene sus entradas: ");
     
     if(entradasPareja>0){
        System.out.printf("Entradas de pareja:            %10d\n ",entradasPareja);
        System.out.printf("Precio entradas de pareja      %10.2f\n ",11.0);
      }
      if(entradasIndividuales>0){
         System.out.printf("Entradas individuales         %10d\n", entradasIndividuales);
         System.out.printf("Precio por entrada individual %10.2f €\n", precioEntradaIndividual); 
      }
      
      System.out.printf("Total                            %10.2f €\n", total);
      System.out.printf("Descuento                        %10.2f €\n", descuento);
      System.out.printf("A pagar                          %10.2f €\n", aPagar);
	}
}

