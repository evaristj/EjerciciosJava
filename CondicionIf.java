package com.java.exercise.ejerciciosbasicos1;

public class CondicionIf {

	public static void main(String[] args) {

		/*
		 * 2) Declara 2 variables numericas (con el valor que desees), e indica cual
		 * es mayor de los dos. Si son iguales indicarlo tambien. Ves cambiando los
		 * valores para comprobar que funciona.
		 */
		
		// creamos las variables y les asignamos un valor
		double valor1 = 40.36;
		double valor2 = 50.25;

		// creamos la condición que nos dira que valor es mayor o si son iguales
		if (valor1 > valor2) {
			System.out.println("El valor " + valor1 + " es mayor que el valor " + valor2 + ".");
		} else if (valor1 < valor2) {
			System.out.println("El valor " + valor2 + " es mayor que el valor " + valor1 + ".");
		} else if (valor1 == valor2) {
			System.out.println("El valor " + valor2 + " es igual que el valor " + valor1 + ".");
		}

	}

}
