/*
2. Realiza un programa que muestre al azar el nombre de una carta de
* la baraja francesa. Esta baraja está dividida en cuatro palos: picas,
* corazones, diamantes y tréboles. Cada palo está formado por 13 cartas,
* de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7,
* 8, 9, 10, J, Q, K y A (que sería el 1). Para convertir un número en
* una cadena de caracteres podemos usar String.valueOf(n).

 */


public class Tema06Ejercicio02 {
public static void main(String[] args) {

String palo= "";
String carta= "";

int nombrePalo=(int)(Math.random()*4)+1;

switch(nombrePalo){
  case 1:
  palo="picas";
  break;
  
   case 2:
  palo="tréboles";
  break;
  
   case 3:
  palo="picas";
  break;
  
   case 4:
  palo="rombos";
  default:
  }
  
  int numeroCarta=(int) (Math.random()*12)+1;
  
  switch(numeroCarta){
  case 1:
  carta="as";
  break;
   case 10:
  carta="j";
  break;
   case 11:
  carta="Q";
  break;
   case 12:
  carta="k";
  break;
  default:
  carta=String.valueOf(numeroCarta);
    }
    System.out.println("es un "+carta+" de "+palo);
  }
}
 
