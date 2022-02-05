package com.java;

public class Arreglos {

	public static void main(String[] args) {
		
		// ARRAYS (ARREGLOS)
		
		// Arreglo Unidimensional
//							0		1			2			3			4		5			6
		String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo", "Algo"};
		String[] dias2 = new String[7];
		dias2[0]= "Lunes";
		dias2[1]="Martes";
		dias2[1]=null;
		
		
		
		int[] numero = {1,2,3,5,7,100};
		boolean[] algo = {true, true, false, true};
		
		System.out.println("El dia de hoy es: "+dias[5]);
		
		int length = dias.length;
		
		for(int i =0; i<length; i++) {
			System.out.println(dias[i]);
		}
		
		// Arreglo Bidimensional
		String[][] nombres = new String[2][2];
		nombres[0][0] = "Ricardo";
		nombres[0][1] = "Adonai";
		nombres[1][0] = "Alejandro";
		nombres[1][1] = "Juan";
		
		// ARREGLO MULTIDIMENSIONAL
		String[][][][] datos = new String[2][2][2][2];
		datos[0][0][0][0] = "Hello";
		datos[0][0][0][1] = "Hello2";
		datos[0][0][1][0] = "Hello3";
		
		System.out.println("El nombre de la persona es: "+ nombres[0][0]);
		
		// ACTIVIDAD
		
//		IMPRIMIR EL ARREGLO BIDIMENSIONAL UTILIZANDO UN LOOP
	}

}
