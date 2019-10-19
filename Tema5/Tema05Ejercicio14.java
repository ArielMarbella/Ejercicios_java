/*
* 14. Escribe un programa que pida una base y un exponente (entero positivo)
* y que calcule la potencia
 */


public class Tema05Ejercicio14 {
	
	public static void main (String args[]) {
		
    System.out.println("Claculemos un numero elevado a su potencia:");
    
    System.out.println("introduce la base:");
    int base=Integer.parseInt(System.console().readLine());
    System.out.println("introduce la el exponente:");
    int exponente=Integer.parseInt(System.console().readLine());
    
    double potencia = 1;
  
    
    if (exponente==0){
      potencia = 1;
      }
    if(exponente>0){
      for(int i = 0; i<exponente;i++){
      potencia *=base;
      }
    }
    if(exponente<0){
      for(int i= 0; i< -exponente;i++){
        potencia *= base;
      }
      potencia = 1/potencia;
    }
    System.out.println(base + "^" + exponente + " = " + potencia);
    
	}
}

