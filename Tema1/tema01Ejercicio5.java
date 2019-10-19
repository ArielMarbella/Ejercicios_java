public class tema01Ejercicio05{
  public static void main(String[] args){
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.println("Lunes\tMartes\tMiérc.\tJueves.\tViernes");
    System.out.println("-----\t-------\t-------\t------\t------");
    System.out.println(verde+"EED"+rojo+"\tPRO\tPROG\tPROG"+morado+"\tFOL");
    System.out.println(azul+"LM"+rojo+"\tPROG\tPROG\tPROG"+morado+"\tFOL");
    System.out.println(azul+"LM"+rojo+"\tPRO"+verde+"\tEED\tPRO\tFOL");
    System.out.println("-----*\t-------\t-------\t------\t------");
    System.out.println("EED\tPRO\tPROG\tPROG \tFOL");
    System.out.println("LM\tPROG\tPROG\tPROG\tFOL");
    System.out.println("LM\tPRO\tED\tPRO\tFOL");
    System.out.println("SNF\tBBDD\tED\tBBDD\tSNF");
    System.out.println("SNF\tBBDD\tLM\tBBDD\tSNF");
    System.out.println("SNF\tBBDD\tLM\tBBDD\tSNF");
    System.out.println("SNF\tBBDD\tED\tBBDD\tSNF");
    System.out.println("SNF\tBBDD\tLM\tBBDD\tSNF");
    System.out.println("SNF\tBBDD\tLM\tBBDD\tSNF");

    }

}
