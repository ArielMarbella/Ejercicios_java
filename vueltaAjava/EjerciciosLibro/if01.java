public class if01{
  public static void main(String args []){
    System.out.println("Escribe el nombre de una fruta");
    String miFruta = System.console().readLine();
    if("naranja".equals(miFruta)){
      System.out.print("iguales");
      }else{
      System.out.print("distintas");
        }
  }
}
