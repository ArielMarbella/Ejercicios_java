/*
 */

import func.misFunciones;
public class ex3ej3 {
	
	public static void main (String args[]) {
    int[] arrayRot=new int[6];
		int[] x= new int[6];
    int[][]arrayBisex=new int[4][6];
    int[][]arrayBisexRot=new int[4][6];
    
      for(int i=0;i<arrayBisex.length;i++){
        for(int j=0;j<arrayBisex.length+2;j++){
  
          arrayBisex[i][j]=(int)(Math.random()*100);
        }
      }  
      for(int i=0;i<arrayBisex.length;i++){
        for(int j=0;j<arrayBisex.length+2;j++){
  
          System.out.printf("%3d",arrayBisex[i][j]);
        }
          System.out.println();
      }  
      System.out.println();
      
    
    for(int i=0;i<x.length;i++){
      x[i]=(int)(Math.random()*100);
    }
    for(int i=0;i<x.length;i++){
      System.out.printf("%3d",x[i]);
    }
    System.out.println();
    
    arrayRot=func.misFunciones.RotarColumnaALaIzquierda (x);
      for(int i=0;i<x.length;i++){
      System.out.printf("%3d",arrayRot[i]);
      }
        System.out.println();
         System.out.println();
        
    arrayBisexRot=func.misFunciones.RotarColumnaALaIzquierda (arrayBisex);
     for(int i=0;i<arrayBisexRot.length;i++){
        for(int j=0;j<arrayBisexRot.length+2;j++){
  
          System.out.printf("%3d",arrayBisexRot[i][j]);
        }
        System.out.println();
      }  
      
	} 
}

