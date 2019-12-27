/*
 24
Escribe un programa que, dado un número introducido por teclado, elija al azar
uno de sus dígitos.
 */


public class Tema06Ejercicio24 {
	
	public static void main (String args[]) {
		 System.out.println("escribe un programa que elija al azar uno de sus números ");
     
    int nIntro=Integer.parseInt(System.console().readLine());
    int n=nIntro;
    int longitud=0;
    int aleatorio;
    
    // calculemos la longitud
    
    while(n>0){
      n=n/10;
      longitud++;
      }
      
      aleatorio= (int)(Math.random()*longitud)+1;
      //escogemos al azar un número
      
      while(aleatorio>0){
        n = nIntro % 10;
        nIntro /= 10;
        aleatorio--;
        
        }
     System.out.println(n);
	}
}

