/*
 * ejerLib5.java
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


public class ejerLib6 {
	
	public static void main (String args[]) {
    
    System.out.println("generación de piedra papel o tijera");
    
    int mano=((int)Math.random()*3);
    
    switch(mano){
      case 0:
      System.out.println("piedra");
      break;
      case 1:
      System.out.println("papel");
      break;
      case 2:
      System.out.println("tijera");
      break;
      default:
      
      }
	}
}

