package com.java;

public class Metodos {

	public static void main(String[] args) {
		
		/*
		 * Caracteristicas de un metodo
		 * 
		 * #1 - Un metodo no puede escribirse fuera de la clase
		 * #2 - Un metodo no se puede escribir dentro de otro metodo
		 * #3 - El metodo main es el punto de entrada del programa
		 * #4 - Un metodo comienza con { y termina con otra }
		 * #5 - Dentro de un metodo se puede invocar otro metodo
		 * 
		 * #6 - Un metodo se puede sobrecargar (Overloading)
		 * 
		 */
		
//		algo();
		
		int suma2Numeros = suma(2,2);
		int suma3Numeros = suma(2,2,2);
		double suma2NumerosDouble = suma(2.2,2.3);
		boolean isReallyHuman = isHuman(false);
		
		System.out.println(suma2Numeros);
		System.out.println(suma3Numeros);
		System.out.println(isReallyHuman);
		
		
		
		
//		int suma = suma(1,2);
//		System.out.println(suma);

	}
	
	public static void printHello() {
		System.out.println("HELLO");
	}
	
	public static void validateUserLoginPage() {
		
	}
	
	public static int suma(int x, int y) {
		return x+y;	
	}
	
	// OVERLOADING - SOBRECARGA
	public static double suma(double x, double y) {
		return x+y;	
	}
	
	// OVERLOADING - SOBRECARGA
	public static int suma(int x, int y, int z) {
		int suma = x+y+z;
		return suma;	
	}
	
	public static boolean isHuman() {
		return true;
	}
	
	// OVERLOADING - SOBRECARGA
	public static boolean isHuman(boolean human) {
		return human;
	}
	
	public static void algo() {
		printHello();
		System.out.println(suma(2,2));
		System.out.println("El es un humano? "+ isHuman());
	}
	
	// QA
	public static void loginApp(String username, String password) {
		System.out.println("Entering username "+ username);
		System.out.println("Entering password "+ password);
	}
	
	// PROD
	public static void loginApp(String username, String password, String token) {
		System.out.println("Entering username "+ username);
		System.out.println("Entering password "+ password);
		System.out.println("Entering token "+ token);
	}

}
