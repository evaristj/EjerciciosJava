package com.java.exercise.ejerciciosbasicos1;

public class CalculadoraSencilla {

	public static void main(String[] args) {

		/*
		 * 1) Declara dos variables numericas (con el valor que desees), muestra por
		 * consola la suma, resta, multiplicacion, division y resto de la division.
		 */
		
		// creamos las variables y les asignamos un valor
		double valor1 = 10;
		double valor2 = 20;

		// creamos las variables que van a realizar cada operacion
		double suma = valor1 + valor2;
		double multiplicacion = valor1 * valor2;
		double division = valor1 / valor2;
		double resta = valor1 - valor2;
		double modulo = valor1 % valor2;
		
		// imprimimos por consola el resultado de cada operacion
		System.out.println("Resultado suma: " + suma + "\nResultado multiplicacion: " 
											+ multiplicacion + "\nResultado resta: " + resta + "\nResultado division: " 
											+ division + "\nResultado del resto de la division: " + modulo);
	}
}
