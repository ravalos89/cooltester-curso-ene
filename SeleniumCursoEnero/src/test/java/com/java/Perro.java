package com.java;

public class Perro {
	
	private String raza;
	private String color;
	private String tamano;
	private String nombre;
	private int numeroPatas;
	
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

	// Encapsulation
	
	// GETTERS AND SETTERS
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		if(numeroPatas>10) {
			this.numeroPatas = -1;
		}else {
			this.numeroPatas = numeroPatas;
		}
		
	}
	
	
	
	
	
	
	

}
