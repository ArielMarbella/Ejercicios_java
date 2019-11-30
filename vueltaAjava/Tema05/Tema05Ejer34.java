/*
34
Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos.
 */


public class Tema05Ejer34 {
	
	public static void main (String args[]) {
    System.out.println("Introduce un número con pares e impares");
    int numero1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce un número con pares e impares");
    int numero2 = Integer.parseInt(System.console().readLine());
    
    int volteado1 =0;
    int volteado2 =0;
    int n1 = numero1;
    int n2 = numero2;

    int longitud=0;
    int longitud2 =0;
    
    int resultadoPar=0;
    int resultadoImpar=0;
    
    int digito=0;

    if (n1==0){
      System.out.println("este número no vale");
    }
    if (n2==0){
      System.out.println("este número no vale");
    }
    
    while(n1>0&&n2>0){
      
      volteado1= (volteado1*10)+(n1%10);
      n1=n1/10;
      longitud++;
      
      volteado2= (volteado2*10)+(n2%10);
      n2=n2/10;
      longitud2++;
    
    }//while
      
    for(int i=0;i<longitud;i++) {

      digito = volteado1%10;
      
      if (digito%2==0){
        
        resultadoPar= (resultadoPar*10) + digito;
      }else{
        resultadoImpar=(resultadoImpar*10)+digito;
       }
       
      digito = volteado2%10;
      
      if (digito%2==0){
        
        resultadoPar= (resultadoPar*10) + digito;
      }else{
        resultadoImpar=(resultadoImpar*10)+digito;
       }
       
       volteado1=volteado1/10;
       volteado2=volteado2/10;
    }
    
    System.out.println("El número formado por resultados pares es = " +   resultadoPar);
    System.out.println("El número formado por resultados impares es = " + resultadoImpar);
    
	}
}

