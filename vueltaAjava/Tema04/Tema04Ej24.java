/*
24
* 
Escribe un programa que genere la nómina (bien desglosada) de un empleado
según las siguientes condiciones:
• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
de proyecto), los días que ha estado de viaje visitando clientes durante el
mes y su estado civil (1 - Soltero, 2 - Casado).
• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
si se trata de un prog. junior, un prog. senior o un jefe de proyecto
respectivamente.
• Por cada día de viaje visitando clientes se pagan 30 euros extra en
concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
un 25% en caso de estar soltero y un 20% en caso de estar casado.
 */


public class Tema04Ej24 {
	
	public static void main (String args[]) {
		
    System.out.println("Escribe tu cargo");
    System.out.println("programador junior = 1");
    System.out.println("programador senior = 2");
    System.out.println("Jefe de proyecto   = 3");
    
    int cargo = Integer.parseInt(System.console().readLine());
    
    System.out.println("Escribe tu estado civil");
    System.out.println("soltero = 1");
    System.out.println("casado = 2");
    
    int eCiv = Integer.parseInt(System.console().readLine());
    
    System.out.println("\n¿cuántos días has estado de visita?");
    
    int diasVis = Integer.parseInt(System.console().readLine());
    
    double sueldoBase = 0;
    
    switch(cargo){
      case 1 :
        sueldoBase = 950;
        break;
      case 2 :
        sueldoBase = 1200;
      break;
        case 3 :
      sueldoBase = 1600;
      break;
        default:
        System.out.println("No has seleccionado correctamente el cargo");
    }

    double sueldoDietas = diasVis * 30;
    double sueldoBruto= sueldoBase + sueldoDietas;
    double irpf = 0;
    
    switch (eCiv){
      case 1:
        irpf = 25;
        break;
      case 2:
        irpf = 20;
        break;
      default:
        System.out.println("esa selección del e.civil es incorrecta");
    }
    
    double irpfAplicado= (sueldoBruto * irpf)/100;
    double sueldoNeto=(sueldoBruto-((sueldoBruto*irpf)/100));
    System.out.println("\n*********************************");
    System.out.printf("Sueldo base                %10.2f\n",sueldoBase);
    System.out.printf("Días de visita             %10d\n",diasVis);
    System.out.printf("Dietas recibidas           %10.2f\n",sueldoDietas);
    System.out.printf("Sueldo bruto               %10.2f\n",sueldoBruto);
    System.out.printf("Retención aplicada         %10.2f\n" ,irpfAplicado);
    System.out.printf("***********************************\n");
    System.out.printf("Sueldo neto                %10.2f\n",sueldoNeto);
    
  }
}

