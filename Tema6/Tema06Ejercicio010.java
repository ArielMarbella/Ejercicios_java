/*
 10. Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
* El carácter con el que se pinta cada línea se elige de forma aleatoria entre
* uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
* aleatoria entre 1 y 40 caracteres.

 */


public class Tema06Ejercicio010 {
	
	public static void main (String args[]) {
		System.out.println("Este programa pinta líneas");

    int pintaLinea;
    int longitud;
    String caracterLinea = "";
    
    for(int i=0;i<10;i++){
      
      longitud=(int)(Math.random()*40)+1;
      pintaLinea=(int)(Math.random()*6);
      //elegimos el caracter
      switch(pintaLinea){
        
        case 0:
        caracterLinea="*";
        break; 
        
        case 1:
        caracterLinea="-";
        break;  
        
        case 2:
        caracterLinea="=";
        break;  
        
        case 3:
        caracterLinea=".";
        break;
         
        case 4:
        caracterLinea="|";
        break;  
        
        case 5:
        caracterLinea="@";
        break;  
        default:
         
      }
      for(int j=0;j<longitud;j++){
        
        System.out.print(caracterLinea);
        
        }
        
        System.out.println();
    }
  }
}

	
