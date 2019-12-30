/*
 6
Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.
 */


public class Tema07Ejer06b{
    public static void main(String[] args){
        
        int[]array=new int[8];
        
        for(int i=0;i<8;i++){
          System.out.print("Introduce un número: ");
          array[i]=Integer.parseInt(System.console().readLine());
        }
        System.out.println();
        
        for(int i=0;i<8;i++){
          System.out.print(" "+array[i]+" ");
        }
        int aux=array[7];//guardamos el valor de la última posici-on en un auxiliar
        
        for(int i=7;i>0;i--){
          array[i]=array[i-1];
        } 
        array[0]= aux;     
        System.out.println();
        
        for(int i=0;i<8;i++){
            System.out.print(" "+array[i]+" ");
        }
    }
}
