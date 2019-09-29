public class Eco{
  public static void main(String[] args){
   String captura;
   int dato;
   
   Sytem.out.print ("este programa repite l que escribes");
   captura = System.console().readLine();
   dato = Integer.parseInt(captura);
   System.out.print(captura);
   System.out.println(dato);
   dato++;
   System.out.println(dato);
}
}
