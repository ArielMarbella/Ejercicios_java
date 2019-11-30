/*
 29
Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.

 */


public class Tema05Ejer29 {
	
	public static void main (String args[]) {
    
      System.out.println("Introduce un número entero mayor a 100");
      int n1 = Integer.parseInt(System.console().readLine());
      
      System.out.println("Introduce un número entero menor a 100");
      int n2 = Integer.parseInt(System.console().readLine());
      
     do{
    
      
         for(int i=1;i<=n2;i++){
     
           if((i%n1)!=0){
        
            System.out.println(i);
         
           }
      
          } 
          System.out.print("ml");
        }   while(n1>0&&n2>0&&n1>n2);
        
        System.out.println("quieres pribar otra vez? si/no");
        
        String s = "si";
        if (s==si){
          System.out.proint("yeah");}
        
      
 }   
}

