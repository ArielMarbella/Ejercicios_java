/**
* 4. Sentencia Condicional
*
* 8. Amplía el programa anterior para que diga la nota del boletín
* (insuficiente, suficiente, bien, notable o sobresaliente)*/
public class tema04Ejercicio08{
  public static void main(String[] args){
    System.out.print("introduce primer numero ");
    double x = Double.parseDouble(System.console().readLine());
    System.out.print("introduce primer numero ");
    double y = Double.parseDouble(System.console().readLine());
    System.out.print("introduce primer numero ");
    double z = Double.parseDouble(System.console().readLine());
    
    Double media = (x + y + z)/3;
    System.out.printf("la media es %.2f\n",media);
    
    if(media<5){
      System.out.print("insuficiente");
      }else{
      if(media>=5){
      System.out.print("suficiente");
      }else
      if(media>=6){
      System.out.print("Bien");
      }else
      if(media>=7){
      System.out.print("Notable");
      }else
      if(media>=8){
      System.out.print("Sobresaliente");
      }
    
  } }}}}
}
