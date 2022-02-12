package com.java.herencia;

public class Hijo extends Padre{

	public Hijo(String nombre, double estatura) {
		super(nombre, estatura);
	}
	
	public String profesion() {
		return "Doctor";
	}

}
