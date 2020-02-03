import ejemplo1.coche;

public class uso_coche{
  public static void main(String[] args){
  
  //ahora creamos un objeto , ponemos el nombre de la clase y a continuacion
  //nobre que quieres que tenga el objeto
  coche Renault=new coche();//instanciar una clase. instanciamos la clase coche
  //imaginemos que queremos ver las ruedas:
  
  //System.out.println("Este coche tiene"+ Renault.ruedas + "ruedas.");
  System.out.println("Este coche tiene "+ Renault.getRuedas() + " ruedas.");
   System.out.println("Este coche tiene "+ Renault.getAncho() + " de ancho.");
  
  
  }
}
