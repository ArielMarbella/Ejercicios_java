/*
 * autor : Ariel Rojas
 * 
23. Escribe un programa que calcule el precio final de un producto según su
* base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
* reducido o superreducido) y el código promocional. Los tipos de IVA general,
* reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
* promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
* respectivamente que no se aplica promoción, el precio se reduce a la mitad,
* se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno
* si se muestran los valores correctos, aunque los números no estén tabulados.
*
* Ejemplo:
* Introduzca la base imponible: 25
* Introduzca el tipo de IVA (general, reducido o superreducido): reducido
* Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
* Base imponible 25.00
* IVA (10%) 2.50
* Precio con IVA 27.50
* Cód. promo. (mitad): -13.75
* TOTAL 13.75

 */


public class tema04Ejercicio23 {
	
	public static void main (String[] args){
    
   System.out.println("introduce el precio sin IVA ");
   double bImp = Double.parseDouble(System.console().readLine());
   System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido ");
   String IvaIntroducido = System.console().readLine();

   System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc ");
   String cod = System.console().readLine();
    
   //le damos valor a la variable iva aplicado y al precio sin descuento
   int iva = 0;
   switch  (IvaIntroducido){
     case "general":
       iva = 21;
       break;
     case "reducido":
       iva = 10;
       break;
     case "superreducido":
       iva = 4;
       break;
     default:
       System.out.println("el iva introducido no es correcto empieza de nuevo");
    }
    double IvaAplicado 
    = bImp * 0.05;
    double precioSinDescuento = bImp * iva;
    
    //sacamos los descuento
    double desc = 0;
    
    switch(cod){
      case "nopro":
        break;
      case "mitad":
        desc = precioSinDescuento / 2;
        break;
      case "menos5":
        desc = 5;
        break;
      case "5porc":
       desc = precioSinDescuento - (precioSinDescuento * 0.05);
        break;
      default:
       System.out.println("El código promocional introducido no es correcto.");
    }
    double total = precioSinDescuento - desc;
    
    System.out.printf(" Base imponible          %6.2f\n", bImp);
    System.out.printf("IVA (%2d%%)               %6.2f\n", iva, IvaAplicado);
    System.out.printf("Precio con IVA            %6.2f\n", precioSinDescuento);
    System.out.printf("Cod. promo. (%5s)         -%6.2f\n", cod, desc);
    System.out.printf("TOTAL                      %6.2f\n", total);    
    
		
	}
}

