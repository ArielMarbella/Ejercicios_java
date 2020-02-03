



public class GatoSimple {
// atributos /////////////////////////////
String color, raza, sexo;
int edad;
double peso;
// métodos ///////////////////////////////
// constructor
GatoSimple (String s) {
this.sexo = s;
}
// getter
String getSexo() {
return this.sexo;
}
/**
* Hace que el gato maulle
*/
void maulla() {
System.out.println("Miauuuu");
}
/**
* Hace que el gato ronronee
*/
void ronronea() {
System.out.println("mrrrrrr");
}
}


