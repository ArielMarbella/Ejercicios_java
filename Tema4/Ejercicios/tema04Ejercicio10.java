/**

* Escribe un programa que nos diga el horóscopo a partir del día y
* el mes de nacimiento.

*
* @author Ariel rojas
*/
public class tema04Ejercicio10{
  public static void main(String[] args){
  
  String horoscopo= ("");
  
  System.out.println("Este programa te dice el horóscopo al que perteneces:");
  System.out.println("Introduce qué número de mes naciste (1-12)");
   int mes= Integer.parseInt(System.console().readLine());
   System.out.println(" y uqé día nacistes?");
   int dia= Integer.parseInt(System.console().readLine());
   
   switch(mes){
     case 1:
     if(dia<21){
       horoscopo = "cpriconio";
       }else{
         horoscopo = "acuario";
         }
         break;
     case 2:
     if(dia<20){
       horoscopo = "acuario";
       }else{
         horoscopo = "piscis";
         }
         break;
    case 3:
     if(dia<21){
       horoscopo = "piscis";
       }else{
         horoscopo = "aries";
         }
         break; 
    case 4:
     if(dia<21){
       horoscopo = "aries";
       }else{
         horoscopo = "tauro";
         }
         break;
    case 5:
     if(dia<21){
       horoscopo = "tauro";
       }else{
         horoscopo = "géminis";
         }
         break;
    case 6:
     if(dia<22){
       horoscopo = "géminis";
       }else{
         horoscopo = "cancer";
         }
         break;
    case 7:
     if(dia<22){
       horoscopo = "cancer";
       }else{
         horoscopo = "Leo";
         }
         break;
    case 8:
     if(dia<24){
       horoscopo = "Leo";
       }else{
         horoscopo = "virgo";
         }
         break;
    case 9:
     if(dia<23){
       horoscopo = "virgo";
       }else{
         horoscopo = "libra";
         }
         break;
    case 10:
     if(dia<23){
       horoscopo = "libra";
       }else{
         horoscopo = "escorpio";
         }
         break;
    case 11:
     if(dia<23){
       horoscopo = "escorpio";
       }else{
         horoscopo = "sagitario";
         }
         break;
     case 12:
     if(dia<23){
       horoscopo = "sagitario";
       }else{
         horoscopo = "capricornio";
         }
         break;
         default:
     }
     System.out.print("Su horóscopo es " + horoscopo);
    }
  }

