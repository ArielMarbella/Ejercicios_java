/*
 17. Realiza un programa que sume los 100 números siguientes a un número entero y positivo
* introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es
* un número positivo).

 */
public class tema05Ejercicio17 {
public static void main(String[] args) {


System.out.print("Introduzca un número entero positivo: ");
int numeroIntroducido;
numeroIntroducido = Integer.parseInt(System.console().readLine());
int suma=0;
for(int i = numeroIntroducido; i < numeroIntroducido + 100; i++) {
suma = suma+i;
}
System.out.println("La suma de los 100 números siguientes a " + numeroIntroducido + " es "+ suma);
if(numeroIntroducido < 0) {
System.out.println("El número introducido no es correcto, debe introducir un número positivo.");
}
}
}
