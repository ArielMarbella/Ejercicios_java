/*
Ariel Rojas Favero 21/11/2019.
* Ejercicio 4
* Podría haber terminado el ejercicio con un poco más de tiempo, lo haré en casa
 */


public class Ex27ahrf4 {
	
	public static void main (String args[]) {
    System.out.println("He necesitado más tiempo , pero podría haberlo acabado");
		System.out.println("introduce una fecha");
    
    System.out.println("introduce el día:\n");
    int dia=Integer.parseInt(System.console().readLine());
    
    System.out.println("introduce el mes con valor numérico (del 1 al 12) :\n");
    int mes=Integer.parseInt(System.console().readLine());
    
    System.out.println("introduce el año:\n");
    int ano=Integer.parseInt(System.console().readLine());
    
    int coef=0;
    int coefAno=0;
    int codAno=1;
    int coefMes=0;
    int coefDia = dia;
    
    if(ano>=1700&&ano<=1799){
      coef=5;
    }
    if(ano>=1800&&ano<=1899){
      coef=3;
    }
    if(ano>=1900&&ano<1999){
      coef=1;
    }
    if(ano>=2000&&ano<2099){
      coef=0;
    }
    if(ano>=2100&&ano<2199){
      coef=-2;
    }
    if(ano>=2200&&ano<2299){
      coef=-4;
    }
    System.out.println("El coeficiente para el siglo " +ano+ "  es: "+ coef);
    
    if (ano>=1700&&ano<=2299){
      codAno =(ano % 100);
      codAno=codAno+((codAno*25)/100);
      
    }
    System.out.println("El coeficiente para el año es:  " + codAno);
    
      switch(mes){
        case 1:
        coefMes= 6;
        }
        switch(mes){
        case 2:
        coefMes= 2;
        }
        switch(mes){
        case 3:
        coefMes= 2;
        }switch(mes){
        case 4:
        coefMes= 5;
        }
        switch(mes){
        case 5:
        coefMes= 0;
        }switch(mes){
        case 6:
        coefMes= 3;
        }switch(mes){
        case 7:
        coefMes= 5;
        }switch(mes){
        case 8:
        coefMes= 1;
        }switch(mes){
        case 9:
        coefMes= 4;
        }switch(mes){
        case 10:
        coefMes= 6;
        }switch(mes){
        case 11:
        coefMes= 2;
        }switch(mes){
        case 12:
        coefMes= 4;
        }
        System.out.println("el coeficiente para el mes "+mes+" es "+coefMes);
        
        System.out.print("El coeficiente del día " +dia+ "es:" + coefDia );
    }
  }
  


