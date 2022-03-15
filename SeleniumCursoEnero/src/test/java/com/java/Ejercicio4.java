package com.java;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// IF ELSE IF
		
		int[] array = {1,3,4,6,6,3,1,8,9,3};
		// Imprimir solo los valores sin repetir
		// Output: 1,3,4,8,9
		
		int x = 5;
		int y = 5;
		
		if(x>y) {
			System.out.println("X es mayor que Y");
		}else if(x==y) {
			System.out.println("Los numeros son iguales");
		}else {
			System.out.println("Error");
		}

	}

}
