/*
 * Tema04Ej21.java
 * 21. Calcula la nota de un trimestre de la asignatura Programación. El programa
* pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
* Si la media de los dos controles da un número mayor o igual a 5, el alumno
* está aprobado y se mostrará la media. En caso de que la media sea un número
* menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
* se califica como apto o no apto, por tanto se debe preguntar al usuario
* ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
* resultado de la recuperación es apto, la nota será un 5; en caso
* contrario, se mantiene la nota media anterior.
*
* Ejemplo 1:
* Nota del primer control: 7
* Nota del segundo control: 10
* Tu nota de Programación es 8.5
*
* Ejemplo 2:
* Nota del primer control: 6
* Nota del segundo control: 3
* ¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto
* Tu nota de Programación es 5

 */


public class Tema04Ej21 {
	
	public static void main (String args[]) {
    double c1 = 0;
    double c2 = 0;
    double media= 0;
    String apto;
    
    System.out.println("nota primer control");
    c1= Double.parseDouble(System.console().readLine());
    if(c1>10){
      System.out.print("incorrecto numero");
      c1 = 0;
      }else{
    System.out.println("nota segundo control");
       
    c2= Double.parseDouble(System.console().readLine());
        if(c2>10){
          System.out.print("incorrecto numero");
          c2 = 0;
          }
     }
    media= ((c1+c2)/2);
    
    System.out.println("nota media = " + media);
    
    if(media<5){
      
    System.out.println("¿resultado de la recuperación? apto/no apto");
    apto = System.console().readLine();
    if(apto.equals("apto")){
    media = 5;
    }
    
    
  }
  System.out.println("tu nota media es " + media);
		
	}
}

