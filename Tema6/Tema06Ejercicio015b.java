/*
 * Tema06Ejercicio015b.java
 * 
 * Copyright 2019 Linux User <tux@slitaz>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Tema06Ejercicio015b {
	
	public static void main (String args[]) {
		int i, j;
    int nota;
    String notaMusical = "";
    int melodia = (int)(Math.random() * 7 + 1);
    
    // Genera entre 1 y 7 compases
    for (i = 1; i <= melodia; i++) {
      // Genera las cuatro notas musicales
      for (j = 0; j < 4; j++) {
	nota = (int)(Math.random() * 7 + 1);
	
	switch (nota) {
	  case 1:
	    notaMusical = "do";
	    break;
	  case 2:
	    notaMusical = "re";
	    break;
	  case 3:
	    notaMusical = "mi";
	    break;
	  case 4:
	    notaMusical = "fa";
	    break;
	  case 5:
	    notaMusical = "sol";
	    break;
	  case 6:
	    notaMusical = "la";
	    break;
	  case 7:
	    notaMusical = "si";
	    break;
	  default:
	}
	System.out.print(notaMusical + " ");
      }
      // Imprime || si estamos en el último compas
      if (i != melodia) {
	System.out.print("| ");
      } else {
	System.out.print("||");
      }
    }
  } 
}
	
