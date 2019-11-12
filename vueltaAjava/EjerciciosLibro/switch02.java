/*
 Hacemos un programa que cree areas
 */


public class switch02 {
	
	public static void main (String args[]) {
		System.out.println("Cáculo de áreas");
    System.out.println("-----------------");
    System.out.println("1.Cuadrado");
    System.out.println("2.rectángulo");
    System.out.println("3.triangulo");
    System.out.println("\nElija una opción (1-3)");
    
    int opcion = Integer.parseInt(System.console().readLine());
    
    double lado;
    double altura;
    double base;
    
    switch(opcion){
      case 1 :
        System.out.println("\nintrioduce el lado del cuadrado");
        lado = Double.parseDouble(System.console().readLine());
        System.out.println("\nEl área del cuadrado es" + (lado*lado));
      break;
      case 2 :
        System.out.print("\nIntroduzca la base del rectángulo en cm: ");
        base = Double.parseDouble(System.console().readLine());
        System.out.println("Introduzca la altura del rectángulo en cm: ");
        altura = Double.parseDouble(System.console().readLine());
        System.out.println("El área del rectángulo es" + (base*altura) + "cms2");
        break;
        case 3 :
        System.out.println("introduce base triangulo");
        base= Double.parseDouble(System.console().readLine());
        System.out.println("la altura");
        altura= Double.parseDouble(System.console().readLine());
        System.out.println("el area es" + ((base*altura)/2) + "cms2");
        break;
      
      default:
      
      System.out.println("\nLo siento, la opción elegida no es válida");
      
      }
  }
}

