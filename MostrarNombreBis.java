package com.java.exercise.ejerciciosbasicos1;

import java.util.Scanner;

public class MostrarNombreBis {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * 4) Modifica la aplicacion anterior, para que nos pida el nombre que queremos
		 * introducir (con Scanner y JOptionPane).
		 */

		// en este caso vamos a pedir el nombre por consola
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce tu nombre para comenzar:");
		String name = scanner.nextLine();

		if (name.length() > 2) {
			System.out.println("Bienvenido " + name + "!!!");
		} else if (name.length() <= 2) {

			do {
				System.out.println("El nombre introducido no es valido");
				System.out.println("Intentelo de nuevo:");
				name = scanner.nextLine();
			} while (name.length() <= 2);

			System.out.println("Bienvenido " + name + "!!!");

		} else if (name == null) {

			System.out.println("No has introducido ningun nombre");
		}
	}
}
