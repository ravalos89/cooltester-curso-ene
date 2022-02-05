package com.java;

public class Loops {

	public static void main(String[] args) {
		// WHILE
		
		// Contador de un rango de numeros
		
		int minNumero = 3;
		int maxNumero = 100;
		
		while(minNumero <=maxNumero) {
			System.out.println("El numero es: "+minNumero);
			minNumero++;
		}
		
		
		// DO WHILE
		
		// ¿Cuantas veces se tiene que sumar un mismo para llegar a 100?
		int numero = 50;
		int sumTotal = 0;
		int count = 0;
		
		do {
			sumTotal = sumTotal + numero;
			count++;
		} while (sumTotal<100);
		
		System.out.println("El numero se sumo a si mismo: "+count);
		
		// FOR
		
		// Contador de un numero limite
		
		int numeroLimite = 10;
		
		for(int i=1;i<=numeroLimite; i++) {
			System.out.println("El numero FOR es "+i);
			
		}

	}

}
