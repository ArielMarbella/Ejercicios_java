/*
 Define tres arrays de 20 números enteros cada una, con nombres
* “numero”, “cuadrado” y “cubo”. Carga el array “numero” con valores
* aleatorios entre 0 y 100. En el array “cuadrado” se deben almacenar
* los cuadrados de los valores que hay en el array “numero”. En el
* array “cubo” se deben almacenar los cubos de los valores que hay
* en “numero”. A continuación, muestra el contenido de los tres arrays
* dispuesto en tres columnas.

 */


public class Tema07Ejer04 {
	
	public static void main (String args[]) {
    int i=0;
    int []numeros;
    numeros= new int[20];
    
    numeros[0]=(int)(Math.random()*101);
    numeros[1]=(int)(Math.random()*101);
    numeros[2]=(int)(Math.random()*101);
    numeros[3]=(int)(Math.random()*101);
    numeros[4]=(int)(Math.random()*101);
    numeros[5]=(int)(Math.random()*101);
    numeros[6]=(int)(Math.random()*101);
    numeros[7]=(int)(Math.random()*101);
    numeros[8]=(int)(Math.random()*101);
    numeros[9]=(int)(Math.random()*101);
    numeros[10]=(int)(Math.random()*101);
    numeros[11]=(int)(Math.random()*101);
    numeros[12]=(int)(Math.random()*101);
    numeros[13]=(int)(Math.random()*101);
    numeros[14]=(int)(Math.random()*101);
    numeros[15]=(int)(Math.random()*101);
    numeros[16]=(int)(Math.random()*101);
    numeros[17]=(int)(Math.random()*101);
    numeros[18]=(int)(Math.random()*101);
    numeros[19]=(int)(Math.random()*101);
    
   int []cuadrado;
   cuadrado= new int[20];
   
   cuadrado[0]=numeros[0]*numeros[0];
   cuadrado[1]=numeros[1]*numeros[1];
   cuadrado[3]=numeros[3]*numeros[3];
   cuadrado[4]=numeros[4]*numeros[4];
   cuadrado[5]=numeros[5]*numeros[5];
   cuadrado[6]=numeros[6]*numeros[6];
   cuadrado[7]=numeros[7]*numeros[7];
   cuadrado[8]=numeros[8]*numeros[8];
   cuadrado[9]=numeros[9]*numeros[9];
   cuadrado[10]=numeros[10]*numeros[10];
   cuadrado[10]=numeros[10]*numeros[10];
   cuadrado[11]=numeros[11]*numeros[11];
   cuadrado[12]=numeros[12]*numeros[12];
   cuadrado[12]=numeros[12]*numeros[12];
   cuadrado[14]=numeros[14]*numeros[13];
   cuadrado[15]=numeros[15]*numeros[15];
   cuadrado[16]=numeros[16]*numeros[16];
   cuadrado[17]=numeros[17]*numeros[17];
   cuadrado[18]=numeros[18]*numeros[18];
   cuadrado[19]=numeros[19]*numeros[19];
   
   int []cubo;
   cubo= new int[20];
   
   cubo[0]=numeros[0]*numeros[0]*numeros[0];
   cubo[1]=numeros[1]*numeros[1]*numeros[1];
   cubo[3]=numeros[3]*numeros[3]*numeros[3];
   cubo[4]=numeros[4]*numeros[4]*numeros[3];
   cubo[5]=numeros[5]*numeros[5]*numeros[5];
   cubo[6]=numeros[6]*numeros[6]*numeros[6];
   cubo[7]=numeros[7]*numeros[7]*numeros[7];
   cubo[8]=numeros[8]*numeros[8]*numeros[8];
   cubo[9]=numeros[9]*numeros[9]*numeros[9];
   cubo[10]=numeros[10]*numeros[10]*numeros[10];
   cubo[10]=numeros[10]*numeros[10]*numeros[10];
   cubo[11]=numeros[11]*numeros[11]*numeros[11];
   cubo[12]=numeros[12]*numeros[12]*numeros[12];
   cubo[12]=numeros[12]*numeros[12]*numeros[12];
   cubo[14]=numeros[14]*numeros[14]*numeros[14];
   cubo[15]=numeros[15]*numeros[15]*numeros[15];
   cubo[16]=numeros[16]*numeros[16]*numeros[16];
   cubo[17]=numeros[17]*numeros[17]*numeros[17];
   cubo[18]=numeros[18]*numeros[18]*numeros[18];
   cubo[19]=numeros[19]*numeros[19]*numeros[19];
   
   System.out.println(" n │ n² │ n³\n─────┼───────┼─────────");
   for ( i=0;i<20;i++){
     System.out.printf("%4d | %5d | %6d",numeros[i],cuadrado[i],cubo[i]);
     System.out.println();
    }
   
	}
}

