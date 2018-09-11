package com.java.exercise.ejerciciosbasicos1;

import java.util.Scanner;

public class ValorEnteroToASCII {

	public static void main(String[] args) throws NumberFormatException {
		/*
		 * 7) Lee un n�mero por teclado y muestra por consola, el car�cter al que
		 * pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una
		 * a.
		 */

		System.out.println("Introduce un n�mero: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		try {

			String numero = sc.nextLine();
			// parseamos el string introducido a int, esto no seria necesario si en la
			// anterior variable en vez de String hubieramos declarado un int
			int number = Integer.parseInt(numero);
			// obtenemos el valor que tiene el entero en la tabla ASCII 
			char caracter = (char) number;

			System.out.println("El n� introducido pertence al car�cter en la tabla ASCII: " + caracter);

		} catch (Exception e) {
			System.out.println("Has introducido un valor incorrecto: " + e.getMessage());
		}

	}

}
