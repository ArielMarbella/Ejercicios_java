/*
* 13. Escribe un programa que simule la tirada de dos dados. El programa deberá
* continuar tirando los dados una y otra vez hasta que en alguna tirada los
* dos dados tengan el mismo valor.


 */


public class Tema06Ejercicio013 {
	
	public static void main (String args[]) {
		System.out.println("simulamos la tirada de dos dados");
    
    int dado1=0;
    int dado2=0;
    
    do{
    
      dado1=(int)(Math.random()*6)+1;
      dado2=(int)(Math.random()*6)+1;
      System.out.println(dado1+" "+dado2);
    }while(dado1!=dado2);
    
	}
}

