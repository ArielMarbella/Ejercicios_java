/*
*
* 2. Realiza un programa que muestre al azar el nombre de una carta de
* la baraja francesa. Esta baraja está dividida en cuatro palos: picas,
* corazones, diamantes y tréboles. Cada palo está formado por 13 cartas,
* de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7,
* 8, 9, 10, J, Q, K y A (que sería el 1). Para convertir un número en
* una cadena de caracteres podemos usar String.valueOf(n)
 */



    
		public class Tema06Ejercicio02 {
    public static void main(String[] args) {

    int numeroPalo = (int)(Math.random()*4) + 1;

    switch(numeroPalo) {
    case 1:
    System.out.println("As" );
    default:
    }
    System.out.print ("de");
    int numeroCarta = (int)(Math.random()*13) + 1;
    
    if((numeroCarta>1) &&(numeroCarta<10)){
      System.out.print(numeroCarta);}
    switch(numeroCarta) {
    case 1:
    System.out.println("as");
    break;
    case 11:
    System.out.println("jota");
    break;
    case 12:
    System.out.println("q");

    break;
    case 13:
    System.out.println("K");
    default:



    }

        }
    }
      
