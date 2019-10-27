/*
Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.
 */


public class Tema05Ejercicio27 {
	
	public static void main (String args[]) {
    
    int suma=0;
    int contador=0;
    int numeroIntroducido;
    
    System.out.print("escribe un número y te diremos los multiplos de tres entre uno y el número");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
     
     for(int i=1;i<=numeroIntroducido;i++){
        if(i % 3 == 0){
          suma = suma + i;
          contador++;
        }
     }
    System.out.println("total múltiplos " + contador + "\nsuma multiplos= " + suma  );
		
	}
}

