package com.java.exercise.ejerciciosbasicos1;

public class basicos1 {

	public static void main(String[] args) {

		/*
		 * 1) Declara dos variables numericas (con el valor que desees), muestra por
		 * consola la suma, resta, multiplicacion, division y resto de la division.
		 */
		double valor1 = 10;
		double valor2 = 20;

		double suma = valor1 + valor2;
		double multiplicacion = valor1 * valor2;
		double division = valor1 / valor2;
		double resta = valor1 - valor2;
		double modulo = valor1 % valor2;
		System.out
				.println("Resultado suma: " + suma + "\nResultado multiplicacion: " + multiplicacion + "\nResultado resta: "
						+ resta + "\nResultado division: " + division + "\nResultado del resto de la division: " + modulo);
	}

}
