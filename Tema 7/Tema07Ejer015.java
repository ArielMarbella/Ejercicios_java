/*
15
Un restaurante nos ha encargado una aplicación para colocar a los clientes en
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
como máximo e intente de nuevo”. Para el grupo que llega, se busca
siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
programa se ilustra a continuación:

 * 
 */


public class Tema07Ejer015 {
	
	public static void main (String args[]) {
    
  int[]ocupacion=new int[10];
  int numClientes;
  int i;
  int numMesa=0;
  boolean mesaLibre;
  
  //vamos a generar mesas con ocupación aleatorias
  for(i=0;i<10;i++){
    ocupacion[i]=(int)(Math.random()*5);
    
  }
  
  for(i=0;i<78;i++){
    System.out.print("-");
  }
  System.out.print("\n|mesa        |");
  for(i=1;i<11;i++){
    System.out.printf("%4d|",i);
  }
  System.out.println();
  
  for(i=0;i<78;i++){
    System.out.print("-");
  }
  System.out.print("\n|comensales  |");
  for(i=0;i<10;i++){
    System.out.printf("%4d|",ocupacion[i]);
  }
  do{
    System.out.println("¿\n\nCuántos clientes son?\n"+"Introduzca -1 para salir del programa");
    numClientes=Integer.parseInt(System.console().readLine());
    if(numClientes>0&&numClientes<5){
      
      }
    
  }while(numClientes>=0);
  
}
}

