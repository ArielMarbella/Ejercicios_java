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
    int c1;
    int c2;
    int c3;
    System.out.println("generando colores");
    String color1="";
    String color2="";
    String color3="";


    do{
    c1=(int)(Math.random()*6);
    c2=(int)(Math.random()*6);
    c3=(int)(Math.random()*6);
    }while((c1==c2)||(c1==c3)||(c2==c3));
    
		switch (c1){
      case 0:
      color1="rojo";
      break;
      
        case 1:
      color1="naranja";
      break;
      
        case 2:
      color1="azul";
      break;
      
        case 3:
      color1="verde";
      break;
      
        case 4:
      color1="amarillo";
      break;
      
        case 5:
      color1="violeta";
      break;
      default:
    
      }
    switch (c2){
      case 0:
      color2="rojo";
      break;
      
      case 1:
      color2="naranja";
      break;
      
      case 2:
      color2="azul";
      break;
      
      case 3:
      color2="verde";
      break;
      
      case 4:
      color2="amarillo";
      break;
      
      case 5:
      color2="violeta";
      break;
      default:
    }
    switch (c3){
      case 0:
      color3="rojo";
      break;
      
        case 1:
      color3="naranja";
      break;
      
        case 2:
      color3="azul";
      break;
      
        case 3:
      color3="verde";
      break;
      
        case 4:
      color3="amarillo";
      break;
      
        case 5:
      color3="violeta";
      break;
      default:
    } 
      System.out.print(color1 + color2 + color3);
	}
}

