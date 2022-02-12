package com.java;

public class Perro {
	
	String raza;
	String color;
	String tamano;
	String nombre;
	int numeroPatas;
	
	// CONSTRUCTORES
	
	/*
	 * 1- TIENE EL MISMO NOMBRE DE LA CLASE
	 * 2- EN UNA CLASE PUEDEN EXISTIR MUCHOS CONSTRUCTORES = OVERLOADING
	 * 3- NO SE HEREDA
	 * 4- UN CONSTRUCTOR NO DEVUELVE NINGUN VALOR (INCLUYENDO OBJETOS)
	 */
	
	public Perro(String raza, String color, String tamano, String nombre, int numeroPatas) {
		this.raza = raza;
		this.color = color;
		this.tamano = tamano;
		this.nombre = nombre;
		this.numeroPatas = numeroPatas;		
	}
	
	// Constructor overloaded
	public Perro(String raza, String color, String tamano, String nombre) {
		this.raza = raza;
		this.color = color;
		this.tamano = tamano;
		this.nombre = nombre;
		this.numeroPatas = 4;		
	}
	
	public Perro() {
		
	}
	
	
	
	
	

}
