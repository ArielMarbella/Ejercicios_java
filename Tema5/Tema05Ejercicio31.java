/*
 * Ejercicio 31
Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno
* */
public class Tema05Ejercicio31{
  public static void main(String[] args){
    
    int altura= 1;
    int alturaIntroducida;
    int longitud;
    char asterisco = '*';
    
    
    System.out.println("este programa pinta una L");
    System.out.println("Introduce la altura de la L");
    alturaIntroducida = Integer.parseInt(System.console().readLine());
       

    while(altura<=alturaIntroducida){
        System.out.print(asterisco);
        altura++;
         System.out.println();
    }
    
    for(int i = 1; i<=(alturaIntroducida/2+1);i++){
      System.out.print(asterisco + " ");
      }
      
  }

}
