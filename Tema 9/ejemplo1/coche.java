
package ejemplo1;

public class  coche{
	//una vez creada la clase coche vamos a crear las características comunes:
  int ruedas;//si quiero acceder de fuera de la clase (desde otro fichero) hau que poner public antes de int
  int largo;
  int ancho;
  int motor;//es entero porque voy a identificar cc.
  int peso;
  //estas cartacterísticas son comunes a todos los coches
  //siguiente paso, decir cuántas ruedas hay , características del motor
  //ancho largo ,peso. Se hace con un método constructor
  //Es un método especial que se encarga de darle un estado inicial a nuestro objeto
  //com se hace?:
  //Se pone public y se llama el metodo constructor igual que la clase
  public coche(){
    ruedas=4;
    largo=2000;
    ancho=300;
    motor=1600;
    peso=500;
    
  }
  
  public int getRuedas() {
      return this.ruedas;
  }
  public int getAncho(){
      return this.ancho;
  }

}

