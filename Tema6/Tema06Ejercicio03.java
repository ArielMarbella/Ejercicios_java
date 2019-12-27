/*
  3. Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de
* 48 cartas: 2, 3, 4, 5, 6, 7, 8, 9, sota, caballo, rey y as.
 */


public class Tema06Ejercicio03 {
	
	public static void main (String args[]) {
		
    String palo="";
    String carta="";
    
    int numeroCarta;
    int nombrePalo;
    
    nombrePalo = (int)(Math.random()*4)+1;
    numeroCarta= (int)(Math.random()*12)+1;
    
    switch (nombrePalo){
      
      case 1:
      palo="oros";
      break;
      case 2:
      palo="bastos";
      break;
      
      case 3:
      palo="copas";
      break;
      
      case 4:
      palo="espadas";
      break;
      default:
      }
      
      switch(numeroCarta){
        
        case 1:
        carta="as";
        break;
        case 10:
        carta="sota";
        break;
        case 11:
        carta="caballo";
        break;
        case 12:
        carta="rey";
        break;
        default:
        carta=String.valueOf(numeroCarta);
        
        }
        
        System.out.println("es un " + carta + " de "  + palo);
	}
}

