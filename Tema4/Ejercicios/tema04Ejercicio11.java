/*
11. Escribe un programa que dada una hora determinada (horas y minutos),
* calcule los segundos que faltan para llegar a la medianoche. */


public class tema04Ejercicio11{
	
	public static void main (String []args) {
    System.out.println("Escribe qué hora es y te decimos cuántos segundos son");
    System.out.println("Primero pon la hora:\n");
		int hora = Integer.parseInt(System.console().readLine());
    System.out.println("Ahora los minutos:\n");
    int minutos = Integer.parseInt(System.console().readLine());
    int segundosTranscurridos = (hora * 3600) + (minutos * 60);
    int segundosHastaMedianoche = (24*3600) - segundosTranscurridos;
    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos", hora, minutos, segundosHastaMedianoche);
    

    
    
    
    
    
    
    
    
	}
}

