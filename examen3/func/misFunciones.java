/*
Esto son las funciones pa usar en examen
 
 ─ ━ │ ┃ ┄ ┅ ┆ ┇ ┈ ┉ ┊ ┋ ┌ ┏ ┐ ┓ └ ┗ ┘ ┛ ├ ┣ ┤ ┫ ┬ ┳ ┴ ┻ ┼ ╋ ═ ║ ╔ ╗ ╚ ╝ ╠ ╣ ╦ ╩ ╬ ╭ ╮ ╯ ╰
 */
package func;

public class misFunciones {
  
	public static void HacemosUnArray(int[][] array){
    
    int linea= 2;
    int columna= 13;
    //barra superior
    System.out.print("┏");
    for(int i=0;i<columna;i++){
      if(i<columna-1){
      System.out.print("━━━┳");
      }else{
       System.out.println("━━━┓");
       }
    }
    //aquí acaba barra superior
    //aqui empieza la parte intermedia
    for(int i=0;i<linea;i++){
     
     for(int j=0;j<columna;j++){
      
        System.out.printf("┃%3d",array[i][j]);  
      } 
     System.out.println("┃");//esto es la ultima barra
     if(i<linea-1){
         System.out.print("┣");
         for(int k=0;k<columna;k++){
         System.out.print("━━━");
         if(k<columna-1){
           System.out.print("╋");
         }else{
           System.out.print("┫");
          }   
          }
          //Aqiui acaba parte intermedia
          //aqui empieza la barra de abajo
        }else{
        System.out.print("┗");
         for(int k=0;k<columna;k++){
         System.out.print("━━━");
         if(k<columna-1){
           System.out.print("┻");
         }else{
           System.out.print("┛");
         }
        }
      }
     System.out.println();
    }

  }
  
  public static int[]RotarColumnaALaIzquierda(int [] vector){
      int[]array=new int[6];
      for(int i=0;i<array.length-1;i++){
        array[i]=vector[i+1];
      }
       array[5]=vector[0];
      
      return array;
      
  }
  public static int[][]RotarColumnaALaIzquierda(int [][] matriz){
      int[][]array=new int[4][6];
      for(int i=0;i<array.length;i++){
        for(int j=0;j<array.length+1;j++){
  
          array[i][j]=matriz[i][j+1];
        }
        
          array[i][5]=matriz[i][0];
      }
      return array;
    
  }
}

