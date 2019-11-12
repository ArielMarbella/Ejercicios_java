/*
 Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.

 * 
 */


public class Tema04Ej04 {
	
	public static void main (String args[]) {
    
		System.out.print("introduce las horas de trabajo");
    
    int horas = Integer.parseInt(System.console().readLine());
    int sueldo;
    if(horas<=40){
      sueldo = (horas * 12);
    }else{
      sueldo= (40*12) + (( horas-40) * 16);
      }
    System.out.print("tu sueldo es" + sueldo);
	}
}

