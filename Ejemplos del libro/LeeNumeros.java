public class LeeNumeros {
public static void main(String[] args) {
  
  String linea;
   
   
  System.out.print("introduce in numero \n ");
  linea= System.console().readLine();
  int primerNumero;
  primerNumero= Integer.parseInt(linea);
  
  System.out.print("otro \n");
  linea=System.console().readLine();
  int segundoNumero;
  segundoNumero= Integer.parseInt(linea);
  
  int total;
  total= (2*  primerNumero ) + segundoNumero;
  int totalDivision;
  totalDivision= (primerNumero/segundoNumero);
  
  System.out.println("el primer numero imtroducido es \n" + primerNumero );
  System.out.println("el segundo es: \n"+segundoNumero);
  System.out.println("la división del primero entre el segundo es " + totalDivision);
  
  }
}
