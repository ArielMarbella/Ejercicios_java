/*

* 7. Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por
* pantalla separados por espacios. El programa pedirá entonces por teclado dos valores y a
* continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista
* generada anteriormente. Los números que se han cambiado deben aparecer entrecomillado
 */


public class Tema07Ejer07 {

  public static void main(String[] args) {
    int valor1;
    int valor2;
    int[]n=new int[100];
    
    for(int i=0;i<100;i++){
      n[i]=(int)(Math.random()*21);
      System.out.print(" "+n[i]);
    
    }

    System.out.println("busca un número por el que cambiar");
    valor1=Integer.parseInt(System.console().readLine());
    
    System.out.println("Di ahora por que número sustituirlo");
    valor2=Integer.parseInt(System.console().readLine());
    
    for(int i=0;i<100;i++){
      
      if(n[i]==valor1){
        n[i]=valor2;
        System.out.print(" " + "\""+ n[i]+"\""+" ");
      }else{
        System.out.print(n[i]+" ");
        }
      
  }
  
	}
}

