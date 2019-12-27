/*
Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y
naranja.

 */


public class Tema06Ejercicio018 {
	
	public static void main (String args[]) {
    
    System.out.println("generando colores");
    string color="";
    do{
    int c1=(int)(Math.random()*6);
    int c2=(int)(Math.random()*6);
    int c3=(int)(Math.random()*6);
    }while((c1==c2)||(c1==c3)||(c2==c3));
    
		switch (c1){
      case 0:
      color="rojo";
      break;
      
        case 1:
      color="naranja";
      break;
      
        case 2:
      color="azul";
      break;
      
        case 3:
      color="verde";
      break;
      
        case 4:
      color="amarillo";
      break;
      
        case 5:
      color="violeta";
      break;
      
      }
      
      
      
	}
}

