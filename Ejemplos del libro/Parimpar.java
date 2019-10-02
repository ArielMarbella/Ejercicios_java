public class Parimpar{
  public static void main (String[] args){
   int resto;
   int valorRecogido;
   
   System.out.print ("introduce");
   valorRecogido = Integer.parseInt(System.console().readLine());
   
   resto = valorRecogido %2 ;
   
   if (resto==0){
     System.out.println("El numero introducido es par");
     }
   }
 }
   
  
  
