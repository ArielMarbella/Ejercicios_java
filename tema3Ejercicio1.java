public class tema3Ejercicio1{
  public static void main (String[] args){
    
    float primerNumero;
    float segundoNumero;
    
    
    
    System.out.println("chavalot@, pon un número ahí");
  
    primerNumero = Integer.parseInt( System.console().readLine() );
    
 
    
    System.out.println("Pon otro ahí zu colega");
    
    segundoNumero = Integer.parseInt( System.console().readLine() );
    
    float total;
    
    total = (primerNumero * segundoNumero );
    System.out.print("la multiplicacion de los dos numweros es: " + total);

  }
}
