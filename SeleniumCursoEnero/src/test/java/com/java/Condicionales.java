package com.java;

public class Condicionales {

	public static void main(String[] args) {
		
		// CONDIOCIONALES
		
		// Automovil conduciento a exceso de velocidad
		int limiteVelocidad = 80; //KM*H
		int velocidadActual = 100; // KM*H
		boolean carretera = true; 
		
		// IF
//		if(velocidadActual>limiteVelocidad) {
//			System.out.println("MULTA!!!");
//		}
		
		// IF ELSE
//		if(velocidadActual>limiteVelocidad) {
//			System.out.println("MULTA!!!"); // TRUE
//		}else {
//			System.out.println("DESCUENTO"); // FALSE
//		}
		
		// IF ANIDADO
//		if(carretera) {
//			
//			// dando nuevo valor a la variable
//			limiteVelocidad=100;
//			
//			if(velocidadActual>limiteVelocidad) {
//				System.out.println("MULTA!!!"); // TRUE
//			}else {
//				System.out.println("DESCUENTO"); // FALSE
//			}
//			
//		}
		
		
		// IF ELSE IF		
		if(carretera) {
			
			// dando nuevo valor a la variable
			limiteVelocidad=100;
			
			if(velocidadActual>limiteVelocidad) {
				System.out.println("MULTA!!! - Vas en Carretera"); // TRUE
			}else {
				System.out.println("DESCUENTO - Vas en Carretera"); // FALSE
			}
			
		} else if(velocidadActual>limiteVelocidad) {
			System.out.println("MULTA!!! - Vas en calle"); // TRUE
		}else {
			System.out.println("DESCUENTO - Vas en calle"); // FALSE
		}
		
		
		// SWITCH CASE
		 int temperatura = 3; // grados C
		 
		 switch(temperatura) {
		 case 2:
		 case 3:
		 case 4:
			 // Block code
			 System.out.println("Temperatura Monterrey, Nuevo Leon, Mexico");
			 System.out.println("Temperatura USA");
			 break;
			 
		 case 19:
			 System.out.println("Temperatura Argentina");
			 break;
			 
		 case 12:
			 System.out.println("Temperatura Ecuador");
			 break;
			 
		 case 17:
			 System.out.println("Temperatura Colombia");
			 break;
			 
			 default:
				 System.out.println("Temperatura Otro lugar");
				 break;
		 }

	}

}
