package com.java.herencia;

public class Main {

	public static void main(String[] args) {
		
		Padre padre1 = new Padre("Jose", 1.80);
		System.out.println("Jose tiene los ojos "+ padre1.colorOjos());
		
		Hijo hijo1 = new Hijo("Juan", 1.75);
		System.out.println("Juan tiene los ojos "+ hijo1.colorOjos());
		System.out.println("Juan tiene el cabello color "+ hijo1.colorCabello());
		
		Nieto nieto1 = new Nieto("Juanito", 1.20);
		System.out.println("Juanito tiene los ojos "+ nieto1.colorOjos("Negro"));
		System.out.println("Juanito tiene el cabello color "+ nieto1.colorCabello());
		System.out.println("Juanito Profesion"+ nieto1.profesion());

	}

}
