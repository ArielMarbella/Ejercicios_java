/*
 Examen funciones Ariel Hernán Rojas Favero.
Ejercicio 04.
 */

import func.misFunciones;

public class Ex27ahrf4 {
	
	public static void main (String args[]) {
    
    int[][] cuad= new int[2][13];	
    //Este programa rellena aleatoriamente cada "cuadradito" del array
    for(int i=0;i<cuad.length;i++){
      for(int j =0;j<13;j++){
        cuad[i][j]=(int)(Math.random()*201);
      }
    }
    func.misFunciones.HacemosUnArray(cuad);
     	
	}
}


