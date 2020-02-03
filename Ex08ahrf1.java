/*
Examen funciones Ariel Hernán Rojas Favero.
Ejercicio 01.
 */


import java.util.Scanner;

public class Ex08ahrf1 {
  
  public static void main(String[] args) {
      
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(s.nextLine());
    
    if(altura>=3 && altura <=12){  
      for (int i = 1; i <altura; i++) {
        System.out.print(vertices(' ', i));
        System.out.print(linea(' ', altura * 2 - i * 2 - 1));
        System.out.println(vertices('*', i));
        }
        
    }else{
      System.out.println("El número introducido debe ser mayor o igual que 3 y menor o igual que 12");
      }
    
  }
    public static String linea(char caracter, int longitud) {
    String resultado = "";
      for (int i = 0; i <longitud; i++) {
      resultado += caracter;
      }
      return resultado;
      }
    public static String vertices(char caracter, int longitud) {
    if (longitud == 1) {
    return "*";
    }
    return "*" + linea(' ', longitud - 2) + "*";
    }
    }


