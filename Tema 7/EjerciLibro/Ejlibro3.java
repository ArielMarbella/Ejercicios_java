/*

 */


public class Ejlibro3 {
  public static void main(String[] args)
    throws InterruptedException { 
      System.out.println("quieres saber que pienso de ti? s/n");
      String s = System.console().readLine();
      if(s.equals("s")){
      
    
    char[] x = {'t','e',' ','q','u','i','e','r','o',' ','m','u','c','h','o'};
     for(int i=0;i<15;i++){
       System.out.print(x[i]);
       Thread.sleep(500);
       }
      }
  }
}




