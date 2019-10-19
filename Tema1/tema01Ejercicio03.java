/**Escribe un programa que muestre por pantalla 10 palabras en inglés junto
a su correspondiente traducción al castellano. Las palabras deben estar
distribuidas en dos columnas y alineadas a la izquierda.
*/

public class tema01Ejercicio03{
  public static void main(String[] args){
    System.out.println("Palabra en inglés        Traducción al español");
    System.out.println("----------------------------------------------");
    System.out.printf("%-28s %-15s\n","house" , "casa"         );
    System.out.printf("%-28s %-15s\n","dog" , "perro"         );
    System.out.printf("%-28s %-15s\n","performance" , "actuación"         );
    System.out.printf("%-28s %-15s\n","car" , "coche"         );
    System.out.printf("%-28s %-15s\n","amazing" , "alucinante"         );
    System.out.printf("%-28s %-15s\n","facebook" , "caralibro"         );
    System.out.printf("%-28s %-15s\n","urbanization" , "urbanización"         );
    System.out.printf("%-28s %-15s\n","auction" , "subasta"         );
    
    }

}
