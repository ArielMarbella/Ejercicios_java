/** Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación.
*/

public class tema02Ejercicio01{
  public static void main(String[] args){
    System.out.println("Lo primero es declarar la variable y darle un valor::");
   
    int x; //declaro la variable entera
    x = 144; //asigno el valor requerido
    int y; //lo mismo
    y = 999; //idem
    System.out.println("");
    System.out.println("x=" + x);//una forma de hacerlo
    System.out.println("y=" + y);
    System.out.println("");
    System.out.println("También puedo hacerlo así:");//otra forma de hacerlo
    System.out.println("");
    System.out.println("el valor de x es: " + x);
    System.out.println("el valor de y es: " + y);
    System.out.println("");//dejo un poco de espacio para que se vea prolijo por pantalla
    System.out.println("");
    System.out.println("");
    System.out.println("");
    
    System.out.println("la suma de "+x+ " + " +y+ " es:");
    System.out.println("x + y = " + (x+y));
    System.out.println("");
    System.out.println("La resta de " + x +" - " + y + " es:");
    System.out.println("x - y = " + (x - y));
    System.out.println("");
    System.out.println("Ahora lo escribo por pantalla sin usar el simbolo + como concatenador de strings y variablesa.");
    System.out.println("");
    System.out.println("La división de 144 / 199 es:");
    System.out.println("x / y = " + ((float)x / (float)y));
    System.out.println("");
    System.out.println("La multiplicación de 144 x 199 es:");
    System.out.println("x + y = "+ (x*y));
  }
}
