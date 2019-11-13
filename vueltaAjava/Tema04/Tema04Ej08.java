/*

Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).
*/

public class Tema04Ej08 {
	
	public static void main (String args[]) {
    System.out.print("introduce las notas" + "\nIntroduce la prrimera nota");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la segunda nota");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la tercera nota");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1+nota2+nota3)/3;
    
    System.out.printf("la nota es %50.2f\n", media);
    
    if(media<5){
      System.out.println("has sacado insuficiente");
    }
     if(media>=5&&media<6){
      System.out.println("has sacado sufi");
    }
     if(media>=6&&media<7){
      System.out.println("has sacado Bien");
    }
      if(media>=7&&media<=9){
      System.out.println("has sacado Notables");
    }
    if (media>9&&media<=10){
      System.out.println("Nadie saca esa nota en programacion");
    }
      
		
		
	}
}

