/*
 * untitled.java
 * 
 * Copyright 2019 Linux User <tux@slitaz>
 * 
1. [2,5 puntos] Implemente un programa que dibuje un “triángulo hueco dentro de un triángulo macizo” (apuntando
hacia arriba).
La altura del triángulo (medida desde el vértice hasta la base) ha de ser, como mínimo, de 3. El programa solicitará este
valor y hasta que no se introduzca un valor que cumpla este requisito seguirá solicitándolo.
El grosor del triángulo (distancia entre el borde del triángulo exterior y el borde del triángulo interior) será, como mínimo, de
1. El programa solicitará este valor y hasta que no se introduzca un valor que cumpla este requisito seguirá solicitándolo.
Una vez el programa haya capturado los datos, procederá a dibujar los triángulos. Tenga en cuenta que el grosor del
triángulo, si es muy grande, provocará que se dibuje un triángulo macizo. 
* 
* Ariel Hernán Rojas Favero.21/11/2019. 
 */



public class Ex27ahrf1 {
	
	public static void main (String args[]) {
		
  System.out.println("Sólo me da tiempo a pintar una pirámide  hueca");
		System.out.println("Introduce la altura");
    int h= Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el carácter\n");
    String car= System.console().readLine();
    
    int espExt= h;
    int espInt=0;
    
    for(int j=0;j<h;j++){
      for(int i=0;i<espExt;i++){
        System.out.print(" ");
      }
      System.out.print(car);
      for(int i=1;i<espInt;i++){
        System.out.print(" ");
      }
      if(j>0){
       System.out.print(car);
      }
     
      espExt--;
      espInt=espInt+2;
      System.out.println();
    }
  for(int i=0;i<=h*2;i++){
    System.out.print(car);
  }
	}
}
  
