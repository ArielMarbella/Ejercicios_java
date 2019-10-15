/*
La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
máxima calidad y nos ha pedido hacer un configurador que calcule el precio
según el al  El precio base de una bandera es de un céntimo de
euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
son 3.25 €. El IVA ya está incluido en todas las tarifas.
 */
public class tema04Ejercicio25 {
	
	public static void main (String args[]) {
    
    double anchoBandera=0;
    double largoBandera=0;
    double precioBase=0;
    double precioTotal=0;
    double precioPorCm2=0.01;                 // Precio por cm2 es 1 cm de euro
    double areaBandera=0;
    String escudo="";
    
    System.out.println("introduce el ancho de la bandera");
    anchoBandera = Integer.parseInt(System.console().readLine());
    System.out.println("introduce el largo de la bandera");
    largoBandera = Integer.parseInt(System.console().readLine());
    System.out.println("¿Quieres con escudo? (si/no)");
    escudo = System.console().readLine();
       
    areaBandera = anchoBandera * largoBandera;
    precioBase = areaBandera*precioPorCm2;
    
     if(escudo.equals("si")){
       precioBase += 2.50;
     }
     
     precioTotal = precioBase + 3.25;
     
     System.out.println("Gracias . Aquí tiene el desglose de su compra");
     System.out.printf("Bandera de %5.2f cm2 : %5.2f €\n" , areaBandera, precioBase);
     System.out.printf("Gastos de envío: %5.2f €\n" , 3.25);
     System.out.printf("Total : %5.2f €\n" , precioTotal);
     
    
  }
}




