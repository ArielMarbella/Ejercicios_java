/*
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


public class tema04Ejercicio24 {
	
	public static void main (String args[]) {
  System.out.print("escribe tu puesto en la empresa,(1 - Programador junior, 2 - Programador senior, 3 - Jefe de proyecto)");
  String cargoIntroducido = System.console().readLine();
  System.out.print("escribe en valor numérico, los días que has estado visitando clientes");
  double visitas = Integer.parseInt(System.console().readLine());
  System.out.print("escribe tu estado civil (soltero o casado)");
  String eCivil = System.console().readLine();
  
  double sueldoCargo = 0; 
  
  switch(cargoIntroducido){
    case "Programador junior":
      sueldoCargo = 950;
      break;
    case "Programador senior":
      sueldoCargo = 1200;
      break;
    case "Jefe proyecto":
      sueldoCargo =1600;
      break;
    default:
      System.out.println("Introduce tu cargo en minúscula y con la primera letrta en mayúscula , o... introduce un cargo real\n. Empieza de nuevo");
  }
  
  int ivaAplicado = 0;
  
  switch (eCivil){
    case "soltero":
      ivaAplicado = 25;
      break;
    case "casado":
      ivaAplicado = 20;
      break;
    default:
      System.out.println("por favor pon sólo soltero o casado , en minúsculas, no somos inclusivos no hay pareja de hecho ni nada parecido");
  }
  
  double dietas = visitas * 30;
  double sueldo = sueldoCargo + (ivaAplicado/100) + visitas;
  double sueldoBruto = sueldoCargo + dietas
  ;
  System.out.printf("Sueldo base %7.2f\n", sueldoCargo);
  System.out.printf("Dietas (%.0f visitas) %7.2f\n", visitas, dietas);
  System.out.printf("Sueldo bruto %7.2f\n", sueldoBruto);
  
  

    }
  }
  
  
  
  
		
	

