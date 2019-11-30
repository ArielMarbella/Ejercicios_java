/*
32
Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.

 */


public class Tema05Ejer32 {
	
	public static void main (String args[]) {
    System.out.print("Por favor, introduzca un número entero positivo: ");
    
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    int longitud=0;
    long volteado=0;
    long n = numeroIntroducido;
    // Le da la vueta al número y calcula la longitud
    
    if(n==0){
        longitud=1;
    }

    else if(n<1){
      System.out.println("sólo números positivos por favor");
    }
    while( n>0){
      volteado=(volteado*10)+(n%10);
      n=n/10;
      longitud++;
    }
    int digito;
    int sumapares=0;
    
    for(int i=0;i<longitud;i++){
      
      digito=(int)(volteado%10);
      
      
      if(digito%2==0){
        System.out.print(digito);
        sumapares= sumapares+digito;
        
      }
      volteado=volteado/10;
    }
    System.out.println("\nla suma de los pares es: " + sumapares);
    
  }
}


