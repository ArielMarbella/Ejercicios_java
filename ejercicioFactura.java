/**Realizar un programa en Java que solicite interactivamente el nombre, la cantidad y el precio de 4 productos, 
así como el tipo de IVA aplicado a cada uno de ellos.

Una vez recogidos los datos, el programa deberá realizar los cálculos necesarios para mostrar por pantalla un Ticket de la compra.

En dicho ticket se detallará el nombre de cada producto, la cantidad, el precio y el importe correspondiente al IVA de cada producto 
(un producto por línea). Después, se deberá indicar el importe total (sin IVA) y la cantidad correspondiente al IVA. 
Finalmente, deberá mostrarse el precio final con iva incluido.

El programa deberá presentar alineados a la izquierda los nombres de los productos, y alineados a la derecha (en columnas) 
las cantidades de producto, precios y cantidades asociadas al IVA. 
Los precios deberán mostrarse siempre con 2 decimales (céntimos de Euro).
*/
public class ejercicioFactura{
  public static void main(String[] args){
    
    System.out.println("Introduce el nombre del primer producto");
    String nombreProducto1 = System.console().readLine();
    System.out.println("Introduce el nombre del segundo producto");
    String nombreProducto2 = System.console().readLine();
    System.out.println("Introduce el nombre del tercer producto");
    String nombreProducto3 = System.console().readLine();
    System.out.println("Introduce el nombre del cuarto producto");
    String nombreProducto4 = System.console().readLine();
    
    System.out.println("introduce la cantidad de " + nombreProducto1);
    double cantidad1 = Integer.parseInt(System.console().readLine());
    System.out.println("introduce la cantidad de " + nombreProducto2);
    double cantidad2 = Integer.parseInt(System.console().readLine());
    System.out.println("introduce la cantidad de " + nombreProducto3);
    double cantidad3 = Integer.parseInt(System.console().readLine());
    System.out.println("introduce la cantidad de " + nombreProducto4);
    double cantidad4 = Integer.parseInt(System.console().readLine());
    
    
    
    System.out.println("introduce el precio del " + nombreProducto1);
    double precio1 = Integer.parseInt(System.console().readLine());
    System.out.println("introduce el precio del " + nombreProducto2);
    double precio2 = Integer.parseInt(System.console().readLine());
    System.out.println("introduce el precio del " + nombreProducto3);
    double precio3 = Integer.parseInt(System.console().readLine());
    System.out.println("introduce el precio del " + nombreProducto4);
    double precio4 = Integer.parseInt(System.console().readLine());
    
    double iva1 = (precio1*21)/100;
    double iva2 = (precio2*21)/100;
    double iva3 = (precio3*21)/100;
    double iva4 = (precio4*21)/100;
    
    System.out.println("Producto cantidad  precio  IVA ");
    System.out.println("-----------------------------------------------------------------");
    System.out.printf("%5s %5.2f %5.2f %5.2f\n ",nombreProducto1,cantidad1,precio1,iva1);
    System.out.printf("%5s %5.2f %5.2f %5.2f\n " ,nombreProducto2,cantidad2,precio2,iva2);
    System.out.printf("%5s %5.2f %5.2f %5.2f\n " ,nombreProducto3,cantidad3,precio3,iva3);
    C("%5s %5.2f %5.2f %5.2f \n" ,nombreProducto4,cantidad4,precio4,iva4);
    //Después, se deberá indicar el importe total (sin IVA) y la cantidad correspondiente al IVA. 
    //Finalmente, deberá mostrarse el precio final con iva incluido.
    System.out.println("imprte sin iva||IVA||precio total");
    System.out.printf("%5f %5f %5f %5f\n");
    
    
    
    
    
    
     
    
    }
}
