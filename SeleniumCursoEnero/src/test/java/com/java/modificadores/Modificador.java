package com.java.modificadores;

public class Modificador {
	
	// MODIFICADORES DE ACCESSO O ACCESS MODIFIERS
	
	/*
	 * 1- PUBLIC - COMPARTIR EN CUALQUIER METODO O CLASE DEL PROYECTO
	 * 2- PROTECTED - SE PUEDE COMPARTIR EN LA CLASE DEL MISMO PAQUETE o QUE HEREDAN
	 * 3- PACKAGE PRIVATE O DEFAULT - SOLO LAS CLASES QUE ESTEN EN EL MISMO PAQUETE PUEDEN ACCEDER
	 * 4- PRIVATE - UNICAMENTE EN LA CLASE DONDE ESTAN LOS METODOS
	 */
	
//	public void sayHello() {
//		System.out.println("HELLO");
//	}
	
	public void sayHello() {
		System.out.println("HELLO - PACKAGE PRIVATE");
	}
	
	public void invokeSayHello() {
		sayHello();
	}

}
