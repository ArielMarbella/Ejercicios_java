/*
25.
La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
máxima calidad y nos ha pedido hacer un configurador que calcule el precio
según el alto y el ancho. El precio base de una bandera es de un céntimo de
euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
son 3.25 €. El IVA ya está incluido en todas las tarifas.
*/
public class Tema04Ejer25{
  public static void main(String args[]){
    System.out.println("Gracias por comprar tu magnífica bandera de España.\n" + "Te vamos a pedir los datos para que puedas comprar tu flamante bandera de España\n" + "para que seas un patriota como Dios manda");
    System.out.println("Introduce el largo en cms de tu magnífica bandera española\n");
    double largo= Double.parseDouble(System.console().readLine());
    System.out.println("Introduce el ancho en cms de tu españolísima bandera\n");
    double ancho= Double.parseDouble(System.console().readLine());
    
    double cmCuadrado= (ancho*largo);
    double precioEscudo = 0;
    double precioSines= 0;
    double precio = (0.01 * cmCuadrado);
    double gastosEnvio= 3.50;
    double precioBandera = (((precio + precioEscudo) + gastosEnvio));
    double precioCentimetro = 0.01;
    
    
    
    System.out.println("Quieres tu superbandera española con escudo? si/no\n");
    String escudo=System.console().readLine();
    
    if (escudo.equals("si")){
    precioEscudo= 2.50;
    }
    if (escudo.equals("no")){
    precioEscudo=0;
    }
    System.out.println("\nGracias por comprar tu españolísima bandera\n");
    System.out.println("-----------------------------------------------------------------------");
    System.out.printf("El ancho de tu bandera es                         %12.2f"+" cms\n",ancho);
    System.out.printf("El largo de tu bandera es                         %12.2f"+" cms\n",largo);
    System.out.printf("los centímetros cuadrados de tu bandera son:      %10.2f"+" cms^2\n",cmCuadrado);
    System.out.printf("El precio del centímetro cuadrado es:             %10.2f"+" euros\n",precioCentimetro);
    System.out.printf("El precio de tu escudo es:                        %10.2f"+" euros\n",precioEscudo);
    System.out.printf("El gasto de envío es:                             %10.2f"+" euros\n",gastosEnvio);
    System.out.println("-----------------------------------------------------------------------");
    System.out.println(" ");
    System.out.printf("El precio de tu flamante bandera es:              %10.2f"+" euros\n",precioBandera);
    
    
    
    
    
    
    
    
  
  }
}
