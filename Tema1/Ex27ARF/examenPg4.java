/*
 * ARIEL HERNÁN ROJAS FAVERO
 * 
4. [2,5 puntos] Implemente un programa que “codifique” los dígitos de un número como su “letra similar”. La tabla
de codificación sería la siguiente:
* 
* 0 1 2 3 4 5 6 7 8 9
  O l Z E A S b J B g

 */


public class examenPg4 {
	
	public static void main (String args[]) {
    
    System.out.print("Por favor, introduzca un numero entero: ");
    int mumeroEntero = Integer.parseInt(System.console().readLine());
    String equivalenteLetra;
    
    switch(mumeroEntero){
      case 0 : 
      equivalenteLetra = "0";
   
      
       case 1 : 
      equivalenteLetra = "l";
      break;
      
       case 2 : 
      equivalenteLetra = "Z";
      
      
       case 3 : 
      equivalenteLetra = "E";
    
      
       case 4 : 
      equivalenteLetra = "A";
      
      
       case 5 : 
      equivalenteLetra = "S";
      break;
      
       case 6 : 
      equivalenteLetra = "b";
     
      
       case 7 : 
      equivalenteLetra = "J";
     
       case 8 : 
      equivalenteLetra = "B";
     
       case 9 : 
      equivalenteLetra = "g";
      
      
      default:
      equivalenteLetra= "no existe esa letra";
   
    }
      
      System.out.println("numeroEntero " + mumeroEntero + ":" + equivalenteLetra);
      
  }
}  
    
    



