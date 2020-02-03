/*
 * Ariel Hernán Rojas Favero
 * 
3. [2,5 puntos] Implemente un programa que solicite (sólo una vez) un número entero “X” al usuario. Después, el
programa realizará el siguiente desempeño:
a) Solicitará un tipo de desplazamiento (a elegir entre “izquierda” y “derecha”; si elige “salir” el programa
finalizará sin más).
b) Solicitará la cantidad de cifras que desea desplazar (si esta cantidad es mayor que el número de cifras del
número, se considerará como si el número fuera circular).
c) Llevará a cabo dicho desplazamiento sobre el dato “X” (el dato ser verá afectado por dicho
desplazamiento, reflejándolo), lo mostrará por pantalla, y volverá al punto a). En caso de que el
desplazamiento indicado no sea ni “izquierda” ni “derecha”, ignorará dicho desplazamiento, volviendo
igualmente al punto a).
* 
* Este programa “da vueltas” a un número.
Introduzca un número: 1234567
Introduzca el tipo de desplazamiento (izquierda, derecha; salir): izquierda
Introduzca la cantidad de cifras que desea desplazar: 2
El número resultante es: 3456712
Introduzca el tipo de desplazamiento (izquierda, derecha; salir): derecha
Introduzca la cantidad de cifras que desea desplazar: 4
El número resultante es: 6712345
Introduzca el tipo de desplazamiento (izquierda, derecha; salir): izquierda
Introduzca la cantidad de cifras que desea desplazar: 10
El número resultante es: 2345671
Introduzca el tipo de desplazamiento (izquierda, derecha; salir): salir

 */


public class examenPg3 {
	
	public static void main (String args[]) {
    
System.out.print("Este programa “da vueltas” a un número. ");

int numeroIntroducido = Integer.parseInt(System.console().readLine());
int numero = numeroIntroducido;
int volteado = 0;
int izquierda;
int numerosAdesplazar;

while (numero > 0) {
volteado = (volteado * 10) + (numero % 10);
numero /= 10;
} 
if (izquierda==true)
// while

System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + volteado);
}
}

