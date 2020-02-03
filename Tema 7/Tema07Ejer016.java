/*
 16
Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes.
Ejemplo:
159 204 20 250 178 90 353 32 229 357 224 54 260 310 140 249 335 326 223 13
¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): 1
159 204 [20] [250] 178 [90] 353 32 229 357 224 54 [260] [310] [140] 249 [335] 326 223 13
 */



public class Tema07Ejer016 {
	
	public static void main (String args[]) {
		
    int[]array=new int[20];
    int opcion=0;
    
    for(int i=0;i<20;i++){
      array[i]=(int)(Math.random()*401);
      System.out.print(array[i]+" ");
    }
    
    /*if(opcion==1) {
      for(int i=0;i<20;i++){
        if(array[i]%5==0){
        System.out.print("[" + array[i] + "]"); 
        }else{
        System.out.print(array[i]);
         }
      }
    }else{
       for(int i=0;i<20;i++){
        if(array[i]%7==0){
        System.out.print("[" + array[i] + "]"); 
        }else{
        System.out.print(array[i]);
         }
      }
      }*/
      int divisor;
      if(opcion==1) {
      divisor=5;
    }else{
       divisor=7;
      }
    for(int i=0;i<20;i++){
        if(array[i]%divisor==0){
        System.out.print("[" + array[i] + "]"); 
        }else{
        System.out.print(array[i]);
         }
      }
  }
}
